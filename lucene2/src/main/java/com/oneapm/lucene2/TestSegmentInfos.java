/**
 * Project Name:lucene2
 * File Name:TestSegmentInfos.java
 * Package Name:com.oneapm.lucene2
 * Date:
 * Copyright (c) 2016, All Rights Reserved.
 *
 */
package com.oneapm.lucene2;

import java.io.IOException;
import java.nio.file.Paths;

import org.apache.lucene.index.SegmentInfos;
import org.apache.lucene.store.FSDirectory;

/**
 * ClassName:TestSegmentInfos <br/>
 * Function: <br/>
 * Date: <br/>
 * 
 * @author hadoop
 * @version
 * @since JDK 1.8
 * @see
 */
public class TestSegmentInfos {
    
    /**
     * main: <br/>
     * 
     * @author hadoop
     * @param args
     * @throws IOException
     * @since JDK 1.8
     */
    public static void main(String[] args) throws IOException {
        FSDirectory fs = FSDirectory.open(Paths.get("/data/elasticsearch/clusters/test_1/data/test_1/nodes/0/indices/monitor-2016-08-11/0/index"));
        SegmentInfos s = SegmentInfos.readCommit(fs,
                                                 "segments_3");
        System.out.println(s);
        System.out.println(s.getUserData());
    }
    
}
