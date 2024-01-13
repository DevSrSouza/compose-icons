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

public val SimpleIcons.Mailtrap: ImageVector
    get() {
        if (_mailtrap != null) {
            return _mailtrap!!
        }
        _mailtrap = Builder(name = "Mailtrap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.3715f, 17.6068f)
                lineTo(3.3348f, 18.8148f)
                curveToRelative(-0.2763f, 0.1817f, -0.15f, 0.494f, 0.0f, 0.5569f)
                lineToRelative(7.9098f, 4.4319f)
                curveToRelative(0.4672f, 0.2618f, 1.0429f, 0.2618f, 1.5101f, 0.0f)
                lineToRelative(8.0146f, -4.4907f)
                curveToRelative(0.2428f, -0.1438f, 0.203f, -0.4361f, 0.0f, -0.5348f)
                lineToRelative(-2.1535f, -1.1635f)
                curveToRelative(-0.1817f, -0.1199f, -0.5871f, -0.08f, -0.7307f, 0.0176f)
                lineToRelative(-5.1304f, 2.8746f)
                curveToRelative(-0.4672f, 0.2618f, -1.0429f, 0.2618f, -1.5101f, 0.0f)
                lineToRelative(-5.1758f, -2.9001f)
                curveToRelative(-0.1929f, -0.1187f, -0.4986f, -0.112f, -0.6973f, 0.0f)
                close()
                moveTo(11.2449f, 0.1963f)
                curveToRelative(0.4672f, -0.2618f, 1.0428f, -0.2618f, 1.51f, 0.0f)
                lineToRelative(6.3697f, 3.569f)
                curveToRelative(0.2543f, 0.1286f, 0.2773f, 0.474f, 0.0f, 0.6298f)
                curveToRelative(-0.4199f, 0.2344f, -0.9831f, 0.5486f, -1.4504f, 0.8092f)
                curveToRelative(-0.5459f, 0.3045f, -1.2106f, 0.3036f, -1.7559f, -0.002f)
                lineToRelative(-3.1633f, -1.7724f)
                curveToRelative(-0.4672f, -0.2618f, -1.0428f, -0.2618f, -1.51f, 0.0f)
                lineToRelative(-3.167f, 1.7745f)
                curveToRelative(-0.5458f, 0.3058f, -1.211f, 0.3063f, -1.7573f, 0.0016f)
                curveToRelative(-0.4858f, -0.271f, -1.0752f, -0.5995f, -1.4999f, -0.8357f)
                curveToRelative(-0.2356f, -0.1012f, -0.2846f, -0.4015f, 0.0f, -0.5745f)
                lineTo(11.2449f, 0.1963f)
                close()
                moveTo(21.9689f, 5.5684f)
                curveToRelative(0.4672f, 0.2618f, 0.7551f, 0.7456f, 0.7551f, 1.2692f)
                verticalLineToRelative(10.3253f)
                curveToRelative(0.0f, 0.511f, -0.32f, 0.6064f, -0.6614f, 0.4279f)
                lineToRelative(-2.3588f, -1.2731f)
                lineTo(19.7038f, 9.3759f)
                lineToRelative(-6.9488f, 3.8935f)
                curveToRelative(-0.4672f, 0.2618f, -1.0428f, 0.2618f, -1.51f, 0.0f)
                lineToRelative(-6.9488f, -3.8935f)
                verticalLineToRelative(6.9408f)
                lineTo(2.1528f, 17.5892f)
                curveToRelative(-0.2555f, 0.1624f, -0.8768f, 0.2136f, -0.8768f, -0.4264f)
                lineTo(1.276f, 6.8376f)
                curveToRelative(0.0f, -0.5236f, 0.2878f, -1.0074f, 0.755f, -1.2692f)
                curveToRelative(0.7517f, -0.3937f, 1.5285f, 0.0f, 1.5285f, 0.0f)
                lineToRelative(8.4404f, 4.7396f)
                lineToRelative(8.4273f, -4.7396f)
                reflectiveCurveToRelative(0.7484f, -0.4514f, 1.5417f, 0.0f)
                close()
            }
        }
        .build()
        return _mailtrap!!
    }

private var _mailtrap: ImageVector? = null
