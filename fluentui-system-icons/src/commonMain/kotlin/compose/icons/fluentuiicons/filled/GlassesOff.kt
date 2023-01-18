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

public val FilledGroup.GlassesOff: ImageVector
    get() {
        if (_glassesOff != null) {
            return _glassesOff!!
        }
        _glassesOff = Builder(name = "GlassesOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(5.4931f, 6.5538f)
                lineTo(2.6277f, 9.6726f)
                lineTo(2.5838f, 9.725f)
                lineTo(2.546f, 9.7802f)
                curveTo(2.2058f, 10.1744f, 2.0f, 10.688f, 2.0f, 11.2496f)
                verticalLineTo(14.7461f)
                curveTo(2.0f, 16.541f, 3.4551f, 17.9961f, 5.25f, 17.9961f)
                horizontalLineTo(7.7488f)
                curveTo(9.5438f, 17.9961f, 10.9988f, 16.541f, 10.9988f, 14.7461f)
                lineTo(10.998f, 12.504f)
                horizontalLineTo(11.4432f)
                lineTo(12.9997f, 14.0606f)
                lineTo(13.0f, 14.7461f)
                curveTo(13.0f, 16.541f, 14.4551f, 17.9961f, 16.25f, 17.9961f)
                horizontalLineTo(16.9351f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(7.9387f, 8.9994f)
                lineTo(5.283f, 8.999f)
                lineTo(6.5546f, 7.6153f)
                lineTo(7.9387f, 8.9994f)
                close()
                moveTo(13.303f, 10.1212f)
                lineTo(20.5996f, 17.418f)
                curveTo(21.4452f, 16.8312f, 21.9988f, 15.8533f, 21.9988f, 14.7461f)
                verticalLineTo(11.2496f)
                curveTo(21.9988f, 10.7201f, 21.816f, 10.2334f, 21.5101f, 9.8491f)
                curveTo(21.479f, 9.7858f, 21.4384f, 9.7259f, 21.3881f, 9.6714f)
                lineTo(17.7462f, 5.7242f)
                lineTo(17.6133f, 5.5918f)
                curveTo(17.2f, 5.2127f, 16.6579f, 5.0f, 16.0925f, 5.0f)
                horizontalLineTo(15.25f)
                lineTo(15.1482f, 5.0069f)
                curveTo(14.7822f, 5.0565f, 14.5f, 5.3703f, 14.5f, 5.75f)
                curveTo(14.5f, 6.1642f, 14.8358f, 6.5f, 15.25f, 6.5f)
                horizontalLineTo(16.0925f)
                lineTo(16.1962f, 6.5072f)
                curveTo(16.3669f, 6.531f, 16.5254f, 6.6132f, 16.6438f, 6.7414f)
                lineTo(18.727f, 8.999f)
                lineTo(15.25f, 8.9996f)
                curveTo(14.4186f, 8.9996f, 13.6925f, 9.4505f, 13.303f, 10.1212f)
                close()
            }
        }
        .build()
        return _glassesOff!!
    }

private var _glassesOff: ImageVector? = null
