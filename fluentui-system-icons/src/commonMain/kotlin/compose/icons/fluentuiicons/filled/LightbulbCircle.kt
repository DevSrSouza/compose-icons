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

public val FilledGroup.LightbulbCircle: ImageVector
    get() {
        if (_lightbulbCircle != null) {
            return _lightbulbCircle!!
        }
        _lightbulbCircle = Builder(name = "LightbulbCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(14.481f, 16.9999f)
                horizontalLineTo(9.519f)
                lineTo(9.6221f, 17.4542f)
                lineTo(9.6651f, 17.6064f)
                lineTo(9.7218f, 17.7486f)
                curveTo(10.0101f, 18.3949f, 10.6239f, 18.7981f, 11.3091f, 18.7981f)
                horizontalLineTo(12.6909f)
                lineTo(12.8466f, 18.7904f)
                lineTo(12.9979f, 18.7671f)
                lineTo(13.1441f, 18.7324f)
                curveTo(13.7664f, 18.5582f, 14.2343f, 18.0764f, 14.3774f, 17.4565f)
                lineTo(14.481f, 16.9999f)
                close()
                moveTo(12.0f, 5.2019f)
                curveTo(9.2386f, 5.2019f, 7.0f, 7.4405f, 7.0f, 10.2019f)
                lineTo(7.0075f, 10.4733f)
                lineTo(7.0287f, 10.7289f)
                lineTo(7.0623f, 10.981f)
                curveTo(7.2477f, 12.1494f, 7.8315f, 13.1957f, 8.7015f, 13.9593f)
                lineTo(8.856f, 14.088f)
                lineTo(9.177f, 15.4999f)
                horizontalLineTo(14.821f)
                lineTo(15.141f, 14.09f)
                lineTo(15.3039f, 13.9535f)
                curveTo(16.314f, 13.0589f, 16.9252f, 11.8104f, 16.9936f, 10.4569f)
                lineTo(17.0f, 10.2019f)
                curveTo(17.0f, 7.4405f, 14.7614f, 5.2019f, 12.0f, 5.2019f)
                close()
            }
        }
        .build()
        return _lightbulbCircle!!
    }

private var _lightbulbCircle: ImageVector? = null
