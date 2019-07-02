public class Main {

    public static void main(String[] args) {

        String test1="2014办理的18855115678当时开卡的时候讲3年以后套餐随意。现在138的套现都用了好几年了。到移动公司改套餐讲是套餐长期138改不掉，移动公司忽悠顾客，强加霸王条款，";
        String test2="2014年在合肥办理的18855115678，当时跟我讲的是138套餐3年以后就可以改，现在去营业厅改套餐，工作人员跟我讲套餐138一直到2099年，移动公司霸王条款，强加用户套餐不给更改，讲这是他们的规定，必须执行、";
        System.out.println("Hello World!");
        System.out.println(Util.getSimilarityRatio(test2,test1));
    }
}
