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

public val FilledGroup.DrinkMargarita: ImageVector
    get() {
        if (_drinkMargarita != null) {
            return _drinkMargarita!!
        }
        _drinkMargarita = Builder(name = "DrinkMargarita", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.4897f, 2.6268f)
                curveTo(20.5578f, 3.0354f, 20.2818f, 3.4218f, 19.8732f, 3.4899f)
                lineTo(14.3838f, 4.4048f)
                lineTo(14.2648f, 5.0001f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 5.0001f, 19.0f, 5.3359f, 19.0f, 5.7501f)
                verticalLineTo(9.7501f)
                curveTo(19.0f, 11.4609f, 17.6781f, 12.863f, 16.0f, 12.9907f)
                verticalLineTo(13.5001f)
                curveTo(16.0f, 15.4529f, 14.6006f, 17.0789f, 12.75f, 17.4299f)
                verticalLineTo(20.5001f)
                horizontalLineTo(15.25f)
                curveTo(15.6642f, 20.5001f, 16.0f, 20.8359f, 16.0f, 21.2501f)
                curveTo(16.0f, 21.6643f, 15.6642f, 22.0001f, 15.25f, 22.0001f)
                horizontalLineTo(8.75f)
                curveTo(8.3358f, 22.0001f, 8.0f, 21.6643f, 8.0f, 21.2501f)
                curveTo(8.0f, 20.8359f, 8.3358f, 20.5001f, 8.75f, 20.5001f)
                horizontalLineTo(11.25f)
                verticalLineTo(17.4299f)
                curveTo(9.3994f, 17.0789f, 8.0f, 15.4529f, 8.0f, 13.5001f)
                verticalLineTo(12.9907f)
                curveTo(6.3219f, 12.863f, 5.0f, 11.4609f, 5.0f, 9.7501f)
                verticalLineTo(5.7501f)
                curveTo(5.0f, 5.3359f, 5.3358f, 5.0001f, 5.75f, 5.0001f)
                horizontalLineTo(12.735f)
                lineTo(13.0145f, 3.603f)
                curveTo(13.0756f, 3.2975f, 13.3192f, 3.0615f, 13.6266f, 3.0103f)
                lineTo(19.6266f, 2.0103f)
                curveTo(20.0352f, 1.9422f, 20.4216f, 2.2182f, 20.4897f, 2.6268f)
                close()
                moveTo(11.985f, 8.7501f)
                lineTo(12.435f, 6.5001f)
                horizontalLineTo(6.5f)
                verticalLineTo(8.7501f)
                horizontalLineTo(11.985f)
                close()
                moveTo(17.5f, 8.7501f)
                verticalLineTo(6.5001f)
                horizontalLineTo(13.9648f)
                lineTo(13.5148f, 8.7501f)
                horizontalLineTo(17.5f)
                close()
            }
        }
        .build()
        return _drinkMargarita!!
    }

private var _drinkMargarita: ImageVector? = null
