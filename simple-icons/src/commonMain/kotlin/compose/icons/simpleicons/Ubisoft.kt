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

public val SimpleIcons.Ubisoft: ImageVector
    get() {
        if (_ubisoft != null) {
            return _ubisoft!!
        }
        _ubisoft = Builder(name = "Ubisoft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.561f, 11.988f)
                curveTo(23.301f, -0.304f, 6.954f, -4.89f, 0.656f, 6.634f)
                curveToRelative(0.282f, 0.206f, 0.661f, 0.477f, 0.943f, 0.672f)
                arcToRelative(11.747f, 11.747f, 0.0f, false, false, -0.976f, 3.067f)
                arcToRelative(11.885f, 11.885f, 0.0f, false, false, -0.184f, 2.071f)
                curveTo(0.439f, 18.818f, 5.621f, 24.0f, 12.005f, 24.0f)
                curveToRelative(6.385f, 0.0f, 11.556f, -5.17f, 11.556f, -11.556f)
                verticalLineToRelative(-0.455f)
                close()
                moveTo(3.291f, 14.048f)
                curveToRelative(-0.152f, 1.246f, -0.054f, 1.636f, -0.054f, 1.788f)
                lineToRelative(-0.282f, 0.098f)
                curveToRelative(-0.108f, -0.206f, -0.37f, -0.932f, -0.488f, -1.908f)
                curveTo(2.163f, 10.308f, 4.7f, 6.96f, 8.57f, 6.33f)
                curveToRelative(3.544f, -0.52f, 6.937f, 1.68f, 7.728f, 4.758f)
                lineToRelative(-0.282f, 0.098f)
                curveToRelative(-0.087f, -0.087f, -0.228f, -0.336f, -0.77f, -0.878f)
                curveToRelative(-4.281f, -4.281f, -11.002f, -2.32f, -11.956f, 3.74f)
                close()
                moveTo(14.293f, 16.129f)
                arcToRelative(3.145f, 3.145f, 0.0f, false, true, -2.59f, 1.355f)
                arcToRelative(3.15f, 3.15f, 0.0f, false, true, -3.155f, -3.155f)
                arcToRelative(3.159f, 3.159f, 0.0f, false, true, 2.927f, -3.144f)
                curveToRelative(1.018f, -0.043f, 1.972f, 0.51f, 2.416f, 1.398f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, true, -0.455f, 2.95f)
                curveToRelative(0.293f, 0.205f, 0.575f, 0.4f, 0.856f, 0.595f)
                close()
                moveTo(20.873f, 16.249f)
                curveToRelative(-1.669f, 3.782f, -5.106f, 5.766f, -8.77f, 5.712f)
                curveToRelative(-7.034f, -0.347f, -9.083f, -8.466f, -4.38f, -11.393f)
                lineToRelative(0.207f, 0.206f)
                curveToRelative(-0.076f, 0.108f, -0.358f, 0.325f, -0.791f, 1.182f)
                curveToRelative(-0.51f, 1.041f, -0.672f, 2.081f, -0.607f, 2.732f)
                curveToRelative(0.369f, 5.67f, 8.314f, 6.83f, 11.045f, 1.214f)
                curveTo(21.057f, 8.217f, 11.822f, 0.401f, 3.626f, 6.374f)
                lineToRelative(-0.184f, -0.184f)
                curveTo(5.599f, 2.808f, 9.816f, 1.3f, 13.837f, 2.309f)
                curveToRelative(6.147f, 1.55f, 9.453f, 7.956f, 7.035f, 13.94f)
                close()
            }
        }
        .build()
        return _ubisoft!!
    }

private var _ubisoft: ImageVector? = null
