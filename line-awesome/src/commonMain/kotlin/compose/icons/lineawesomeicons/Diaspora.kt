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

public val LineAwesomeIcons.Diaspora: ImageVector
    get() {
        if (_diaspora != null) {
            return _diaspora!!
        }
        _diaspora = Builder(name = "Diaspora", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0059f, 5.0f)
                lineTo(12.0059f, 11.1426f)
                lineTo(6.3691f, 9.2637f)
                lineTo(4.1543f, 15.9043f)
                lineTo(9.8164f, 17.793f)
                lineTo(6.0996f, 22.8008f)
                lineTo(11.7207f, 26.9727f)
                lineTo(15.3906f, 22.0273f)
                lineTo(18.8613f, 27.0996f)
                lineTo(24.6367f, 23.1465f)
                lineTo(21.0391f, 17.8906f)
                lineTo(26.8164f, 16.0234f)
                lineTo(24.6641f, 9.3613f)
                lineTo(20.0f, 11.1914f)
                lineTo(19.0f, 5.0f)
                lineTo(12.0059f, 5.0f)
                close()
                moveTo(14.0f, 7.0f)
                lineTo(17.0059f, 7.0f)
                lineTo(17.0059f, 13.9395f)
                lineTo(23.377f, 11.8809f)
                lineTo(24.2988f, 14.7344f)
                lineTo(17.877f, 16.8105f)
                lineTo(21.8574f, 22.625f)
                lineTo(19.3809f, 24.3184f)
                lineTo(15.4551f, 18.582f)
                lineTo(11.3066f, 24.1758f)
                lineTo(8.8965f, 22.3867f)
                lineTo(13.0664f, 16.7676f)
                lineTo(6.6855f, 14.6406f)
                lineTo(7.6328f, 11.7949f)
                lineTo(14.0f, 14.0f)
                lineTo(14.0f, 7.0f)
                close()
            }
        }
        .build()
        return _diaspora!!
    }

private var _diaspora: ImageVector? = null
