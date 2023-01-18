package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ArrowTrendingDown: ImageVector
    get() {
        if (_arrowTrendingDown != null) {
            return _arrowTrendingDown!!
        }
        _arrowTrendingDown = Builder(name = "ArrowTrendingDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7489f, 18.5f)
                lineTo(21.3027f, 18.4995f)
                lineTo(21.403f, 18.4856f)
                lineTo(21.5018f, 18.458f)
                lineTo(21.5621f, 18.4324f)
                curveTo(21.6413f, 18.3975f, 21.7155f, 18.3469f, 21.7808f, 18.2817f)
                lineTo(21.8215f, 18.2376f)
                lineTo(21.865f, 18.1812f)
                lineTo(21.9192f, 18.0911f)
                lineTo(21.9579f, 18.0008f)
                lineTo(21.977f, 17.9367f)
                lineTo(21.9906f, 17.8727f)
                lineTo(22.0f, 17.7785f)
                lineTo(22.0004f, 10.2461f)
                curveTo(22.0004f, 9.8319f, 21.6647f, 9.4961f, 21.2504f, 9.4961f)
                curveTo(20.8708f, 9.4961f, 20.557f, 9.7783f, 20.5073f, 10.1443f)
                lineTo(20.5004f, 10.2461f)
                lineTo(20.5f, 15.941f)
                lineTo(12.7812f, 8.2207f)
                curveTo(12.5149f, 7.9545f, 12.0982f, 7.9303f, 11.8046f, 8.1481f)
                lineTo(11.7205f, 8.2207f)
                lineTo(8.75f, 11.1911f)
                lineTo(3.2803f, 5.7214f)
                curveTo(2.9874f, 5.4285f, 2.5126f, 5.4285f, 2.2197f, 5.7214f)
                curveTo(1.9534f, 5.9877f, 1.9292f, 6.4043f, 2.147f, 6.6979f)
                lineTo(2.2197f, 6.7821f)
                lineTo(8.2197f, 12.7821f)
                curveTo(8.4859f, 13.0483f, 8.9026f, 13.0725f, 9.1962f, 12.8547f)
                lineTo(9.2803f, 12.7821f)
                lineTo(12.2508f, 9.8117f)
                lineTo(19.438f, 17.0f)
                horizontalLineTo(13.7489f)
                curveTo(13.3692f, 17.0f, 13.0554f, 17.2822f, 13.0058f, 17.6482f)
                lineTo(12.9989f, 17.75f)
                curveTo(12.9989f, 18.1297f, 13.2811f, 18.4435f, 13.6472f, 18.4932f)
                lineTo(13.7489f, 18.5f)
                close()
            }
        }
        .build()
        return _arrowTrendingDown!!
    }

private var _arrowTrendingDown: ImageVector? = null
