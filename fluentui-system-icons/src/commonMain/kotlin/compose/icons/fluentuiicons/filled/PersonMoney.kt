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

public val FilledGroup.PersonMoney: ImageVector
    get() {
        if (_personMoney != null) {
            return _personMoney!!
        }
        _personMoney = Builder(name = "PersonMoney", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7545f, 14.0002f)
                curveTo(18.5344f, 14.0002f, 19.2215f, 14.3971f, 19.6249f, 15.0f)
                horizontalLineTo(13.5002f)
                curveTo(12.1195f, 15.0f, 11.0002f, 16.1193f, 11.0002f, 17.5f)
                verticalLineTo(21.5f)
                curveTo(11.0002f, 21.6613f, 11.0155f, 21.8191f, 11.0447f, 21.972f)
                curveTo(8.1064f, 21.7865f, 5.9091f, 20.7224f, 4.5143f, 18.7648f)
                curveTo(4.1823f, 18.2989f, 4.0039f, 17.7411f, 4.0039f, 17.169f)
                verticalLineTo(16.2491f)
                curveTo(4.0039f, 15.007f, 5.0108f, 14.0002f, 6.2528f, 14.0002f)
                horizontalLineTo(17.7545f)
                close()
                moveTo(12.0004f, 2.0049f)
                curveTo(14.7618f, 2.0049f, 17.0004f, 4.2435f, 17.0004f, 7.0049f)
                curveTo(17.0004f, 9.7663f, 14.7618f, 12.0049f, 12.0004f, 12.0049f)
                curveTo(9.2389f, 12.0049f, 7.0004f, 9.7663f, 7.0004f, 7.0049f)
                curveTo(7.0004f, 4.2435f, 9.2389f, 2.0049f, 12.0004f, 2.0049f)
                close()
                moveTo(12.0002f, 17.5f)
                curveTo(12.0002f, 16.6716f, 12.6718f, 16.0f, 13.5002f, 16.0f)
                horizontalLineTo(21.5002f)
                curveTo(22.3287f, 16.0f, 23.0002f, 16.6716f, 23.0002f, 17.5f)
                verticalLineTo(21.5f)
                curveTo(23.0002f, 22.3284f, 22.3287f, 23.0f, 21.5002f, 23.0f)
                horizontalLineTo(13.5002f)
                curveTo(12.6718f, 23.0f, 12.0002f, 22.3284f, 12.0002f, 21.5f)
                verticalLineTo(17.5f)
                close()
                moveTo(22.0002f, 18.0f)
                curveTo(21.448f, 18.0f, 21.0002f, 17.5523f, 21.0002f, 17.0f)
                horizontalLineTo(20.0002f)
                curveTo(20.0002f, 18.1046f, 20.8957f, 19.0f, 22.0002f, 19.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(22.0002f, 20.0f)
                curveTo(20.8957f, 20.0f, 20.0002f, 20.8954f, 20.0002f, 22.0f)
                horizontalLineTo(21.0002f)
                curveTo(21.0002f, 21.4477f, 21.448f, 21.0f, 22.0002f, 21.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(14.0002f, 17.0f)
                curveTo(14.0002f, 17.5523f, 13.5525f, 18.0f, 13.0002f, 18.0f)
                verticalLineTo(19.0f)
                curveTo(14.1048f, 19.0f, 15.0002f, 18.1046f, 15.0002f, 17.0f)
                horizontalLineTo(14.0002f)
                close()
                moveTo(15.0002f, 22.0f)
                curveTo(15.0002f, 20.8954f, 14.1048f, 20.0f, 13.0002f, 20.0f)
                verticalLineTo(21.0f)
                curveTo(13.5525f, 21.0f, 14.0002f, 21.4477f, 14.0002f, 22.0f)
                horizontalLineTo(15.0002f)
                close()
                moveTo(19.2502f, 19.5f)
                curveTo(19.2502f, 18.5335f, 18.4667f, 17.75f, 17.5002f, 17.75f)
                curveTo(16.5337f, 17.75f, 15.7502f, 18.5335f, 15.7502f, 19.5f)
                curveTo(15.7502f, 20.4665f, 16.5337f, 21.25f, 17.5002f, 21.25f)
                curveTo(18.4667f, 21.25f, 19.2502f, 20.4665f, 19.2502f, 19.5f)
                close()
            }
        }
        .build()
        return _personMoney!!
    }

private var _personMoney: ImageVector? = null
