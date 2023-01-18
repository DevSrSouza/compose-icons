package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.MicroscopeLine: ImageVector
    get() {
        if (_microscopeLine != null) {
            return _microscopeLine!!
        }
        _microscopeLine = Builder(name = "MicroscopeLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.196f, 2.268f)
                lineToRelative(3.25f, 5.63f)
                curveToRelative(0.276f, 0.477f, 0.112f, 1.089f, -0.366f, 1.365f)
                lineToRelative(-1.3f, 0.75f)
                lineToRelative(1.001f, 1.732f)
                lineToRelative(-1.732f, 1.0f)
                lineToRelative(-1.0f, -1.733f)
                lineToRelative(-1.299f, 0.751f)
                curveToRelative(-0.478f, 0.276f, -1.09f, 0.112f, -1.366f, -0.366f)
                lineTo(8.546f, 8.215f)
                curveTo(6.494f, 8.837f, 5.0f, 10.745f, 5.0f, 13.0f)
                curveToRelative(0.0f, 0.625f, 0.115f, 1.224f, 0.324f, 1.776f)
                curveTo(6.1f, 14.284f, 7.016f, 14.0f, 8.0f, 14.0f)
                curveToRelative(1.684f, 0.0f, 3.174f, 0.833f, 4.08f, 2.109f)
                lineToRelative(7.688f, -4.439f)
                lineToRelative(1.0f, 1.732f)
                lineToRelative(-7.878f, 4.549f)
                curveToRelative(0.072f, 0.338f, 0.11f, 0.69f, 0.11f, 1.049f)
                curveToRelative(0.0f, 0.343f, -0.034f, 0.677f, -0.1f, 1.0f)
                lineTo(21.0f, 20.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(-17.0f, 0.001f)
                curveToRelative(-0.628f, -0.836f, -1.0f, -1.875f, -1.0f, -3.001f)
                curveToRelative(0.0f, -1.007f, 0.298f, -1.945f, 0.81f, -2.73f)
                curveTo(3.293f, 15.295f, 3.0f, 14.182f, 3.0f, 13.0f)
                curveToRelative(0.0f, -2.995f, 1.881f, -5.551f, 4.527f, -6.55f)
                lineToRelative(-0.393f, -0.682f)
                curveToRelative(-0.552f, -0.957f, -0.225f, -2.18f, 0.732f, -2.732f)
                lineToRelative(2.598f, -1.5f)
                curveToRelative(0.957f, -0.552f, 2.18f, -0.225f, 2.732f, 0.732f)
                close()
                moveTo(8.0f, 16.0f)
                curveToRelative(-1.657f, 0.0f, -3.0f, 1.343f, -3.0f, 3.0f)
                curveToRelative(0.0f, 0.35f, 0.06f, 0.687f, 0.17f, 1.0f)
                horizontalLineToRelative(5.66f)
                curveToRelative(0.11f, -0.313f, 0.17f, -0.65f, 0.17f, -1.0f)
                curveToRelative(0.0f, -1.657f, -1.343f, -3.0f, -3.0f, -3.0f)
                close()
                moveTo(11.464f, 3.268f)
                lineToRelative(-2.598f, 1.5f)
                lineToRelative(2.75f, 4.763f)
                lineToRelative(2.598f, -1.5f)
                lineToRelative(-2.75f, -4.763f)
                close()
            }
        }
        .build()
        return _microscopeLine!!
    }

private var _microscopeLine: ImageVector? = null
