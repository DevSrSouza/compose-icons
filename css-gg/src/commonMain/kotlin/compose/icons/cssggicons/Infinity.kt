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

public val CssGgIcons.Infinity: ImageVector
    get() {
        if (_infinity != null) {
            return _infinity!!
        }
        _infinity = Builder(name = "Infinity", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.121f, 9.879f)
                lineTo(10.204f, 11.962f)
                lineTo(10.211f, 11.955f)
                lineTo(11.663f, 13.408f)
                lineTo(11.669f, 13.414f)
                lineTo(13.791f, 15.535f)
                curveTo(15.743f, 17.488f, 18.909f, 17.488f, 20.862f, 15.535f)
                curveTo(22.814f, 13.583f, 22.814f, 10.417f, 20.862f, 8.464f)
                curveTo(18.909f, 6.512f, 15.743f, 6.512f, 13.791f, 8.464f)
                lineTo(13.077f, 9.178f)
                lineTo(14.491f, 10.592f)
                lineTo(15.205f, 9.879f)
                curveTo(16.376f, 8.707f, 18.276f, 8.707f, 19.448f, 9.879f)
                curveTo(20.619f, 11.05f, 20.619f, 12.95f, 19.448f, 14.121f)
                curveTo(18.276f, 15.293f, 16.376f, 15.293f, 15.205f, 14.121f)
                lineTo(13.133f, 12.049f)
                lineTo(13.126f, 12.055f)
                lineTo(9.536f, 8.464f)
                curveTo(7.583f, 6.512f, 4.417f, 6.512f, 2.464f, 8.464f)
                curveTo(0.512f, 10.417f, 0.512f, 13.583f, 2.464f, 15.535f)
                curveTo(4.417f, 17.488f, 7.583f, 17.488f, 9.536f, 15.535f)
                lineTo(10.249f, 14.822f)
                lineTo(8.835f, 13.408f)
                lineTo(8.121f, 14.121f)
                curveTo(6.95f, 15.293f, 5.05f, 15.293f, 3.879f, 14.121f)
                curveTo(2.707f, 12.95f, 2.707f, 11.05f, 3.879f, 9.879f)
                curveTo(5.05f, 8.707f, 6.95f, 8.707f, 8.121f, 9.879f)
                close()
            }
        }
        .build()
        return _infinity!!
    }

private var _infinity: ImageVector? = null
