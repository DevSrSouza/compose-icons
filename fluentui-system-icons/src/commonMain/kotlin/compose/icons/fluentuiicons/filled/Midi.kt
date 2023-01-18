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

public val FilledGroup.Midi: ImageVector
    get() {
        if (_midi != null) {
            return _midi!!
        }
        _midi = Builder(name = "Midi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.25f, 4.0039f)
                curveTo(21.6297f, 4.0039f, 21.9435f, 4.2861f, 21.9932f, 4.6521f)
                lineTo(22.0f, 4.7539f)
                verticalLineTo(19.2495f)
                curveTo(22.0f, 19.6292f, 21.7178f, 19.943f, 21.3518f, 19.9927f)
                lineTo(21.25f, 19.9995f)
                horizontalLineTo(2.75f)
                curveTo(2.3703f, 19.9995f, 2.0565f, 19.7174f, 2.0069f, 19.3513f)
                lineTo(2.0f, 19.2495f)
                verticalLineTo(4.7539f)
                curveTo(2.0f, 4.3742f, 2.2822f, 4.0604f, 2.6482f, 4.0107f)
                lineTo(2.75f, 4.0039f)
                horizontalLineTo(21.25f)
                close()
                moveTo(6.0f, 12.0039f)
                horizontalLineTo(3.5f)
                verticalLineTo(18.4995f)
                horizontalLineTo(20.5f)
                verticalLineTo(12.0039f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.2495f)
                curveTo(18.0f, 16.6637f, 17.6642f, 16.9995f, 17.25f, 16.9995f)
                curveTo(16.8703f, 16.9995f, 16.5565f, 16.7174f, 16.5068f, 16.3513f)
                lineTo(16.5f, 16.2495f)
                verticalLineTo(12.0039f)
                horizontalLineTo(14.5f)
                verticalLineTo(16.2495f)
                curveTo(14.5f, 16.6637f, 14.1642f, 16.9995f, 13.75f, 16.9995f)
                curveTo(13.3703f, 16.9995f, 13.0565f, 16.7174f, 13.0068f, 16.3513f)
                lineTo(13.0f, 16.2495f)
                verticalLineTo(12.0039f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.2495f)
                curveTo(11.0f, 16.6637f, 10.6642f, 16.9995f, 10.25f, 16.9995f)
                curveTo(9.8703f, 16.9995f, 9.5565f, 16.7174f, 9.5069f, 16.3513f)
                lineTo(9.5f, 16.2495f)
                verticalLineTo(12.0039f)
                horizontalLineTo(7.5f)
                verticalLineTo(16.2495f)
                curveTo(7.5f, 16.6637f, 7.1642f, 16.9995f, 6.75f, 16.9995f)
                curveTo(6.3703f, 16.9995f, 6.0565f, 16.7174f, 6.0068f, 16.3513f)
                lineTo(6.0f, 16.2495f)
                verticalLineTo(12.0039f)
                close()
                moveTo(17.25f, 7.5004f)
                horizontalLineTo(14.75f)
                lineTo(14.6482f, 7.5073f)
                curveTo(14.2822f, 7.557f, 14.0f, 7.8707f, 14.0f, 8.2504f)
                curveTo(14.0f, 8.6301f, 14.2822f, 8.9439f, 14.6482f, 8.9936f)
                lineTo(14.75f, 9.0004f)
                horizontalLineTo(17.25f)
                lineTo(17.3518f, 8.9936f)
                curveTo(17.7178f, 8.9439f, 18.0f, 8.6301f, 18.0f, 8.2504f)
                curveTo(18.0f, 7.8362f, 17.6642f, 7.5004f, 17.25f, 7.5004f)
                close()
                moveTo(6.25f, 7.4995f)
                curveTo(5.8358f, 7.4995f, 5.5f, 7.8353f, 5.5f, 8.2495f)
                curveTo(5.5f, 8.6637f, 5.8358f, 8.9995f, 6.25f, 8.9995f)
                curveTo(6.6642f, 8.9995f, 7.0f, 8.6637f, 7.0f, 8.2495f)
                curveTo(7.0f, 7.8353f, 6.6642f, 7.4995f, 6.25f, 7.4995f)
                close()
                moveTo(9.25f, 7.4995f)
                curveTo(8.8358f, 7.4995f, 8.5f, 7.8353f, 8.5f, 8.2495f)
                curveTo(8.5f, 8.6637f, 8.8358f, 8.9995f, 9.25f, 8.9995f)
                curveTo(9.6642f, 8.9995f, 10.0f, 8.6637f, 10.0f, 8.2495f)
                curveTo(10.0f, 7.8353f, 9.6642f, 7.4995f, 9.25f, 7.4995f)
                close()
            }
        }
        .build()
        return _midi!!
    }

private var _midi: ImageVector? = null
