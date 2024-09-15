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
                moveTo(16.0f, 3.719f)
                lineTo(15.375f, 4.219f)
                lineTo(7.125f, 10.625f)
                lineTo(6.875f, 10.844f)
                lineTo(6.781f, 11.156f)
                lineTo(4.031f, 21.25f)
                lineTo(3.813f, 22.031f)
                lineTo(16.0f, 28.125f)
                lineTo(28.188f, 22.031f)
                lineTo(27.969f, 21.25f)
                lineTo(25.219f, 11.156f)
                lineTo(25.125f, 10.844f)
                lineTo(24.875f, 10.625f)
                lineTo(16.625f, 4.219f)
                close()
                moveTo(15.0f, 7.063f)
                lineTo(15.0f, 10.0f)
                lineTo(11.219f, 10.0f)
                close()
                moveTo(17.0f, 7.063f)
                lineTo(20.781f, 10.0f)
                lineTo(17.0f, 10.0f)
                close()
                moveTo(9.063f, 12.0f)
                lineTo(14.0f, 12.0f)
                lineTo(10.406f, 16.781f)
                close()
                moveTo(18.0f, 12.0f)
                lineTo(22.938f, 12.0f)
                lineTo(21.594f, 16.781f)
                close()
                moveTo(16.0f, 12.688f)
                lineTo(20.0f, 18.0f)
                lineTo(12.0f, 18.0f)
                close()
                moveTo(7.813f, 15.0f)
                lineTo(8.813f, 18.5f)
                lineTo(6.563f, 19.625f)
                close()
                moveTo(24.188f, 15.0f)
                lineTo(25.438f, 19.625f)
                lineTo(23.188f, 18.5f)
                close()
                moveTo(12.0f, 20.0f)
                lineTo(20.0f, 20.0f)
                lineTo(16.0f, 25.313f)
                close()
                moveTo(9.688f, 20.281f)
                lineTo(12.625f, 24.188f)
                lineTo(7.25f, 21.5f)
                close()
                moveTo(22.313f, 20.281f)
                lineTo(24.75f, 21.5f)
                lineTo(19.375f, 24.188f)
                close()
            }
        }
        .build()
        return _diceD20Solid!!
    }

private var _diceD20Solid: ImageVector? = null
