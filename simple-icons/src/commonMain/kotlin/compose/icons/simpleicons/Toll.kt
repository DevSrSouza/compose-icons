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

public val SimpleIcons.Toll: ImageVector
    get() {
        if (_toll != null) {
            return _toll!!
        }
        _toll = Builder(name = "Toll", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.852f, 13.351f)
                lineTo(24.0f, 13.351f)
                lineToRelative(-0.645f, 1.455f)
                horizontalLineToRelative(-3.346f)
                curveToRelative(-0.689f, 0.0f, -1.158f, -0.584f, -0.898f, -1.15f)
                lineToRelative(1.978f, -4.463f)
                horizontalLineToRelative(2.356f)
                lineToRelative(-1.75f, 3.954f)
                curveToRelative(-0.037f, 0.088f, -0.008f, 0.202f, 0.157f, 0.204f)
                close()
                moveTo(6.147f, 10.647f)
                lineToRelative(-1.843f, 4.159f)
                lineTo(3.303f, 14.806f)
                curveToRelative(-0.601f, 0.0f, -1.061f, -0.556f, -0.852f, -1.045f)
                lineToRelative(1.379f, -3.114f)
                lineTo(0.0f, 10.647f)
                lineToRelative(0.112f, -0.252f)
                horizontalLineToRelative(7.375f)
                curveToRelative(0.375f, 0.0f, 0.955f, -0.058f, 1.534f, -0.338f)
                curveToRelative(0.155f, -0.074f, 0.845f, -0.473f, 1.503f, -0.864f)
                horizontalLineToRelative(1.474f)
                curveToRelative(-0.411f, 0.194f, -2.381f, 1.141f, -2.617f, 1.227f)
                curveToRelative(-0.618f, 0.225f, -1.017f, 0.227f, -1.526f, 0.227f)
                lineTo(6.147f, 10.647f)
                close()
                moveTo(6.685f, 10.176f)
                lineTo(0.209f, 10.176f)
                curveToRelative(0.195f, -0.442f, 0.632f, -0.983f, 1.933f, -0.983f)
                horizontalLineToRelative(6.18f)
                curveToRelative(-0.351f, 0.44f, -0.704f, 0.983f, -1.637f, 0.983f)
                close()
                moveTo(16.686f, 13.147f)
                curveToRelative(-0.037f, 0.088f, -0.007f, 0.202f, 0.157f, 0.204f)
                horizontalLineToRelative(2.149f)
                lineToRelative(-0.644f, 1.455f)
                horizontalLineToRelative(-3.347f)
                curveToRelative(-0.689f, 0.0f, -1.157f, -0.584f, -0.898f, -1.15f)
                lineToRelative(1.978f, -4.463f)
                horizontalLineToRelative(2.356f)
                lineToRelative(-1.75f, 3.954f)
                horizontalLineToRelative(-0.001f)
                close()
                moveTo(14.855f, 9.708f)
                curveToRelative(0.283f, 0.402f, 0.128f, 1.0f, -0.107f, 1.506f)
                lineToRelative(-0.91f, 2.055f)
                curveToRelative(-0.686f, 1.655f, -3.056f, 1.536f, -3.056f, 1.536f)
                lineTo(8.085f, 14.805f)
                reflectiveCurveToRelative(-2.332f, 0.122f, -1.315f, -2.167f)
                lineToRelative(0.785f, -1.774f)
                horizontalLineToRelative(0.655f)
                curveToRelative(0.531f, 0.0f, 1.182f, -0.165f, 1.48f, -0.282f)
                lineToRelative(3.509f, -1.389f)
                horizontalLineToRelative(0.616f)
                curveToRelative(0.497f, 0.0f, 0.871f, 0.24f, 1.037f, 0.515f)
                horizontalLineToRelative(0.003f)
                close()
                moveTo(12.455f, 11.084f)
                curveToRelative(0.119f, -0.291f, -0.054f, -0.437f, -0.294f, -0.437f)
                horizontalLineToRelative(-1.7f)
                curveToRelative(-0.343f, -0.002f, -0.512f, 0.168f, -0.563f, 0.279f)
                curveToRelative(-0.036f, 0.074f, -0.854f, 1.925f, -0.854f, 1.925f)
                curveToRelative(-0.233f, 0.518f, 0.261f, 0.501f, 0.261f, 0.501f)
                horizontalLineToRelative(1.617f)
                reflectiveCurveToRelative(0.52f, 0.002f, 0.756f, -0.512f)
                lineToRelative(0.777f, -1.757f)
                verticalLineToRelative(0.001f)
                close()
            }
        }
        .build()
        return _toll!!
    }

private var _toll: ImageVector? = null
