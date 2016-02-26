package com.teramint.cayenne;

import org.apache.cayenne.Cayenne;
import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.configuration.server.ServerRuntime;
import org.apache.cayenne.configuration.server.ServerRuntimeBuilder;

import com.teramint.cayenne.entity.LevelInfo;

/**
 * 
 * @author mramos
 *
 */

public class CayenneService {
	
	private static CayenneService _INSTANCE = new CayenneService();
	private ServerRuntime serverRuntime;
	private ObjectContext sharedContext;
	
	private CayenneService(){}
	
	protected void init(){
			
		serverRuntime = //new ServerRuntime(config, modules);
				new ServerRuntimeBuilder().addConfig("cayenne-project.xml")
					.build();
				
		sharedContext = serverRuntime.newContext();
	}
	
	public LevelInfo levelInfo(int obj){
		return  (LevelInfo) Cayenne.objectForPK(sharedContext, "LevelInfo", obj);
	}
	
	
	public static CayenneService instance(){
		return _INSTANCE;
	}
}
