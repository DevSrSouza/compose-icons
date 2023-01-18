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

public val RemixIcons.HeartsFill: ImageVector
    get() {
        if (_heartsFill != null) {
            return _heartsFill!!
        }
        _heartsFill = Builder(name = "HeartsFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.363f, 11.045f)
                curveToRelative(1.404f, -1.393f, 3.68f, -1.393f, 5.084f, 0.0f)
                curveToRelative(1.404f, 1.394f, 1.404f, 3.654f, 0.0f, 5.047f)
                lineTo(17.0f, 21.5f)
                lineToRelative(-5.447f, -5.408f)
                curveToRelative(-1.404f, -1.393f, -1.404f, -3.653f, 0.0f, -5.047f)
                curveToRelative(1.404f, -1.393f, 3.68f, -1.393f, 5.084f, 0.0f)
                lineToRelative(0.363f, 0.36f)
                lineToRelative(0.363f, -0.36f)
                close()
                moveTo(19.243f, 4.757f)
                curveToRelative(0.94f, 0.943f, 1.503f, 2.118f, 1.689f, 3.338f)
                curveToRelative(-1.333f, -0.248f, -2.739f, -0.01f, -3.932f, 0.713f)
                curveToRelative(-2.15f, -1.303f, -4.994f, -1.03f, -6.856f, 0.818f)
                curveToRelative(-2.131f, 2.115f, -2.19f, 5.515f, -0.178f, 7.701f)
                lineToRelative(0.178f, 0.185f)
                lineToRelative(2.421f, 2.404f)
                lineTo(11.0f, 21.485f)
                lineTo(2.52f, 12.993f)
                curveTo(0.417f, 10.637f, 0.496f, 7.019f, 2.757f, 4.757f)
                curveToRelative(2.265f, -2.264f, 5.888f, -2.34f, 8.244f, -0.228f)
                curveToRelative(2.349f, -2.109f, 5.979f, -2.039f, 8.242f, 0.228f)
                close()
            }
        }
        .build()
        return _heartsFill!!
    }

private var _heartsFill: ImageVector? = null
