package jqademo.complexity.complexmethod;

public class ComplexMethod {

    public int simpleMethod(String s) {
        if (s.length() > 5) {
            return 0;
        }
        return 1;
    }

    public int complexMethod(String s) {
        if (s.length() > 2) {
            if (s.startsWith("a")) {
                if (s.contains("b")) {
                    if (s.indexOf('c') != 3) {
                        if (s.contentEquals("aaa") || s.contentEquals("bbb")) {
                            if (s.lastIndexOf('d') >= 4) {
                                switch (s.indexOf('e')) {
                                    case 0: return 0;
                                    case 1: return 1;
                                    case 2: return 2;
                                    case 3: return 3;
                                    case 4: return 4;
                                    case 5: return 5;
                                    case 6: return 6;
                                    case 7: return 7;
                                    default: {
                                        String c = String.valueOf(s.getBytes());
                                        while (c.length() > 0) {
                                            c = c.substring(0, c.length()-1);
                                        }
                                        return 8;
                                    }
                                }
                            }
                            else {
                                if (s.contains("ff")) {
                                    if ("fff".equals(s)) {
                                        return 8;
                                    }
                                    return 9;
                                }
                                else if (s.contains("g")) {
                                    return 10;
                                }
                                else if (s.contains("h") && s.contains("j")) {
                                    return 11;
                                }
                                else if (s.contains("i")) {
                                    return 12;
                                }
                                else {
                                    if (s.indexOf('h') == 0) {
                                        if (s.indexOf('e') == 1) {
                                            if (s.indexOf('l') == 2) {
                                                if (s.indexOf('l') == 3) {
                                                    if (s.indexOf('o') == 4) {
                                                        if ("hello".equals(s.trim())) {
                                                            return Integer.MAX_VALUE;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return 0;
                }
            }
        }
        return -1;
    }

}
