package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.ChartAreaLineFilled: ImageVector
    get() {
        if (_chartAreaLineFilled != null) {
            return _chartAreaLineFilled!!
        }
        _chartAreaLineFilled = Builder(name = "ChartAreaLineFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.22f, 9.375f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.393f, -0.165f)
                lineToRelative(0.094f, 0.083f)
                lineToRelative(4.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.284f, 0.576f)
                lineToRelative(0.009f, 0.131f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.883f, 0.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-16.022f)
                lineToRelative(-0.11f, -0.009f)
                lineToRelative(-0.11f, -0.02f)
                lineToRelative(-0.107f, -0.034f)
                lineToRelative(-0.105f, -0.046f)
                lineToRelative(-0.1f, -0.059f)
                lineToRelative(-0.094f, -0.07f)
                lineToRelative(-0.06f, -0.055f)
                lineToRelative(-0.072f, -0.082f)
                lineToRelative(-0.064f, -0.089f)
                lineToRelative(-0.054f, -0.096f)
                lineToRelative(-0.016f, -0.035f)
                lineToRelative(-0.04f, -0.103f)
                lineToRelative(-0.027f, -0.106f)
                lineToRelative(-0.015f, -0.108f)
                lineToRelative(-0.004f, -0.11f)
                lineToRelative(0.009f, -0.11f)
                lineToRelative(0.019f, -0.105f)
                curveToRelative(0.01f, -0.04f, 0.022f, -0.077f, 0.035f, -0.112f)
                lineToRelative(0.046f, -0.105f)
                lineToRelative(0.059f, -0.1f)
                lineToRelative(4.0f, -6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.165f, -0.39f)
                lineToRelative(0.114f, 0.05f)
                lineToRelative(3.277f, 1.638f)
                lineToRelative(3.495f, -4.369f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.232f, 3.36f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.382f, -0.15f)
                lineToRelative(0.093f, 0.083f)
                lineToRelative(4.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.32f, 1.497f)
                lineToRelative(-0.094f, -0.083f)
                lineToRelative(-3.226f, -3.225f)
                lineToRelative(-4.299f, 5.158f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.1f, 0.303f)
                lineToRelative(-0.115f, -0.049f)
                lineToRelative(-3.254f, -1.626f)
                lineToRelative(-2.499f, 3.332f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.295f, 0.269f)
                lineToRelative(-0.105f, -0.069f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.269f, -1.295f)
                lineToRelative(0.069f, -0.105f)
                lineToRelative(3.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.137f, -0.341f)
                lineToRelative(0.11f, 0.047f)
                lineToRelative(3.291f, 1.645f)
                lineToRelative(4.494f, -5.391f)
                close()
            }
        }
        .build()
        return _chartAreaLineFilled!!
    }

private var _chartAreaLineFilled: ImageVector? = null
