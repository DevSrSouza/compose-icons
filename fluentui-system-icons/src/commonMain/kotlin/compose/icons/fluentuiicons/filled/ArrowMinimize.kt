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

public val FilledGroup.ArrowMinimize: ImageVector
    get() {
        if (_arrowMinimize != null) {
            return _arrowMinimize!!
        }
        _arrowMinimize = Builder(name = "ArrowMinimize", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.4976f, 12.5052f)
                curveTo(11.0105f, 12.5052f, 11.4331f, 12.8913f, 11.4909f, 13.3886f)
                lineTo(11.4976f, 13.5052f)
                verticalLineTo(21.0091f)
                curveTo(11.4976f, 21.5614f, 11.0499f, 22.0091f, 10.4976f, 22.0091f)
                curveTo(9.9848f, 22.0091f, 9.5621f, 21.6231f, 9.5043f, 21.1257f)
                lineTo(9.4976f, 21.0091f)
                lineTo(9.4971f, 15.916f)
                lineTo(3.7066f, 21.7077f)
                curveTo(3.3461f, 22.0682f, 2.7789f, 22.0959f, 2.3866f, 21.7909f)
                lineTo(2.2924f, 21.7077f)
                curveTo(1.9319f, 21.3472f, 1.9042f, 20.78f, 2.2092f, 20.3877f)
                lineTo(2.2924f, 20.2935f)
                lineTo(8.0801f, 14.505f)
                lineTo(2.9961f, 14.5052f)
                curveTo(2.4438f, 14.5052f, 1.9961f, 14.0575f, 1.9961f, 13.5052f)
                curveTo(1.9961f, 12.9924f, 2.3821f, 12.5697f, 2.8795f, 12.5119f)
                lineTo(2.9961f, 12.5052f)
                horizontalLineTo(10.4976f)
                close()
                moveTo(13.4986f, 2.0f)
                curveTo(14.0115f, 2.0f, 14.4341f, 2.386f, 14.4919f, 2.8834f)
                lineTo(14.4986f, 3.0f)
                lineTo(14.4981f, 8.087f)
                lineTo(20.2924f, 2.2935f)
                curveTo(20.6529f, 1.933f, 21.2201f, 1.9053f, 21.6124f, 2.2103f)
                lineTo(21.7066f, 2.2935f)
                curveTo(22.0671f, 2.654f, 22.0948f, 3.2212f, 21.7898f, 3.6135f)
                lineTo(21.7066f, 3.7077f)
                lineTo(15.9101f, 9.503f)
                lineTo(21.0001f, 9.5039f)
                curveTo(21.5524f, 9.5039f, 22.0001f, 9.9516f, 22.0001f, 10.5039f)
                curveTo(22.0001f, 11.0167f, 21.6141f, 11.4394f, 21.1168f, 11.4972f)
                lineTo(21.0001f, 11.5039f)
                horizontalLineTo(13.4986f)
                curveTo(12.9858f, 11.5039f, 12.5631f, 11.1179f, 12.5053f, 10.6205f)
                lineTo(12.4986f, 10.5039f)
                verticalLineTo(3.0f)
                curveTo(12.4986f, 2.4477f, 12.9463f, 2.0f, 13.4986f, 2.0f)
                close()
            }
        }
        .build()
        return _arrowMinimize!!
    }

private var _arrowMinimize: ImageVector? = null
