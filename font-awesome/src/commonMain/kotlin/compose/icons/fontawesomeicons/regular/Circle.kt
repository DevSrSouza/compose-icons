package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Circle: ImageVector
    get() {
        if (_circle != null) {
            return _circle!!
        }
        _circle = Builder(name = "Circle", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                curveTo(119.0f, 8.0f, 8.0f, 119.0f, 8.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(393.0f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(256.0f, 456.0f)
                curveToRelative(-110.5f, 0.0f, -200.0f, -89.5f, -200.0f, -200.0f)
                reflectiveCurveTo(145.5f, 56.0f, 256.0f, 56.0f)
                reflectiveCurveToRelative(200.0f, 89.5f, 200.0f, 200.0f)
                reflectiveCurveToRelative(-89.5f, 200.0f, -200.0f, 200.0f)
                close()
            }
        }
        .build()
        return _circle!!
    }

private var _circle: ImageVector? = null
