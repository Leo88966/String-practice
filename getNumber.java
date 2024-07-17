    public String getNumber(String str){
        String getNum;        //返回值
        char[] charArray;     //遍历str用
        boolean hasDecimal=false;   //是否出现小数点
        int i=0;    //记录小数点和小数部分的位数
        StringBuilder sb = new StringBuilder(); //添加满足需求的元素

        charArray=str.toCharArray();

        for(char ch:charArray){
            if(ch>'0'&&ch<'9'||ch=='.'){
                if(ch=='.') {  //当小数点出现时，hasDecimal=true，i记录小数点
                    hasDecimal=true;
                    i++;
                }else if (hasDecimal){  //如果小数点已经出现，i记录小数部分位数
                    i++;
                }
                sb.append(ch);      //满足数字和小数点的字符，都存入sb
                if(i>2) break;      //小数部分到2位时，跳出循环
            }
        }
        switch (i){
            case 0:     //没有小数点
                sb.append(".00");
                break;
            case 1:     //只有小数点
                sb.append("00");
                break;
            case 2:     //有一位小数
                sb.append("0");
                break;
        }
        getNum=sb.toString();
        return getNum;
    }
