package com.justcodinghere.mybatisgeneratorcustom;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class GeneratorSqlmap {

    public void generator() throws Exception {

        final List<String> warnings = new ArrayList<String>();
        final boolean overwrite = true;
        // 指定 逆向工程配置文件
        final ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        final InputStream is = classloader.getResourceAsStream("generatorConfig.xml");
        final ConfigurationParser cp = new ConfigurationParser(warnings);
        final Configuration config = cp.parseConfiguration(is);
        final DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        final MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);

    }

    public static void main(final String[] args) throws Exception {
        try {
            final GeneratorSqlmap generatorSqlmap = new GeneratorSqlmap();
            generatorSqlmap.generator();
        } catch (final Exception e) {
            e.printStackTrace();
        }

    }

}
