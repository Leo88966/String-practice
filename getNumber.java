    public String getNumber(String str){
        String getNum;
        char[] charArray;
        StringBuilder sb = new StringBuilder();

        charArray=str.toCharArray();
        for(char ch:charArray){
            if(ch>'0'&&ch<'9'||ch=='.'){
                sb.append(ch);
            }
        }
        System.out.println(sb);
        getNum=sb.toString();
        // getNum = str.replaceAll(['a'-'z'|'A'-'Z'] ,'');
        if (getNum.indexOf('.') == -1) {
            getNum = getNum + ".00";
        } else if (getNum.indexOf('.') == getNum.length() - 1) {
            getNum = getNum + "00";
        } else if (getNum.indexOf('.') == getNum.length() - 2) {
            getNum = getNum + "0";
        } else {
            getNum = getNum.substring(0, getNum.indexOf('.') + 3);
        }
        return getNum;
    }
