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

public val FilledGroup.ArrowDownload: ImageVector
    get() {
        if (_arrowDownload != null) {
            return _arrowDownload!!
        }
        _arrowDownload = Builder(name = "ArrowDownload", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 20.5005f)
                horizontalLineTo(18.7477f)
                curveTo(19.1619f, 20.5005f, 19.4977f, 20.8363f, 19.4977f, 21.2505f)
                curveTo(19.4977f, 21.6302f, 19.2155f, 21.944f, 18.8494f, 21.9936f)
                lineTo(18.7477f, 22.0005f)
                horizontalLineTo(5.25f)
                curveTo(4.8358f, 22.0005f, 4.5f, 21.6647f, 4.5f, 21.2505f)
                curveTo(4.5f, 20.8708f, 4.7821f, 20.557f, 5.1482f, 20.5073f)
                lineTo(5.25f, 20.5005f)
                horizontalLineTo(18.7477f)
                horizontalLineTo(5.25f)
                close()
                moveTo(11.8834f, 2.0028f)
                lineTo(12.0f, 1.9961f)
                curveTo(12.5128f, 1.9961f, 12.9355f, 2.3821f, 12.9933f, 2.8795f)
                lineTo(13.0f, 2.9961f)
                verticalLineTo(15.5861f)
                lineTo(16.2941f, 12.2933f)
                curveTo(16.6546f, 11.9329f, 17.2218f, 11.9052f, 17.6141f, 12.2103f)
                lineTo(17.7083f, 12.2935f)
                curveTo(18.0687f, 12.654f, 18.0964f, 13.2212f, 17.7913f, 13.6135f)
                lineTo(17.7081f, 13.7077f)
                lineTo(12.7105f, 18.7043f)
                curveTo(12.3502f, 19.0645f, 11.7833f, 19.0924f, 11.391f, 18.7878f)
                lineTo(11.2968f, 18.7047f)
                lineTo(6.2934f, 13.7081f)
                curveTo(5.9026f, 13.3178f, 5.9022f, 12.6847f, 6.2924f, 12.2939f)
                curveTo(6.6526f, 11.9331f, 7.2199f, 11.905f, 7.6124f, 12.2098f)
                lineTo(7.7066f, 12.2929f)
                lineTo(11.0f, 15.5811f)
                verticalLineTo(2.9961f)
                curveTo(11.0f, 2.4833f, 11.386f, 2.0606f, 11.8834f, 2.0028f)
                lineTo(12.0f, 1.9961f)
                lineTo(11.8834f, 2.0028f)
                close()
            }
        }
        .build()
        return _arrowDownload!!
    }

private var _arrowDownload: ImageVector? = null
