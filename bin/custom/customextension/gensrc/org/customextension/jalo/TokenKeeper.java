/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 23, 2023, 11:47:59 PM                   ---
 * ----------------------------------------------------------------
 */
package org.customextension.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type TokenKeeper.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class TokenKeeper extends GenericItem
{
	/** Qualifier of the <code>TokenKeeper.token</code> attribute **/
	public static final String TOKEN = "token";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(TOKEN, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TokenKeeper.token</code> attribute.
	 * @return the token
	 */
	public Long getToken(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, "token".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TokenKeeper.token</code> attribute.
	 * @return the token
	 */
	public Long getToken()
	{
		return getToken( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TokenKeeper.token</code> attribute. 
	 * @return the token
	 */
	public long getTokenAsPrimitive(final SessionContext ctx)
	{
		Long value = getToken( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>TokenKeeper.token</code> attribute. 
	 * @return the token
	 */
	public long getTokenAsPrimitive()
	{
		return getTokenAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TokenKeeper.token</code> attribute. 
	 * @param value the token
	 */
	public void setToken(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, "token".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TokenKeeper.token</code> attribute. 
	 * @param value the token
	 */
	public void setToken(final Long value)
	{
		setToken( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TokenKeeper.token</code> attribute. 
	 * @param value the token
	 */
	public void setToken(final SessionContext ctx, final long value)
	{
		setToken( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>TokenKeeper.token</code> attribute. 
	 * @param value the token
	 */
	public void setToken(final long value)
	{
		setToken( getSession().getSessionContext(), value );
	}
	
}
