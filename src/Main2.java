/**
 * @Author: georgexie
 * @description: 该算法利用中文分词，对大文本进行去重十分有效。
 * @Date: 2019/6/24 0024 14:59
 * @Version 1.0
 */
public class Main2 {
    public static void main(String[] args) {
        String s1="之前打电话投诉过网络问题，10086客服说教室学校不给整修，我在教室也是主要是学习，本来想网络信号差点就算了吧！但是关于宿舍的网络问题，我反馈了很多遍，也跟来我们宿舍调查网络的人反馈过，到现在还没有弄好，从最初的的上学期，一直到现在，一年都快过去了，我想知道移动能不能提高点效率，我是在人多的时候网络特别差，比如晚上十一点左右，那个时候打游戏延迟经常红色，200 的ping值，但是最初网络部门的人来我们宿舍，就在人少的时候转一下，比如上午九点左右，说没问题就走了，我都说了时间，你那个时间段来有什么意义呢？一丁点用都没，我已经忍了很久了，营业厅最近跟我说网络已经升级了，可是我发现我游戏延迟还是一如既往的卡，从上学期开始就一次两次的网络升级，加上这次，应该三次以上了，可是结果呢？我室友的电信卡没有升级却网络一直很好！难道你们就只会一而再再而三的拖延欺骗用户？不想说什么了，如果这次还是解决不了，可不可以不要再欺骗用户了？连最基本的网络保障都不行，赶紧从皖西学院撤走吧！现在的我，连个蚂蚁森林都打不开，呵呵呵呵....";
        String s2="之前打电话投诉过网络问题，10086客服说教室学校不给整修，我在教室也是主要是学习，本来想网络信号差点就算了吧！但是关于宿舍的网络问题，我反馈了很多遍，也跟来我们宿舍调查网络的人反馈过，到现在还没有弄好，从最初的的上学期，一直到现在，一年都快过去了，我想知道移动能不能提高点效率，我是在人多的时候网络特别差，比如晚上十一点左右，那个时候打游戏延迟经常红色，200 的ping值，但是最初网络部门的人来我们宿舍，就在人少的时候转一下，比如上午九点左右，说没问题就走了，我都说了时间，你那个时间段来有什么意义呢？一丁点用都没，我已经忍了很久了，营业厅最近跟我说网络已经升级了，可是我发现我游戏延迟还是一如既往的卡，从上学期开始就一次两次的网络升级，加上这次，应该三次以上了，可是结果呢？我室友的电信卡没有升级却网络一直很好！难道你们就只会一而再再而三的拖延欺骗用户？不想说什么了，如果这次还是解决不了，可不可以不要再欺骗用户了？连最基本的网络保障都不行，赶紧从皖西学院撤走吧！现在的我，连个蚂蚁森林都打不开，呵呵呵呵....";
        SimHash hash1 = new SimHash(s1, 64);
        SimHash hash2 = new SimHash(s2, 64);
        System.out.println(  hash1.hammingDistance(hash2) );
        System.out.println(  hash2.getSemblance(hash1) );

    }
}
