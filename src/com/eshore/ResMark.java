package com.eshore;

import java.sql.Date;

public class ResMark {
private int mres_id;
private int marker_id;
private Date res_mark_time;
private int res_mark;

public ResMark(){};
public int getMresId()
{
	return mres_id;
}
public void setMresId(int mres_id)
{
	this.mres_id=mres_id;
}
public int getMarkerId()
{
	return marker_id;
}
public void setMarkerId(int marker_id)
{
	this.marker_id=marker_id;
}
public Date getResMarkTime()
{
	return res_mark_time;
}
public void setResMarkTime(Date res_mark_time)
{
	this.res_mark_time=res_mark_time;
}
public int getResMark()
{
	return res_mark;
}
public void setResMark(int res_mark)
{
	this.res_mark=res_mark;
}
}
