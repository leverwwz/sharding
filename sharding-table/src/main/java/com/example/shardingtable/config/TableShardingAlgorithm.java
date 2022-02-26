package com.example.shardingtable.config;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

public class TableShardingAlgorithm implements  PreciseShardingAlgorithm<String> {
    static final int HASH_BITS = 0x7fffffff; // usable bits of normal node hash

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<String> preciseShardingValue) {
        String key = preciseShardingValue.getValue();
        int suffix = spread(key.hashCode()) % 2;
        return "tb_user" + suffix;
    }

    static final int spread(int h) {
        return (h ^ (h >>> 16)) & HASH_BITS;
    }
}