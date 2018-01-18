package com.router1011.atimemod2.lazymodder.blocks.properties;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;

import net.minecraft.block.properties.PropertyHelper;

public class PropertyVariant extends PropertyHelper<String> {

	private Collection<String> allowedValued;
	private List<String> nameToValue = new ArrayList<>();

	protected PropertyVariant(String name, Collection<String> allowedValued) {
		super(name, String.class);
		this.allowedValued = allowedValued;

		for (String s : allowedValued) {
			if (this.nameToValue.contains(s)) {
				throw new IllegalArgumentException("Multiple values have the same name '" + s + "'");
			}

			this.nameToValue.add(s);
		}
	}

	public static PropertyVariant create(String name, String...variants) {
		return new PropertyVariant(name, Lists.newArrayList(variants));
	}
	
	public static PropertyVariant create(String name, Collection<String> variants) {
		return new PropertyVariant(name, variants);
	}

	@Override
	public Collection<String> getAllowedValues() {
		return allowedValued;
	}

	@Override
	public Optional<String> parseValue(String value) {
		return Optional.<String>fromNullable(this.allowedValued.contains(value) ? value : null);
	}

	@Override
	public String getName(String value) {
		return value;
	}
	
	public String getNameFromValue(int value) {
		return value > nameToValue.size() ? "" : nameToValue.get(value);
	}
	
	public int getValue(String value) {
		return nameToValue.indexOf(value);
	}

}
