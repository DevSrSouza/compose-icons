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

public val LineAwesomeIcons.GemSolid: ImageVector
    get() {
        if (_gemSolid != null) {
            return _gemSolid!!
        }
        _gemSolid = Builder(name = "GemSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5313f, 6.0f)
                lineTo(4.2188f, 12.375f)
                lineTo(3.7188f, 12.9688f)
                lineTo(4.2188f, 13.625f)
                lineTo(15.2188f, 27.625f)
                lineTo(16.0f, 28.625f)
                lineTo(16.7813f, 27.625f)
                lineTo(27.7813f, 13.625f)
                lineTo(28.2813f, 12.9688f)
                lineTo(27.7813f, 12.375f)
                lineTo(22.4688f, 6.0f)
                close()
                moveTo(10.4688f, 8.0f)
                lineTo(14.125f, 8.0f)
                lineTo(11.4375f, 12.0f)
                lineTo(7.125f, 12.0f)
                close()
                moveTo(17.875f, 8.0f)
                lineTo(21.5313f, 8.0f)
                lineTo(24.875f, 12.0f)
                lineTo(20.5625f, 12.0f)
                close()
                moveTo(16.0f, 8.8438f)
                lineTo(18.125f, 12.0f)
                lineTo(13.875f, 12.0f)
                close()
                moveTo(7.0313f, 14.0f)
                lineTo(11.25f, 14.0f)
                lineTo(13.625f, 22.4063f)
                close()
                moveTo(13.3125f, 14.0f)
                lineTo(18.6563f, 14.0f)
                lineTo(16.0f, 23.3125f)
                close()
                moveTo(20.75f, 14.0f)
                lineTo(24.9688f, 14.0f)
                lineTo(18.375f, 22.375f)
                close()
            }
        }
        .build()
        return _gemSolid!!
    }

private var _gemSolid: ImageVector? = null
