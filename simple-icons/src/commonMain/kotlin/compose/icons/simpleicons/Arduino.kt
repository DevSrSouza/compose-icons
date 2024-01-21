package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Arduino: ImageVector
    get() {
        if (_arduino != null) {
            return _arduino!!
        }
        _arduino = Builder(name = "Arduino", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.087f, 6.146f)
                curveToRelative(-0.3f, 0.0f, -0.607f, 0.017f, -0.907f, 0.069f)
                curveToRelative(-2.532f, 0.367f, -4.23f, 2.239f, -5.18f, 3.674f)
                curveToRelative(-0.95f, -1.435f, -2.648f, -3.307f, -5.18f, -3.674f)
                arcToRelative(6.49f, 6.49f, 0.0f, false, false, -0.907f, -0.069f)
                curveTo(2.648f, 6.146f, 0.0f, 8.77f, 0.0f, 12.0f)
                reflectiveCurveToRelative(2.656f, 5.854f, 5.913f, 5.854f)
                curveToRelative(0.3f, 0.0f, 0.607f, -0.017f, 0.916f, -0.069f)
                curveToRelative(2.531f, -0.376f, 4.23f, -2.247f, 5.18f, -3.683f)
                curveToRelative(0.949f, 1.436f, 2.647f, 3.307f, 5.18f, 3.683f)
                curveToRelative(0.299f, 0.043f, 0.607f, 0.069f, 0.915f, 0.069f)
                curveTo(21.344f, 17.854f, 24.0f, 15.23f, 24.0f, 12.0f)
                reflectiveCurveToRelative(-2.656f, -5.854f, -5.913f, -5.854f)
                close()
                moveTo(6.53f, 15.734f)
                arcToRelative(3.837f, 3.837f, 0.0f, false, true, -0.625f, 0.043f)
                curveToRelative(-2.148f, 0.0f, -3.889f, -1.7f, -3.889f, -3.777f)
                curveToRelative(0.0f, -2.085f, 1.749f, -3.777f, 3.898f, -3.777f)
                curveToRelative(0.208f, 0.0f, 0.416f, 0.017f, 0.624f, 0.043f)
                curveToRelative(2.39f, 0.35f, 3.847f, 2.768f, 4.347f, 3.734f)
                curveToRelative(-0.508f, 0.974f, -1.974f, 3.384f, -4.355f, 3.734f)
                close()
                moveTo(18.088f, 15.777f)
                curveToRelative(-0.208f, 0.0f, -0.416f, -0.017f, -0.624f, -0.043f)
                curveToRelative(-2.39f, -0.35f, -3.856f, -2.768f, -4.347f, -3.734f)
                curveToRelative(0.491f, -0.966f, 1.957f, -3.384f, 4.347f, -3.734f)
                curveToRelative(0.208f, -0.026f, 0.416f, -0.043f, 0.624f, -0.043f)
                curveToRelative(2.149f, 0.0f, 3.89f, 1.7f, 3.89f, 3.777f)
                curveToRelative(0.0f, 2.085f, -1.75f, 3.777f, -3.89f, 3.777f)
                close()
                moveTo(19.738f, 11.373f)
                verticalLineToRelative(1.134f)
                horizontalLineToRelative(-1.205f)
                verticalLineToRelative(1.182f)
                horizontalLineToRelative(-1.156f)
                verticalLineToRelative(-1.182f)
                lineTo(16.17f, 12.507f)
                verticalLineToRelative(-1.134f)
                horizontalLineToRelative(1.206f)
                lineTo(17.376f, 10.19f)
                horizontalLineToRelative(1.156f)
                verticalLineToRelative(1.183f)
                horizontalLineToRelative(1.206f)
                close()
                moveTo(4.246f, 12.498f)
                lineTo(7.82f, 12.498f)
                verticalLineToRelative(-1.125f)
                lineTo(4.245f, 11.373f)
                verticalLineToRelative(1.125f)
                close()
            }
        }
        .build()
        return _arduino!!
    }

private var _arduino: ImageVector? = null
