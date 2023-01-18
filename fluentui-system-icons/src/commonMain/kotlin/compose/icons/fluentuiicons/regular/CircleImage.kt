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

public val RegularGroup.CircleImage: ImageVector
    get() {
        if (_circleImage != null) {
            return _circleImage!!
        }
        _circleImage = Builder(name = "CircleImage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 3.5f)
                curveTo(5.9624f, 3.5f, 3.5f, 5.9624f, 3.5f, 9.0f)
                curveTo(3.5f, 11.6961f, 5.4399f, 13.9391f, 8.0f, 14.4093f)
                verticalLineTo(15.9291f)
                curveTo(4.6077f, 15.4439f, 2.0f, 12.5265f, 2.0f, 9.0f)
                curveTo(2.0f, 5.134f, 5.134f, 2.0f, 9.0f, 2.0f)
                curveTo(12.5265f, 2.0f, 15.4439f, 4.6077f, 15.9291f, 8.0f)
                horizontalLineTo(14.4093f)
                curveTo(13.9391f, 5.4399f, 11.6961f, 3.5f, 9.0f, 3.5f)
                close()
                moveTo(14.7929f, 17.2678f)
                curveTo(15.1834f, 16.8772f, 15.8166f, 16.8772f, 16.2071f, 17.2678f)
                lineTo(19.3381f, 20.3987f)
                curveTo(19.1543f, 20.4643f, 18.9563f, 20.5f, 18.75f, 20.5f)
                horizontalLineTo(12.25f)
                curveTo(12.0437f, 20.5f, 11.8457f, 20.4643f, 11.6619f, 20.3987f)
                lineTo(14.7929f, 17.2678f)
                close()
                moveTo(10.6013f, 19.3381f)
                curveTo(10.5357f, 19.1543f, 10.5f, 18.9563f, 10.5f, 18.75f)
                verticalLineTo(12.25f)
                curveTo(10.5f, 11.2835f, 11.2835f, 10.5f, 12.25f, 10.5f)
                horizontalLineTo(18.75f)
                curveTo(19.7165f, 10.5f, 20.5f, 11.2835f, 20.5f, 12.25f)
                verticalLineTo(18.75f)
                curveTo(20.5f, 18.9563f, 20.4643f, 19.1543f, 20.3987f, 19.3381f)
                lineTo(17.2678f, 16.2071f)
                curveTo(16.2915f, 15.2308f, 14.7085f, 15.2308f, 13.7322f, 16.2071f)
                lineTo(10.6013f, 19.3381f)
                close()
                moveTo(19.25f, 13.0f)
                curveTo(19.25f, 13.6904f, 18.6904f, 14.25f, 18.0f, 14.25f)
                curveTo(17.3096f, 14.25f, 16.75f, 13.6904f, 16.75f, 13.0f)
                curveTo(16.75f, 12.3096f, 17.3096f, 11.75f, 18.0f, 11.75f)
                curveTo(18.6904f, 11.75f, 19.25f, 12.3096f, 19.25f, 13.0f)
                close()
                moveTo(12.25f, 9.0f)
                curveTo(10.4551f, 9.0f, 9.0f, 10.4551f, 9.0f, 12.25f)
                verticalLineTo(18.75f)
                curveTo(9.0f, 20.5449f, 10.4551f, 22.0f, 12.25f, 22.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 22.0f, 22.0f, 20.5449f, 22.0f, 18.75f)
                verticalLineTo(12.25f)
                curveTo(22.0f, 10.4551f, 20.5449f, 9.0f, 18.75f, 9.0f)
                horizontalLineTo(12.25f)
                close()
            }
        }
        .build()
        return _circleImage!!
    }

private var _circleImage: ImageVector? = null
