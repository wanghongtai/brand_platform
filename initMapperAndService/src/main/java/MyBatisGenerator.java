import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * Created by Hunter on 2020-06-23.
 */
public class MyBatisGenerator {

    public static void main(String[] args) {
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir("D:\\教学\\王老师\\工作\\项目\\就业项目\\springboot进阶\\brand_platform\\initMapperAndService\\src\\main\\java");
        gc.setFileOverride(true);//文件覆盖
        gc.setActiveRecord(true);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(true);// XML columList
        gc.setAuthor("Hunter");
        gc.setServiceName("%sService");//去掉前缀I

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("root");
        dsc.setUrl("jdbc:mysql://127.0.0.1:3306/smbms?characterEncoding=utf8");

        // 策略配置(表)
        StrategyConfig strategy = new StrategyConfig();
        strategy.setInclude("smbms_user");
        strategy.setNaming(NamingStrategy.underline_to_camel);//下划线转驼峰命名

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.example.demo");
        pc.setMapper("mapper");
        pc.setEntity("entity");
        pc.setXml("mapper.xml");
        pc.setService("service");
        pc.setController("controller");


        //整合配置
        AutoGenerator mpg = new AutoGenerator();
        mpg.setGlobalConfig(gc);
        mpg.setDataSource(dsc);
        mpg.setStrategy(strategy);
        mpg.setPackageInfo(pc);

        // 执行生成
        mpg.execute();
        System.out.println("生成完毕");
    }

}
