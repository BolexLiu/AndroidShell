# AndroidShell
android应用内执行shell
```
 String[] strings = {"input swipe 100 400 300 900 1200","dumpsys activity activities "};
                ShellUtils.CommandResult commandResult = ShellUtils.execCmd(strings, false, true);
                Log.e(MainActivity.this.getClass().getName(),"失败:"+commandResult.errorMsg+"成功："+commandResult.successMsg+commandResult.result);
```
