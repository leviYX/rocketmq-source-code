package com.yx;

import com.alibaba.fastjson.JSON;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

/**
 * @Description:
 * @Author: linhui
 * @Date: 2024/6/12 11:44
 */
@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.SECONDS)
@State(Scope.Thread)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
public class FastjsonLongSerializationBenchmark {
    private SendLongMessageRequestHeaderV2 slv2;

    @Setup
    public void setUp() {
        slv2 = new SendLongMessageRequestHeaderV2("a", "b","c","d");
    }

    @Benchmark
    public String serializeUser() {
        return JSON.toJSONString(slv2);
    }

    // @Benchmark
    public SendLongMessageRequestHeaderV2 deserializeUser(String json) throws IOException {
        return JSON.parseObject(json, SendLongMessageRequestHeaderV2.class);
    }


    public static void main(String[] args) throws Exception {
        Options opt = new OptionsBuilder()
            .include(FastjsonLongSerializationBenchmark.class.getSimpleName())
            .forks(1)
            .output("longParam.json")
            .build();

        new Runner(opt).run();
    }
}