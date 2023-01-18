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

public val FilledGroup.Money: ImageVector
    get() {
        if (_money != null) {
            return _money!!
        }
        _money = Builder(name = "Money", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.75f)
                curveTo(2.0f, 5.7835f, 2.7835f, 5.0f, 3.75f, 5.0f)
                horizontalLineTo(17.25f)
                curveTo(18.2165f, 5.0f, 19.0f, 5.7835f, 19.0f, 6.75f)
                verticalLineTo(15.25f)
                curveTo(19.0f, 16.2165f, 18.2165f, 17.0f, 17.25f, 17.0f)
                horizontalLineTo(3.75f)
                curveTo(2.7835f, 17.0f, 2.0f, 16.2165f, 2.0f, 15.25f)
                verticalLineTo(6.75f)
                close()
                moveTo(5.0f, 6.25f)
                verticalLineTo(7.25f)
                curveTo(5.0f, 7.6642f, 4.6642f, 8.0f, 4.25f, 8.0f)
                horizontalLineTo(3.25f)
                verticalLineTo(9.5f)
                horizontalLineTo(4.25f)
                curveTo(5.4926f, 9.5f, 6.5f, 8.4926f, 6.5f, 7.25f)
                verticalLineTo(6.25f)
                horizontalLineTo(5.0f)
                close()
                moveTo(10.5f, 13.5f)
                curveTo(11.7426f, 13.5f, 12.75f, 12.4926f, 12.75f, 11.25f)
                curveTo(12.75f, 10.0074f, 11.7426f, 9.0f, 10.5f, 9.0f)
                curveTo(9.2574f, 9.0f, 8.25f, 10.0074f, 8.25f, 11.25f)
                curveTo(8.25f, 12.4926f, 9.2574f, 13.5f, 10.5f, 13.5f)
                close()
                moveTo(3.25f, 14.0f)
                horizontalLineTo(4.25f)
                curveTo(4.6642f, 14.0f, 5.0f, 14.3358f, 5.0f, 14.75f)
                verticalLineTo(15.75f)
                horizontalLineTo(6.5f)
                verticalLineTo(14.75f)
                curveTo(6.5f, 13.5074f, 5.4926f, 12.5f, 4.25f, 12.5f)
                horizontalLineTo(3.25f)
                verticalLineTo(14.0f)
                close()
                moveTo(16.0f, 14.75f)
                curveTo(16.0f, 14.3358f, 16.3358f, 14.0f, 16.75f, 14.0f)
                horizontalLineTo(17.75f)
                verticalLineTo(12.5f)
                horizontalLineTo(16.75f)
                curveTo(15.5074f, 12.5f, 14.5f, 13.5074f, 14.5f, 14.75f)
                verticalLineTo(15.75f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.75f)
                close()
                moveTo(16.0f, 7.25f)
                verticalLineTo(6.25f)
                horizontalLineTo(14.5f)
                verticalLineTo(7.25f)
                curveTo(14.5f, 8.4926f, 15.5074f, 9.5f, 16.75f, 9.5f)
                horizontalLineTo(17.75f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.75f)
                curveTo(16.3358f, 8.0f, 16.0f, 7.6642f, 16.0f, 7.25f)
                close()
                moveTo(4.4014f, 18.5f)
                curveTo(4.9201f, 19.3967f, 5.8896f, 20.0f, 7.0f, 20.0f)
                horizontalLineTo(17.25f)
                curveTo(19.8734f, 20.0f, 22.0f, 17.8734f, 22.0f, 15.25f)
                verticalLineTo(10.0f)
                curveTo(22.0f, 8.8896f, 21.3967f, 7.9201f, 20.5f, 7.4014f)
                verticalLineTo(15.25f)
                curveTo(20.5f, 17.0449f, 19.0449f, 18.5f, 17.25f, 18.5f)
                horizontalLineTo(4.4014f)
                close()
            }
        }
        .build()
        return _money!!
    }

private var _money: ImageVector? = null
