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

public val SimpleIcons.Cinema4d: VectorAsset
    get() {
        if (_cinema4d != null) {
            return _cinema4d!!
        }
        _cinema4d = VectorAssetBuilder(name = "Cinema4d", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.022f, 5.127f)
                curveTo(8.786f, 5.713f, 6.677f, 6.917f, 5.3f, 8.047f)
                curveToRelative(-0.172f, 0.665f, -0.273f, 1.356f, -0.273f, 2.072f)
                curveToRelative(0.0f, 4.794f, 4.093f, 8.68f, 9.141f, 8.68f)
                curveToRelative(0.753f, 0.0f, 1.467f, -0.098f, 2.146f, -0.264f)
                curveToRelative(1.458f, -1.848f, 2.651f, -5.065f, 2.955f, -7.728f)
                curveToRelative(0.319f, -2.786f, 0.953f, -3.63f, 1.742f, -4.18f)
                curveToRelative(0.28f, -0.195f, 0.574f, -0.344f, 0.885f, -0.415f)
                curveToRelative(-0.887f, -1.897f, -2.439f, -3.388f, -4.444f, -4.168f)
                curveToRelative(0.005f, 0.022f, 0.014f, 0.04f, 0.019f, 0.062f)
                curveTo(17.852f, 3.735f, 16.115f, 4.386f, 12.022f, 5.127f)
                close()
                moveTo(23.179f, 7.898f)
                curveToRelative(-0.032f, -0.063f, -0.064f, -0.134f, -0.097f, -0.214f)
                curveToRelative(-0.594f, -1.455f, -2.022f, -0.512f, -2.399f, 0.344f)
                curveToRelative(-0.742f, 1.686f, -0.633f, 2.422f, -0.934f, 4.131f)
                reflectiveCurveToRelative(-1.337f, 4.999f, -2.828f, 6.688f)
                curveToRelative(-2.13f, 2.412f, -4.46f, 3.484f, -7.727f, 3.172f)
                reflectiveCurveToRelative(-5.785f, -3.082f, -6.717f, -5.09f)
                curveToRelative(-0.782f, -1.685f, -0.9f, -3.596f, 0.025f, -6.073f)
                reflectiveCurveToRelative(3.7f, -4.491f, 6.237f, -5.459f)
                curveToRelative(2.537f, -0.968f, 4.545f, -1.063f, 5.96f, -1.475f)
                curveToRelative(1.415f, -0.413f, 2.249f, -1.093f, 2.197f, -1.672f)
                curveToRelative(-0.065f, -0.718f, -0.757f, -1.1f, -1.148f, -1.26f)
                curveToRelative(-1.18f, -0.379f, -2.441f, -0.584f, -3.751f, -0.584f)
                curveToRelative(-6.611f, 0.0f, -11.97f, 5.218f, -11.97f, 11.655f)
                curveToRelative(0.0f, 6.437f, 5.359f, 11.655f, 11.97f, 11.655f)
                reflectiveCurveToRelative(11.97f, -5.218f, 11.97f, -11.655f)
                curveTo(23.966f, 10.594f, 23.687f, 9.191f, 23.179f, 7.898f)
                close()
            }
        }
        .build()
        return _cinema4d!!
    }

private var _cinema4d: VectorAsset? = null
