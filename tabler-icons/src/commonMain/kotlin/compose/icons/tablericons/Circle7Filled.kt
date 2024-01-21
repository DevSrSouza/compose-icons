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

public val TablerIcons.Circle7Filled: ImageVector
    get() {
        if (_circle7Filled != null) {
            return _circle7Filled!!
        }
        _circle7Filled = Builder(name = "Circle7Filled", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(14.0f, 7.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.876f, 0.876f)
                lineToRelative(-0.007f, 0.117f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.876f, 0.876f)
                lineToRelative(0.117f, 0.007f)
                horizontalLineToRelative(2.718f)
                lineToRelative(-1.688f, 6.757f)
                lineToRelative(-0.022f, 0.115f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.927f, 0.482f)
                lineToRelative(0.035f, -0.111f)
                lineToRelative(2.0f, -8.0f)
                lineToRelative(0.021f, -0.112f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.878f, -1.125f)
                lineToRelative(-0.113f, -0.006f)
                close()
            }
        }
        .build()
        return _circle7Filled!!
    }

private var _circle7Filled: ImageVector? = null
