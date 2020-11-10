package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Ubisoft: VectorAsset
    get() {
        if (_ubisoft != null) {
            return _ubisoft!!
        }
        _ubisoft = VectorAssetBuilder(name = "Ubisoft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.561f, 11.989f)
                curveTo(23.301f, -0.304f, 6.953f, -4.89f, 0.655f, 6.634f)
                curveToRelative(0.282f, 0.206f, 0.661f, 0.477f, 0.943f, 0.672f)
                arcToRelative(11.748f, 11.748f, 0.0f, false, false, -0.976f, 3.068f)
                arcToRelative(11.886f, 11.886f, 0.0f, false, false, -0.184f, 2.071f)
                curveToRelative(0.0f, 6.374f, 5.182f, 11.556f, 11.567f, 11.556f)
                reflectiveCurveToRelative(11.556f, -5.171f, 11.556f, -11.556f)
                verticalLineToRelative(-0.455f)
                close()
                moveTo(3.29f, 14.048f)
                curveToRelative(-0.152f, 1.247f, -0.054f, 1.637f, -0.054f, 1.789f)
                lineToRelative(-0.282f, 0.098f)
                curveToRelative(-0.108f, -0.206f, -0.369f, -0.932f, -0.488f, -1.908f)
                curveToRelative(-0.304f, -3.718f, 2.233f, -7.068f, 6.103f, -7.697f)
                curveToRelative(3.545f, -0.52f, 6.938f, 1.68f, 7.729f, 4.759f)
                lineToRelative(-0.282f, 0.098f)
                curveToRelative(-0.087f, -0.087f, -0.228f, -0.336f, -0.77f, -0.878f)
                curveToRelative(-4.282f, -4.282f, -11.003f, -2.32f, -11.957f, 3.74f)
                close()
                moveTo(14.293f, 16.13f)
                arcToRelative(3.145f, 3.145f, 0.0f, false, true, -2.591f, 1.355f)
                arcToRelative(3.151f, 3.151f, 0.0f, false, true, -3.155f, -3.155f)
                arcToRelative(3.159f, 3.159f, 0.0f, false, true, 2.927f, -3.144f)
                curveToRelative(1.019f, -0.043f, 1.973f, 0.51f, 2.417f, 1.398f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, true, -0.455f, 2.949f)
                curveToRelative(0.293f, 0.206f, 0.575f, 0.401f, 0.856f, 0.596f)
                close()
                moveTo(20.873f, 16.249f)
                curveToRelative(-1.669f, 3.783f, -5.106f, 5.767f, -8.77f, 5.713f)
                curveToRelative(-7.035f, -0.347f, -9.084f, -8.466f, -4.38f, -11.393f)
                lineToRelative(0.206f, 0.206f)
                curveToRelative(-0.076f, 0.108f, -0.358f, 0.325f, -0.791f, 1.182f)
                curveToRelative(-0.51f, 1.041f, -0.672f, 2.081f, -0.607f, 2.732f)
                curveToRelative(0.369f, 5.67f, 8.315f, 6.83f, 11.046f, 1.214f)
                curveTo(21.057f, 8.217f, 11.821f, 0.401f, 3.625f, 6.374f)
                lineToRelative(-0.184f, -0.184f)
                curveToRelative(2.157f, -3.382f, 6.374f, -4.889f, 10.396f, -3.881f)
                curveToRelative(6.147f, 1.55f, 9.453f, 7.957f, 7.035f, 13.941f)
                close()
            }
        }
        .build()
        return _ubisoft!!
    }

private var _ubisoft: VectorAsset? = null
