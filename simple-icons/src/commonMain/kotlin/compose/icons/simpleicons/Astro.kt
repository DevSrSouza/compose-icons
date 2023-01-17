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

public val SimpleIcons.Astro: ImageVector
    get() {
        if (_astro != null) {
            return _astro!!
        }
        _astro = Builder(name = "Astro", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.074f, 16.86f)
                curveToRelative(-0.72f, 0.616f, -2.157f, 1.035f, -3.812f, 1.035f)
                curveToRelative(-2.032f, 0.0f, -3.735f, -0.632f, -4.187f, -1.483f)
                curveToRelative(-0.161f, 0.488f, -0.198f, 1.046f, -0.198f, 1.402f)
                curveToRelative(0.0f, 0.0f, -0.106f, 1.75f, 1.111f, 2.968f)
                curveToRelative(0.0f, -0.632f, 0.513f, -1.145f, 1.145f, -1.145f)
                curveToRelative(1.083f, 0.0f, 1.082f, 0.945f, 1.081f, 1.712f)
                verticalLineToRelative(0.069f)
                curveToRelative(0.0f, 1.164f, 0.711f, 2.161f, 1.723f, 2.582f)
                arcToRelative(2.347f, 2.347f, 0.0f, false, true, -0.236f, -1.029f)
                curveToRelative(0.0f, -1.11f, 0.652f, -1.523f, 1.41f, -2.003f)
                curveToRelative(0.602f, -0.383f, 1.272f, -0.807f, 1.733f, -1.66f)
                arcToRelative(3.129f, 3.129f, 0.0f, false, false, 0.378f, -1.494f)
                arcToRelative(3.14f, 3.14f, 0.0f, false, false, -0.148f, -0.954f)
                close()
                moveTo(15.551f, 0.6f)
                curveToRelative(0.196f, 0.244f, 0.296f, 0.572f, 0.496f, 1.229f)
                lineToRelative(4.368f, 14.347f)
                arcToRelative(18.18f, 18.18f, 0.0f, false, false, -5.222f, -1.768f)
                lineTo(12.35f, 4.8f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, false, -0.71f, 0.002f)
                lineToRelative(-2.81f, 9.603f)
                arcToRelative(18.175f, 18.175f, 0.0f, false, false, -5.245f, 1.771f)
                lineTo(7.974f, 1.827f)
                curveToRelative(0.2f, -0.656f, 0.3f, -0.984f, 0.497f, -1.227f)
                arcToRelative(1.613f, 1.613f, 0.0f, false, true, 0.654f, -0.484f)
                curveTo(9.415f, 0.0f, 9.757f, 0.0f, 10.443f, 0.0f)
                horizontalLineToRelative(3.135f)
                curveToRelative(0.686f, 0.0f, 1.03f, 0.0f, 1.32f, 0.117f)
                arcTo(1.614f, 1.614f, 0.0f, false, true, 15.55f, 0.6f)
                close()
            }
        }
        .build()
        return _astro!!
    }

private var _astro: ImageVector? = null
