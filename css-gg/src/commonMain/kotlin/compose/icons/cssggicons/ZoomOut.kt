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

public val CssGgIcons.ZoomOut: ImageVector
    get() {
        if (_zoomOut != null) {
            return _zoomOut!!
        }
        _zoomOut = Builder(name = "ZoomOut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.3431f, 15.2426f)
                curveTo(17.6863f, 12.8995f, 17.6863f, 9.1005f, 15.3431f, 6.7574f)
                curveTo(13.0f, 4.4142f, 9.201f, 4.4142f, 6.8579f, 6.7574f)
                curveTo(4.5147f, 9.1005f, 4.5147f, 12.8995f, 6.8579f, 15.2426f)
                curveTo(9.201f, 17.5858f, 13.0f, 17.5858f, 15.3431f, 15.2426f)
                close()
                moveTo(16.7574f, 5.3432f)
                curveTo(19.6425f, 8.2283f, 19.8633f, 12.769f, 17.4195f, 15.9075f)
                curveTo(17.4348f, 15.921f, 17.4498f, 15.9351f, 17.4645f, 15.9497f)
                lineTo(21.7071f, 20.1924f)
                curveTo(22.0976f, 20.5829f, 22.0976f, 21.2161f, 21.7071f, 21.6066f)
                curveTo(21.3166f, 21.9971f, 20.6834f, 21.9971f, 20.2929f, 21.6066f)
                lineTo(16.0503f, 17.364f)
                curveTo(16.0356f, 17.3493f, 16.0215f, 17.3343f, 16.008f, 17.319f)
                curveTo(12.8695f, 19.7628f, 8.3288f, 19.542f, 5.4436f, 16.6569f)
                curveTo(2.3195f, 13.5327f, 2.3195f, 8.4673f, 5.4436f, 5.3432f)
                curveTo(8.5679f, 2.219f, 13.6332f, 2.219f, 16.7574f, 5.3432f)
                close()
                moveTo(7.1005f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.1005f)
                verticalLineTo(10.0f)
                lineTo(7.1005f, 10.0f)
                close()
            }
        }
        .build()
        return _zoomOut!!
    }

private var _zoomOut: ImageVector? = null
