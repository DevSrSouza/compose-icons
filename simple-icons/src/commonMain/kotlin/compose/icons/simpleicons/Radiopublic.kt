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

public val SimpleIcons.Radiopublic: VectorAsset
    get() {
        if (_radiopublic != null) {
            return _radiopublic!!
        }
        _radiopublic = VectorAssetBuilder(name = "Radiopublic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.938f, 4.073f)
                curveToRelative(3.256f, -0.284f, 6.512f, -1.977f, 9.768f, -0.536f)
                verticalLineToRelative(19.889f)
                curveToRelative(-4.491f, -1.989f, -8.983f, 1.989f, -13.474f, 0.0f)
                verticalLineToRelative(-3.151f)
                verticalLineToRelative(-0.347f)
                curveToRelative(-3.313f, 0.27f, -6.625f, 1.987f, -9.938f, 0.539f)
                lineTo(0.294f, 0.578f)
                curveToRelative(4.548f, 1.989f, 9.096f, -1.989f, 13.644f, 0.0f)
                close()
                moveTo(16.418f, 14.87f)
                curveToRelative(0.393f, -0.086f, 0.784f, -0.174f, 1.176f, -0.259f)
                curveToRelative(1.735f, -0.379f, 2.427f, -1.403f, 2.426f, -3.014f)
                lineTo(20.02f, 9.0f)
                curveToRelative(0.0f, -1.585f, -0.447f, -2.59f, -2.556f, -2.135f)
                curveToRelative(-1.176f, 0.257f, -2.35f, 0.543f, -3.527f, 0.645f)
                verticalLineToRelative(12.968f)
                curveToRelative(0.827f, -0.072f, 1.654f, -0.235f, 2.482f, -0.414f)
                close()
                moveTo(16.418f, 12.76f)
                lineTo(16.418f, 9.1f)
                lineToRelative(0.467f, -0.102f)
                curveToRelative(0.58f, -0.129f, 0.633f, 0.156f, 0.635f, 0.627f)
                verticalLineToRelative(2.161f)
                curveToRelative(0.0f, 0.401f, -0.055f, 0.744f, -0.635f, 0.872f)
                lineToRelative(-0.466f, 0.102f)
                close()
                moveTo(6.531f, 17.11f)
                verticalLineToRelative(-5.542f)
                lineToRelative(0.522f, -0.114f)
                curveToRelative(0.504f, -0.11f, 0.652f, 0.015f, 0.653f, 0.625f)
                verticalLineToRelative(3.783f)
                curveToRelative(0.0f, 0.575f, 0.094f, 0.834f, 0.224f, 0.946f)
                curveToRelative(0.828f, -0.173f, 1.654f, -0.323f, 2.481f, -0.377f)
                verticalLineToRelative(-0.087f)
                curveToRelative(-0.092f, -0.15f, -0.205f, -0.385f, -0.204f, -0.944f)
                verticalLineToRelative(-4.41f)
                curveToRelative(0.0f, -0.962f, -0.673f, -1.33f, -1.064f, -1.4f)
                curveToRelative(0.465f, -0.272f, 1.101f, -0.802f, 1.1f, -1.88f)
                lineTo(10.243f, 5.638f)
                curveToRelative(0.0f, -1.391f, -0.764f, -2.126f, -2.276f, -1.805f)
                curveToRelative(-1.305f, 0.272f, -2.612f, 0.606f, -3.918f, 0.718f)
                lineTo(4.049f, 17.52f)
                curveToRelative(0.827f, -0.072f, 1.654f, -0.232f, 2.482f, -0.409f)
                close()
                moveTo(6.531f, 9.424f)
                lineTo(6.531f, 6.147f)
                curveToRelative(0.186f, -0.04f, 0.373f, -0.08f, 0.56f, -0.122f)
                curveToRelative(0.503f, -0.11f, 0.615f, 0.041f, 0.615f, 0.599f)
                verticalLineToRelative(1.76f)
                curveToRelative(0.0f, 0.61f, -0.185f, 0.824f, -0.69f, 0.934f)
                lineToRelative(-0.485f, 0.106f)
                close()
            }
        }
        .build()
        return _radiopublic!!
    }

private var _radiopublic: VectorAsset? = null
