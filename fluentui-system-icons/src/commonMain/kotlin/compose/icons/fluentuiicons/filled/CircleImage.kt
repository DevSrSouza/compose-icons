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

public val FilledGroup.CircleImage: ImageVector
    get() {
        if (_circleImage != null) {
            return _circleImage!!
        }
        _circleImage = Builder(name = "CircleImage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.25f, 8.0f)
                horizontalLineTo(15.9291f)
                curveTo(15.4439f, 4.6077f, 12.5265f, 2.0f, 9.0f, 2.0f)
                curveTo(5.134f, 2.0f, 2.0f, 5.134f, 2.0f, 9.0f)
                curveTo(2.0f, 12.5265f, 4.6077f, 15.4439f, 8.0f, 15.9291f)
                verticalLineTo(12.25f)
                curveTo(8.0f, 9.9028f, 9.9028f, 8.0f, 12.25f, 8.0f)
                close()
                moveTo(12.25f, 9.0f)
                curveTo(10.4551f, 9.0f, 9.0f, 10.4551f, 9.0f, 12.25f)
                verticalLineTo(18.75f)
                curveTo(9.0f, 19.3757f, 9.1768f, 19.9602f, 9.4833f, 20.4561f)
                lineTo(13.7322f, 16.2071f)
                curveTo(14.7085f, 15.2308f, 16.2915f, 15.2308f, 17.2678f, 16.2071f)
                lineTo(21.5167f, 20.4561f)
                curveTo(21.8232f, 19.9602f, 22.0f, 19.3757f, 22.0f, 18.75f)
                verticalLineTo(12.25f)
                curveTo(22.0f, 10.4551f, 20.5449f, 9.0f, 18.75f, 9.0f)
                horizontalLineTo(12.25f)
                close()
                moveTo(20.4561f, 21.5167f)
                lineTo(16.2071f, 17.2678f)
                curveTo(15.8166f, 16.8772f, 15.1834f, 16.8772f, 14.7929f, 17.2678f)
                lineTo(10.5439f, 21.5167f)
                curveTo(11.0398f, 21.8232f, 11.6243f, 22.0f, 12.25f, 22.0f)
                horizontalLineTo(18.75f)
                curveTo(19.3757f, 22.0f, 19.9602f, 21.8232f, 20.4561f, 21.5167f)
                close()
                moveTo(19.25f, 13.0f)
                curveTo(19.25f, 13.6904f, 18.6904f, 14.25f, 18.0f, 14.25f)
                curveTo(17.3096f, 14.25f, 16.75f, 13.6904f, 16.75f, 13.0f)
                curveTo(16.75f, 12.3096f, 17.3096f, 11.75f, 18.0f, 11.75f)
                curveTo(18.6904f, 11.75f, 19.25f, 12.3096f, 19.25f, 13.0f)
                close()
            }
        }
        .build()
        return _circleImage!!
    }

private var _circleImage: ImageVector? = null
