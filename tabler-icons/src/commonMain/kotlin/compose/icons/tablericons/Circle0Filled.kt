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

public val TablerIcons.Circle0Filled: ImageVector
    get() {
        if (_circle0Filled != null) {
            return _circle0Filled!!
        }
        _circle0Filled = Builder(name = "Circle0Filled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveToRelative(-10.0f, -4.477f, -10.0f, -10.0f)
                reflectiveCurveToRelative(4.477f, -10.0f, 10.0f, -10.0f)
                close()
                moveTo(12.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.995f, 2.824f)
                lineToRelative(-0.005f, 0.176f)
                verticalLineToRelative(4.0f)
                lineToRelative(0.005f, 0.176f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 5.99f, 0.0f)
                lineToRelative(0.005f, -0.176f)
                verticalLineToRelative(-4.0f)
                lineToRelative(-0.005f, -0.176f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.995f, -2.824f)
                close()
                moveTo(12.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(4.0f)
                lineToRelative(-0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.986f, 0.0f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-4.0f)
                lineToRelative(0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.993f, -0.883f)
                close()
            }
        }
        .build()
        return _circle0Filled!!
    }

private var _circle0Filled: ImageVector? = null
