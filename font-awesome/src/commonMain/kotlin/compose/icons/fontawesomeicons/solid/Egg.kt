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

public val SolidGroup.Egg: ImageVector
    get() {
        if (_egg != null) {
            return _egg!!
        }
        _egg = Builder(name = "Egg", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 496.0f)
                curveTo(86.0f, 496.0f, 0.0f, 394.0f, 0.0f, 288.0f)
                curveTo(0.0f, 176.0f, 64.0f, 16.0f, 192.0f, 16.0f)
                reflectiveCurveToRelative(192.0f, 160.0f, 192.0f, 272.0f)
                curveToRelative(0.0f, 106.0f, -86.0f, 208.0f, -192.0f, 208.0f)
                close()
                moveTo(154.8f, 134.0f)
                curveToRelative(6.5f, -6.0f, 7.0f, -16.1f, 1.0f, -22.6f)
                reflectiveCurveToRelative(-16.1f, -7.0f, -22.6f, -1.0f)
                curveToRelative(-23.9f, 21.8f, -41.1f, 52.7f, -52.3f, 84.2f)
                curveTo(69.7f, 226.1f, 64.0f, 259.7f, 64.0f, 288.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                reflectiveCurveToRelative(16.0f, -7.2f, 16.0f, -16.0f)
                curveToRelative(0.0f, -24.5f, 5.0f, -54.4f, 15.1f, -82.8f)
                curveToRelative(10.1f, -28.5f, 25.0f, -54.1f, 43.7f, -71.2f)
                close()
            }
        }
        .build()
        return _egg!!
    }

private var _egg: ImageVector? = null
