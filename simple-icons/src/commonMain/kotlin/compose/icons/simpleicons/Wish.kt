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

public val SimpleIcons.Wish: VectorAsset
    get() {
        if (_wish != null) {
            return _wish!!
        }
        _wish = VectorAssetBuilder(name = "Wish", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.463f, 8.653f)
                curveToRelative(-0.627f, 0.0f, -1.211f, 0.511f, -1.297f, 1.135f)
                lineToRelative(-0.637f, 4.647f)
                curveToRelative(-0.07f, 0.506f, -0.313f, 0.945f, -0.727f, 1.317f)
                curveToRelative(-0.415f, 0.372f, -0.882f, 0.558f, -1.4f, 0.558f)
                curveToRelative(-0.504f, 0.0f, -0.913f, -0.182f, -1.224f, -0.547f)
                curveToRelative(-0.313f, -0.365f, -0.433f, -0.808f, -0.361f, -1.329f)
                lineToRelative(0.385f, -2.82f)
                curveToRelative(0.012f, -0.563f, -0.411f, -1.003f, -0.993f, -1.003f)
                horizontalLineToRelative(-1.525f)
                curveToRelative(-0.582f, 0.0f, -1.127f, 0.44f, -1.27f, 1.003f)
                lineToRelative(-0.397f, 2.82f)
                curveToRelative(-0.072f, 0.521f, -0.315f, 0.964f, -0.729f, 1.329f)
                curveToRelative(-0.414f, 0.365f, -0.872f, 0.547f, -1.376f, 0.547f)
                curveToRelative(-0.504f, 0.0f, -0.915f, -0.186f, -1.234f, -0.558f)
                curveToRelative(-0.319f, -0.372f, -0.443f, -0.811f, -0.373f, -1.317f)
                lineToRelative(0.854f, -6.166f)
                curveToRelative(0.091f, -0.6f, -0.265f, -1.228f, -0.808f, -1.482f)
                curveToRelative(0.0f, 0.0f, -6.43f, -2.68f, -6.849f, -2.853f)
                curveTo(1.077f, 3.76f, 0.596f, 4.15f, 0.432f, 4.8f)
                lineTo(0.039f, 6.351f)
                curveTo(-0.126f, 7.0f, 0.246f, 7.739f, 0.863f, 7.992f)
                lineToRelative(4.31f, 1.784f)
                lineToRelative(-0.646f, 4.659f)
                curveToRelative(-0.217f, 1.563f, 0.15f, 2.899f, 1.1f, 4.008f)
                curveToRelative(0.95f, 1.11f, 2.203f, 1.664f, 3.76f, 1.664f)
                curveToRelative(1.437f, 0.0f, 2.748f, -0.483f, 3.934f, -1.451f)
                curveToRelative(0.947f, 0.968f, 2.133f, 1.451f, 3.555f, 1.451f)
                curveToRelative(1.556f, 0.0f, 2.962f, -0.554f, 4.22f, -1.664f)
                curveToRelative(1.257f, -1.109f, 1.995f, -2.446f, 2.211f, -4.008f)
                curveToRelative(0.0f, 0.0f, 0.675f, -4.917f, 0.688f, -5.003f)
                curveToRelative(0.059f, -0.429f, -0.406f, -0.779f, -1.032f, -0.779f)
                lineTo(21.463f, 8.653f)
                lineTo(21.463f, 8.653f)
                close()
            }
        }
        .build()
        return _wish!!
    }

private var _wish: VectorAsset? = null
