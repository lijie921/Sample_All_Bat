import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;
public class LaodVideo
{
    @Test
    public void getVideo()
    {
        DriverInit.driver.navigate().back();
        PublicFunction pb=new PublicFunction();

        //请求video广告:先点击video按钮，进入video广告页面
        DriverInit.driver.findElement(By.id("com.unit.sample_all:id/video")).click();
        pb.screenShot(DriverInit.driver,DriverInit.phoneName,"进入Video主页");

        //点击Load按钮请求广告
        DriverInit.driver.findElement(By.id("com.unit.sample_all:id/load1")).click();
        pb.screenShot(DriverInit.driver,DriverInit.phoneName,"Video主页点击load按钮");
        /*
        try {
            Thread.sleep(100000);
            //WebElement msg=pb.findElement(DriverInit.driver,"com.unit.sample_all:id/message1");
            pb.findElement(DriverInit.driver,"com.unit.sample_all:id/message1");
            WebElement show=pb.findElement(DriverInit.driver,"com.unit.sample_all:id/show1");
           // assertTrue(show.isEnabled());
            if(show.isEnabled())
            {
                show.click();
                pb.screenShot(DriverInit.driver,DriverInit.phoneName,"Video主页点击Show按钮");
                WebElement closeBtnId=pb.findElement(DriverInit.driver,"closeBtnId");
                if(closeBtnId.isEnabled())
                {
                    pb.screenShot(DriverInit.driver,DriverInit.phoneName,"SuccessToLoadVideo");
                    DriverInit.driver.navigate().back();
                }
                else
                {
                    pb.screenShot(DriverInit.driver,DriverInit.phoneName,"FailToShowVideo");
                }
            }
            else
            {
                pb.screenShot(DriverInit.driver,DriverInit.phoneName,"FailToLoadVideo");
            }

        }catch (Exception e){}*/
        //展示完广告后，返回主页
        DriverInit.driver.navigate().back();
    }
}
