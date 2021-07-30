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

public val LineAwesomeIcons.TrademarkSolid: ImageVector
    get() {
        if (_trademarkSolid != null) {
            return _trademarkSolid!!
        }
        _trademarkSolid = Builder(name = "TrademarkSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 8.0f)
                lineTo(3.0f, 10.0f)
                lineTo(7.0f, 10.0f)
                lineTo(7.0f, 23.0f)
                lineTo(9.0f, 23.0f)
                lineTo(9.0f, 10.0f)
                lineTo(13.0f, 10.0f)
                lineTo(13.0f, 8.0f)
                close()
                moveTo(15.0f, 8.0f)
                lineTo(15.0f, 23.0f)
                lineTo(17.0f, 23.0f)
                lineTo(17.0f, 10.875f)
                lineTo(21.1563f, 17.5313f)
                lineTo(22.0f, 18.875f)
                lineTo(22.8438f, 17.5313f)
                lineTo(27.0f, 10.875f)
                lineTo(27.0f, 23.0f)
                lineTo(29.0f, 23.0f)
                lineTo(29.0f, 8.0f)
                lineTo(26.4375f, 8.0f)
                lineTo(26.1563f, 8.4688f)
                lineTo(22.0f, 15.125f)
                lineTo(17.8438f, 8.4688f)
                lineTo(17.5625f, 8.0f)
                close()
            }
        }
        .build()
        return _trademarkSolid!!
    }

private var _trademarkSolid: ImageVector? = null
