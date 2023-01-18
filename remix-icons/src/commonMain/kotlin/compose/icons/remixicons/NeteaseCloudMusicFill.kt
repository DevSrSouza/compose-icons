package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.NeteaseCloudMusicFill: ImageVector
    get() {
        if (_neteaseCloudMusicFill != null) {
            return _neteaseCloudMusicFill!!
        }
        _neteaseCloudMusicFill = Builder(name = "NeteaseCloudMusicFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(10.914f, 11.568f)
                curveToRelative(0.24f, -0.84f, 1.075f, -1.541f, 1.99f, -1.648f)
                curveToRelative(0.187f, 0.694f, 0.388f, 1.373f, 0.545f, 2.063f)
                curveToRelative(0.053f, 0.23f, 0.037f, 0.495f, -0.018f, 0.727f)
                curveToRelative(-0.213f, 0.892f, -1.248f, 1.242f, -1.978f, 0.685f)
                curveToRelative(-0.53f, -0.405f, -0.742f, -1.12f, -0.539f, -1.827f)
                close()
                moveTo(14.731f, 11.371f)
                curveToRelative(-0.125f, -0.465f, -0.256f, -0.927f, -0.393f, -1.42f)
                curveToRelative(0.5f, 0.13f, 0.908f, 0.36f, 1.255f, 0.698f)
                curveToRelative(1.257f, 1.221f, 1.385f, 3.3f, 0.294f, 4.731f)
                curveToRelative(-1.135f, 1.49f, -3.155f, 2.134f, -5.028f, 1.605f)
                curveToRelative(-2.302f, -0.65f, -3.808f, -2.952f, -3.441f, -5.316f)
                curveToRelative(0.274f, -1.768f, 1.27f, -3.004f, 2.9f, -3.733f)
                curveToRelative(0.407f, -0.182f, 0.58f, -0.56f, 0.42f, -0.93f)
                curveToRelative(-0.157f, -0.364f, -0.54f, -0.504f, -0.944f, -0.343f)
                curveToRelative(-2.721f, 1.089f, -4.32f, 4.134f, -3.67f, 6.987f)
                curveToRelative(0.713f, 3.118f, 3.495f, 5.163f, 6.675f, 4.859f)
                curveToRelative(1.732f, -0.165f, 3.164f, -0.948f, 4.216f, -2.347f)
                curveToRelative(1.506f, -2.002f, 1.297f, -4.783f, -0.463f, -6.499f)
                curveToRelative(-0.666f, -0.65f, -1.471f, -1.018f, -2.39f, -1.153f)
                curveToRelative(-0.083f, -0.013f, -0.217f, -0.052f, -0.232f, -0.106f)
                curveToRelative(-0.087f, -0.313f, -0.18f, -0.632f, -0.206f, -0.954f)
                curveToRelative(-0.029f, -0.357f, 0.29f, -0.64f, 0.65f, -0.645f)
                curveToRelative(0.253f, -0.003f, 0.434f, 0.13f, 0.603f, 0.3f)
                curveToRelative(0.303f, 0.3f, 0.704f, 0.322f, 0.988f, 0.062f)
                curveToRelative(0.29f, -0.264f, 0.296f, -0.678f, 0.018f, -1.008f)
                curveToRelative(-0.566f, -0.672f, -1.586f, -0.891f, -2.43f, -0.523f)
                curveToRelative(-0.847f, 0.37f, -1.321f, 1.187f, -1.2f, 2.093f)
                curveToRelative(0.038f, 0.28f, 0.11f, 0.557f, 0.167f, 0.842f)
                lineToRelative(-0.26f, 0.072f)
                curveToRelative(-0.856f, 0.24f, -1.561f, 0.704f, -2.098f, 1.414f)
                curveToRelative(-0.921f, 1.22f, -0.936f, 2.828f, -0.041f, 3.947f)
                curveToRelative(1.274f, 1.594f, 3.747f, 1.284f, 4.523f, -0.568f)
                curveToRelative(0.284f, -0.676f, 0.275f, -1.368f, 0.087f, -2.065f)
                close()
            }
        }
        .build()
        return _neteaseCloudMusicFill!!
    }

private var _neteaseCloudMusicFill: ImageVector? = null
