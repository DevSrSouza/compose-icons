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

public val RegularGroup.ImageShadow: ImageVector
    get() {
        if (_imageShadow != null) {
            return _imageShadow!!
        }
        _imageShadow = Builder(name = "ImageShadow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9963f, 6.7482f)
                curveTo(13.9963f, 7.4375f, 13.4375f, 7.9963f, 12.7482f, 7.9963f)
                curveTo(12.0588f, 7.9963f, 11.5f, 7.4375f, 11.5f, 6.7482f)
                curveTo(11.5f, 6.0588f, 12.0588f, 5.5f, 12.7482f, 5.5f)
                curveTo(13.4375f, 5.5f, 13.9963f, 6.0588f, 13.9963f, 6.7482f)
                close()
                moveTo(2.0f, 5.25f)
                curveTo(2.0f, 3.4551f, 3.4551f, 2.0f, 5.25f, 2.0f)
                horizontalLineTo(14.25f)
                curveTo(16.0449f, 2.0f, 17.5f, 3.4551f, 17.5f, 5.25f)
                verticalLineTo(14.25f)
                curveTo(17.5f, 16.0449f, 16.0449f, 17.5f, 14.25f, 17.5f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 17.5f, 2.0f, 16.0449f, 2.0f, 14.25f)
                verticalLineTo(5.25f)
                close()
                moveTo(5.25f, 3.5f)
                curveTo(4.2835f, 3.5f, 3.5f, 4.2835f, 3.5f, 5.25f)
                verticalLineTo(14.25f)
                curveTo(3.5f, 14.481f, 3.5447f, 14.7015f, 3.626f, 14.9033f)
                lineTo(8.2125f, 10.6128f)
                curveTo(9.0775f, 9.8036f, 10.4217f, 9.8036f, 11.2867f, 10.6128f)
                lineTo(15.8738f, 14.9038f)
                curveTo(15.9552f, 14.7018f, 16.0f, 14.4812f, 16.0f, 14.25f)
                verticalLineTo(5.25f)
                curveTo(16.0f, 4.2835f, 15.2165f, 3.5f, 14.25f, 3.5f)
                horizontalLineTo(5.25f)
                close()
                moveTo(14.7669f, 15.9224f)
                lineTo(10.262f, 11.7082f)
                curveTo(9.9736f, 11.4385f, 9.5256f, 11.4385f, 9.2373f, 11.7082f)
                lineTo(4.7325f, 15.9222f)
                curveTo(4.8961f, 15.9728f, 5.0698f, 16.0f, 5.25f, 16.0f)
                horizontalLineTo(14.25f)
                curveTo(14.4299f, 16.0f, 14.6035f, 15.9728f, 14.7669f, 15.9224f)
                close()
                moveTo(6.499f, 18.75f)
                verticalLineTo(18.5f)
                horizontalLineTo(14.5f)
                curveTo(14.58f, 18.5f, 14.6594f, 18.4977f, 14.7382f, 18.493f)
                curveTo(16.8369f, 18.3702f, 18.5009f, 16.6294f, 18.5009f, 14.4999f)
                verticalLineTo(6.5f)
                horizontalLineTo(18.749f)
                curveTo(20.5439f, 6.5f, 21.999f, 7.9551f, 21.999f, 9.75f)
                verticalLineTo(16.75f)
                curveTo(21.999f, 19.6495f, 19.6485f, 22.0f, 16.749f, 22.0f)
                horizontalLineTo(9.749f)
                curveTo(7.9541f, 22.0f, 6.499f, 20.5449f, 6.499f, 18.75f)
                close()
            }
        }
        .build()
        return _imageShadow!!
    }

private var _imageShadow: ImageVector? = null
