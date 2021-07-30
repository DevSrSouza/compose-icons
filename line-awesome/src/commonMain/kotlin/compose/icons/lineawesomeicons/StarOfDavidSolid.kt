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

public val LineAwesomeIcons.StarOfDavidSolid: ImageVector
    get() {
        if (_starOfDavidSolid != null) {
            return _starOfDavidSolid!!
        }
        _starOfDavidSolid = Builder(name = "StarOfDavidSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0625f)
                lineTo(15.1563f, 3.4688f)
                lineTo(11.7813f, 9.0f)
                lineTo(3.3125f, 9.0f)
                lineTo(4.2188f, 10.5313f)
                lineTo(7.5313f, 16.0f)
                lineTo(4.2188f, 21.4688f)
                lineTo(3.3125f, 23.0f)
                lineTo(11.7813f, 23.0f)
                lineTo(15.1563f, 28.5313f)
                lineTo(16.0f, 29.9375f)
                lineTo(16.8438f, 28.5313f)
                lineTo(20.2188f, 23.0f)
                lineTo(28.7813f, 23.0f)
                lineTo(27.8438f, 21.4688f)
                lineTo(24.5f, 16.0f)
                lineTo(27.8438f, 10.5313f)
                lineTo(28.7813f, 9.0f)
                lineTo(20.2188f, 9.0f)
                lineTo(16.8438f, 3.4688f)
                close()
                moveTo(16.0f, 5.9063f)
                lineTo(17.875f, 9.0f)
                lineTo(14.125f, 9.0f)
                close()
                moveTo(6.875f, 11.0f)
                lineTo(10.5938f, 11.0f)
                lineTo(8.7188f, 14.0625f)
                close()
                moveTo(12.9063f, 11.0f)
                lineTo(19.125f, 11.0f)
                lineTo(22.1563f, 16.0f)
                lineTo(19.125f, 21.0f)
                lineTo(12.9063f, 21.0f)
                lineTo(9.9063f, 16.0f)
                close()
                moveTo(21.4375f, 11.0f)
                lineTo(25.2188f, 11.0f)
                lineTo(23.3438f, 14.0938f)
                close()
                moveTo(23.3438f, 17.9063f)
                lineTo(25.2188f, 21.0f)
                lineTo(21.4375f, 21.0f)
                close()
                moveTo(8.7188f, 17.9375f)
                lineTo(10.5938f, 21.0f)
                lineTo(6.875f, 21.0f)
                close()
                moveTo(14.125f, 23.0f)
                lineTo(17.875f, 23.0f)
                lineTo(16.0f, 26.0938f)
                close()
            }
        }
        .build()
        return _starOfDavidSolid!!
    }

private var _starOfDavidSolid: ImageVector? = null
