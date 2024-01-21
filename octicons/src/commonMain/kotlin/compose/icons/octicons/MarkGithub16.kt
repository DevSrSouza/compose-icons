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

public val Octicons.MarkGithub16: ImageVector
    get() {
        if (_markGithub16 != null) {
            return _markGithub16!!
        }
        _markGithub16 = Builder(name = "MarkGithub16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, 3.58f, 8.0f, 8.0f)
                arcToRelative(8.013f, 8.013f, 0.0f, false, true, -5.45f, 7.59f)
                curveToRelative(-0.4f, 0.08f, -0.55f, -0.17f, -0.55f, -0.38f)
                curveToRelative(0.0f, -0.27f, 0.01f, -1.13f, 0.01f, -2.2f)
                curveToRelative(0.0f, -0.75f, -0.25f, -1.23f, -0.54f, -1.48f)
                curveToRelative(1.78f, -0.2f, 3.65f, -0.88f, 3.65f, -3.95f)
                curveToRelative(0.0f, -0.88f, -0.31f, -1.59f, -0.82f, -2.15f)
                curveToRelative(0.08f, -0.2f, 0.36f, -1.02f, -0.08f, -2.12f)
                curveToRelative(0.0f, 0.0f, -0.67f, -0.22f, -2.2f, 0.82f)
                curveToRelative(-0.64f, -0.18f, -1.32f, -0.27f, -2.0f, -0.27f)
                curveToRelative(-0.68f, 0.0f, -1.36f, 0.09f, -2.0f, 0.27f)
                curveToRelative(-1.53f, -1.03f, -2.2f, -0.82f, -2.2f, -0.82f)
                curveToRelative(-0.44f, 1.1f, -0.16f, 1.92f, -0.08f, 2.12f)
                curveToRelative(-0.51f, 0.56f, -0.82f, 1.28f, -0.82f, 2.15f)
                curveToRelative(0.0f, 3.06f, 1.86f, 3.75f, 3.64f, 3.95f)
                curveToRelative(-0.23f, 0.2f, -0.44f, 0.55f, -0.51f, 1.07f)
                curveToRelative(-0.46f, 0.21f, -1.61f, 0.55f, -2.33f, -0.66f)
                curveToRelative(-0.15f, -0.24f, -0.6f, -0.83f, -1.23f, -0.82f)
                curveToRelative(-0.67f, 0.01f, -0.27f, 0.38f, 0.01f, 0.53f)
                curveToRelative(0.34f, 0.19f, 0.73f, 0.9f, 0.82f, 1.13f)
                curveToRelative(0.16f, 0.45f, 0.68f, 1.31f, 2.69f, 0.94f)
                curveToRelative(0.0f, 0.67f, 0.01f, 1.3f, 0.01f, 1.49f)
                curveToRelative(0.0f, 0.21f, -0.15f, 0.45f, -0.55f, 0.38f)
                arcTo(7.995f, 7.995f, 0.0f, false, true, 0.0f, 8.0f)
                curveToRelative(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f)
                close()
            }
        }
        .build()
        return _markGithub16!!
    }

private var _markGithub16: ImageVector? = null
