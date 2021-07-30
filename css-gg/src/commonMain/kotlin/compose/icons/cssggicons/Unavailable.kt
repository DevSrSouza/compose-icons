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

public val CssGgIcons.Unavailable: ImageVector
    get() {
        if (_unavailable != null) {
            return _unavailable!!
        }
        _unavailable = Builder(name = "Unavailable", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.364f, 5.636f)
                curveTo(21.8787f, 9.1508f, 21.8787f, 14.8492f, 18.364f, 18.364f)
                curveTo(14.8492f, 21.8787f, 9.1508f, 21.8787f, 5.636f, 18.364f)
                curveTo(2.1213f, 14.8492f, 2.1213f, 9.1508f, 5.636f, 5.636f)
                curveTo(9.1508f, 2.1213f, 14.8492f, 2.1213f, 18.364f, 5.636f)
                close()
                moveTo(16.1925f, 17.6067f)
                lineTo(6.3933f, 7.8075f)
                curveTo(4.3377f, 10.5493f, 4.5567f, 14.4562f, 7.0503f, 16.9497f)
                curveTo(9.5438f, 19.4433f, 13.4507f, 19.6623f, 16.1925f, 17.6067f)
                close()
                moveTo(16.9497f, 7.0503f)
                curveTo(19.4433f, 9.5438f, 19.6623f, 13.4507f, 17.6067f, 16.1925f)
                lineTo(7.8075f, 6.3933f)
                curveTo(10.5493f, 4.3377f, 14.4562f, 4.5567f, 16.9497f, 7.0503f)
                close()
            }
        }
        .build()
        return _unavailable!!
    }

private var _unavailable: ImageVector? = null
