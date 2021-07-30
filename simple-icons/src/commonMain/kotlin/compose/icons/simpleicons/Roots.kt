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

public val SimpleIcons.Roots: ImageVector
    get() {
        if (_roots != null) {
            return _roots!!
        }
        _roots = Builder(name = "Roots", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.513f, 12.27f)
                lineTo(2.6f, 18.177f)
                arcToRelative(0.244f, 0.244f, 0.0f, false, true, -0.174f, 0.072f)
                lineToRelative(-0.02f, -0.001f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, true, -0.178f, -0.102f)
                arcToRelative(11.973f, 11.973f, 0.0f, false, true, -0.889f, -1.452f)
                arcToRelative(0.247f, 0.247f, 0.0f, false, true, 0.045f, -0.287f)
                lineToRelative(5.638f, -5.628f)
                arcToRelative(9.403f, 9.403f, 0.0f, false, false, 2.776f, -6.694f)
                arcToRelative(0.245f, 0.245f, 0.0f, false, true, 0.49f, 0.0f)
                verticalLineToRelative(3.911f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.774f, 4.274f)
                close()
                moveTo(18.0f, 0.842f)
                arcToRelative(0.242f, 0.242f, 0.0f, false, false, -0.245f, 0.0f)
                arcToRelative(0.246f, 0.246f, 0.0f, false, false, -0.122f, 0.212f)
                verticalLineToRelative(10.855f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.773f, 4.273f)
                lineToRelative(1.997f, 1.995f)
                arcToRelative(0.246f, 0.246f, 0.0f, false, false, 0.173f, 0.072f)
                lineToRelative(0.021f, -0.001f)
                arcToRelative(0.256f, 0.256f, 0.0f, false, false, 0.18f, -0.102f)
                arcTo(11.902f, 11.902f, 0.0f, false, false, 24.0f, 11.21f)
                curveToRelative(0.0f, -4.255f, -2.298f, -8.228f, -6.0f, -10.367f)
                close()
                moveTo(6.367f, 4.085f)
                lineTo(6.367f, 1.054f)
                arcTo(0.244f, 0.244f, 0.0f, false, false, 6.0f, 0.842f)
                curveTo(2.3f, 2.982f, 0.0f, 6.954f, 0.0f, 11.21f)
                curveToRelative(0.0f, 0.34f, 0.018f, 0.705f, 0.056f, 1.115f)
                curveToRelative(0.01f, 0.094f, 0.072f, 0.174f, 0.161f, 0.208f)
                arcToRelative(0.294f, 0.294f, 0.0f, false, false, 0.084f, 0.014f)
                arcToRelative(0.245f, 0.245f, 0.0f, false, false, 0.172f, -0.071f)
                lineToRelative(4.123f, -4.118f)
                arcToRelative(5.999f, 5.999f, 0.0f, false, false, 1.771f, -4.273f)
                close()
                moveTo(16.981f, 18.605f)
                arcToRelative(9.402f, 9.402f, 0.0f, false, true, -2.778f, -6.696f)
                lineTo(14.203f, 7.996f)
                arcToRelative(0.245f, 0.245f, 0.0f, true, false, -0.489f, 0.0f)
                arcToRelative(9.401f, 9.401f, 0.0f, false, true, -2.776f, 6.696f)
                lineToRelative(-5.915f, 5.905f)
                arcToRelative(0.244f, 0.244f, 0.0f, false, false, -0.071f, 0.193f)
                arcToRelative(0.243f, 0.243f, 0.0f, false, false, 0.102f, 0.18f)
                arcTo(11.929f, 11.929f, 0.0f, false, false, 12.0f, 23.192f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 6.947f, -2.222f)
                arcToRelative(0.237f, 0.237f, 0.0f, false, false, 0.1f, -0.18f)
                arcToRelative(0.239f, 0.239f, 0.0f, false, false, -0.068f, -0.193f)
                lineToRelative(-1.998f, -1.992f)
                close()
            }
        }
        .build()
        return _roots!!
    }

private var _roots: ImageVector? = null
