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

public val SimpleIcons.Prepbytes: ImageVector
    get() {
        if (_prepbytes != null) {
            return _prepbytes!!
        }
        _prepbytes = Builder(name = "Prepbytes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.427f, 0.0f, 0.0997f, 5.3717f, 0.1016f, 12.0f)
                curveToRelative(0.0f, 6.6283f, 5.3273f, 12.0f, 11.8984f, 12.0f)
                reflectiveCurveToRelative(11.8984f, -5.3736f, 11.8984f, -12.0f)
                curveToRelative(0.0f, -6.6283f, -5.3273f, -12.0f, -11.8984f, -12.0f)
                close()
                moveTo(13.4082f, 7.1602f)
                horizontalLineToRelative(1.127f)
                verticalLineToRelative(3.914f)
                lineToRelative(0.2675f, -0.1855f)
                arcToRelative(3.5647f, 3.5647f, 0.0f, false, true, 2.252f, -0.6992f)
                curveToRelative(0.0095f, 0.0f, 0.0198f, 0.002f, 0.0293f, 0.002f)
                curveToRelative(1.924f, 0.1048f, 3.3998f, 1.7497f, 3.2969f, 3.6737f)
                curveToRelative(-0.2155f, 3.5392f, -5.069f, 4.5848f, -6.625f, 1.3946f)
                curveToRelative(-0.3757f, -0.7761f, -0.3483f, -0.4843f, -0.375f, -4.5059f)
                lineToRelative(0.0273f, -3.5937f)
                close()
                moveTo(8.6758f, 7.293f)
                arcToRelative(3.4259f, 3.4259f, 0.0f, false, true, 2.1308f, 0.7539f)
                curveToRelative(1.5084f, 1.1765f, 1.7943f, 3.3475f, 0.6387f, 4.873f)
                curveToRelative(-1.167f, 1.5408f, -3.3616f, 1.8448f, -4.9023f, 0.6778f)
                curveToRelative(-0.0801f, -0.0534f, -0.1895f, -0.1068f, -0.2696f, -0.1602f)
                curveToRelative(-0.0267f, 0.0f, -0.0273f, 0.8561f, -0.0273f, 1.9297f)
                verticalLineToRelative(1.9297f)
                lineTo(5.119f, 17.2969f)
                verticalLineToRelative(-3.1895f)
                curveToRelative(0.0f, -3.8614f, 0.0013f, -4.0768f, 0.377f, -4.8281f)
                arcTo(3.6055f, 3.6055f, 0.0f, false, true, 7.91f, 7.375f)
                curveToRelative(0.2541f, -0.0572f, 0.5101f, -0.0831f, 0.7657f, -0.082f)
                close()
                moveTo(8.6074f, 8.3965f)
                curveToRelative(-1.0545f, -0.0057f, -1.9793f, 0.6966f, -2.2539f, 1.7148f)
                curveToRelative(-0.3337f, 1.2357f, 0.3992f, 2.51f, 1.6367f, 2.8438f)
                curveToRelative(1.2357f, 0.3337f, 2.5081f, -0.3992f, 2.8418f, -1.6367f)
                curveToRelative(0.3337f, -1.2357f, -0.3972f, -2.5081f, -1.6347f, -2.8418f)
                arcToRelative(2.2104f, 2.2104f, 0.0f, false, false, -0.5899f, -0.0801f)
                close()
                moveTo(17.0274f, 11.293f)
                curveToRelative(-1.1232f, -0.0687f, -2.142f, 0.659f, -2.4395f, 1.7441f)
                curveToRelative(-0.347f, 1.2662f, 0.3979f, 2.5748f, 1.664f, 2.9219f)
                curveToRelative(1.2662f, 0.347f, 2.5749f, -0.398f, 2.922f, -1.664f)
                curveToRelative(0.347f, -1.2662f, -0.398f, -2.5749f, -1.6641f, -2.922f)
                arcToRelative(1.48f, 1.48f, 0.0f, false, false, -0.4825f, -0.08f)
                close()
            }
        }
        .build()
        return _prepbytes!!
    }

private var _prepbytes: ImageVector? = null
