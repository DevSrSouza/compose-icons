package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.ClockFilled: ImageVector
    get() {
        if (_clockFilled != null) {
            return _clockFilled!!
        }
        _clockFilled = Builder(name = "ClockFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 3.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -14.995f, 8.984f)
                lineToRelative(-0.005f, -0.324f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.995f, -8.336f)
                close()
                moveTo(12.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                verticalLineToRelative(5.0f)
                lineToRelative(0.009f, 0.131f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.197f, 0.477f)
                lineToRelative(0.087f, 0.1f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(0.094f, 0.082f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.226f, 0.0f)
                lineToRelative(0.094f, -0.083f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.226f)
                lineToRelative(-0.083f, -0.094f)
                lineToRelative(-2.707f, -2.708f)
                verticalLineToRelative(-4.585f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, -0.883f)
                close()
            }
        }
        .build()
        return _clockFilled!!
    }

private var _clockFilled: ImageVector? = null
