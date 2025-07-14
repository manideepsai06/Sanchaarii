package com.sanchaarii.app;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = SanchaariiApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface SanchaariiApplication_GeneratedInjector {
  void injectSanchaariiApplication(SanchaariiApplication sanchaariiApplication);
}
