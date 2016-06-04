package timer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import orm.ICatService;

public class TestJob extends QuartzJobBean {

	private ICatService i;
	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {
		// TODO Auto-generated method stub

		
		System.out.println(new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��",Locale.JAPAN).format(new Date()) + "----------------------------   quartz job bean  is run --------------------------------------");
	}

	
	public void run() {
		System.out.println("+++++++++++++++++++++++++++++ POJO  QUTARZ SCHEDELE +++++++++++++++++");
	}
}
