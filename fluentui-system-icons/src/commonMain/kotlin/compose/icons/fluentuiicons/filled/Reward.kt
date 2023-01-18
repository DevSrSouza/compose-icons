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

public val FilledGroup.Reward: ImageVector
    get() {
        if (_reward != null) {
            return _reward!!
        }
        _reward = Builder(name = "Reward", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.25f, 1.999f)
                curveTo(21.2165f, 1.999f, 22.0f, 2.7825f, 22.0f, 3.749f)
                verticalLineTo(6.7917f)
                curveTo(22.0f, 7.8159f, 21.4309f, 8.7552f, 20.5231f, 9.2293f)
                lineTo(14.223f, 12.5198f)
                curveTo(15.869f, 13.3381f, 17.0f, 15.0368f, 17.0f, 16.9996f)
                curveTo(17.0f, 19.761f, 14.7614f, 21.9996f, 12.0f, 21.9996f)
                curveTo(9.2386f, 21.9996f, 7.0f, 19.761f, 7.0f, 16.9996f)
                curveTo(7.0f, 15.0368f, 8.131f, 13.3381f, 9.7769f, 12.5198f)
                lineTo(3.4769f, 9.2293f)
                curveTo(2.5691f, 8.7552f, 2.0f, 7.8159f, 2.0f, 6.7917f)
                verticalLineTo(3.749f)
                curveTo(2.0f, 2.7825f, 2.7835f, 1.999f, 3.75f, 1.999f)
                horizontalLineTo(20.25f)
                close()
                moveTo(12.0f, 13.4996f)
                curveTo(10.067f, 13.4996f, 8.5f, 15.0666f, 8.5f, 16.9996f)
                curveTo(8.5f, 18.9326f, 10.067f, 20.4996f, 12.0f, 20.4996f)
                curveTo(13.933f, 20.4996f, 15.5f, 18.9326f, 15.5f, 16.9996f)
                curveTo(15.5f, 15.0666f, 13.933f, 13.4996f, 12.0f, 13.4996f)
                close()
                moveTo(16.0f, 3.499f)
                horizontalLineTo(7.997f)
                verticalLineTo(9.897f)
                lineTo(11.8843f, 11.9279f)
                curveTo(11.9568f, 11.9658f, 12.0432f, 11.9658f, 12.1157f, 11.9279f)
                lineTo(16.0f, 9.898f)
                verticalLineTo(3.499f)
                close()
            }
        }
        .build()
        return _reward!!
    }

private var _reward: ImageVector? = null
