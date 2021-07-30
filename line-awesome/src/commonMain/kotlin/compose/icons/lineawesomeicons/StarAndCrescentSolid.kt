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

public val LineAwesomeIcons.StarAndCrescentSolid: ImageVector
    get() {
        if (_starAndCrescentSolid != null) {
            return _starAndCrescentSolid!!
        }
        _starAndCrescentSolid = Builder(name = "StarAndCrescentSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 4.0f)
                curveTo(8.1445f, 4.0f, 3.0313f, 9.4102f, 3.0313f, 16.0f)
                curveTo(3.0313f, 22.5898f, 8.1445f, 28.0f, 14.5f, 28.0f)
                curveTo(18.3672f, 28.0f, 20.9766f, 26.4453f, 22.9375f, 24.5938f)
                lineTo(22.25f, 23.875f)
                lineTo(21.75f, 23.0f)
                curveTo(20.5938f, 23.6836f, 19.5352f, 24.0f, 17.0f, 24.0f)
                curveTo(12.5742f, 24.0f, 9.0f, 20.6602f, 9.0f, 16.0f)
                curveTo(9.0f, 11.3398f, 12.5781f, 8.0f, 17.0f, 8.0f)
                curveTo(19.1484f, 8.0f, 20.6445f, 8.3398f, 21.7188f, 8.9375f)
                lineTo(21.9375f, 8.5313f)
                lineTo(22.0f, 8.4688f)
                lineTo(21.75f, 8.9375f)
                curveTo(21.7695f, 8.9492f, 21.7852f, 8.9531f, 21.8125f, 8.9688f)
                lineTo(22.3125f, 8.125f)
                lineTo(23.0313f, 7.4063f)
                curveTo(21.0313f, 5.5195f, 18.1758f, 4.0f, 14.5f, 4.0f)
                close()
                moveTo(14.5f, 6.0f)
                curveTo(14.9609f, 6.0f, 15.3867f, 6.043f, 15.8125f, 6.0938f)
                curveTo(10.9063f, 6.668f, 7.0f, 10.7188f, 7.0f, 16.0f)
                curveTo(7.0f, 21.293f, 10.9258f, 25.3438f, 15.8438f, 25.9063f)
                curveTo(15.418f, 25.9531f, 14.9805f, 26.0f, 14.5f, 26.0f)
                curveTo(9.2773f, 26.0f, 5.0313f, 21.5586f, 5.0313f, 16.0f)
                curveTo(5.0313f, 10.4375f, 9.2773f, 6.0f, 14.5f, 6.0f)
                close()
                moveTo(25.5938f, 11.0f)
                lineTo(23.4375f, 14.0938f)
                lineTo(20.0313f, 12.875f)
                lineTo(22.125f, 16.0f)
                lineTo(20.0f, 19.0625f)
                lineTo(23.4375f, 17.9063f)
                lineTo(25.5625f, 21.0f)
                lineTo(25.5625f, 17.1875f)
                lineTo(29.0f, 16.0f)
                lineTo(25.5625f, 14.8125f)
                close()
            }
        }
        .build()
        return _starAndCrescentSolid!!
    }

private var _starAndCrescentSolid: ImageVector? = null
