package demo;

import org.bitcoinj.core.Block;
import org.bitcoinj.core.Context;
import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.params.MainNetParams;
import org.bitcoinj.utils.BlockFileLoader;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Hello {

    private static NetworkParameters mainNetParams = new MainNetParams();

    static {
        Context.getOrCreate(mainNetParams);
    }

    public static void main(String[] args) {
        List<File> blockChainFiles = Arrays.asList(new File("./btc-data/blocks/blk00000.dat"));
        BlockFileLoader loader = new BlockFileLoader(mainNetParams, blockChainFiles);

        for (Block block : loader) {
            System.out.println(block);
        }
    }

}
