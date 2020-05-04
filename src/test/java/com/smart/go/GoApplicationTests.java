package com.smart.go;

import com.smart.go.dao.ApDao;
import com.smart.go.dao.MoveInfoDao;
import com.smart.go.dao.SingleLogDao;
import com.smart.go.domain.Ap;
import com.smart.go.domain.MoveInfo;
import com.smart.go.domain.SingleLog;
import com.smart.go.domain.Teacher;
import com.smart.go.service.BuildMoveInfo;
import com.smart.go.service.ReadAndExactDataService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.junit.platform.engine.discovery.ClasspathResourceSelector;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.beans.factory.support.MethodOverride;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import sun.reflect.generics.tree.VoidDescriptor;

import javax.annotation.Resource;
import javax.persistence.Table;
import java.awt.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.Signature;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootTest
class GoApplicationTests {
    @Test
    void contextLoads() {
    }

    private Logger logger = LogManager.getLogger(this.getClass());


    @Resource
    private BuildMoveInfo buildMoveInfo;

    @Test
    void TestBuildMoveInfo() {
        long currentTime = System.currentTimeMillis();
        buildMoveInfo.buildMoveInfo();
        logger.info("All  cost: " + (System.currentTimeMillis() - currentTime) + " ms");
    }

    @Resource
    private ReadAndExactDataService readAndExactDataService;

    @Test
    void TestReadExtract() throws IOException, ParseException {
        readAndExactDataService.TestReadLog();
    }

    @Test
    void Read() throws IOException {

        InputStream stream = getClass().getClassLoader().getResourceAsStream("test.log");
        assert stream != null;
        BufferedReader br = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8));
        System.out.println(br.readLine());

    }

    @Resource
    private MoveInfoDao moveInfoDao;

    @Test
    void TestCountPoint() throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time1 = simpleDateFormat.parse("2020-04-16 00:00:00");
        Date time2 = simpleDateFormat.parse("2020-04-16 19:15:51");

        MoveInfo m = moveInfoDao.sPoint("3170211163", time1, time2);
        System.out.println(m);
    }
}



