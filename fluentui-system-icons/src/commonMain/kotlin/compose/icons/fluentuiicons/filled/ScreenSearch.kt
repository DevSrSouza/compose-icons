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

public val FilledGroup.ScreenSearch: ImageVector
    get() {
        if (_screenSearch != null) {
            return _screenSearch!!
        }
        _screenSearch = Builder(name = "ScreenSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.25f)
                curveTo(2.0f, 5.4551f, 3.4551f, 4.0f, 5.25f, 4.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 4.0f, 22.0f, 5.4551f, 22.0f, 7.25f)
                verticalLineTo(16.75f)
                curveTo(22.0f, 18.5449f, 20.5449f, 20.0f, 18.75f, 20.0f)
                horizontalLineTo(12.4749f)
                lineTo(10.4253f, 17.9504f)
                curveTo(10.7931f, 17.2126f, 11.0f, 16.3805f, 11.0f, 15.5f)
                curveTo(11.0f, 12.4624f, 8.5376f, 10.0f, 5.5f, 10.0f)
                curveTo(4.1704f, 10.0f, 2.9509f, 10.4718f, 2.0f, 11.2572f)
                verticalLineTo(7.25f)
                close()
                moveTo(5.5f, 20.0f)
                curveTo(6.4719f, 20.0f, 7.3718f, 19.6919f, 8.1074f, 19.1681f)
                lineTo(10.7197f, 21.7803f)
                curveTo(11.0126f, 22.0732f, 11.4874f, 22.0732f, 11.7803f, 21.7803f)
                curveTo(12.0732f, 21.4874f, 12.0732f, 21.0126f, 11.7803f, 20.7197f)
                lineTo(9.1681f, 18.1074f)
                curveTo(9.6919f, 17.3718f, 10.0f, 16.4719f, 10.0f, 15.5f)
                curveTo(10.0f, 13.0147f, 7.9853f, 11.0f, 5.5f, 11.0f)
                curveTo(3.0147f, 11.0f, 1.0f, 13.0147f, 1.0f, 15.5f)
                curveTo(1.0f, 17.9853f, 3.0147f, 20.0f, 5.5f, 20.0f)
                close()
                moveTo(5.5f, 18.5f)
                curveTo(3.8431f, 18.5f, 2.5f, 17.1569f, 2.5f, 15.5f)
                curveTo(2.5f, 13.8431f, 3.8431f, 12.5f, 5.5f, 12.5f)
                curveTo(7.1568f, 12.5f, 8.5f, 13.8431f, 8.5f, 15.5f)
                curveTo(8.5f, 17.1569f, 7.1568f, 18.5f, 5.5f, 18.5f)
                close()
            }
        }
        .build()
        return _screenSearch!!
    }

private var _screenSearch: ImageVector? = null
