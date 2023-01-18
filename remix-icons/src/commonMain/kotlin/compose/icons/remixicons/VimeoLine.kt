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

public val RemixIcons.VimeoLine: ImageVector
    get() {
        if (_vimeoLine != null) {
            return _vimeoLine!!
        }
        _vimeoLine = Builder(name = "VimeoLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.993f, 3.004f)
                curveToRelative(2.433f, 0.0f, 4.005f, 1.512f, 4.005f, 4.496f)
                curveToRelative(0.0f, 1.72f, -0.998f, 3.94f, -1.832f, 5.235f)
                curveToRelative(-2.789f, 4.333f, -6.233f, 8.74f, -9.643f, 8.74f)
                curveToRelative(-3.706f, 0.0f, -4.67f, -6.831f, -5.092f, -8.432f)
                curveToRelative(-0.422f, -1.601f, -0.533f, -2.21f, -1.17f, -3.233f)
                curveToRelative(-0.317f, 0.22f, -0.76f, 0.529f, -1.33f, 0.93f)
                curveToRelative(-0.224f, 0.157f, -0.533f, 0.105f, -0.693f, -0.117f)
                lineTo(0.925f, 8.807f)
                curveTo(0.789f, 8.62f, 0.8f, 8.363f, 0.952f, 8.187f)
                curveTo(3.779f, 4.915f, 6.128f, 3.278f, 8.0f, 3.278f)
                curveToRelative(2.392f, 0.0f, 3.124f, 2.816f, 3.324f, 4.223f)
                curveToRelative(0.3f, 2.117f, 0.69f, 4.738f, 1.244f, 5.872f)
                curveToRelative(0.557f, -0.792f, 2.18f, -2.888f, 1.967f, -3.99f)
                curveToRelative(-0.094f, -0.486f, -1.317f, 0.183f, -1.887f, 0.078f)
                curveToRelative(-0.425f, -0.08f, -0.806f, -0.402f, -0.806f, -1.026f)
                curveToRelative(0.0f, -1.31f, 1.852f, -5.43f, 6.151f, -5.43f)
                close()
                moveTo(18.0f, 5.004f)
                curveToRelative(-2.195f, 0.0f, -3.251f, 1.533f, -3.653f, 2.208f)
                curveToRelative(1.25f, 0.046f, 1.97f, 0.818f, 2.133f, 1.803f)
                curveToRelative(0.389f, 2.33f, -1.916f, 4.92f, -2.339f, 5.565f)
                curveToRelative(-0.396f, 0.603f, -3.061f, 3.328f, -4.25f, -3.36f)
                curveToRelative(-0.112f, -0.629f, -0.367f, -2.163f, -0.665f, -4.186f)
                curveToRelative(-0.17f, -1.151f, -0.873f, -1.763f, -1.23f, -1.763f)
                curveToRelative(-0.842f, 0.0f, -1.92f, 0.65f, -3.855f, 2.515f)
                curveToRelative(1.905f, -0.115f, 2.545f, 2.276f, 2.916f, 3.633f)
                curveToRelative(0.816f, 2.984f, 1.571f, 8.056f, 3.62f, 8.056f)
                curveToRelative(1.727f, 0.0f, 4.439f, -2.646f, 7.37f, -7.04f)
                curveToRelative(0.209f, -0.311f, 1.966f, -3.024f, 1.966f, -5.036f)
                curveToRelative(0.0f, -2.395f, -1.469f, -2.395f, -2.013f, -2.395f)
                close()
            }
        }
        .build()
        return _vimeoLine!!
    }

private var _vimeoLine: ImageVector? = null
