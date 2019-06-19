import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;
public class LoadSmartBanner
{
    @Test
    public void getSmartBanner()
    {
        DriverInit.driver.navigate().back();
        PublicFunction pb=new PublicFunction();

        //请求SmartBanner 广告:先点击SmartBanner 按钮，进入SmartBanner 广告页面
        DriverInit.driver.findElement(By.id("com.unit.sample_all:id/smartBanner")).click();
        pb.screenShot(DriverInit.driver, DriverInit.phoneName, "进入SmartBanner主页");

        //点击Load按钮请求广告
        DriverInit.driver.findElement(By.id("com.unit.sample_all:id/load1")).click();
        pb.screenShot(DriverInit.driver, DriverInit.phoneName, "SmartBanner主页点击Load按钮");

        //点击getview按钮
        WebElement getViewSmartBanner=pb.findElement(DriverInit.driver,"com.unit.sample_all:id/getView1");
        if(getViewSmartBanner.isEnabled())
        {
            getViewSmartBanner.click();
            pb.screenShot(DriverInit.driver, DriverInit.phoneName, "SmartBanner主页点击getView按钮");
            WebElement showSmartBanner=pb.findElement(DriverInit.driver,"com.unit.sample_all:id/show1");
            if(showSmartBanner.isEnabled())
            {
                showSmartBanner.click();
                pb.screenShot(DriverInit.driver, DriverInit.phoneName, "SuccessToLoadSmartBanner");
                /*检查广告图片上的元素
                WebElement imgSmartBanner;
                imgSmartBanner = DriverInit.driver.findElementByClassName("android.widget.Image");
                if(imgSmartBanner.isEnabled())
                {
                    pb.screenShot(DriverInit.driver, DriverInit.phoneName, "SuccessToLoadSmartBanner");
                }*/
            }
            else
            {
                pb.screenShot(DriverInit.driver,DriverInit.phoneName,"FailToShowSmartBanner");
            }
        }
        else
        {
            pb.screenShot(DriverInit.driver,DriverInit.phoneName,"FailToLoadSmartBanner");
        }
        //assertTrue(getViewSmartBanner.isEnabled());
    }
}
