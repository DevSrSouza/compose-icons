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

public val FilledGroup.Trophy: ImageVector
    get() {
        if (_trophy != null) {
            return _trophy!!
        }
        _trophy = Builder(name = "Trophy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2536f, 2.0f)
                curveTo(16.4119f, 2.0f, 17.3657f, 2.8752f, 17.4899f, 4.0004f)
                lineTo(18.7576f, 4.0f)
                curveTo(19.6758f, 4.0f, 20.4288f, 4.7071f, 20.5018f, 5.6065f)
                lineTo(20.5076f, 5.75f)
                verticalLineTo(8.75f)
                curveTo(20.5076f, 10.483f, 19.1512f, 11.8992f, 17.4421f, 11.9949f)
                lineTo(17.2318f, 12.0007f)
                curveTo(16.564f, 14.0909f, 14.7334f, 15.6615f, 12.5007f, 15.9517f)
                lineTo(12.5001f, 17.5f)
                horizontalLineTo(14.2536f)
                curveTo(15.9866f, 17.5f, 17.4028f, 18.8565f, 17.4984f, 20.5656f)
                lineTo(17.5036f, 20.75f)
                verticalLineTo(21.25f)
                curveTo(17.5036f, 21.6297f, 17.2214f, 21.9435f, 16.8554f, 21.9932f)
                lineTo(16.7536f, 22.0f)
                horizontalLineTo(6.7506f)
                curveTo(6.3709f, 22.0f, 6.0571f, 21.7178f, 6.0074f, 21.3518f)
                lineTo(6.0006f, 21.25f)
                verticalLineTo(20.75f)
                curveTo(6.0006f, 19.017f, 7.357f, 17.6008f, 9.0661f, 17.5051f)
                lineTo(9.2506f, 17.5f)
                horizontalLineTo(11.0001f)
                lineTo(11.0004f, 15.9513f)
                curveTo(8.7691f, 15.6601f, 6.9399f, 14.09f, 6.2723f, 12.0007f)
                lineTo(6.2461f, 12.0f)
                curveTo(4.4512f, 12.0f, 2.9961f, 10.5449f, 2.9961f, 8.75f)
                verticalLineTo(5.75f)
                curveTo(2.9961f, 4.7835f, 3.7796f, 4.0f, 4.7461f, 4.0f)
                lineTo(6.0142f, 4.0004f)
                curveTo(6.1384f, 2.8752f, 7.0923f, 2.0f, 8.2506f, 2.0f)
                horizontalLineTo(15.2536f)
                close()
                moveTo(18.7576f, 5.5f)
                horizontalLineTo(17.5036f)
                verticalLineTo(10.4829f)
                curveTo(18.3036f, 10.3703f, 18.93f, 9.7168f, 19.0009f, 8.9042f)
                lineTo(19.0076f, 8.75f)
                verticalLineTo(5.75f)
                curveTo(19.0076f, 5.6316f, 18.9254f, 5.5325f, 18.815f, 5.5066f)
                lineTo(18.7576f, 5.5f)
                close()
                moveTo(6.0006f, 5.5f)
                horizontalLineTo(4.7461f)
                curveTo(4.608f, 5.5f, 4.4961f, 5.6119f, 4.4961f, 5.75f)
                verticalLineTo(8.75f)
                curveTo(4.4961f, 9.6332f, 5.1503f, 10.3635f, 6.0006f, 10.4829f)
                verticalLineTo(5.5f)
                close()
            }
        }
        .build()
        return _trophy!!
    }

private var _trophy: ImageVector? = null
