package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.LeftRight: ImageVector
    get() {
        if (_leftRight != null) {
            return _leftRight!!
        }
        _leftRight = Builder(name = "LeftRight", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.3f, 273.6f)
                curveToRelative(4.9f, -4.5f, 7.7f, -10.9f, 7.7f, -17.6f)
                reflectiveCurveToRelative(-2.8f, -13.0f, -7.7f, -17.6f)
                lineToRelative(-112.0f, -104.0f)
                curveToRelative(-7.0f, -6.5f, -17.2f, -8.2f, -25.9f, -4.4f)
                reflectiveCurveToRelative(-14.4f, 12.5f, -14.4f, 22.0f)
                lineToRelative(0.0f, 56.0f)
                lineToRelative(-192.0f, 0.0f)
                lineToRelative(0.0f, -56.0f)
                curveToRelative(0.0f, -9.5f, -5.7f, -18.2f, -14.4f, -22.0f)
                reflectiveCurveToRelative(-18.9f, -2.1f, -25.9f, 4.4f)
                lineToRelative(-112.0f, 104.0f)
                curveTo(2.8f, 243.0f, 0.0f, 249.3f, 0.0f, 256.0f)
                reflectiveCurveToRelative(2.8f, 13.0f, 7.7f, 17.6f)
                lineToRelative(112.0f, 104.0f)
                curveToRelative(7.0f, 6.5f, 17.2f, 8.2f, 25.9f, 4.4f)
                reflectiveCurveToRelative(14.4f, -12.5f, 14.4f, -22.0f)
                lineToRelative(0.0f, -56.0f)
                lineToRelative(192.0f, 0.0f)
                lineToRelative(0.0f, 56.0f)
                curveToRelative(0.0f, 9.5f, 5.7f, 18.2f, 14.4f, 22.0f)
                reflectiveCurveToRelative(18.9f, 2.1f, 25.9f, -4.4f)
                lineToRelative(112.0f, -104.0f)
                close()
            }
        }
        .build()
        return _leftRight!!
    }

private var _leftRight: ImageVector? = null
