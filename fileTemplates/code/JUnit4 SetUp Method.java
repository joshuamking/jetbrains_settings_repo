@org.junit.Before
@Override
public void setUp() throws Exception {
    super.setUp();
    setActivityInitialTouchMode(false);

    mActivity = getActivity();
    assertNotNull(mActivity);
	
  ${BODY}
}