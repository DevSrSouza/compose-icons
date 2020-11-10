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

public val SimpleIcons.VlcMediaPlayer: VectorAsset
    get() {
        if (_vlcMediaPlayer != null) {
            return _vlcMediaPlayer!!
        }
        _vlcMediaPlayer = VectorAssetBuilder(name = "VlcMediaPlayer", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.891f, 13.463f)
                curveToRelative(3.757f, 0.0f, 4.854f, -1.347f, 5.065f, -1.674f)
                lineToRelative(-1.36f, -4.334f)
                curveToRelative(-0.36f, 0.34f, -1.327f, 0.937f, -3.68f, 0.937f)
                curveToRelative(-2.292f, 0.0f, -3.188f, -0.567f, -3.52f, -0.91f)
                lineToRelative(-1.39f, 4.422f)
                curveToRelative(0.228f, 0.361f, 1.255f, 1.56f, 4.885f, 1.56f)
                close()
                moveTo(11.917f, 3.807f)
                arcToRelative(6.143f, 6.143f, 0.0f, false, false, 2.376f, -0.507f)
                lineTo(13.435f, 0.566f)
                arcToRelative(0.781f, 0.781f, 0.0f, false, false, -0.406f, -0.437f)
                reflectiveCurveTo(12.914f, 0.0f, 12.032f, 0.0f)
                reflectiveCurveToRelative(-1.055f, 0.136f, -1.055f, 0.136f)
                arcToRelative(0.733f, 0.733f, 0.0f, false, false, -0.41f, 0.43f)
                lineToRelative(-0.884f, 2.815f)
                arcToRelative(6.77f, 6.77f, 0.0f, false, false, 2.234f, 0.426f)
                close()
                moveTo(22.59f, 23.319f)
                arcToRelative(0.395f, 0.395f, 0.0f, false, false, -0.016f, -0.16f)
                lineToRelative(-2.334f, -7.632f)
                arcToRelative(0.647f, 0.647f, 0.0f, false, false, -0.583f, -0.431f)
                horizontalLineToRelative(-1.663f)
                lineToRelative(0.2f, 0.64f)
                curveToRelative(-0.24f, 0.485f, -1.488f, 2.38f, -6.303f, 2.38f)
                curveToRelative(-4.6f, 0.0f, -5.828f, -1.73f, -6.11f, -2.308f)
                lineToRelative(0.223f, -0.712f)
                horizontalLineTo(4.343f)
                arcToRelative(0.647f, 0.647f, 0.0f, false, false, -0.583f, 0.431f)
                lineTo(1.426f, 23.16f)
                arcToRelative(0.398f, 0.398f, 0.0f, false, false, -0.017f, 0.15f)
                lineToRelative(-0.002f, 0.02f)
                arcToRelative(1.843f, 1.843f, 0.0f, false, false, 0.024f, 0.226f)
                arcToRelative(0.528f, 0.528f, 0.0f, false, false, 0.51f, 0.445f)
                horizontalLineTo(22.06f)
                arcToRelative(0.528f, 0.528f, 0.0f, false, false, 0.51f, -0.445f)
                arcToRelative(1.843f, 1.843f, 0.0f, false, false, 0.023f, -0.226f)
                close()
            }
        }
        .build()
        return _vlcMediaPlayer!!
    }

private var _vlcMediaPlayer: VectorAsset? = null
