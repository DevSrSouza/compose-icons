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

public val RegularGroup.ImageMultiple: ImageVector
    get() {
        if (_imageMultiple != null) {
            return _imageMultiple!!
        }
        _imageMultiple = Builder(name = "ImageMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7482f, 8.9963f)
                curveTo(14.4375f, 8.9963f, 14.9963f, 8.4375f, 14.9963f, 7.7482f)
                curveTo(14.9963f, 7.0588f, 14.4375f, 6.5f, 13.7482f, 6.5f)
                curveTo(13.0588f, 6.5f, 12.5f, 7.0588f, 12.5f, 7.7482f)
                curveTo(12.5f, 8.4375f, 13.0588f, 8.9963f, 13.7482f, 8.9963f)
                close()
                moveTo(6.25f, 3.0f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(15.25f)
                curveTo(3.0f, 17.0449f, 4.4551f, 18.5f, 6.25f, 18.5f)
                horizontalLineTo(15.25f)
                curveTo(17.0449f, 18.5f, 18.5f, 17.0449f, 18.5f, 15.25f)
                verticalLineTo(6.25f)
                curveTo(18.5f, 4.4551f, 17.0449f, 3.0f, 15.25f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(4.5f, 6.25f)
                curveTo(4.5f, 5.2835f, 5.2835f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(15.25f)
                curveTo(16.2165f, 4.5f, 17.0f, 5.2835f, 17.0f, 6.25f)
                verticalLineTo(15.25f)
                curveTo(17.0f, 15.4812f, 16.9552f, 15.7018f, 16.8738f, 15.9038f)
                lineTo(12.2867f, 11.6128f)
                curveTo(11.4217f, 10.8036f, 10.0775f, 10.8036f, 9.2125f, 11.6128f)
                lineTo(4.626f, 15.9033f)
                curveTo(4.5447f, 15.7015f, 4.5f, 15.481f, 4.5f, 15.25f)
                verticalLineTo(6.25f)
                close()
                moveTo(11.262f, 12.7082f)
                lineTo(15.7669f, 16.9224f)
                curveTo(15.6035f, 16.9728f, 15.4299f, 17.0f, 15.25f, 17.0f)
                horizontalLineTo(6.25f)
                curveTo(6.0698f, 17.0f, 5.8961f, 16.9728f, 5.7325f, 16.9222f)
                lineTo(10.2372f, 12.7082f)
                curveTo(10.5256f, 12.4385f, 10.9736f, 12.4385f, 11.262f, 12.7082f)
                close()
                moveTo(8.75f, 21.0002f)
                curveTo(7.5993f, 21.0002f, 6.5883f, 20.4022f, 6.0107f, 19.5f)
                horizontalLineTo(8.7244f)
                lineTo(8.75f, 19.5002f)
                horizontalLineTo(15.7499f)
                curveTo(17.821f, 19.5002f, 19.5f, 17.8212f, 19.5f, 15.7502f)
                verticalLineTo(6.0111f)
                curveTo(20.402f, 6.5886f, 21.0f, 7.5996f, 21.0f, 8.7502f)
                verticalLineTo(15.7502f)
                curveTo(21.0f, 18.6497f, 18.6494f, 21.0002f, 15.7499f, 21.0002f)
                horizontalLineTo(8.75f)
                close()
            }
        }
        .build()
        return _imageMultiple!!
    }

private var _imageMultiple: ImageVector? = null
