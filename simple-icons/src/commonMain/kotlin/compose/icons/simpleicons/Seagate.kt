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

public val SimpleIcons.Seagate: VectorAsset
    get() {
        if (_seagate != null) {
            return _seagate!!
        }
        _seagate = VectorAssetBuilder(name = "Seagate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.315f, 1.735f)
                curveToRelative(0.277f, -0.166f, 0.554f, -0.333f, 0.831f, -0.443f)
                curveToRelative(0.111f, 0.277f, 0.277f, 0.554f, 0.388f, 0.83f)
                curveToRelative(-0.61f, 0.333f, -1.219f, 0.61f, -1.772f, 0.997f)
                curveToRelative(-8.149f, 4.948f, -6.9f, 10.574f, -3.379f, 11.077f)
                curveToRelative(2.399f, 0.45f, 5.343f, -1.094f, 7.422f, -2.326f)
                curveToRelative(1.575f, -0.985f, 2.99f, -1.926f, 2.99f, -3.046f)
                curveToRelative(0.0f, -0.713f, -0.824f, -1.053f, -1.495f, -0.942f)
                curveToRelative(-2.167f, 0.542f, -5.07f, 3.545f, -7.477f, 3.545f)
                curveToRelative(-1.097f, 0.0f, -1.895f, -0.842f, -1.772f, -1.828f)
                curveToRelative(0.154f, -1.843f, 1.891f, -3.229f, 3.49f, -4.154f)
                curveToRelative(2.585f, -1.696f, 6.02f, -3.199f, 9.082f, -3.046f)
                curveToRelative(7.647f, 0.264f, 12.227f, 9.815f, -0.997f, 18.167f)
                curveToRelative(-1.501f, 0.948f, -3.92f, 1.99f, -4.43f, 2.16f)
                curveToRelative(-0.222f, -0.997f, -0.554f, -1.994f, -0.776f, -2.991f)
                curveToRelative(2.421f, -1.14f, 3.145f, -1.281f, 5.816f, -3.323f)
                curveToRelative(2.243f, -1.795f, 4.4f, -3.917f, 4.763f, -6.813f)
                curveToRelative(0.055f, -0.664f, 0.055f, -1.274f, -0.111f, -1.938f)
                curveToRelative(-0.901f, -3.09f, -5.07f, -6.275f, -12.905f, -1.052f)
                curveToRelative(-0.815f, 0.475f, -2.16f, 1.436f, -2.16f, 2.381f)
                curveToRelative(0.0f, 0.222f, 0.166f, 0.499f, 0.388f, 0.554f)
                curveToRelative(1.204f, 0.516f, 3.881f, -2.192f, 6.535f, -3.102f)
                curveToRelative(2.08f, -0.734f, 4.175f, 0.047f, 4.542f, 1.884f)
                curveToRelative(0.055f, 0.498f, 0.055f, 0.996f, -0.11f, 1.44f)
                curveToRelative(-0.594f, 1.541f, -2.025f, 2.658f, -3.49f, 3.6f)
                curveToRelative(-1.53f, 0.842f, -3.087f, 2.042f, -6.48f, 2.935f)
                curveToRelative(-2.315f, 0.631f, -5.267f, 0.29f, -6.48f, -1.772f)
                curveToRelative(-0.499f, -0.776f, -0.72f, -1.717f, -0.72f, -2.603f)
                curveToRelative(0.055f, -1.053f, 0.277f, -2.105f, 0.72f, -3.047f)
                curveToRelative(0.775f, -1.606f, 1.938f, -3.046f, 3.323f, -4.209f)
                arcToRelative(23.121f, 23.121f, 0.0f, false, true, 4.32f, -2.99f)
                close()
            }
        }
        .build()
        return _seagate!!
    }

private var _seagate: VectorAsset? = null
