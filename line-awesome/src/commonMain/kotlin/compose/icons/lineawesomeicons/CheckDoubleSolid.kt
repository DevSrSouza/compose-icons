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

public val LineAwesomeIcons.CheckDoubleSolid: ImageVector
    get() {
        if (_checkDoubleSolid != null) {
            return _checkDoubleSolid!!
        }
        _checkDoubleSolid = Builder(name = "CheckDoubleSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.2813f, 7.2813f)
                lineTo(11.5f, 19.0625f)
                lineTo(8.7188f, 16.2813f)
                lineTo(7.2813f, 17.7188f)
                lineTo(10.0625f, 20.5f)
                lineTo(8.0f, 22.5625f)
                lineTo(1.7188f, 16.2813f)
                lineTo(0.2813f, 17.7188f)
                lineTo(7.2813f, 24.7188f)
                lineTo(8.0f, 25.4063f)
                lineTo(8.7188f, 24.7188f)
                lineTo(11.5f, 21.9375f)
                lineTo(14.2813f, 24.7188f)
                lineTo(15.0f, 25.4063f)
                lineTo(15.7188f, 24.7188f)
                lineTo(31.625f, 8.7188f)
                lineTo(30.1875f, 7.2813f)
                lineTo(15.0f, 22.5625f)
                lineTo(12.9375f, 20.5f)
                lineTo(24.7188f, 8.7188f)
                close()
            }
        }
        .build()
        return _checkDoubleSolid!!
    }

private var _checkDoubleSolid: ImageVector? = null
