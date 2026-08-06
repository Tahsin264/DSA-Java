class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return new ArrayList<>();
        }

        return padRet("", digits);
    }

    public ArrayList<String> padRet(String p, String up) {
        if (up.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';

        ArrayList<String> list = new ArrayList<>();

        int start = (digit - 2) * 3;
        if (digit > 7) {
            start = start + 1;
        }

        int count = 3;
        if (digit == 7 || digit == 9) {
            count = 4;
        }

        for (int i = start; i < start + count; i++) {
            char ch = (char) ('a' + i);
            list.addAll(padRet(p + ch, up.substring(1)));
        }

        return list;
    }
}