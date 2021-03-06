package com.wx_auto_sale.utils;

import com.wrapper.util.StringUtils;
import lombok.extern.slf4j.Slf4j;

import java.io.PrintWriter;
import java.io.StringWriter;

import static com.wx_auto_sale.constants.Constants.MAX_NAME_LENGTH;
import static com.wx_auto_sale.constants.Constants.MAX_NAME_LENGTH_ETC;

/**
 * @Author wangyu
 * @Create: 2020/4/13 11:17 上午
 * @Description:
 */
@Slf4j
public class DataUtil {

    public static String textTransfer(String text) {
        if (StringUtils.isNotEmpty(text)) {
            return text.length() > MAX_NAME_LENGTH ? text.substring(0, MAX_NAME_LENGTH - MAX_NAME_LENGTH_ETC.length()).concat(MAX_NAME_LENGTH_ETC) : text;
        }
        return StringUtils.EMPTY;
    }

    /**
     * 将异常转为字符串
     *
     * @param e
     * @return
     */
    public static String getErrorInfoFromException(Exception e) {
        try {
            if (e == null) {
                return null;
            }
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            return sw.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String transOrderMsg(String oldMsg, String newMsg) {
        StringBuffer sb = new StringBuffer();
        if (StringUtils.isNotEmpty(oldMsg)) {
            sb.append(oldMsg.endsWith(";") ? oldMsg : oldMsg + ";");
        }
        sb.append(DateUtil.date2string(DateUtil.now(), DateUtil.FORMAT_19))
                .append("  ")
                .append(newMsg)
                .append(";");
        return sb.toString();
    }
}
