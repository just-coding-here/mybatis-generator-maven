## mybatis-generator-maven

使用官方网站的mapper自动生成工具mybatis-generator-core-1.4.0来生成pojo类和mapper映射文件，为了方便使用改成Maven项目，已添加了Oracle、PostgreSQL和MySQL的依赖。

## How to work

1. 修改`generatorConfig.xml`里的db信息
2. 配置文件里有着充足的注释，请根据需要自行修改定制。
3. 启动类是`GeneratorSqlmap.java`，导入IDE工具后并修改好配置文件，直接右键该启动类选择`Rus As`即可。