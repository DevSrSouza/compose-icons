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

public val FilledGroup.VideoOff: ImageVector
    get() {
        if (_videoOff != null) {
            return _videoOff!!
        }
        _videoOff = Builder(name = "VideoOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(3.7866f, 4.8473f)
                curveTo(2.7268f, 5.3827f, 2.0f, 6.4815f, 2.0f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(2.0f, 18.0449f, 3.4551f, 19.5f, 5.25f, 19.5f)
                horizontalLineTo(12.75f)
                curveTo(14.2943f, 19.5f, 15.5871f, 18.4229f, 15.9179f, 16.9789f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(17.0f, 13.8182f)
                lineTo(21.5042f, 18.3226f)
                curveTo(21.8008f, 18.1491f, 22.0f, 17.8272f, 22.0f, 17.4588f)
                verticalLineTo(6.541f)
                curveTo(22.0f, 6.3037f, 21.9156f, 6.0741f, 21.762f, 5.8933f)
                curveTo(21.4043f, 5.4725f, 20.7732f, 5.4213f, 20.3524f, 5.779f)
                lineTo(17.0f, 8.6279f)
                verticalLineTo(13.8182f)
                close()
                moveTo(7.6819f, 4.5f)
                lineTo(16.0f, 12.8182f)
                verticalLineTo(7.75f)
                curveTo(16.0f, 5.9551f, 14.5449f, 4.5f, 12.75f, 4.5f)
                horizontalLineTo(7.6819f)
                close()
            }
        }
        .build()
        return _videoOff!!
    }

private var _videoOff: ImageVector? = null
