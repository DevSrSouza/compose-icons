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

public val LineAwesomeIcons.FileAlt: ImageVector
    get() {
        if (_fileAlt != null) {
            return _fileAlt!!
        }
        _fileAlt = Builder(name = "FileAlt", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                lineTo(6.0f, 29.0f)
                lineTo(26.0f, 29.0f)
                lineTo(26.0f, 9.5938f)
                lineTo(25.7188f, 9.2813f)
                lineTo(19.7188f, 3.2813f)
                lineTo(19.4063f, 3.0f)
                close()
                moveTo(8.0f, 5.0f)
                lineTo(18.0f, 5.0f)
                lineTo(18.0f, 11.0f)
                lineTo(24.0f, 11.0f)
                lineTo(24.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                close()
                moveTo(20.0f, 6.4375f)
                lineTo(22.5625f, 9.0f)
                lineTo(20.0f, 9.0f)
                close()
                moveTo(11.0f, 13.0f)
                lineTo(11.0f, 15.0f)
                lineTo(21.0f, 15.0f)
                lineTo(21.0f, 13.0f)
                close()
                moveTo(11.0f, 17.0f)
                lineTo(11.0f, 19.0f)
                lineTo(21.0f, 19.0f)
                lineTo(21.0f, 17.0f)
                close()
                moveTo(11.0f, 21.0f)
                lineTo(11.0f, 23.0f)
                lineTo(21.0f, 23.0f)
                lineTo(21.0f, 21.0f)
                close()
            }
        }
        .build()
        return _fileAlt!!
    }

private var _fileAlt: ImageVector? = null
