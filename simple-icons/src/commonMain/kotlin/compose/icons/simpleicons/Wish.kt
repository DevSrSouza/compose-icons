package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Wish: ImageVector
    get() {
        if (_wish != null) {
            return _wish!!
        }
        _wish = Builder(name = "Wish", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.463f, 8.653f)
                curveToRelative(-0.627f, 0.0f, -1.21f, 0.511f, -1.297f, 1.135f)
                lineToRelative(-0.637f, 4.647f)
                curveToRelative(-0.07f, 0.507f, -0.313f, 0.945f, -0.727f, 1.318f)
                curveToRelative(-0.415f, 0.372f, -0.882f, 0.558f, -1.4f, 0.558f)
                curveToRelative(-0.504f, 0.0f, -0.912f, -0.182f, -1.224f, -0.547f)
                curveToRelative(-0.313f, -0.365f, -0.433f, -0.808f, -0.361f, -1.329f)
                lineToRelative(0.385f, -2.82f)
                arcToRelative(0.965f, 0.965f, 0.0f, false, false, -0.993f, -1.003f)
                horizontalLineToRelative(-1.525f)
                curveToRelative(-0.582f, 0.0f, -1.127f, 0.44f, -1.27f, 1.003f)
                lineToRelative(-0.397f, 2.82f)
                arcToRelative(2.11f, 2.11f, 0.0f, false, true, -0.73f, 1.329f)
                curveToRelative(-0.413f, 0.365f, -0.871f, 0.547f, -1.375f, 0.547f)
                arcToRelative(1.55f, 1.55f, 0.0f, false, true, -1.234f, -0.558f)
                curveToRelative(-0.319f, -0.372f, -0.443f, -0.811f, -0.373f, -1.318f)
                lineToRelative(0.854f, -6.166f)
                curveToRelative(0.09f, -0.6f, -0.265f, -1.227f, -0.808f, -1.482f)
                curveToRelative(0.0f, 0.0f, -6.43f, -2.68f, -6.85f, -2.853f)
                curveTo(1.078f, 3.76f, 0.597f, 4.15f, 0.433f, 4.8f)
                lineTo(0.039f, 6.35f)
                curveToRelative(-0.165f, 0.65f, 0.207f, 1.39f, 0.824f, 1.643f)
                lineToRelative(4.31f, 1.784f)
                lineToRelative(-0.646f, 4.66f)
                curveToRelative(-0.217f, 1.562f, 0.15f, 2.899f, 1.1f, 4.008f)
                curveToRelative(0.95f, 1.11f, 2.203f, 1.663f, 3.76f, 1.663f)
                curveToRelative(1.436f, 0.0f, 2.748f, -0.483f, 3.934f, -1.451f)
                curveToRelative(0.947f, 0.968f, 2.133f, 1.451f, 3.555f, 1.451f)
                curveToRelative(1.556f, 0.0f, 2.963f, -0.554f, 4.22f, -1.663f)
                curveToRelative(1.258f, -1.11f, 1.995f, -2.446f, 2.211f, -4.009f)
                lineToRelative(0.688f, -5.003f)
                curveToRelative(0.059f, -0.428f, -0.406f, -0.778f, -1.032f, -0.778f)
                horizontalLineToRelative(-1.5f)
                close()
            }
        }
        .build()
        return _wish!!
    }

private var _wish: ImageVector? = null
