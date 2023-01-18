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

public val FilledGroup.AnimalRabbit: ImageVector
    get() {
        if (_animalRabbit != null) {
            return _animalRabbit!!
        }
        _animalRabbit = Builder(name = "AnimalRabbit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5308f, 5.4369f)
                lineTo(20.9564f, 10.8736f)
                curveTo(22.3479f, 12.268f, 22.3479f, 14.5286f, 20.9564f, 15.923f)
                curveTo(20.0498f, 16.8314f, 18.7763f, 17.148f, 17.614f, 16.8727f)
                lineTo(17.614f, 16.9967f)
                curveTo(17.614f, 18.1031f, 16.719f, 19.0f, 15.6149f, 19.0f)
                lineTo(13.5041f, 18.9998f)
                lineTo(13.505f, 18.2522f)
                lineTo(13.5f, 18.0844f)
                curveTo(13.4169f, 16.699f, 12.3119f, 15.5896f, 10.9303f, 15.5031f)
                lineTo(10.7562f, 15.4977f)
                horizontalLineTo(9.7566f)
                lineTo(9.6549f, 15.5045f)
                curveTo(9.2889f, 15.5543f, 9.0069f, 15.8686f, 9.0069f, 16.2489f)
                curveTo(9.0069f, 16.6292f, 9.2889f, 16.9435f, 9.6549f, 16.9933f)
                lineTo(9.7566f, 17.0001f)
                horizontalLineTo(10.7562f)
                lineTo(10.8839f, 17.0066f)
                curveTo(11.472f, 17.0664f, 11.9395f, 17.5349f, 11.9992f, 18.1241f)
                lineTo(12.0056f, 18.2522f)
                lineTo(12.0048f, 18.9998f)
                lineTo(7.0059f, 19.0f)
                curveTo(5.9018f, 19.0f, 5.0067f, 18.1031f, 5.0067f, 16.9967f)
                verticalLineTo(14.4927f)
                curveTo(5.0067f, 14.3023f, 5.0185f, 14.1147f, 5.0414f, 13.9306f)
                curveTo(4.8674f, 13.9714f, 4.6856f, 13.9919f, 4.4989f, 13.9919f)
                curveTo(3.1188f, 13.9919f, 2.0f, 12.8707f, 2.0f, 11.4878f)
                curveTo(2.0f, 10.1048f, 3.1188f, 8.9837f, 4.4989f, 8.9837f)
                curveTo(5.6462f, 8.9837f, 6.6129f, 9.7584f, 6.9064f, 10.8142f)
                curveTo(7.6389f, 10.2922f, 8.5361f, 9.9853f, 9.5048f, 9.9853f)
                horizontalLineTo(13.116f)
                curveTo(13.7193f, 9.9853f, 14.2948f, 10.1044f, 14.8206f, 10.3202f)
                curveTo(14.9844f, 10.0442f, 15.1837f, 9.7822f, 15.4175f, 9.5412f)
                lineTo(13.4258f, 7.5462f)
                curveTo(12.8445f, 6.9637f, 12.8445f, 6.0193f, 13.4258f, 5.4369f)
                curveTo(14.0071f, 4.8544f, 14.9495f, 4.8544f, 15.5308f, 5.4369f)
                close()
            }
        }
        .build()
        return _animalRabbit!!
    }

private var _animalRabbit: ImageVector? = null
