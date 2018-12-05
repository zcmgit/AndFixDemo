# AndFixDemo
AndFix热更新
对现有工程进行apk打包old.apk  
修改程序方法中已有问题  
再次打包new.apk  
下载andFix打包工具apkpatch-1.0.3.zip，https://github.com/alibaba/AndFix/tree/master/tools  
将两个apk文件，及秘钥.keystore文件，拷入apkpatch-1.0.3文件夹中  
打开cmd，进入apkpatch-1.0.3文件夹  
执行以下命令：  
apkpatch.bat -f 新apk文件 -t 就apk文件 -o 输出目录 -k 秘钥文件 -p 密码 -a 别名  -e 别名密码  
如：apkpatch.bat -f new.apk -t old.apk -o output -k release.keystore -p testres -a testres  -e testres  
在output文件夹中，生成.apatch文件，修改该文件名称为程序中 patchManager.addPatch方法指定的名称，如a2  
执行复制指令adb push output/a2.apatch /storage/sdcard0/andfix/a2.apatch，将.apatch文件，复制到程序中 patchManager.addPatch方法指令的路径中  
热更新完成  
（配置见demo）
