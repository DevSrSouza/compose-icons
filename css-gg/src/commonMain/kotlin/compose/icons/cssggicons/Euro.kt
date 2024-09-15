package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Euro: ImageVector
    get() {
        if (_euro != null) {
            return _euro!!
        }
        _euro = Builder(name = "Euro", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.553f, 15.535f)
                curveTo(17.649f, 16.44f, 16.399f, 17.0f, 15.018f, 17.0f)
                curveTo(13.142f, 17.0f, 11.507f, 15.966f, 10.651f, 14.437f)
                horizontalLineTo(13.032f)
                lineTo(13.728f, 12.563f)
                horizontalLineTo(10.049f)
                curveTo(10.029f, 12.378f, 10.018f, 12.19f, 10.018f, 12.0f)
                curveTo(10.018f, 11.81f, 10.029f, 11.622f, 10.049f, 11.437f)
                horizontalLineTo(14.336f)
                lineTo(15.032f, 9.563f)
                horizontalLineTo(10.651f)
                curveTo(11.507f, 8.034f, 13.142f, 7.0f, 15.018f, 7.0f)
                curveTo(16.399f, 7.0f, 17.649f, 7.56f, 18.553f, 8.464f)
                lineTo(19.968f, 7.05f)
                curveTo(18.701f, 5.784f, 16.951f, 5.0f, 15.018f, 5.0f)
                curveTo(12.009f, 5.0f, 9.444f, 6.898f, 8.454f, 9.563f)
                horizontalLineTo(6.032f)
                lineTo(5.336f, 11.437f)
                horizontalLineTo(8.04f)
                curveTo(8.026f, 11.623f, 8.018f, 11.811f, 8.018f, 12.0f)
                curveTo(8.018f, 12.189f, 8.026f, 12.377f, 8.04f, 12.563f)
                horizontalLineTo(4.728f)
                lineTo(4.032f, 14.437f)
                horizontalLineTo(8.454f)
                curveTo(9.444f, 17.102f, 12.009f, 19.0f, 15.018f, 19.0f)
                curveTo(16.951f, 19.0f, 18.701f, 18.216f, 19.968f, 16.95f)
                lineTo(18.553f, 15.535f)
                close()
            }
        }
        .build()
        return _euro!!
    }

private var _euro: ImageVector? = null
