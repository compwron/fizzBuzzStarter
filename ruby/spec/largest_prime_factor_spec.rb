require_relative "spec_helper"

describe LargestPrimeFactor do
  
  describe "#largest_factor_of" do
    it "should return 1 for 1" do
      LargestPrimeFactor.new.largest_factor_of(1).should == 1
    end

    it "should return 2 for 2" do
      LargestPrimeFactor.new.largest_factor_of(2).should == 2
    end
  end
end
