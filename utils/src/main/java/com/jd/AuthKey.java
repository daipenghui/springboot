package com.jd;

import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: daipenghui
 * @date: 2020/1/15 20:10
 */
public class AuthKey {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        System.out.println(StringUtils.upperCase(uuid.toString().replaceAll("-","")));
    }
}
