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

public val SimpleIcons.Renault: VectorAsset
    get() {
        if (_renault != null) {
            return _renault!!
        }
        _renault = VectorAssetBuilder(name = "Renault", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(-0.747f, 0.0f, -2.32f, 0.013f, -2.693f, 0.053f)
                curveToRelative(-0.347f, 0.04f, -0.44f, 0.147f, -0.64f, 0.4f)
                curveTo(8.4f, 0.813f, 6.107f, 4.68f, 4.92f, 6.827f)
                curveToRelative(-0.867f, 1.546f, -2.227f, 4.24f, -2.347f, 4.533f)
                curveToRelative(-0.12f, 0.253f, -0.173f, 0.467f, -0.173f, 0.64f)
                curveToRelative(0.0f, 0.187f, 0.053f, 0.4f, 0.173f, 0.64f)
                curveToRelative(0.28f, 0.627f, 1.147f, 2.333f, 2.347f, 4.533f)
                curveToRelative(1.253f, 2.28f, 3.52f, 6.054f, 3.76f, 6.387f)
                curveToRelative(0.253f, 0.347f, 0.427f, 0.36f, 0.653f, 0.387f)
                curveToRelative(0.347f, 0.026f, 1.854f, 0.053f, 2.667f, 0.053f)
                curveToRelative(0.867f, 0.0f, 2.44f, -0.04f, 2.667f, -0.053f)
                curveToRelative(0.213f, -0.014f, 0.4f, -0.04f, 0.653f, -0.387f)
                curveToRelative(0.227f, -0.32f, 2.667f, -4.387f, 3.76f, -6.387f)
                curveToRelative(1.053f, -1.92f, 2.213f, -4.226f, 2.347f, -4.533f)
                curveToRelative(0.146f, -0.333f, 0.173f, -0.507f, 0.173f, -0.64f)
                curveToRelative(0.0f, -0.107f, -0.027f, -0.333f, -0.173f, -0.64f)
                arcToRelative(105.647f, 105.647f, 0.0f, false, false, -2.347f, -4.533f)
                curveTo(17.813f, 4.547f, 15.56f, 0.773f, 15.307f, 0.44f)
                curveToRelative(-0.254f, -0.333f, -0.4f, -0.36f, -0.627f, -0.373f)
                horizontalLineToRelative(-0.04f)
                curveTo(14.307f, 0.013f, 12.867f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(14.347f, 0.92f)
                curveToRelative(0.093f, 0.0f, 0.146f, 0.013f, 0.16f, 0.04f)
                curveToRelative(-0.4f, 0.787f, -1.414f, 2.773f, -2.134f, 4.6f)
                arcToRelative(111.067f, 111.067f, 0.0f, false, true, 2.907f, 5.747f)
                curveToRelative(0.16f, 0.346f, 0.24f, 0.52f, 0.24f, 0.693f)
                curveToRelative(0.0f, 0.173f, -0.08f, 0.347f, -0.24f, 0.693f)
                curveToRelative(-1.227f, 2.64f, -4.093f, 8.054f, -5.28f, 10.067f)
                curveToRelative(-0.12f, 0.2f, -0.253f, 0.307f, -0.347f, 0.307f)
                curveToRelative(-0.093f, 0.0f, -0.146f, -0.014f, -0.16f, -0.04f)
                curveToRelative(0.4f, -0.787f, 1.414f, -2.774f, 2.134f, -4.6f)
                arcTo(111.062f, 111.062f, 0.0f, false, true, 8.72f, 12.68f)
                curveToRelative(-0.16f, -0.347f, -0.24f, -0.52f, -0.24f, -0.693f)
                curveToRelative(0.0f, -0.174f, 0.08f, -0.347f, 0.253f, -0.694f)
                curveTo(9.933f, 8.653f, 12.8f, 3.24f, 14.0f, 1.227f)
                curveToRelative(0.12f, -0.2f, 0.253f, -0.307f, 0.347f, -0.307f)
                close()
            }
        }
        .build()
        return _renault!!
    }

private var _renault: VectorAsset? = null
