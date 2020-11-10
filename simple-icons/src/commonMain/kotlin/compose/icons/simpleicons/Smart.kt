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

public val SimpleIcons.Smart: VectorAsset
    get() {
        if (_smart != null) {
            return _smart!!
        }
        _smart = VectorAssetBuilder(name = "Smart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.048f, 2.611f)
                curveToRelative(0.318f, 3.819f, 0.248f, 16.941f, 0.012f, 18.605f)
                curveToRelative(-0.016f, 0.125f, -0.018f, 0.341f, 0.113f, 0.239f)
                arcTo(23.879f, 23.879f, 0.0f, false, false, 24.0f, 12.003f)
                curveToRelative(-1.467f, -3.684f, -3.722f, -6.74f, -6.604f, -9.258f)
                curveToRelative(-0.167f, -0.147f, -0.267f, -0.229f, -0.314f, -0.229f)
                curveToRelative(-0.03f, 0.0f, -0.04f, 0.03f, -0.034f, 0.095f)
                moveTo(0.0f, 12.002f)
                curveToRelative(0.0f, 6.215f, 5.064f, 11.252f, 11.245f, 11.252f)
                curveToRelative(1.612f, 0.0f, 3.138f, -0.35f, 4.332f, -0.86f)
                curveToRelative(0.34f, -0.146f, 0.32f, -0.377f, 0.325f, -0.478f)
                lineToRelative(0.001f, -4.945f)
                curveToRelative(0.0f, -0.244f, -0.192f, -0.139f, -0.29f, -0.087f)
                curveToRelative(-2.292f, 1.228f, -4.374f, 1.15f, -4.374f, 1.15f)
                curveToRelative(-3.416f, 0.0f, -6.032f, -2.797f, -6.032f, -6.03f)
                curveToRelative(0.0f, -3.306f, 2.671f, -6.055f, 6.049f, -6.055f)
                curveToRelative(1.788f, 0.0f, 3.19f, 0.56f, 4.385f, 1.164f)
                curveToRelative(0.106f, 0.054f, 0.256f, 0.042f, 0.263f, -0.117f)
                lineToRelative(-0.002f, -4.729f)
                reflectiveCurveToRelative(0.023f, -0.53f, -0.42f, -0.705f)
                curveTo(13.951f, 0.96f, 12.584f, 0.746f, 11.26f, 0.746f)
                arcTo(11.245f, 11.245f, 0.0f, false, false, 0.0f, 12.002f)
                close()
            }
        }
        .build()
        return _smart!!
    }

private var _smart: VectorAsset? = null
