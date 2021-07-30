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

public val LineAwesomeIcons.DollarSignSolid: ImageVector
    get() {
        if (_dollarSignSolid != null) {
            return _dollarSignSolid!!
        }
        _dollarSignSolid = Builder(name = "DollarSignSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                lineTo(15.0f, 5.0938f)
                curveTo(12.1641f, 5.5703f, 10.0f, 8.0508f, 10.0f, 11.0f)
                curveTo(10.0f, 12.7773f, 10.832f, 14.1484f, 11.9375f, 15.0313f)
                curveTo(13.043f, 15.9141f, 14.375f, 16.4063f, 15.625f, 16.9063f)
                curveTo(16.875f, 17.4063f, 18.043f, 17.9141f, 18.8125f, 18.5313f)
                curveTo(19.582f, 19.1484f, 20.0f, 19.7734f, 20.0f, 21.0f)
                curveTo(20.0f, 23.1563f, 18.207f, 25.0f, 16.0f, 25.0f)
                curveTo(13.7813f, 25.0f, 12.0f, 23.2188f, 12.0f, 21.0f)
                lineTo(12.0f, 20.0f)
                lineTo(10.0f, 20.0f)
                lineTo(10.0f, 21.0f)
                curveTo(10.0f, 23.9648f, 12.1641f, 26.4297f, 15.0f, 26.9063f)
                lineTo(15.0f, 29.0f)
                lineTo(17.0f, 29.0f)
                lineTo(17.0f, 26.9063f)
                curveTo(19.8438f, 26.4258f, 22.0f, 23.9258f, 22.0f, 21.0f)
                curveTo(22.0f, 19.2188f, 21.168f, 17.8555f, 20.0625f, 16.9688f)
                curveTo(18.957f, 16.082f, 17.625f, 15.5625f, 16.375f, 15.0625f)
                curveTo(15.125f, 14.5625f, 13.957f, 14.082f, 13.1875f, 13.4688f)
                curveTo(12.418f, 12.8555f, 12.0f, 12.2188f, 12.0f, 11.0f)
                curveTo(12.0f, 8.8086f, 13.7852f, 7.0f, 16.0f, 7.0f)
                curveTo(18.2188f, 7.0f, 20.0f, 8.7813f, 20.0f, 11.0f)
                lineTo(20.0f, 12.0f)
                lineTo(22.0f, 12.0f)
                lineTo(22.0f, 11.0f)
                curveTo(22.0f, 8.0352f, 19.8359f, 5.5703f, 17.0f, 5.0938f)
                lineTo(17.0f, 3.0f)
                close()
            }
        }
        .build()
        return _dollarSignSolid!!
    }

private var _dollarSignSolid: ImageVector? = null
