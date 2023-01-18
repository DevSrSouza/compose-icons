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

public val FilledGroup.BroadActivityFeed: ImageVector
    get() {
        if (_broadActivityFeed != null) {
            return _broadActivityFeed!!
        }
        _broadActivityFeed = Builder(name = "BroadActivityFeed", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.2461f, 14.0013f)
                curveTo(10.2126f, 14.0013f, 10.9961f, 14.7848f, 10.9961f, 15.7513f)
                verticalLineTo(19.2513f)
                curveTo(10.9961f, 20.2178f, 10.2126f, 21.0013f, 9.2461f, 21.0013f)
                horizontalLineTo(3.75f)
                curveTo(2.7835f, 21.0013f, 2.0f, 20.2178f, 2.0f, 19.2513f)
                verticalLineTo(15.7513f)
                curveTo(2.0f, 14.7848f, 2.7835f, 14.0013f, 3.75f, 14.0013f)
                horizontalLineTo(9.2461f)
                close()
                moveTo(20.25f, 14.0013f)
                curveTo(21.2165f, 14.0013f, 22.0f, 14.7848f, 22.0f, 15.7513f)
                verticalLineTo(19.2513f)
                curveTo(22.0f, 20.2178f, 21.2165f, 21.0013f, 20.25f, 21.0013f)
                horizontalLineTo(14.7539f)
                curveTo(13.7874f, 21.0013f, 13.0039f, 20.2178f, 13.0039f, 19.2513f)
                verticalLineTo(15.7513f)
                curveTo(13.0039f, 14.7848f, 13.7874f, 14.0013f, 14.7539f, 14.0013f)
                horizontalLineTo(20.25f)
                close()
                moveTo(20.25f, 2.9961f)
                curveTo(21.2165f, 2.9961f, 22.0f, 3.7796f, 22.0f, 4.7461f)
                verticalLineTo(10.2495f)
                curveTo(22.0f, 11.216f, 21.2165f, 11.9995f, 20.25f, 11.9995f)
                horizontalLineTo(3.75f)
                curveTo(2.7835f, 11.9995f, 2.0f, 11.216f, 2.0f, 10.2495f)
                verticalLineTo(4.7461f)
                curveTo(2.0f, 3.8279f, 2.7071f, 3.0749f, 3.6065f, 3.0019f)
                lineTo(3.75f, 2.9961f)
                horizontalLineTo(20.25f)
                close()
            }
        }
        .build()
        return _broadActivityFeed!!
    }

private var _broadActivityFeed: ImageVector? = null
