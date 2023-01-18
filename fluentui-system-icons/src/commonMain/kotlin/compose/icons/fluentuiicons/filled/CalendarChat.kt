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

public val FilledGroup.CalendarChat: ImageVector
    get() {
        if (_calendarChat != null) {
            return _calendarChat!!
        }
        _calendarChat = Builder(name = "CalendarChat", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 8.5f)
                verticalLineTo(12.021f)
                curveTo(19.9893f, 11.3752f, 18.786f, 11.0f, 17.5013f, 11.0f)
                curveTo(13.9108f, 11.0f, 11.0002f, 13.9107f, 11.0002f, 17.5012f)
                curveTo(11.0002f, 18.4874f, 11.2204f, 19.4244f, 11.6149f, 20.2637f)
                lineTo(11.3907f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(8.5f)
                horizontalLineTo(21.0f)
                close()
                moveTo(17.75f, 3.0f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(21.0f, 13.2558f)
                curveTo(20.1623f, 12.5646f, 19.1166f, 12.1166f, 17.9708f, 12.0198f)
                curveTo(17.816f, 12.0067f, 17.6593f, 12.0f, 17.5011f, 12.0f)
                curveTo(14.4629f, 12.0f, 12.0f, 14.463f, 12.0f, 17.5012f)
                curveTo(12.0f, 18.4692f, 12.25f, 19.3787f, 12.6889f, 20.1688f)
                lineTo(12.0231f, 22.3553f)
                curveTo(11.9066f, 22.7381f, 12.2644f, 23.0959f, 12.6471f, 22.9795f)
                lineTo(14.8343f, 22.3139f)
                curveTo(15.6242f, 22.7526f, 16.5335f, 23.0024f, 17.5011f, 23.0024f)
                curveTo(20.5393f, 23.0024f, 23.0023f, 20.5395f, 23.0023f, 17.5012f)
                curveTo(23.0023f, 15.792f, 22.2228f, 14.2648f, 21.0f, 13.2558f)
                close()
                moveTo(15.5009f, 17.0011f)
                curveTo(15.2247f, 17.0011f, 15.0008f, 16.7772f, 15.0008f, 16.501f)
                curveTo(15.0008f, 16.2248f, 15.2247f, 16.0009f, 15.5009f, 16.0009f)
                horizontalLineTo(19.5015f)
                curveTo(19.7777f, 16.0009f, 20.0016f, 16.2248f, 20.0016f, 16.501f)
                curveTo(20.0016f, 16.7772f, 19.7777f, 17.0011f, 19.5015f, 17.0011f)
                horizontalLineTo(15.5009f)
                close()
                moveTo(17.5011f, 19.0015f)
                horizontalLineTo(15.5009f)
                curveTo(15.2247f, 19.0015f, 15.0008f, 18.7776f, 15.0008f, 18.5014f)
                curveTo(15.0008f, 18.2252f, 15.2247f, 18.0013f, 15.5009f, 18.0013f)
                horizontalLineTo(17.5011f)
                curveTo(17.7773f, 18.0013f, 18.0012f, 18.2252f, 18.0012f, 18.5014f)
                curveTo(18.0012f, 18.7776f, 17.7773f, 19.0015f, 17.5011f, 19.0015f)
                close()
            }
        }
        .build()
        return _calendarChat!!
    }

private var _calendarChat: ImageVector? = null
