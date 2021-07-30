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

public val LineAwesomeIcons.ExchangeAltSolid: ImageVector
    get() {
        if (_exchangeAltSolid != null) {
            return _exchangeAltSolid!!
        }
        _exchangeAltSolid = Builder(name = "ExchangeAltSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1875f, 2.2813f)
                lineTo(20.7813f, 3.7188f)
                lineTo(25.0625f, 8.0f)
                lineTo(4.0f, 8.0f)
                lineTo(4.0f, 10.0f)
                lineTo(25.0625f, 10.0f)
                lineTo(20.7813f, 14.2813f)
                lineTo(22.1875f, 15.7188f)
                lineTo(28.9063f, 9.0f)
                close()
                moveTo(9.8125f, 16.2813f)
                lineTo(3.0938f, 23.0f)
                lineTo(9.8125f, 29.7188f)
                lineTo(11.2188f, 28.2813f)
                lineTo(6.9375f, 24.0f)
                lineTo(28.0f, 24.0f)
                lineTo(28.0f, 22.0f)
                lineTo(6.9375f, 22.0f)
                lineTo(11.2188f, 17.7188f)
                close()
            }
        }
        .build()
        return _exchangeAltSolid!!
    }

private var _exchangeAltSolid: ImageVector? = null
