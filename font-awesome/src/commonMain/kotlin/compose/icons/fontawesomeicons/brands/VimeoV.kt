package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.VimeoV: ImageVector
    get() {
        if (_vimeoV != null) {
            return _vimeoV!!
        }
        _vimeoV = Builder(name = "VimeoV", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(447.8f, 153.6f)
                curveToRelative(-2.0f, 43.6f, -32.4f, 103.3f, -91.4f, 179.1f)
                curveToRelative(-60.9f, 79.2f, -112.4f, 118.8f, -154.6f, 118.8f)
                curveToRelative(-26.1f, 0.0f, -48.2f, -24.1f, -66.3f, -72.3f)
                curveTo(100.3f, 250.0f, 85.3f, 174.3f, 56.2f, 174.3f)
                curveToRelative(-3.4f, 0.0f, -15.1f, 7.1f, -35.2f, 21.1f)
                lineTo(0.0f, 168.2f)
                curveToRelative(51.6f, -45.3f, 100.9f, -95.7f, 131.8f, -98.5f)
                curveToRelative(34.9f, -3.4f, 56.3f, 20.5f, 64.4f, 71.5f)
                curveToRelative(28.7f, 181.5f, 41.4f, 208.9f, 93.6f, 126.7f)
                curveToRelative(18.7f, -29.6f, 28.8f, -52.1f, 30.2f, -67.6f)
                curveToRelative(4.8f, -45.9f, -35.8f, -42.8f, -63.3f, -31.0f)
                curveToRelative(22.0f, -72.1f, 64.1f, -107.1f, 126.2f, -105.1f)
                curveToRelative(45.8f, 1.2f, 67.5f, 31.1f, 64.9f, 89.4f)
                close()
            }
        }
        .build()
        return _vimeoV!!
    }

private var _vimeoV: ImageVector? = null
