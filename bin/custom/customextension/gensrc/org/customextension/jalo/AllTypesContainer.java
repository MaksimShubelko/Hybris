/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Jun 11, 2023, 1:32:29 PM                    ---
 * ----------------------------------------------------------------
 */
package org.customextension.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.customextension.constants.CustomextensionConstants;
import org.customextension.jalo.Item3;
import org.customextension.jalo.Item4;

/**
 * Generated class for type AllTypesContainer.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class AllTypesContainer extends GenericItem
{
	/** Qualifier of the <code>AllTypesContainer.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>AllTypesContainer.nonDynamicEnum</code> attribute **/
	public static final String NONDYNAMICENUM = "nonDynamicEnum";
	/** Qualifier of the <code>AllTypesContainer.map</code> attribute **/
	public static final String MAP = "map";
	/** Qualifier of the <code>AllTypesContainer.listOfStrings</code> attribute **/
	public static final String LISTOFSTRINGS = "listOfStrings";
	/** Qualifier of the <code>AllTypesContainer.one2one</code> attribute **/
	public static final String ONE2ONE = "one2one";
	/** Qualifier of the <code>AllTypesContainer.many2many</code> attribute **/
	public static final String MANY2MANY = "many2many";
	/** Qualifier of the <code>AllTypesContainer.item3</code> attribute **/
	public static final String ITEM3 = "item3";
	/**
	* {@link OneToManyHandler} for handling 1:n ITEM3's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Item3> ITEM3HANDLER = new OneToManyHandler<Item3>(
	CustomextensionConstants.TC.ITEM3,
	false,
	"allTypesContainer",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(NONDYNAMICENUM, AttributeMode.INITIAL);
		tmp.put(MAP, AttributeMode.INITIAL);
		tmp.put(LISTOFSTRINGS, AttributeMode.INITIAL);
		tmp.put(ONE2ONE, AttributeMode.INITIAL);
		tmp.put(MANY2MANY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AllTypesContainer.item3</code> attribute.
	 * @return the item3
	 */
	public Collection<Item3> getItem3(final SessionContext ctx)
	{
		return ITEM3HANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AllTypesContainer.item3</code> attribute.
	 * @return the item3
	 */
	public Collection<Item3> getItem3()
	{
		return getItem3( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AllTypesContainer.item3</code> attribute. 
	 * @param value the item3
	 */
	public void setItem3(final SessionContext ctx, final Collection<Item3> value)
	{
		ITEM3HANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AllTypesContainer.item3</code> attribute. 
	 * @param value the item3
	 */
	public void setItem3(final Collection<Item3> value)
	{
		setItem3( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to item3. 
	 * @param value the item to add to item3
	 */
	public void addToItem3(final SessionContext ctx, final Item3 value)
	{
		ITEM3HANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to item3. 
	 * @param value the item to add to item3
	 */
	public void addToItem3(final Item3 value)
	{
		addToItem3( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from item3. 
	 * @param value the item to remove from item3
	 */
	public void removeFromItem3(final SessionContext ctx, final Item3 value)
	{
		ITEM3HANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from item3. 
	 * @param value the item to remove from item3
	 */
	public void removeFromItem3(final Item3 value)
	{
		removeFromItem3( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AllTypesContainer.listOfStrings</code> attribute.
	 * @return the listOfStrings
	 */
	public List<String> getListOfStrings(final SessionContext ctx)
	{
		List<String> coll = (List<String>)getProperty( ctx, "listOfStrings".intern());
		return coll != null ? coll : Collections.EMPTY_LIST;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AllTypesContainer.listOfStrings</code> attribute.
	 * @return the listOfStrings
	 */
	public List<String> getListOfStrings()
	{
		return getListOfStrings( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AllTypesContainer.listOfStrings</code> attribute. 
	 * @param value the listOfStrings
	 */
	public void setListOfStrings(final SessionContext ctx, final List<String> value)
	{
		setProperty(ctx, "listOfStrings".intern(),value == null || !value.isEmpty() ? value : null );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AllTypesContainer.listOfStrings</code> attribute. 
	 * @param value the listOfStrings
	 */
	public void setListOfStrings(final List<String> value)
	{
		setListOfStrings( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AllTypesContainer.many2many</code> attribute.
	 * @return the many2many
	 */
	public Link getMany2many(final SessionContext ctx)
	{
		return (Link)getProperty( ctx, "many2many".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AllTypesContainer.many2many</code> attribute.
	 * @return the many2many
	 */
	public Link getMany2many()
	{
		return getMany2many( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AllTypesContainer.many2many</code> attribute. 
	 * @param value the many2many
	 */
	public void setMany2many(final SessionContext ctx, final Link value)
	{
		setProperty(ctx, "many2many".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AllTypesContainer.many2many</code> attribute. 
	 * @param value the many2many
	 */
	public void setMany2many(final Link value)
	{
		setMany2many( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AllTypesContainer.map</code> attribute.
	 * @return the map
	 */
	public Map<String,Integer> getAllMap(final SessionContext ctx)
	{
		Map<String,Integer> map = (Map<String,Integer>)getProperty( ctx, "map".intern());
		return map != null ? map : Collections.EMPTY_MAP;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AllTypesContainer.map</code> attribute.
	 * @return the map
	 */
	public Map<String,Integer> getAllMap()
	{
		return getAllMap( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AllTypesContainer.map</code> attribute. 
	 * @param value the map
	 */
	public void setAllMap(final SessionContext ctx, final Map<String,Integer> value)
	{
		setProperty(ctx, "map".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AllTypesContainer.map</code> attribute. 
	 * @param value the map
	 */
	public void setAllMap(final Map<String,Integer> value)
	{
		setAllMap( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AllTypesContainer.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "name".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AllTypesContainer.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AllTypesContainer.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "name".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AllTypesContainer.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AllTypesContainer.nonDynamicEnum</code> attribute.
	 * @return the nonDynamicEnum
	 */
	public EnumerationValue getNonDynamicEnum(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, "nonDynamicEnum".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AllTypesContainer.nonDynamicEnum</code> attribute.
	 * @return the nonDynamicEnum
	 */
	public EnumerationValue getNonDynamicEnum()
	{
		return getNonDynamicEnum( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AllTypesContainer.nonDynamicEnum</code> attribute. 
	 * @param value the nonDynamicEnum
	 */
	public void setNonDynamicEnum(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, "nonDynamicEnum".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AllTypesContainer.nonDynamicEnum</code> attribute. 
	 * @param value the nonDynamicEnum
	 */
	public void setNonDynamicEnum(final EnumerationValue value)
	{
		setNonDynamicEnum( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AllTypesContainer.one2one</code> attribute.
	 * @return the one2one
	 */
	public Item4 getOne2one(final SessionContext ctx)
	{
		return (Item4)getProperty( ctx, "one2one".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>AllTypesContainer.one2one</code> attribute.
	 * @return the one2one
	 */
	public Item4 getOne2one()
	{
		return getOne2one( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AllTypesContainer.one2one</code> attribute. 
	 * @param value the one2one
	 */
	public void setOne2one(final SessionContext ctx, final Item4 value)
	{
		setProperty(ctx, "one2one".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>AllTypesContainer.one2one</code> attribute. 
	 * @param value the one2one
	 */
	public void setOne2one(final Item4 value)
	{
		setOne2one( getSession().getSessionContext(), value );
	}
	
}
