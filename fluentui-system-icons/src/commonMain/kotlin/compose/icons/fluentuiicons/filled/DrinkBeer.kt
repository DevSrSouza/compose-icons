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

public val FilledGroup.DrinkBeer: ImageVector
    get() {
        if (_drinkBeer != null) {
            return _drinkBeer!!
        }
        _drinkBeer = Builder(name = "DrinkBeer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.25f, 2.0f)
                curveTo(5.4551f, 2.0f, 4.0f, 3.4551f, 4.0f, 5.25f)
                verticalLineTo(19.75f)
                curveTo(4.0f, 20.9926f, 5.0074f, 22.0f, 6.25f, 22.0f)
                horizontalLineTo(15.25f)
                curveTo(16.4926f, 22.0f, 17.5f, 20.9926f, 17.5f, 19.75f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 18.0f, 22.0f, 16.5449f, 22.0f, 14.75f)
                verticalLineTo(9.25f)
                curveTo(22.0f, 7.4551f, 20.5449f, 6.0f, 18.75f, 6.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(5.25f)
                curveTo(17.5f, 3.4551f, 16.0449f, 2.0f, 14.25f, 2.0f)
                horizontalLineTo(7.25f)
                close()
                moveTo(18.75f, 16.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(7.5f)
                horizontalLineTo(18.75f)
                curveTo(19.7165f, 7.5f, 20.5f, 8.2835f, 20.5f, 9.25f)
                verticalLineTo(14.75f)
                curveTo(20.5f, 15.7165f, 19.7165f, 16.5f, 18.75f, 16.5f)
                close()
                moveTo(16.0f, 6.0f)
                horizontalLineTo(5.5f)
                verticalLineTo(5.25f)
                curveTo(5.5f, 4.2835f, 6.2835f, 3.5f, 7.25f, 3.5f)
                horizontalLineTo(14.25f)
                curveTo(15.2165f, 3.5f, 16.0f, 4.2835f, 16.0f, 5.25f)
                verticalLineTo(6.0f)
                close()
                moveTo(8.5f, 10.0f)
                verticalLineTo(17.0f)
                curveTo(8.5f, 17.4142f, 8.1642f, 17.75f, 7.75f, 17.75f)
                curveTo(7.3358f, 17.75f, 7.0f, 17.4142f, 7.0f, 17.0f)
                verticalLineTo(10.0f)
                curveTo(7.0f, 9.5858f, 7.3358f, 9.25f, 7.75f, 9.25f)
                curveTo(8.1642f, 9.25f, 8.5f, 9.5858f, 8.5f, 10.0f)
                close()
                moveTo(11.5f, 10.0f)
                verticalLineTo(17.0f)
                curveTo(11.5f, 17.4142f, 11.1642f, 17.75f, 10.75f, 17.75f)
                curveTo(10.3358f, 17.75f, 10.0f, 17.4142f, 10.0f, 17.0f)
                verticalLineTo(10.0f)
                curveTo(10.0f, 9.5858f, 10.3358f, 9.25f, 10.75f, 9.25f)
                curveTo(11.1642f, 9.25f, 11.5f, 9.5858f, 11.5f, 10.0f)
                close()
                moveTo(14.5f, 10.0f)
                verticalLineTo(17.0f)
                curveTo(14.5f, 17.4142f, 14.1642f, 17.75f, 13.75f, 17.75f)
                curveTo(13.3358f, 17.75f, 13.0f, 17.4142f, 13.0f, 17.0f)
                verticalLineTo(10.0f)
                curveTo(13.0f, 9.5858f, 13.3358f, 9.25f, 13.75f, 9.25f)
                curveTo(14.1642f, 9.25f, 14.5f, 9.5858f, 14.5f, 10.0f)
                close()
            }
        }
        .build()
        return _drinkBeer!!
    }

private var _drinkBeer: ImageVector? = null
