import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;

public class LoadBanner
{
    @Test
    public void getBanner()
    {
        DriverInit.driver.navigate().back();
        PublicFunction pb=new PublicFunction();

        //请求Banner广告:先点击Banner按钮，进入Banner广告页面
        DriverInit.driver.findElement(By.id("com.unit.sample_all:id/banner")).click();
        pb.screenShot(DriverInit.driver, DriverInit.phoneName, "进入Banner主页");

        //点击Load按钮请求广告
        DriverInit.driver.findElement(By.id("com.unit.sample_all:id/load1")).click();
        pb.screenShot(DriverInit.driver, DriverInit.phoneName, "Banner主页点击Load按钮");

        //点击getview按钮
        WebElement getViewBanner=pb.findElement(DriverInit.driver,"com.unit.sample_all:id/getView1");
        if(getViewBanner.isEnabled())
        {
            getViewBanner.click();
            pb.screenShot(DriverInit.driver, DriverInit.phoneName, "Banner主页点击getView按钮");

            WebElement showBanner=pb.findElement(DriverInit.driver,"com.unit.sample_all:id/show1");
            if(showBanner.isEnabled())
            {
                showBanner.click();
                pb.screenShot(DriverInit.driver, DriverInit.phoneName, "SuccessToLoadBanner");
                /*检查广告图片上的元素
                WebElement elementByClassNameBanner = DriverInit.driver.findElementByClassName("android.widget.Image");
                if(elementByClassNameBanner.isEnabled())
                {
                    pb.screenShot(DriverInit.driver, DriverInit.phoneName, "SuccessToLoadBanner");
                }*/
            }
            else
            {
                pb.screenShot(DriverInit.driver, DriverInit.phoneName, "FailToShowBanner");
            }
        }
        else
        {
            pb.screenShot(DriverInit.driver,DriverInit.phoneName,"FailToLoadBanner");
        }
    }
}
