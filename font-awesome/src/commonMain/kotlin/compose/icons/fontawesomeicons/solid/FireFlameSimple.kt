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

public val SolidGroup.FireFlameSimple: ImageVector
    get() {
        if (_fireFlameSimple != null) {
            return _fireFlameSimple!!
        }
        _fireFlameSimple = Builder(name = "FireFlameSimple", defaultWidth = 384.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(372.5f, 256.5f)
                lineToRelative(-0.7f, -1.9f)
                curveTo(337.8f, 160.8f, 282.0f, 76.5f, 209.1f, 8.5f)
                lineToRelative(-3.3f, -3.0f)
                curveTo(202.1f, 2.0f, 197.1f, 0.0f, 192.0f, 0.0f)
                reflectiveCurveToRelative(-10.1f, 2.0f, -13.8f, 5.5f)
                lineToRelative(-3.3f, 3.0f)
                curveTo(102.0f, 76.5f, 46.2f, 160.8f, 12.2f, 254.6f)
                lineToRelative(-0.7f, 1.9f)
                curveTo(3.9f, 277.3f, 0.0f, 299.4f, 0.0f, 321.6f)
                curveTo(0.0f, 426.7f, 86.8f, 512.0f, 192.0f, 512.0f)
                reflectiveCurveToRelative(192.0f, -85.3f, 192.0f, -190.4f)
                curveToRelative(0.0f, -22.2f, -3.9f, -44.2f, -11.5f, -65.1f)
                close()
                moveTo(281.7f, 306.0f)
                curveToRelative(4.1f, 9.3f, 6.2f, 19.4f, 6.2f, 29.5f)
                curveToRelative(0.0f, 53.0f, -43.0f, 96.5f, -96.0f, 96.5f)
                reflectiveCurveToRelative(-96.0f, -43.5f, -96.0f, -96.5f)
                curveToRelative(0.0f, -10.1f, 2.1f, -20.3f, 6.2f, -29.5f)
                lineToRelative(1.9f, -4.3f)
                curveToRelative(15.8f, -35.4f, 37.9f, -67.7f, 65.3f, -95.1f)
                lineToRelative(8.9f, -8.9f)
                curveToRelative(3.6f, -3.6f, 8.5f, -5.6f, 13.6f, -5.6f)
                reflectiveCurveToRelative(10.0f, 2.0f, 13.6f, 5.6f)
                lineToRelative(8.9f, 8.9f)
                curveToRelative(27.4f, 27.4f, 49.6f, 59.7f, 65.3f, 95.1f)
                lineToRelative(1.9f, 4.3f)
                close()
            }
        }
        .build()
        return _fireFlameSimple!!
    }

private var _fireFlameSimple: ImageVector? = null
