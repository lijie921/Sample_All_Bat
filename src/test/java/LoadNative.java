import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.internal.runners.statements.Fail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoadNative
{
    @Test
    public void getNative()
    {
        PublicFunction pb=new PublicFunction();

        //请求native广告:先点击native按钮，进入native广告页面
        DriverInit.driver.findElement(By.id("com.unit.sample_all:id/Native")).click();
        pb.screenShot(DriverInit.driver,DriverInit.phoneName,"进入Native主页");

        //点击Load按钮请求广告
        DriverInit.driver.findElement(By.id("com.unit.sample_all:id/load1")).click();
        pb.screenShot(DriverInit.driver,DriverInit.phoneName,"Native页面点击load按钮");

        //点击show展示广告
        WebElement show=pb.findElement(DriverInit.driver,"com.unit.sample_all:id/show1");
        //断言是否能拿到广告，就看show按钮是否可用，程序是能Load到广告，show按钮才可以用，所以断言show按钮即可
       // assertTrue(show.isEnabled());
        if(show.isEnabled())
        {
            show.click();
            pb.screenShot(DriverInit.driver,DriverInit.phoneName,"SuccessToLoadNative");
            /* 检查webview上的img元素
            WebElement img=pb.findElement(DriverInit.driver,"com.unit.sample_all:id/img_big");
            if(img.isEnabled())
            {
                pb.screenShot(DriverInit.driver,DriverInit.phoneName,"SuccessToLoadNative");
            }
            else
            {
                try {
                    Thread.sleep(60000);
                }catch (Exception e){}
            }*/
        }
        else
        {
            pb.screenShot(DriverInit.driver,DriverInit.phoneName,"FailToLoadNative");
        }
    }
}
