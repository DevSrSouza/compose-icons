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

public val RegularGroup.Frown: ImageVector
    get() {
        if (_frown != null) {
            return _frown!!
        }
        _frown = Builder(name = "Frown", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.0f, 8.0f, 0.0f, 119.0f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(385.0f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(248.0f, 456.0f)
                curveToRelative(-110.3f, 0.0f, -200.0f, -89.7f, -200.0f, -200.0f)
                reflectiveCurveTo(137.7f, 56.0f, 248.0f, 56.0f)
                reflectiveCurveToRelative(200.0f, 89.7f, 200.0f, 200.0f)
                reflectiveCurveToRelative(-89.7f, 200.0f, -200.0f, 200.0f)
                close()
                moveTo(168.0f, 240.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                close()
                moveTo(328.0f, 176.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(248.0f, 304.0f)
                curveToRelative(-40.2f, 0.0f, -78.0f, 17.7f, -103.8f, 48.6f)
                curveToRelative(-8.5f, 10.2f, -7.1f, 25.3f, 3.1f, 33.8f)
                curveToRelative(10.2f, 8.4f, 25.3f, 7.1f, 33.8f, -3.1f)
                curveToRelative(16.6f, -19.9f, 41.0f, -31.4f, 66.9f, -31.4f)
                reflectiveCurveToRelative(50.3f, 11.4f, 66.9f, 31.4f)
                curveToRelative(8.1f, 9.7f, 23.1f, 11.9f, 33.8f, 3.1f)
                curveToRelative(10.2f, -8.5f, 11.5f, -23.6f, 3.1f, -33.8f)
                curveTo(326.0f, 321.7f, 288.2f, 304.0f, 248.0f, 304.0f)
                close()
            }
        }
        .build()
        return _frown!!
    }

private var _frown: ImageVector? = null
