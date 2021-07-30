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

public val LineAwesomeIcons.HighlighterSolid: ImageVector
    get() {
        if (_highlighterSolid != null) {
            return _highlighterSolid!!
        }
        _highlighterSolid = Builder(name = "HighlighterSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.625f, 3.0625f)
                lineTo(22.9063f, 3.6875f)
                lineTo(7.5625f, 17.0f)
                lineTo(7.0625f, 17.4688f)
                lineTo(7.3125f, 18.125f)
                curveTo(7.3125f, 18.125f, 8.4375f, 21.125f, 6.2813f, 23.2813f)
                lineTo(6.2813f, 23.3125f)
                lineTo(6.25f, 23.3438f)
                lineTo(6.0938f, 23.5313f)
                lineTo(5.9688f, 23.6563f)
                lineTo(2.0f, 27.5313f)
                lineTo(7.375f, 29.0f)
                lineTo(9.4375f, 26.9375f)
                lineTo(9.6563f, 26.75f)
                lineTo(9.6875f, 26.7188f)
                lineTo(9.7188f, 26.7188f)
                curveTo(11.875f, 24.5625f, 14.875f, 25.6875f, 14.875f, 25.6875f)
                lineTo(15.5313f, 25.9375f)
                lineTo(16.0f, 25.4375f)
                lineTo(29.3125f, 10.0938f)
                lineTo(29.9375f, 9.375f)
                close()
                moveTo(23.5f, 5.8125f)
                lineTo(27.1875f, 9.5f)
                lineTo(18.4375f, 19.5625f)
                lineTo(13.4375f, 14.5625f)
                close()
                moveTo(11.9375f, 15.875f)
                lineTo(17.125f, 21.0625f)
                lineTo(15.1875f, 23.3125f)
                lineTo(9.6875f, 17.8125f)
                close()
                moveTo(9.5625f, 20.5f)
                lineTo(12.5f, 23.4375f)
                curveTo(11.2578f, 23.4844f, 9.7539f, 23.875f, 8.3438f, 25.25f)
                curveTo(8.3242f, 25.2695f, 8.3008f, 25.2617f, 8.2813f, 25.2813f)
                lineTo(8.0313f, 25.5f)
                lineTo(7.5f, 24.9688f)
                lineTo(7.7188f, 24.7188f)
                lineTo(7.75f, 24.6563f)
                curveTo(9.125f, 23.2461f, 9.5156f, 21.7422f, 9.5625f, 20.5f)
                close()
            }
        }
        .build()
        return _highlighterSolid!!
    }

private var _highlighterSolid: ImageVector? = null
