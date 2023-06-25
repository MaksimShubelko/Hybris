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
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type CustomOrder.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class CustomOrder extends GenericItem
{
	/** Qualifier of the <code>CustomOrder.price</code> attribute **/
	public static final String PRICE = "price";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(PRICE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomOrder.price</code> attribute.
	 * @return the price
	 */
	public BigDecimal getPrice(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, "price".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomOrder.price</code> attribute.
	 * @return the price
	 */
	public BigDecimal getPrice()
	{
		return getPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomOrder.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, "price".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomOrder.price</code> attribute. 
	 * @param value the price
	 */
	public void setPrice(final BigDecimal value)
	{
		setPrice( getSession().getSessionContext(), value );
	}
	
}
