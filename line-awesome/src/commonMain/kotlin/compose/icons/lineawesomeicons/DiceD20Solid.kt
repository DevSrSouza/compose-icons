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

public val LineAwesomeIcons.DiceD20Solid: ImageVector
    get() {
        if (_diceD20Solid != null) {
            return _diceD20Solid!!
        }
        _diceD20Solid = Builder(name = "DiceD20Solid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.7188f)
                lineTo(15.375f, 4.2188f)
                lineTo(7.125f, 10.625f)
                lineTo(6.875f, 10.8438f)
                lineTo(6.7813f, 11.1563f)
                lineTo(4.0313f, 21.25f)
                lineTo(3.8125f, 22.0313f)
                lineTo(16.0f, 28.125f)
                lineTo(28.1875f, 22.0313f)
                lineTo(27.9688f, 21.25f)
                lineTo(25.2188f, 11.1563f)
                lineTo(25.125f, 10.8438f)
                lineTo(24.875f, 10.625f)
                lineTo(16.625f, 4.2188f)
                close()
                moveTo(15.0f, 7.0625f)
                lineTo(15.0f, 10.0f)
                lineTo(11.2188f, 10.0f)
                close()
                moveTo(17.0f, 7.0625f)
                lineTo(20.7813f, 10.0f)
                lineTo(17.0f, 10.0f)
                close()
                moveTo(9.0625f, 12.0f)
                lineTo(14.0f, 12.0f)
                lineTo(10.4063f, 16.7813f)
                close()
                moveTo(18.0f, 12.0f)
                lineTo(22.9375f, 12.0f)
                lineTo(21.5938f, 16.7813f)
                close()
                moveTo(16.0f, 12.6875f)
                lineTo(20.0f, 18.0f)
                lineTo(12.0f, 18.0f)
                close()
                moveTo(7.8125f, 15.0f)
                lineTo(8.8125f, 18.5f)
                lineTo(6.5625f, 19.625f)
                close()
                moveTo(24.1875f, 15.0f)
                lineTo(25.4375f, 19.625f)
                lineTo(23.1875f, 18.5f)
                close()
                moveTo(12.0f, 20.0f)
                lineTo(20.0f, 20.0f)
                lineTo(16.0f, 25.3125f)
                close()
                moveTo(9.6875f, 20.2813f)
                lineTo(12.625f, 24.1875f)
                lineTo(7.25f, 21.5f)
                close()
                moveTo(22.3125f, 20.2813f)
                lineTo(24.75f, 21.5f)
                lineTo(19.375f, 24.1875f)
                close()
            }
        }
        .build()
        return _diceD20Solid!!
    }

private var _diceD20Solid: ImageVector? = null
