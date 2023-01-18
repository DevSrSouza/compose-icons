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

public val FilledGroup.ImageShadow: ImageVector
    get() {
        if (_imageShadow != null) {
            return _imageShadow!!
        }
        _imageShadow = Builder(name = "ImageShadow", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 2.0f)
                curveTo(3.4551f, 2.0f, 2.0f, 3.4551f, 2.0f, 5.25f)
                verticalLineTo(14.25f)
                curveTo(2.0f, 14.8913f, 2.1857f, 15.4891f, 2.5063f, 15.9928f)
                lineTo(8.2073f, 10.623f)
                curveTo(9.0738f, 9.8068f, 10.4262f, 9.8068f, 11.2927f, 10.623f)
                lineTo(16.9936f, 15.9929f)
                curveTo(17.3143f, 15.4892f, 17.5f, 14.8913f, 17.5f, 14.25f)
                verticalLineTo(5.25f)
                curveTo(17.5f, 3.4551f, 16.0449f, 2.0f, 14.25f, 2.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(12.75f, 8.0f)
                curveTo(12.0596f, 8.0f, 11.5f, 7.4404f, 11.5f, 6.75f)
                curveTo(11.5f, 6.0596f, 12.0596f, 5.5f, 12.75f, 5.5f)
                curveTo(13.4404f, 5.5f, 14.0f, 6.0596f, 14.0f, 6.75f)
                curveTo(14.0f, 7.4404f, 13.4404f, 8.0f, 12.75f, 8.0f)
                close()
                moveTo(5.25f, 17.5f)
                curveTo(4.6403f, 17.5f, 4.0698f, 17.3321f, 3.5822f, 17.04f)
                lineTo(9.2358f, 11.7149f)
                curveTo(9.5246f, 11.4428f, 9.9754f, 11.4428f, 10.2642f, 11.7149f)
                lineTo(15.9177f, 17.0401f)
                curveTo(15.4301f, 17.3321f, 14.8597f, 17.5f, 14.25f, 17.5f)
                horizontalLineTo(5.25f)
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
