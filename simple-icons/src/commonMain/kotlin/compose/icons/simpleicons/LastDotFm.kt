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

public val SimpleIcons.LastDotFm: VectorAsset
    get() {
        if (_lastDotFm != null) {
            return _lastDotFm!!
        }
        _lastDotFm = VectorAssetBuilder(name = "LastDotFm", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.599f, 17.211f)
                lineToRelative(-0.881f, -2.393f)
                reflectiveCurveToRelative(-1.433f, 1.596f, -3.579f, 1.596f)
                curveToRelative(-1.9f, 0.0f, -3.249f, -1.652f, -3.249f, -4.296f)
                curveToRelative(0.0f, -3.385f, 1.708f, -4.596f, 3.388f, -4.596f)
                curveToRelative(2.418f, 0.0f, 3.184f, 1.568f, 3.845f, 3.578f)
                lineToRelative(0.871f, 2.751f)
                curveToRelative(0.871f, 2.672f, 2.523f, 4.818f, 7.285f, 4.818f)
                curveToRelative(3.41f, 0.0f, 5.722f, -1.045f, 5.722f, -3.801f)
                curveToRelative(0.0f, -2.227f, -1.276f, -3.383f, -3.635f, -3.935f)
                lineToRelative(-1.757f, -0.384f)
                curveToRelative(-1.217f, -0.274f, -1.577f, -0.771f, -1.577f, -1.597f)
                curveToRelative(0.0f, -0.936f, 0.736f, -1.487f, 1.952f, -1.487f)
                curveToRelative(1.323f, 0.0f, 2.028f, 0.495f, 2.147f, 1.679f)
                lineToRelative(2.749f, -0.33f)
                curveToRelative(-0.225f, -2.479f, -1.937f, -3.494f, -4.745f, -3.494f)
                curveToRelative(-2.479f, 0.0f, -4.897f, 0.936f, -4.897f, 3.934f)
                curveToRelative(0.0f, 1.873f, 0.902f, 3.058f, 3.185f, 3.605f)
                lineToRelative(1.862f, 0.443f)
                curveToRelative(1.397f, 0.33f, 1.863f, 0.916f, 1.863f, 1.713f)
                curveToRelative(0.0f, 1.021f, -0.992f, 1.441f, -2.869f, 1.441f)
                curveToRelative(-2.779f, 0.0f, -3.936f, -1.457f, -4.597f, -3.469f)
                lineToRelative(-0.901f, -2.75f)
                curveToRelative(-1.156f, -3.574f, -3.004f, -4.896f, -6.669f, -4.896f)
                curveTo(2.147f, 5.327f, 0.0f, 7.879f, 0.0f, 12.235f)
                curveToRelative(0.0f, 4.179f, 2.147f, 6.445f, 6.003f, 6.445f)
                curveToRelative(3.108f, 0.0f, 4.596f, -1.457f, 4.596f, -1.457f)
                verticalLineToRelative(-0.012f)
                close()
            }
        }
        .build()
        return _lastDotFm!!
    }

private var _lastDotFm: VectorAsset? = null
