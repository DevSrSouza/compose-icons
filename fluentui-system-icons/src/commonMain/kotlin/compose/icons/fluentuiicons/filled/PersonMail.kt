package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.PersonMail: ImageVector
    get() {
        if (_personMail != null) {
            return _personMail!!
        }
        _personMail = Builder(name = "PersonMail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0004f, 15.5002f)
                curveTo(11.0004f, 14.9374f, 11.1864f, 14.418f, 11.5002f, 14.0002f)
                horizontalLineTo(5.2528f)
                curveTo(4.0108f, 14.0002f, 3.0039f, 15.007f, 3.0039f, 16.2491f)
                verticalLineTo(17.169f)
                curveTo(3.0039f, 17.7411f, 3.1823f, 18.2989f, 3.5143f, 18.7648f)
                curveTo(5.0564f, 20.9292f, 7.5794f, 22.0013f, 11.0004f, 22.0013f)
                lineTo(11.0506f, 22.0013f)
                curveTo(11.0177f, 21.8394f, 11.0004f, 21.6718f, 11.0004f, 21.5002f)
                verticalLineTo(15.5002f)
                close()
                moveTo(11.0004f, 2.0049f)
                curveTo(13.7618f, 2.0049f, 16.0004f, 4.2435f, 16.0004f, 7.0049f)
                curveTo(16.0004f, 9.7663f, 13.7618f, 12.0049f, 11.0004f, 12.0049f)
                curveTo(8.2389f, 12.0049f, 6.0004f, 9.7663f, 6.0004f, 7.0049f)
                curveTo(6.0004f, 4.2435f, 8.2389f, 2.0049f, 11.0004f, 2.0049f)
                close()
                moveTo(17.5103f, 18.9271f)
                lineTo(12.0194f, 15.7241f)
                curveTo(12.1539f, 14.7502f, 12.9896f, 14.0002f, 14.0005f, 14.0002f)
                horizontalLineTo(21.0005f)
                curveTo(22.0953f, 14.0002f, 22.9846f, 14.8799f, 23.0003f, 15.9709f)
                lineTo(17.5103f, 18.9271f)
                close()
                moveTo(17.7375f, 19.9405f)
                lineTo(23.0005f, 17.1066f)
                verticalLineTo(21.0002f)
                curveTo(23.0005f, 22.1048f, 22.1051f, 23.0002f, 21.0005f, 23.0002f)
                horizontalLineTo(14.0005f)
                curveTo(12.8959f, 23.0002f, 12.0005f, 22.1048f, 12.0005f, 21.0002f)
                verticalLineTo(16.8708f)
                lineTo(17.2486f, 19.9321f)
                curveTo(17.399f, 20.0199f, 17.5842f, 20.023f, 17.7375f, 19.9405f)
                close()
            }
        }
        .build()
        return _personMail!!
    }

private var _personMail: ImageVector? = null
