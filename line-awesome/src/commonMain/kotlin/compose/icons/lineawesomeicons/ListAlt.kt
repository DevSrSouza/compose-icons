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
                moveTo(10.281f, 5.281f)
                lineTo(7.0f, 8.563f)
                lineTo(5.719f, 7.281f)
                lineTo(4.281f, 8.719f)
                lineTo(6.281f, 10.719f)
                lineTo(7.0f, 11.406f)
                lineTo(7.719f, 10.719f)
                lineTo(11.719f, 6.719f)
                close()
                moveTo(15.0f, 7.0f)
                lineTo(15.0f, 9.0f)
                lineTo(28.0f, 9.0f)
                lineTo(28.0f, 7.0f)
                close()
                moveTo(10.281f, 13.281f)
                lineTo(7.0f, 16.563f)
                lineTo(5.719f, 15.281f)
                lineTo(4.281f, 16.719f)
                lineTo(6.281f, 18.719f)
                lineTo(7.0f, 19.406f)
                lineTo(7.719f, 18.719f)
                lineTo(11.719f, 14.719f)
                close()
                moveTo(15.0f, 15.0f)
                lineTo(15.0f, 17.0f)
                lineTo(28.0f, 17.0f)
                lineTo(28.0f, 15.0f)
                close()
                moveTo(10.281f, 21.281f)
                lineTo(7.0f, 24.563f)
                lineTo(5.719f, 23.281f)
                lineTo(4.281f, 24.719f)
                lineTo(6.281f, 26.719f)
                lineTo(7.0f, 27.406f)
                lineTo(7.719f, 26.719f)
                lineTo(11.719f, 22.719f)
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
