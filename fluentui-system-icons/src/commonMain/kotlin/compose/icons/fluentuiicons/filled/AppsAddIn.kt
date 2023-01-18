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

public val FilledGroup.AppsAddIn: ImageVector
    get() {
        if (_appsAddIn != null) {
            return _appsAddIn!!
        }
        _appsAddIn = Builder(name = "AppsAddIn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 3.0f)
                curveTo(11.8807f, 3.0f, 13.0f, 4.1193f, 13.0f, 5.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.5f)
                curveTo(19.8807f, 11.0f, 21.0f, 12.1193f, 21.0f, 13.5f)
                verticalLineTo(18.5f)
                curveTo(21.0f, 19.8807f, 19.8807f, 21.0f, 18.5f, 21.0f)
                horizontalLineTo(5.5f)
                curveTo(4.1193f, 21.0f, 3.0f, 19.8807f, 3.0f, 18.5f)
                verticalLineTo(5.5f)
                curveTo(3.0f, 4.1193f, 4.1193f, 3.0f, 5.5f, 3.0f)
                horizontalLineTo(10.5f)
                close()
                moveTo(11.0f, 13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.5f)
                curveTo(5.0f, 18.7761f, 5.2239f, 19.0f, 5.5f, 19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(18.5f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.5f)
                curveTo(18.7761f, 19.0f, 19.0f, 18.7761f, 19.0f, 18.5f)
                verticalLineTo(13.5f)
                curveTo(19.0f, 13.2239f, 18.7761f, 13.0f, 18.5f, 13.0f)
                close()
                moveTo(10.5f, 5.0f)
                horizontalLineTo(5.5f)
                curveTo(5.2239f, 5.0f, 5.0f, 5.2239f, 5.0f, 5.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.5f)
                curveTo(11.0f, 5.2239f, 10.7761f, 5.0f, 10.5f, 5.0f)
                close()
                moveTo(17.8834f, 2.0067f)
                lineTo(18.0f, 2.0f)
                curveTo(18.5128f, 2.0f, 18.9355f, 2.386f, 18.9933f, 2.8834f)
                lineTo(19.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5128f, 5.0f, 21.9355f, 5.386f, 21.9933f, 5.8834f)
                lineTo(22.0f, 6.0f)
                curveTo(22.0f, 6.5128f, 21.614f, 6.9355f, 21.1166f, 6.9933f)
                lineTo(21.0f, 7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                curveTo(19.0f, 9.5128f, 18.614f, 9.9355f, 18.1166f, 9.9933f)
                lineTo(18.0f, 10.0f)
                curveTo(17.4872f, 10.0f, 17.0645f, 9.614f, 17.0067f, 9.1166f)
                lineTo(17.0f, 9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                curveTo(14.4872f, 7.0f, 14.0645f, 6.614f, 14.0067f, 6.1166f)
                lineTo(14.0f, 6.0f)
                curveTo(14.0f, 5.4872f, 14.386f, 5.0645f, 14.8834f, 5.0067f)
                lineTo(15.0f, 5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(3.0f)
                curveTo(17.0f, 2.4872f, 17.386f, 2.0645f, 17.8834f, 2.0067f)
                lineTo(18.0f, 2.0f)
                lineTo(17.8834f, 2.0067f)
                close()
            }
        }
        .build()
        return _appsAddIn!!
    }

private var _appsAddIn: ImageVector? = null
