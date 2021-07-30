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

public val CssGgIcons.Unblock: ImageVector
    get() {
        if (_unblock != null) {
            return _unblock!!
        }
        _unblock = Builder(name = "Unblock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.636f, 18.364f)
                curveTo(9.1508f, 21.8787f, 14.8492f, 21.8787f, 18.364f, 18.364f)
                curveTo(21.8787f, 14.8492f, 21.8787f, 9.1508f, 18.364f, 5.636f)
                curveTo(14.8492f, 2.1213f, 9.1508f, 2.1213f, 5.636f, 5.636f)
                curveTo(2.1213f, 9.1508f, 2.1213f, 14.8492f, 5.636f, 18.364f)
                close()
                moveTo(7.8075f, 17.6067f)
                curveTo(10.5493f, 19.6623f, 14.4562f, 19.4433f, 16.9497f, 16.9497f)
                curveTo(19.4433f, 14.4562f, 19.6623f, 10.5493f, 17.6067f, 7.8075f)
                lineTo(14.8284f, 10.5858f)
                curveTo(14.4379f, 10.9763f, 13.8047f, 10.9763f, 13.4142f, 10.5858f)
                curveTo(13.0237f, 10.1953f, 13.0237f, 9.5621f, 13.4142f, 9.1716f)
                lineTo(16.1925f, 6.3933f)
                curveTo(13.4507f, 4.3377f, 9.5438f, 4.5567f, 7.0503f, 7.0503f)
                curveTo(4.5567f, 9.5438f, 4.3377f, 13.4507f, 6.3933f, 16.1925f)
                lineTo(9.1716f, 13.4142f)
                curveTo(9.5621f, 13.0237f, 10.1953f, 13.0237f, 10.5858f, 13.4142f)
                curveTo(10.9763f, 13.8047f, 10.9763f, 14.4379f, 10.5858f, 14.8284f)
                lineTo(7.8075f, 17.6067f)
                close()
            }
        }
        .build()
        return _unblock!!
    }

private var _unblock: ImageVector? = null
