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

public val SimpleIcons.Weasyl: ImageVector
    get() {
        if (_weasyl != null) {
            return _weasyl!!
        }
        _weasyl = Builder(name = "Weasyl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.23f, 4.156f)
                arcToRelative(8.488f, 8.488f, 0.0f, false, false, -5.871f, -1.857f)
                curveToRelative(-3.766f, 0.243f, -6.324f, 2.662f, -7.364f, 6.481f)
                curveToRelative(-1.28f, -1.224f, -1.892f, -3.238f, -2.093f, -5.54f)
                curveToRelative(-1.02f, 0.215f, -1.658f, 0.702f, -2.233f, 1.237f)
                curveToRelative(0.445f, 2.316f, 1.802f, 4.015f, 3.264f, 5.158f)
                curveToRelative(-2.559f, 0.317f, -5.99f, 2.442f, -6.771f, 4.904f)
                curveToRelative(-0.507f, 1.598f, 0.258f, 3.415f, 1.283f, 4.52f)
                curveToRelative(1.237f, 1.333f, 3.75f, 1.998f, 6.355f, 1.754f)
                curveToRelative(0.037f, 0.362f, -0.104f, 0.536f, -0.058f, 0.907f)
                curveToRelative(4.067f, -0.306f, 7.174f, -1.646f, 10.04f, -3.894f)
                curveToRelative(1.119f, -0.877f, 2.659f, -2.037f, 3.756f, -3.227f)
                curveToRelative(1.101f, -1.192f, 2.296f, -2.578f, 2.443f, -4.52f)
                curveToRelative(0.21f, -2.79f, -1.236f, -4.694f, -2.751f, -5.923f)
                close()
                moveTo(19.796f, 15.094f)
                curveToRelative(-1.035f, 1.001f, -2.241f, 1.797f, -3.351f, 2.675f)
                curveToRelative(-1.249f, -1.987f, -2.583f, -3.984f, -3.887f, -5.917f)
                curveToRelative(0.017f, 2.63f, 0.006f, 5.432f, 0.04f, 7.957f)
                curveToRelative(-0.78f, 0.381f, -1.789f, 0.558f, -2.744f, 0.763f)
                curveToRelative(-1.935f, -2.917f, -3.968f, -5.99f, -5.961f, -8.908f)
                curveToRelative(0.693f, -0.447f, 1.627f, -0.785f, 2.478f, -1.075f)
                curveToRelative(1.419f, 2.05f, 2.729f, 4.253f, 4.171f, 6.333f)
                curveToRelative(0.019f, -3.113f, -0.009f, -6.673f, -0.061f, -9.919f)
                arcToRelative(14.175f, 14.175f, 0.0f, false, false, 1.527f, -0.434f)
                curveToRelative(1.813f, 2.721f, 3.553f, 5.628f, 5.464f, 8.359f)
                arcToRelative(547.35f, 547.35f, 0.0f, false, true, -0.018f, -9.768f)
                curveToRelative(0.858f, -0.282f, 1.803f, -0.535f, 2.669f, -0.809f)
                curveToRelative(0.02f, 3.499f, -0.338f, 7.128f, -0.327f, 10.743f)
                close()
            }
        }
        .build()
        return _weasyl!!
    }

private var _weasyl: ImageVector? = null
