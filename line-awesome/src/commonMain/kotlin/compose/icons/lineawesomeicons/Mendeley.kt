package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Mendeley: ImageVector
    get() {
        if (_mendeley != null) {
            return _mendeley!!
        }
        _mendeley = Builder(name = "Mendeley", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.658f, 7.201f)
                curveTo(6.046f, 7.161f, 4.204f, 10.833f, 5.328f, 13.682f)
                curveTo(5.932f, 16.848f, 5.347f, 18.527f, 3.201f, 18.576f)
                curveTo(2.151f, 18.462f, 1.367f, 18.898f, 0.574f, 19.691f)
                curveTo(-0.412f, 20.667f, -0.381f, 24.388f, 2.686f, 24.775f)
                curveTo(5.02f, 25.067f, 6.646f, 22.522f, 5.719f, 20.426f)
                curveTo(3.375f, 15.288f, 15.073f, 15.169f, 13.121f, 20.02f)
                curveTo(13.116f, 20.025f, 13.11f, 20.029f, 13.105f, 20.039f)
                curveTo(11.777f, 22.16f, 13.444f, 24.867f, 16.02f, 24.758f)
                curveTo(18.601f, 24.862f, 20.25f, 22.15f, 18.932f, 20.039f)
                curveTo(18.927f, 20.029f, 18.923f, 20.025f, 18.918f, 20.02f)
                curveTo(16.966f, 15.169f, 28.663f, 15.288f, 26.32f, 20.426f)
                curveTo(26.092f, 20.921f, 25.987f, 21.481f, 26.037f, 22.061f)
                curveTo(26.28f, 24.707f, 29.442f, 25.733f, 31.236f, 23.805f)
                curveTo(32.119f, 23.071f, 32.38f, 20.555f, 31.236f, 19.43f)
                curveTo(30.627f, 18.816f, 29.766f, 18.477f, 28.84f, 18.576f)
                curveTo(26.695f, 18.526f, 26.067f, 16.848f, 26.672f, 13.682f)
                curveTo(27.802f, 10.833f, 25.935f, 7.166f, 22.342f, 7.201f)
                curveTo(18.507f, 7.236f, 18.458f, 11.264f, 16.02f, 11.264f)
                curveTo(13.637f, 11.264f, 13.468f, 7.236f, 9.658f, 7.201f)
                close()
                moveTo(16.006f, 12.26f)
                lineTo(16.035f, 12.26f)
                curveTo(17.754f, 12.26f, 19.146f, 13.651f, 19.146f, 15.371f)
                curveTo(19.146f, 16.61f, 18.195f, 18.482f, 16.035f, 18.482f)
                lineTo(16.006f, 18.482f)
                curveTo(13.856f, 18.482f, 12.893f, 16.625f, 12.893f, 15.371f)
                curveTo(12.893f, 13.652f, 14.291f, 12.26f, 16.006f, 12.26f)
                close()
            }
        }
        .build()
        return _mendeley!!
    }

private var _mendeley: ImageVector? = null
