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

public val SolidGroup.Radiation: ImageVector
    get() {
        if (_radiation != null) {
            return _radiation!!
        }
        _radiation = Builder(name = "Radiation", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(328.2f, 255.8f)
                horizontalLineToRelative(151.6f)
                curveToRelative(9.1f, 0.0f, 16.8f, -7.7f, 16.2f, -16.8f)
                curveToRelative(-5.1f, -75.8f, -44.4f, -142.2f, -102.5f, -184.2f)
                curveToRelative(-7.4f, -5.3f, -17.9f, -2.9f, -22.7f, 4.8f)
                lineTo(290.4f, 188.0f)
                curveToRelative(22.6f, 14.3f, 37.8f, 39.2f, 37.8f, 67.8f)
                close()
                moveTo(290.4f, 323.5f)
                curveToRelative(-12.3f, 7.7f, -26.8f, 12.4f, -42.4f, 12.4f)
                curveToRelative(-15.6f, 0.0f, -30.0f, -4.7f, -42.4f, -12.4f)
                lineTo(125.2f, 452.0f)
                curveToRelative(-4.8f, 7.7f, -2.4f, 18.1f, 5.6f, 22.4f)
                curveTo(165.7f, 493.2f, 205.6f, 504.0f, 248.0f, 504.0f)
                reflectiveCurveToRelative(82.3f, -10.8f, 117.2f, -29.6f)
                curveToRelative(8.0f, -4.3f, 10.4f, -14.8f, 5.6f, -22.4f)
                lineToRelative(-80.4f, -128.5f)
                close()
                moveTo(248.0f, 303.8f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                reflectiveCurveToRelative(-21.5f, -48.0f, -48.0f, -48.0f)
                reflectiveCurveToRelative(-48.0f, 21.5f, -48.0f, 48.0f)
                reflectiveCurveToRelative(21.5f, 48.0f, 48.0f, 48.0f)
                close()
                moveTo(16.2f, 255.8f)
                horizontalLineToRelative(151.6f)
                curveToRelative(0.0f, -28.6f, 15.2f, -53.5f, 37.8f, -67.7f)
                lineTo(125.2f, 59.7f)
                curveToRelative(-4.8f, -7.7f, -15.3f, -10.2f, -22.7f, -4.8f)
                curveTo(44.4f, 96.9f, 5.1f, 163.3f, 0.0f, 239.1f)
                curveToRelative(-0.6f, 9.0f, 7.1f, 16.7f, 16.2f, 16.7f)
                close()
            }
        }
        .build()
        return _radiation!!
    }

private var _radiation: ImageVector? = null
