package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Music: ImageVector
    get() {
        if (_music != null) {
            return _music!!
        }
        _music = Builder(name = "Music", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 6.001f)
                curveTo(22.0f, 3.549f, 19.815f, 1.675f, 17.392f, 2.047f)
                lineTo(10.392f, 3.124f)
                curveTo(8.44f, 3.424f, 7.0f, 5.103f, 7.0f, 7.078f)
                verticalLineTo(15.841f)
                curveTo(6.545f, 15.625f, 6.037f, 15.504f, 5.5f, 15.504f)
                curveTo(3.567f, 15.504f, 2.0f, 17.071f, 2.0f, 19.004f)
                curveTo(2.0f, 20.937f, 3.567f, 22.504f, 5.5f, 22.504f)
                curveTo(7.433f, 22.504f, 9.0f, 20.937f, 9.0f, 19.004f)
                verticalLineTo(7.078f)
                curveTo(9.0f, 6.091f, 9.72f, 5.251f, 10.696f, 5.101f)
                lineTo(17.696f, 4.024f)
                curveTo(18.907f, 3.838f, 20.0f, 4.775f, 20.0f, 6.001f)
                verticalLineTo(12.841f)
                curveTo(19.545f, 12.625f, 19.037f, 12.504f, 18.5f, 12.504f)
                curveTo(16.567f, 12.504f, 15.0f, 14.071f, 15.0f, 16.004f)
                curveTo(15.0f, 17.937f, 16.567f, 19.504f, 18.5f, 19.504f)
                curveTo(20.433f, 19.504f, 22.0f, 17.937f, 22.0f, 16.004f)
                verticalLineTo(6.001f)
                close()
                moveTo(20.0f, 16.004f)
                curveTo(20.0f, 15.175f, 19.328f, 14.504f, 18.5f, 14.504f)
                curveTo(17.672f, 14.504f, 17.0f, 15.175f, 17.0f, 16.004f)
                curveTo(17.0f, 16.832f, 17.672f, 17.504f, 18.5f, 17.504f)
                curveTo(19.328f, 17.504f, 20.0f, 16.832f, 20.0f, 16.004f)
                close()
                moveTo(7.0f, 19.004f)
                curveTo(7.0f, 18.176f, 6.328f, 17.504f, 5.5f, 17.504f)
                curveTo(4.672f, 17.504f, 4.0f, 18.176f, 4.0f, 19.004f)
                curveTo(4.0f, 19.832f, 4.672f, 20.504f, 5.5f, 20.504f)
                curveTo(6.328f, 20.504f, 7.0f, 19.832f, 7.0f, 19.004f)
                close()
            }
        }
        .build()
        return _music!!
    }

private var _music: ImageVector? = null
