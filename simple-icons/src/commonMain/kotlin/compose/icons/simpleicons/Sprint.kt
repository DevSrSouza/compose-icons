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

public val SimpleIcons.Sprint: VectorAsset
    get() {
        if (_sprint != null) {
            return _sprint!!
        }
        _sprint = VectorAssetBuilder(name = "Sprint", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.13f, 23.995f)
                curveToRelative(5.493f, -1.808f, 13.457f, -6.02f, 18.996f, -9.782f)
                curveToRelative(0.465f, -0.314f, 0.827f, -0.607f, 0.827f, -1.118f)
                curveToRelative(0.0f, -0.889f, -1.655f, -2.08f, -2.458f, -2.555f)
                curveToRelative(-4.359f, 4.456f, -13.033f, 11.134f, -17.366f, 13.455f)
                moveTo(7.225f, 20.21f)
                curveToRelative(3.388f, -2.304f, 8.31f, -6.638f, 9.975f, -8.996f)
                curveToRelative(0.393f, -0.554f, 0.683f, -0.876f, 0.683f, -1.456f)
                curveToRelative(0.0f, -0.952f, -1.128f, -1.65f, -1.94f, -2.135f)
                curveToRelative(-1.946f, 4.51f, -6.316f, 10.125f, -8.718f, 12.587f)
                moveTo(9.816f, 16.682f)
                curveToRelative(2.344f, -2.967f, 4.188f, -6.454f, 4.188f, -8.958f)
                curveToRelative(0.0f, -1.308f, -0.953f, -2.222f, -2.196f, -2.916f)
                curveToRelative(0.024f, 2.721f, -0.934f, 9.101f, -1.992f, 11.874f)
                moveTo(10.312f, 13.82f)
                curveToRelative(0.438f, -2.847f, 0.18f, -6.285f, -0.379f, -8.442f)
                curveToRelative(-0.304f, -1.174f, -1.38f, -2.5f, -2.376f, -2.913f)
                curveToRelative(1.305f, 3.643f, 2.426f, 8.832f, 2.755f, 11.355f)
                moveTo(9.347f, 9.825f)
                curveTo(8.321f, 7.097f, 5.763f, 1.41f, 2.0f, 0.0f)
                curveToRelative(2.45f, 2.66f, 6.083f, 7.935f, 7.347f, 9.825f)
            }
        }
        .build()
        return _sprint!!
    }

private var _sprint: VectorAsset? = null
