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

public val FilledGroup.CalendarQuestionMark: ImageVector
    get() {
        if (_calendarQuestionMark != null) {
            return _calendarQuestionMark!!
        }
        _calendarQuestionMark = Builder(name = "CalendarQuestionMark", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.25f)
                close()
                moveTo(21.0f, 12.0218f)
                verticalLineTo(8.5f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(12.0218f)
                curveTo(11.375f, 19.9897f, 11.0f, 18.7886f, 11.0f, 17.5f)
                curveTo(11.0f, 13.9101f, 13.9101f, 11.0f, 17.5f, 11.0f)
                curveTo(18.7886f, 11.0f, 19.9897f, 11.375f, 21.0f, 12.0218f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 14.4624f, 20.5376f, 12.0f, 17.5f, 12.0f)
                curveTo(14.4624f, 12.0f, 12.0f, 14.4624f, 12.0f, 17.5f)
                curveTo(12.0f, 20.5376f, 14.4624f, 23.0f, 17.5f, 23.0f)
                curveTo(20.5376f, 23.0f, 23.0f, 20.5376f, 23.0f, 17.5f)
                close()
                moveTo(16.8755f, 20.3755f)
                curveTo(16.8755f, 20.0306f, 17.1551f, 19.751f, 17.5f, 19.751f)
                curveTo(17.8449f, 19.751f, 18.1245f, 20.0306f, 18.1245f, 20.3755f)
                curveTo(18.1245f, 20.7204f, 17.8449f, 21.0f, 17.5f, 21.0f)
                curveTo(17.1551f, 21.0f, 16.8755f, 20.7204f, 16.8755f, 20.3755f)
                close()
                moveTo(15.6467f, 15.8284f)
                curveTo(15.6358f, 14.6915f, 16.4521f, 13.8741f, 17.5f, 13.8741f)
                curveTo(18.5311f, 13.8741f, 19.3534f, 14.7199f, 19.3534f, 15.8236f)
                curveTo(19.3534f, 16.333f, 19.2034f, 16.6653f, 18.8251f, 17.1162f)
                lineTo(18.6905f, 17.2713f)
                lineTo(18.4247f, 17.5617f)
                lineTo(18.3238f, 17.6772f)
                lineTo(18.2389f, 17.7813f)
                curveTo(18.0585f, 18.0126f, 18.0f, 18.1684f, 18.0f, 18.3716f)
                curveTo(18.0f, 18.6477f, 17.7762f, 18.8716f, 17.5f, 18.8716f)
                curveTo(17.2239f, 18.8716f, 17.0f, 18.6477f, 17.0f, 18.3716f)
                curveTo(17.0f, 17.854f, 17.1513f, 17.5182f, 17.5347f, 17.0615f)
                lineTo(17.6711f, 16.9043f)
                lineTo(17.9365f, 16.6142f)
                lineTo(18.0355f, 16.5009f)
                lineTo(18.1295f, 16.3851f)
                curveTo(18.2981f, 16.1659f, 18.3534f, 16.0158f, 18.3534f, 15.8236f)
                curveTo(18.3534f, 15.266f, 17.9724f, 14.8741f, 17.5f, 14.8741f)
                curveTo(17.0063f, 14.8741f, 16.6411f, 15.2398f, 16.6466f, 15.8188f)
                curveTo(16.6493f, 16.0949f, 16.4276f, 16.3209f, 16.1514f, 16.3235f)
                curveTo(15.8753f, 16.3262f, 15.6493f, 16.1045f, 15.6467f, 15.8284f)
                close()
            }
        }
        .build()
        return _calendarQuestionMark!!
    }

private var _calendarQuestionMark: ImageVector? = null
