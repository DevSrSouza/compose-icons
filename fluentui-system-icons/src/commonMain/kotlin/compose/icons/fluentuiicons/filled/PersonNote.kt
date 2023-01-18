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

public val FilledGroup.PersonNote: ImageVector
    get() {
        if (_personNote != null) {
            return _personNote!!
        }
        _personNote = Builder(name = "PersonNote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0005f, 15.0002f)
                curveTo(11.0005f, 14.6496f, 11.0607f, 14.313f, 11.1712f, 14.0002f)
                horizontalLineTo(4.2528f)
                curveTo(3.0108f, 14.0002f, 2.0039f, 15.007f, 2.0039f, 16.2491f)
                verticalLineTo(17.169f)
                curveTo(2.0039f, 17.7411f, 2.1823f, 18.2989f, 2.5143f, 18.7648f)
                curveTo(4.0564f, 20.9292f, 6.5794f, 22.0013f, 10.0004f, 22.0013f)
                curveTo(10.3979f, 22.0013f, 10.7834f, 21.9869f, 11.1566f, 21.9579f)
                curveTo(11.0554f, 21.6571f, 11.0005f, 21.3351f, 11.0005f, 21.0002f)
                verticalLineTo(15.0002f)
                close()
                moveTo(10.0004f, 2.0049f)
                curveTo(12.7618f, 2.0049f, 15.0004f, 4.2435f, 15.0004f, 7.0049f)
                curveTo(15.0004f, 9.7663f, 12.7618f, 12.0049f, 10.0004f, 12.0049f)
                curveTo(7.2389f, 12.0049f, 5.0004f, 9.7663f, 5.0004f, 7.0049f)
                curveTo(5.0004f, 4.2435f, 7.2389f, 2.0049f, 10.0004f, 2.0049f)
                close()
                moveTo(12.0005f, 15.0002f)
                curveTo(12.0005f, 13.8957f, 12.8959f, 13.0002f, 14.0005f, 13.0002f)
                horizontalLineTo(21.0005f)
                curveTo(22.1051f, 13.0002f, 23.0005f, 13.8957f, 23.0005f, 15.0002f)
                verticalLineTo(21.0002f)
                curveTo(23.0005f, 22.1048f, 22.1051f, 23.0002f, 21.0005f, 23.0002f)
                horizontalLineTo(14.0005f)
                curveTo(12.8959f, 23.0002f, 12.0005f, 22.1048f, 12.0005f, 21.0002f)
                verticalLineTo(15.0002f)
                close()
                moveTo(14.5005f, 16.0002f)
                curveTo(14.2243f, 16.0002f, 14.0005f, 16.2241f, 14.0005f, 16.5002f)
                curveTo(14.0005f, 16.7764f, 14.2243f, 17.0002f, 14.5005f, 17.0002f)
                horizontalLineTo(20.5005f)
                curveTo(20.7766f, 17.0002f, 21.0005f, 16.7764f, 21.0005f, 16.5002f)
                curveTo(21.0005f, 16.2241f, 20.7766f, 16.0002f, 20.5005f, 16.0002f)
                horizontalLineTo(14.5005f)
                close()
                moveTo(14.5005f, 19.0002f)
                curveTo(14.2243f, 19.0002f, 14.0005f, 19.2241f, 14.0005f, 19.5002f)
                curveTo(14.0005f, 19.7764f, 14.2243f, 20.0002f, 14.5005f, 20.0002f)
                horizontalLineTo(20.5005f)
                curveTo(20.7766f, 20.0002f, 21.0005f, 19.7764f, 21.0005f, 19.5002f)
                curveTo(21.0005f, 19.2241f, 20.7766f, 19.0002f, 20.5005f, 19.0002f)
                horizontalLineTo(14.5005f)
                close()
            }
        }
        .build()
        return _personNote!!
    }

private var _personNote: ImageVector? = null
