package com.insightfullogic.honest_profiler.core.profiles.lean.info;

import com.insightfullogic.honest_profiler.core.parser.StackFrame;

/**
 * FrameInfo collects the metadata about a {@link StackFrame}. It records the method id and, if available, the BCI (Byte
 * Code Index) and the line number for the frame.
 */
public class FrameInfo
{
    // Instance Properties

    private final long methodId;
    private final int bci;
    private final int lineNr;

    // Instance Constructors

    /**
     * Constructor which extracts the metadata from a {@link StackFrame}.
     * <p>
     * @param stackFrame the {@link StackFrame} whose metadata will be stored
     */
    public FrameInfo(StackFrame stackFrame)
    {
        this.methodId = stackFrame.getMethodId();
        this.bci = stackFrame.getBci();
        this.lineNr = stackFrame.getLineNumber();
    }

    // Instance Accessors

    /**
     * Returns the id of the method whose execution was recorded in the frame.
     * <p>
     * @return the id of the method whose execution was recorded in the frame
     */
    public long getMethodId()
    {
        return methodId;
    }

    /**
     * Returns the Byte Code Index of the execution point recorded in the frame.
     * <p>
     * @return the Byte Code Index of the execution point recorded in the frame
     */
    public int getBci()
    {
        return bci;
    }

    /**
     * Returns the line number of the execution point recorded in the frame.
     * <p>
     * @return the line number of the execution point recorded in the frame
     */
    public int getLineNr()
    {
        return lineNr;
    }

    // Object Implementation

    @Override
    // Generated by Eclipse
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + bci;
        result = prime * result + lineNr;
        result = prime * result + (int)(methodId ^ (methodId >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }

        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }

        FrameInfo other = (FrameInfo)obj;
        return (bci == other.bci && lineNr == other.lineNr && methodId == other.methodId);
    }

    @Override
    public String toString()
    {
        return "frame[" + methodId + ":" + lineNr + ":" + bci + "]";
    }
}
