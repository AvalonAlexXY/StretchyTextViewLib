# StretchyTextViewLib
 
## 一 、这是一个可伸缩的TextView
 
## 二 、包含功能:
1.展开TextView
2.收缩TextView
 
## 三、使用方法：
 
1.gradle 中添加：   
2.调用ExpandTextView
       ExpandTextView expandTextView =(ExpandTextView) findViewById(R.id.expand_text);<br> 
        //输入展示行数<br> 
        expandTextView.setMaxLineCount(3);<br> 
        //输入展示文字<br> 
        expandTextView.setContent("helloWorld! helloWorld! helloWorld! helloWorld! " +<br> 
                "helloWorld! helloWorld! helloWorld! helloWorld! helloWorld! " +<br> 
                "helloWorld! helloWorld! helloWorld! helloWorld! helloWorld! " +<br> 
                "helloWorld! helloWorld! helloWorld! helloWorld! helloWorld! ");<br> 
        //设置“展开”，"收起"按钮位置<br> 
        expandTextView.setBottomTextGravity(Gravity.RIGHT);<br> 
        //设置文字大小<br> 
        expandTextView.setContentTextSize(16);<br> 
        //设置文字颜色<br> 
        expandTextView.setContentTextColor(Color.parseColor("#000000"));<br> 
 
## 四、关于我：
  邮箱：xyyansheng@163.com<br> 
