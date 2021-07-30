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

public val LineAwesomeIcons.ListAlt: ImageVector
    get() {
        if (_listAlt != null) {
            return _listAlt!!
        }
        _listAlt = Builder(name = "ListAlt", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.2813f, 5.2813f)
                lineTo(7.0f, 8.5625f)
                lineTo(5.7188f, 7.2813f)
                lineTo(4.2813f, 8.7188f)
                lineTo(6.2813f, 10.7188f)
                lineTo(7.0f, 11.4063f)
                lineTo(7.7188f, 10.7188f)
                lineTo(11.7188f, 6.7188f)
                close()
                moveTo(15.0f, 7.0f)
                lineTo(15.0f, 9.0f)
                lineTo(28.0f, 9.0f)
                lineTo(28.0f, 7.0f)
                close()
                moveTo(10.2813f, 13.2813f)
                lineTo(7.0f, 16.5625f)
                lineTo(5.7188f, 15.2813f)
                lineTo(4.2813f, 16.7188f)
                lineTo(6.2813f, 18.7188f)
                lineTo(7.0f, 19.4063f)
                lineTo(7.7188f, 18.7188f)
                lineTo(11.7188f, 14.7188f)
                close()
                moveTo(15.0f, 15.0f)
                lineTo(15.0f, 17.0f)
                lineTo(28.0f, 17.0f)
                lineTo(28.0f, 15.0f)
                close()
                moveTo(10.2813f, 21.2813f)
                lineTo(7.0f, 24.5625f)
                lineTo(5.7188f, 23.2813f)
                lineTo(4.2813f, 24.7188f)
                lineTo(6.2813f, 26.7188f)
                lineTo(7.0f, 27.4063f)
                lineTo(7.7188f, 26.7188f)
                lineTo(11.7188f, 22.7188f)
                close()
                moveTo(15.0f, 23.0f)
                lineTo(15.0f, 25.0f)
                lineTo(28.0f, 25.0f)
                lineTo(28.0f, 23.0f)
                close()
            }
        }
        .build()
        return _listAlt!!
    }

private var _listAlt: ImageVector? = null
