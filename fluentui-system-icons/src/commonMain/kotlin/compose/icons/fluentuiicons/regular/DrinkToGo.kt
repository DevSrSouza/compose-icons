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

public val RegularGroup.DrinkToGo: ImageVector
    get() {
        if (_drinkToGo != null) {
            return _drinkToGo!!
        }
        _drinkToGo = Builder(name = "DrinkToGo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.7203f, 2.2197f)
                curveTo(16.0132f, 1.9268f, 16.4881f, 1.9268f, 16.781f, 2.2197f)
                curveTo(17.0739f, 2.5126f, 17.0739f, 2.9874f, 16.781f, 3.2803f)
                lineTo(15.56f, 4.5f)
                horizontalLineTo(17.7506f)
                curveTo(18.0676f, 4.5f, 18.3503f, 4.6993f, 18.4569f, 4.9977f)
                lineTo(19.7069f, 8.4978f)
                curveTo(19.8814f, 8.9862f, 19.5193f, 9.5f, 19.0006f, 9.5f)
                horizontalLineTo(17.956f)
                lineTo(16.3686f, 19.5493f)
                curveTo(16.1592f, 21.0145f, 14.9096f, 22.0f, 13.3987f, 22.0f)
                horizontalLineTo(10.6025f)
                curveTo(9.0917f, 22.0f, 7.842f, 21.0145f, 7.6343f, 19.5602f)
                lineTo(6.045f, 9.5f)
                horizontalLineTo(5.0006f)
                curveTo(4.482f, 9.5f, 4.1199f, 8.9862f, 4.2943f, 8.4978f)
                lineTo(5.5443f, 4.9977f)
                curveTo(5.6509f, 4.6993f, 5.9337f, 4.5f, 6.2506f, 4.5f)
                horizontalLineTo(13.439f)
                lineTo(15.7203f, 2.2197f)
                close()
                moveTo(16.437f, 9.5f)
                horizontalLineTo(7.563f)
                lineTo(9.1176f, 19.3371f)
                curveTo(9.2169f, 20.0322f, 9.8101f, 20.5f, 10.6025f, 20.5f)
                horizontalLineTo(13.3987f)
                curveTo(14.1911f, 20.5f, 14.7843f, 20.0322f, 14.8853f, 19.3262f)
                lineTo(16.437f, 9.5f)
                close()
                moveTo(17.2221f, 6.0f)
                horizontalLineTo(6.7792f)
                lineTo(6.0649f, 8.0f)
                horizontalLineTo(17.9364f)
                lineTo(17.2221f, 6.0f)
                close()
            }
        }
        .build()
        return _drinkToGo!!
    }

private var _drinkToGo: ImageVector? = null
