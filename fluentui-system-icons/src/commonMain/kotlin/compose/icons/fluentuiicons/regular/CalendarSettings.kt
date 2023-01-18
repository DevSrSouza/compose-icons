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

public val RegularGroup.CalendarSettings: ImageVector
    get() {
        if (_calendarSettings != null) {
            return _calendarSettings!!
        }
        _calendarSettings = Builder(name = "CalendarSettings", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 3.0f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(12.0218f)
                curveTo(20.5368f, 11.7253f, 20.0335f, 11.4858f, 19.5f, 11.3135f)
                verticalLineTo(8.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.7165f, 5.2835f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(11.3135f)
                curveTo(11.4858f, 20.0335f, 11.7253f, 20.5368f, 12.0218f, 21.0f)
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
                moveTo(14.2811f, 13.9759f)
                curveTo(14.5959f, 15.0661f, 13.9415f, 16.1995f, 12.8399f, 16.4721f)
                lineTo(12.2557f, 16.6166f)
                curveTo(12.2108f, 16.9043f, 12.1875f, 17.1995f, 12.1875f, 17.5003f)
                curveTo(12.1875f, 17.815f, 12.213f, 18.1235f, 12.2621f, 18.4237f)
                lineTo(12.8015f, 18.5536f)
                curveTo(13.9141f, 18.8216f, 14.5754f, 19.9666f, 14.2515f, 21.0641f)
                lineTo(14.0652f, 21.6954f)
                curveTo(14.5044f, 22.081f, 15.0048f, 22.3942f, 15.5494f, 22.6169f)
                lineTo(16.0427f, 22.0982f)
                curveTo(16.8312f, 21.269f, 18.1535f, 21.2692f, 18.9418f, 22.0987f)
                lineTo(19.4405f, 22.6235f)
                curveTo(19.9841f, 22.4032f, 20.484f, 22.093f, 20.9233f, 21.7106f)
                lineTo(20.7253f, 21.0247f)
                curveTo(20.4105f, 19.9344f, 21.0649f, 18.801f, 22.1665f, 18.5285f)
                lineTo(22.7502f, 18.384f)
                curveTo(22.7951f, 18.0963f, 22.8184f, 17.8011f, 22.8184f, 17.5003f)
                curveTo(22.8184f, 17.1856f, 22.7929f, 16.877f, 22.7438f, 16.5767f)
                lineTo(22.2048f, 16.4469f)
                curveTo(21.0923f, 16.179f, 20.431f, 15.034f, 20.7549f, 13.9364f)
                lineTo(20.941f, 13.3056f)
                curveTo(20.5019f, 12.9198f, 20.0014f, 12.6066f, 19.4568f, 12.3838f)
                lineTo(18.9637f, 12.9023f)
                curveTo(18.1752f, 13.7316f, 16.8529f, 13.7313f, 16.0646f, 12.9018f)
                lineTo(15.5658f, 12.377f)
                curveTo(15.0223f, 12.5972f, 14.5223f, 12.9073f, 14.083f, 13.2897f)
                lineTo(14.2811f, 13.9759f)
                close()
                moveTo(17.503f, 19.0003f)
                curveTo(16.7023f, 19.0003f, 16.0533f, 18.3287f, 16.0533f, 17.5003f)
                curveTo(16.0533f, 16.6719f, 16.7023f, 16.0003f, 17.503f, 16.0003f)
                curveTo(18.3036f, 16.0003f, 18.9526f, 16.6719f, 18.9526f, 17.5003f)
                curveTo(18.9526f, 18.3287f, 18.3036f, 19.0003f, 17.503f, 19.0003f)
                close()
            }
        }
        .build()
        return _calendarSettings!!
    }

private var _calendarSettings: ImageVector? = null
