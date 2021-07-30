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

public val LineAwesomeIcons.Modx: ImageVector
    get() {
        if (_modx != null) {
            return _modx!!
        }
        _modx = Builder(name = "Modx", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 4.2422f)
                lineTo(7.0f, 16.2344f)
                lineTo(8.8555f, 17.4473f)
                lineTo(3.8887f, 25.0f)
                lineTo(16.375f, 25.0f)
                lineTo(17.5215f, 23.2852f)
                lineTo(25.0f, 27.7656f)
                lineTo(25.0f, 15.4395f)
                lineTo(23.1797f, 14.3242f)
                lineTo(27.8164f, 7.0f)
                lineTo(15.4805f, 7.0f)
                lineTo(14.3477f, 8.6074f)
                lineTo(7.0f, 4.2422f)
                close()
                moveTo(9.0f, 7.7578f)
                lineTo(13.1914f, 10.248f)
                lineTo(19.3203f, 13.8906f)
                lineTo(10.1934f, 15.9316f)
                lineTo(9.0f, 15.1523f)
                lineTo(9.0f, 7.7578f)
                close()
                moveTo(16.5195f, 9.0f)
                lineTo(24.1836f, 9.0f)
                lineTo(21.6758f, 12.9609f)
                lineTo(16.0723f, 9.6328f)
                lineTo(16.5195f, 9.0f)
                close()
                moveTo(20.1523f, 15.7559f)
                lineTo(15.3066f, 23.0f)
                lineTo(7.5977f, 23.0f)
                lineTo(11.0195f, 17.7969f)
                lineTo(20.1523f, 15.7559f)
                close()
                moveTo(22.3105f, 16.1367f)
                lineTo(23.0f, 16.5605f)
                lineTo(23.0f, 24.2344f)
                lineTo(18.6719f, 21.6445f)
                lineTo(22.3105f, 16.1367f)
                close()
            }
        }
        .build()
        return _modx!!
    }

private var _modx: ImageVector? = null
