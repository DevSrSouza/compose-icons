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

public val LineAwesomeIcons.SyringeSolid: ImageVector
    get() {
        if (_syringeSolid != null) {
            return _syringeSolid!!
        }
        _syringeSolid = Builder(name = "SyringeSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.2188f, 3.7813f)
                lineTo(21.7813f, 5.2188f)
                lineTo(22.1563f, 5.5938f)
                lineTo(19.875f, 7.875f)
                lineTo(21.2813f, 9.3125f)
                lineTo(23.5625f, 7.0f)
                lineTo(25.0f, 8.4375f)
                lineTo(22.6875f, 10.7188f)
                lineTo(24.125f, 12.125f)
                lineTo(26.4063f, 9.8438f)
                lineTo(26.7813f, 10.2188f)
                lineTo(28.2188f, 8.7813f)
                close()
                moveTo(17.7188f, 7.2813f)
                lineTo(16.2813f, 8.7188f)
                lineTo(16.9375f, 9.375f)
                lineTo(7.0f, 19.3438f)
                lineTo(6.6563f, 19.6875f)
                lineTo(6.7188f, 20.1563f)
                lineTo(7.0625f, 23.3438f)
                lineTo(7.0938f, 23.6875f)
                lineTo(7.1875f, 23.75f)
                lineTo(3.9375f, 27.0f)
                lineTo(6.7813f, 27.0f)
                lineTo(8.8125f, 24.9688f)
                lineTo(11.8438f, 25.2813f)
                lineTo(12.3125f, 25.3438f)
                lineTo(12.6563f, 25.0f)
                lineTo(22.625f, 15.0625f)
                lineTo(23.2813f, 15.7188f)
                lineTo(24.7188f, 14.2813f)
                close()
                moveTo(18.375f, 10.8125f)
                lineTo(21.1875f, 13.625f)
                lineTo(11.5938f, 23.25f)
                lineTo(9.2188f, 22.9688f)
                lineTo(9.0313f, 22.7813f)
                lineTo(8.75f, 20.4063f)
                close()
            }
        }
        .build()
        return _syringeSolid!!
    }

private var _syringeSolid: ImageVector? = null
