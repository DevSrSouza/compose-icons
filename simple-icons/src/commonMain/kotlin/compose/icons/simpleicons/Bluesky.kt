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

public val SimpleIcons.Bluesky: ImageVector
    get() {
        if (_bluesky != null) {
            return _bluesky!!
        }
        _bluesky = Builder(name = "Bluesky", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.8f)
                curveToRelative(-1.087f, -2.114f, -4.046f, -6.053f, -6.798f, -7.995f)
                curveTo(2.566f, 0.944f, 1.561f, 1.266f, 0.902f, 1.565f)
                curveTo(0.139f, 1.908f, 0.0f, 3.08f, 0.0f, 3.768f)
                curveToRelative(0.0f, 0.69f, 0.378f, 5.65f, 0.624f, 6.479f)
                curveToRelative(0.815f, 2.736f, 3.713f, 3.66f, 6.383f, 3.364f)
                curveToRelative(0.136f, -0.02f, 0.275f, -0.039f, 0.415f, -0.056f)
                curveToRelative(-0.138f, 0.022f, -0.276f, 0.04f, -0.415f, 0.056f)
                curveToRelative(-3.912f, 0.58f, -7.387f, 2.005f, -2.83f, 7.078f)
                curveToRelative(5.013f, 5.19f, 6.87f, -1.113f, 7.823f, -4.308f)
                curveToRelative(0.953f, 3.195f, 2.05f, 9.271f, 7.733f, 4.308f)
                curveToRelative(4.267f, -4.308f, 1.172f, -6.498f, -2.74f, -7.078f)
                arcToRelative(8.741f, 8.741f, 0.0f, false, true, -0.415f, -0.056f)
                curveToRelative(0.14f, 0.017f, 0.279f, 0.036f, 0.415f, 0.056f)
                curveToRelative(2.67f, 0.297f, 5.568f, -0.628f, 6.383f, -3.364f)
                curveToRelative(0.246f, -0.828f, 0.624f, -5.79f, 0.624f, -6.478f)
                curveToRelative(0.0f, -0.69f, -0.139f, -1.861f, -0.902f, -2.206f)
                curveToRelative(-0.659f, -0.298f, -1.664f, -0.62f, -4.3f, 1.24f)
                curveTo(16.046f, 4.748f, 13.087f, 8.687f, 12.0f, 10.8f)
                close()
            }
        }
        .build()
        return _bluesky!!
    }

private var _bluesky: ImageVector? = null
