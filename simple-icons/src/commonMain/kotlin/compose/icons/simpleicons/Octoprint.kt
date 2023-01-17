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

public val SimpleIcons.Octoprint: ImageVector
    get() {
        if (_octoprint != null) {
            return _octoprint!!
        }
        _octoprint = Builder(name = "Octoprint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.942f, 4.613f)
                curveTo(2.424f, 5.987f, 1.107f, 7.473f, 0.476f, 9.71f)
                curveToRelative(-0.634f, 2.248f, -0.585f, 5.094f, -0.145f, 7.398f)
                curveToRelative(0.44f, 2.303f, 1.12f, 4.107f, 1.873f, 5.83f)
                horizontalLineToRelative(13.179f)
                curveToRelative(-0.31f, -0.988f, -0.761f, -1.967f, -1.446f, -3.237f)
                curveToRelative(-0.685f, -1.268f, -1.658f, -2.692f, -2.648f, -4.178f)
                curveToRelative(-0.99f, -1.486f, -1.985f, -3.077f, -1.851f, -4.472f)
                curveToRelative(0.094f, -0.987f, 0.49f, -1.976f, 1.492f, -2.76f)
                curveToRelative(1.16f, -0.909f, 2.289f, -1.437f, 3.353f, -1.595f)
                curveToRelative(3.325f, -0.496f, 6.422f, 0.601f, 8.925f, 3.366f)
                curveToRelative(0.288f, 0.316f, 0.36f, 0.726f, 0.545f, 1.127f)
                lineToRelative(0.166f, -0.653f)
                curveToRelative(0.15f, -0.589f, 0.088f, -1.359f, -0.152f, -2.371f)
                curveToRelative(-0.243f, -1.029f, -0.563f, -1.792f, -1.46f, -2.973f)
                curveToRelative(-0.893f, -1.176f, -2.467f, -2.322f, -4.48f, -3.226f)
                curveToRelative(-1.5f, -0.673f, -3.305f, -1.0f, -5.798f, -0.879f)
                curveToRelative(-2.522f, 0.124f, -5.494f, 1.177f, -8.087f, 3.526f)
                close()
            }
        }
        .build()
        return _octoprint!!
    }

private var _octoprint: ImageVector? = null
