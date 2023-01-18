package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.CalendarChat: ImageVector
    get() {
        if (_calendarChat != null) {
            return _calendarChat!!
        }
        _calendarChat = Builder(name = "CalendarChat", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 3.0f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(12.0208f)
                curveTo(20.5368f, 11.7244f, 20.0334f, 11.4852f, 19.5f, 11.313f)
                verticalLineTo(8.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.7165f, 5.2835f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(11.3135f)
                curveTo(11.3982f, 19.7622f, 11.499f, 20.0172f, 11.6149f, 20.2637f)
                lineTo(11.3907f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(17.75f, 4.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 4.5f, 4.5f, 5.2835f, 4.5f, 6.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.2835f, 18.7165f, 4.5f, 17.75f, 4.5f)
                close()
                moveTo(19.5f, 12.3743f)
                curveTo(20.0482f, 12.5882f, 20.5536f, 12.8875f, 21.0f, 13.2558f)
                curveTo(22.2228f, 14.2648f, 23.0023f, 15.792f, 23.0023f, 17.5012f)
                curveTo(23.0023f, 20.5395f, 20.5393f, 23.0024f, 17.5011f, 23.0024f)
                curveTo(16.5335f, 23.0024f, 15.6242f, 22.7526f, 14.8343f, 22.3139f)
                lineTo(12.6471f, 22.9795f)
                curveTo(12.2644f, 23.0959f, 11.9066f, 22.7381f, 12.0231f, 22.3553f)
                lineTo(12.6889f, 20.1688f)
                curveTo(12.25f, 19.3787f, 12.0f, 18.4692f, 12.0f, 17.5012f)
                curveTo(12.0f, 14.5216f, 14.3689f, 12.0952f, 17.3261f, 12.0027f)
                curveTo(17.3755f, 12.0012f, 17.4252f, 12.0003f, 17.475f, 12.0001f)
                curveTo(17.4837f, 12.0f, 17.4924f, 12.0f, 17.5011f, 12.0f)
                curveTo(18.2063f, 12.0f, 18.8804f, 12.1326f, 19.5f, 12.3743f)
                close()
                moveTo(19.5015f, 17.0011f)
                curveTo(19.7777f, 17.0011f, 20.0016f, 16.7772f, 20.0016f, 16.501f)
                curveTo(20.0016f, 16.2248f, 19.7777f, 16.0009f, 19.5015f, 16.0009f)
                horizontalLineTo(15.5007f)
                curveTo(15.2245f, 16.0009f, 15.0006f, 16.2248f, 15.0006f, 16.501f)
                curveTo(15.0006f, 16.7772f, 15.2245f, 17.0011f, 15.5007f, 17.0011f)
                horizontalLineTo(19.5015f)
                close()
                moveTo(15.5007f, 19.0015f)
                horizontalLineTo(17.5011f)
                curveTo(17.7773f, 19.0015f, 18.0012f, 18.7776f, 18.0012f, 18.5014f)
                curveTo(18.0012f, 18.2252f, 17.7773f, 18.0013f, 17.5011f, 18.0013f)
                horizontalLineTo(15.5007f)
                curveTo(15.2245f, 18.0013f, 15.0006f, 18.2252f, 15.0006f, 18.5014f)
                curveTo(15.0006f, 18.7776f, 15.2245f, 19.0015f, 15.5007f, 19.0015f)
                close()
            }
        }
        .build()
        return _calendarChat!!
    }

private var _calendarChat: ImageVector? = null
