package de.hstr.bigdata.hdfsexample;

import java.io.PrintWriter;

import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class WriteRandomNumbers extends Configured implements Tool {
    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();
        Logger.getRootLogger().setLevel(Level.INFO);
        ToolRunner.run(new WriteRandomNumbers(), args);
    }
        
    public int run(String[] args) throws Exception {
        try (FileSystem fs = FileSystem.get(getConf())) {
            // Ihr Code hierher!
        }
        return 0;
    }
}
