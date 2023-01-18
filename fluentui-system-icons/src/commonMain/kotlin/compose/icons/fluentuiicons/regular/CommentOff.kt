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

public val RegularGroup.CommentOff: ImageVector
    get() {
        if (_commentOff != null) {
            return _commentOff!!
        }
        _commentOff = Builder(name = "CommentOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(2.9218f, 3.9824f)
                curveTo(2.3514f, 4.568f, 2.0f, 5.368f, 2.0f, 6.25f)
                verticalLineTo(14.75f)
                curveTo(2.0f, 16.5449f, 3.4551f, 18.0f, 5.25f, 18.0f)
                horizontalLineTo(5.9992f)
                lineTo(6.0f, 20.7499f)
                curveTo(6.0f, 21.0196f, 6.0874f, 21.2822f, 6.249f, 21.4984f)
                curveTo(6.6625f, 22.0512f, 7.4458f, 22.1642f, 7.9987f, 21.7507f)
                lineTo(13.0125f, 18.0f)
                horizontalLineTo(16.9391f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(15.4391f, 16.5f)
                horizontalLineTo(12.5135f)
                lineTo(7.4999f, 20.2506f)
                lineTo(7.4988f, 16.5f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 16.5f, 3.5f, 15.7165f, 3.5f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(3.5f, 5.7822f, 3.6836f, 5.3573f, 3.9826f, 5.0433f)
                lineTo(15.4391f, 16.5f)
                close()
                moveTo(20.5f, 14.75f)
                curveTo(20.5f, 15.4446f, 20.0954f, 16.0446f, 19.509f, 16.3273f)
                lineTo(20.6024f, 17.4208f)
                curveTo(21.4471f, 16.8338f, 22.0f, 15.8565f, 22.0f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(22.0f, 4.4551f, 20.5449f, 3.0f, 18.75f, 3.0f)
                horizontalLineTo(6.182f)
                lineTo(7.6819f, 4.5f)
                horizontalLineTo(18.75f)
                curveTo(19.7165f, 4.5f, 20.5f, 5.2835f, 20.5f, 6.25f)
                verticalLineTo(14.75f)
                close()
            }
        }
        .build()
        return _commentOff!!
    }

private var _commentOff: ImageVector? = null
