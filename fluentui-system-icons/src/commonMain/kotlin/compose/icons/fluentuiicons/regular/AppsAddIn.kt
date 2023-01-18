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

public val RegularGroup.AppsAddIn: ImageVector
    get() {
        if (_appsAddIn != null) {
            return _appsAddIn!!
        }
        _appsAddIn = Builder(name = "AppsAddIn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 3.0f)
                curveTo(11.7426f, 3.0f, 12.75f, 4.0074f, 12.75f, 5.25f)
                verticalLineTo(11.25f)
                horizontalLineTo(18.75f)
                curveTo(19.9926f, 11.25f, 21.0f, 12.2574f, 21.0f, 13.5f)
                verticalLineTo(18.75f)
                curveTo(21.0f, 19.9926f, 19.9926f, 21.0f, 18.75f, 21.0f)
                horizontalLineTo(5.25f)
                curveTo(4.0074f, 21.0f, 3.0f, 19.9926f, 3.0f, 18.75f)
                verticalLineTo(5.25f)
                curveTo(3.0f, 4.0074f, 4.0074f, 3.0f, 5.25f, 3.0f)
                horizontalLineTo(10.5f)
                close()
                moveTo(11.25f, 12.75f)
                horizontalLineTo(4.5f)
                verticalLineTo(18.75f)
                curveTo(4.5f, 19.1642f, 4.8358f, 19.5f, 5.25f, 19.5f)
                horizontalLineTo(11.249f)
                lineTo(11.25f, 12.75f)
                close()
                moveTo(18.75f, 12.75f)
                horizontalLineTo(12.749f)
                verticalLineTo(19.5f)
                horizontalLineTo(18.75f)
                curveTo(19.1642f, 19.5f, 19.5f, 19.1642f, 19.5f, 18.75f)
                verticalLineTo(13.5f)
                curveTo(19.5f, 13.0858f, 19.1642f, 12.75f, 18.75f, 12.75f)
                close()
                moveTo(10.5f, 4.5f)
                horizontalLineTo(5.25f)
                curveTo(4.8358f, 4.5f, 4.5f, 4.8358f, 4.5f, 5.25f)
                verticalLineTo(11.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(5.25f)
                curveTo(11.25f, 4.8358f, 10.9142f, 4.5f, 10.5f, 4.5f)
                close()
                moveTo(17.8982f, 2.0069f)
                lineTo(18.0f, 2.0f)
                curveTo(18.3797f, 2.0f, 18.6935f, 2.2822f, 18.7432f, 2.6482f)
                lineTo(18.75f, 2.75f)
                verticalLineTo(5.25f)
                horizontalLineTo(21.25f)
                curveTo(21.6297f, 5.25f, 21.9435f, 5.5321f, 21.9932f, 5.8982f)
                lineTo(22.0f, 6.0f)
                curveTo(22.0f, 6.3797f, 21.7178f, 6.6935f, 21.3518f, 6.7432f)
                lineTo(21.25f, 6.75f)
                horizontalLineTo(18.75f)
                verticalLineTo(9.25f)
                curveTo(18.75f, 9.6297f, 18.4678f, 9.9435f, 18.1018f, 9.9931f)
                lineTo(18.0f, 10.0f)
                curveTo(17.6203f, 10.0f, 17.3065f, 9.7178f, 17.2568f, 9.3518f)
                lineTo(17.25f, 9.25f)
                verticalLineTo(6.75f)
                horizontalLineTo(14.75f)
                curveTo(14.3703f, 6.75f, 14.0565f, 6.4679f, 14.0068f, 6.1018f)
                lineTo(14.0f, 6.0f)
                curveTo(14.0f, 5.6203f, 14.2822f, 5.3065f, 14.6482f, 5.2568f)
                lineTo(14.75f, 5.25f)
                horizontalLineTo(17.25f)
                verticalLineTo(2.75f)
                curveTo(17.25f, 2.3703f, 17.5322f, 2.0565f, 17.8982f, 2.0069f)
                close()
            }
        }
        .build()
        return _appsAddIn!!
    }

private var _appsAddIn: ImageVector? = null
