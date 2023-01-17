package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Number16: ImageVector
    get() {
        if (_number16 != null) {
            return _number16!!
        }
        _number16 = Builder(name = "Number16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 9.75f, 4.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.53f, 1.28f)
                lineToRelative(-1.89f, 1.892f)
                curveToRelative(0.312f, 0.076f, 0.604f, 0.18f, 0.867f, 0.319f)
                curveToRelative(0.742f, 0.391f, 1.244f, 1.063f, 1.244f, 2.005f)
                curveToRelative(0.0f, 0.653f, -0.231f, 1.208f, -0.629f, 1.627f)
                curveToRelative(-0.386f, 0.408f, -0.894f, 0.653f, -1.408f, 0.777f)
                curveToRelative(-1.01f, 0.243f, -2.225f, 0.063f, -3.124f, -0.527f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 0.822f, -1.254f)
                curveToRelative(0.534f, 0.35f, 1.32f, 0.474f, 1.951f, 0.322f)
                curveToRelative(0.306f, -0.073f, 0.53f, -0.201f, 0.67f, -0.349f)
                curveToRelative(0.129f, -0.136f, 0.218f, -0.32f, 0.218f, -0.596f)
                curveToRelative(0.0f, -0.308f, -0.123f, -0.509f, -0.444f, -0.678f)
                curveToRelative(-0.373f, -0.197f, -0.98f, -0.318f, -1.806f, -0.318f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.53f, -1.28f)
                lineToRelative(1.72f, -1.72f)
                lineTo(9.75f, 5.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 9.0f, 4.75f)
                close()
                moveTo(5.413f, 10.513f)
                curveToRelative(-0.35f, -0.05f, -0.77f, 0.113f, -0.983f, 0.572f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.36f, -0.632f)
                curveToRelative(0.508f, -1.094f, 1.589f, -1.565f, 2.558f, -1.425f)
                curveToRelative(1.0f, 0.145f, 1.872f, 0.945f, 1.872f, 2.222f)
                curveToRelative(0.0f, 1.433f, -1.088f, 2.192f, -1.79f, 2.681f)
                curveToRelative(-0.308f, 0.216f, -0.571f, 0.397f, -0.772f, 0.573f)
                lineTo(7.0f, 14.504f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(3.75f, 16.004f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                curveToRelative(0.0f, -0.69f, 0.3f, -1.211f, 0.67f, -1.61f)
                curveToRelative(0.348f, -0.372f, 0.8f, -0.676f, 1.15f, -0.92f)
                curveToRelative(0.8f, -0.56f, 1.18f, -0.904f, 1.18f, -1.474f)
                curveToRelative(0.0f, -0.473f, -0.267f, -0.69f, -0.587f, -0.737f)
                close()
                moveTo(5.604f, 0.089f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 6.0f, 0.75f)
                verticalLineToRelative(4.77f)
                horizontalLineToRelative(0.711f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(3.759f, 7.02f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                lineTo(4.5f, 5.52f)
                lineTo(4.5f, 2.15f)
                lineToRelative(-0.334f, 0.223f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.832f, -1.248f)
                lineToRelative(1.5f, -1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.77f, -0.037f)
                close()
            }
        }
        .build()
        return _number16!!
    }

private var _number16: ImageVector? = null
