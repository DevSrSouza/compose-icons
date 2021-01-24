package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }
        _fire = Builder(name = "Fire", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 23.86f)
                curveToRelative(0.0f, -23.8f, -30.65f, -32.77f, -44.15f, -13.04f)
                curveTo(48.0f, 191.85f, 224.0f, 200.0f, 224.0f, 288.0f)
                curveToRelative(0.0f, 35.63f, -29.11f, 64.46f, -64.85f, 63.99f)
                curveToRelative(-35.17f, -0.45f, -63.15f, -29.77f, -63.15f, -64.94f)
                verticalLineToRelative(-85.51f)
                curveToRelative(0.0f, -21.7f, -26.47f, -32.23f, -41.43f, -16.5f)
                curveTo(27.8f, 213.16f, 0.0f, 261.33f, 0.0f, 320.0f)
                curveToRelative(0.0f, 105.87f, 86.13f, 192.0f, 192.0f, 192.0f)
                reflectiveCurveToRelative(192.0f, -86.13f, 192.0f, -192.0f)
                curveToRelative(0.0f, -170.29f, -168.0f, -193.0f, -168.0f, -296.14f)
                close()
            }
        }
        .build()
        return _fire!!
    }

private var _fire: ImageVector? = null
