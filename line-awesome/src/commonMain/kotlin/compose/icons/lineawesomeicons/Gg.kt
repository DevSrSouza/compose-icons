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

public val LineAwesomeIcons.Gg: ImageVector
    get() {
        if (_gg != null) {
            return _gg!!
        }
        _gg = Builder(name = "Gg", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth =
                32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.5938f)
                lineTo(11.2813f, 7.2813f)
                lineTo(3.2813f, 15.2813f)
                lineTo(2.5938f, 16.0f)
                lineTo(3.2813f, 16.7188f)
                lineTo(11.2813f, 24.7188f)
                lineTo(12.0f, 25.4063f)
                lineTo(12.7188f, 24.7188f)
                lineTo(16.7188f, 20.7188f)
                lineTo(17.4063f, 20.0f)
                lineTo(16.7188f, 19.2813f)
                lineTo(11.7188f, 14.2813f)
                lineTo(10.2813f, 15.7188f)
                lineTo(14.5625f, 20.0f)
                lineTo(12.0f, 22.5625f)
                lineTo(5.4375f, 16.0f)
                lineTo(12.0f, 9.4375f)
                lineTo(13.2813f, 10.7188f)
                lineTo(14.7188f, 9.2813f)
                lineTo(12.7188f, 7.2813f)
                close()
                moveTo(20.0f, 6.5938f)
                lineTo(19.2813f, 7.2813f)
                lineTo(15.2813f, 11.2813f)
                lineTo(14.5938f, 12.0f)
                lineTo(15.2813f, 12.7188f)
                lineTo(20.2813f, 17.7188f)
                lineTo(21.7188f, 16.2813f)
                lineTo(17.4375f, 12.0f)
                lineTo(20.0f, 9.4375f)
                lineTo(26.5625f, 16.0f)
                lineTo(20.0f, 22.5625f)
                lineTo(18.7188f, 21.2813f)
                lineTo(17.2813f, 22.7188f)
                lineTo(19.2813f, 24.7188f)
                lineTo(20.0f, 25.4063f)
                lineTo(20.7188f, 24.7188f)
                lineTo(28.7188f, 16.7188f)
                lineTo(29.4063f, 16.0f)
                lineTo(28.7188f, 15.2813f)
                lineTo(20.7188f, 7.2813f)
                close()
            }
        }
        .build()
        return _gg!!
    }

private var _gg: ImageVector? = null
