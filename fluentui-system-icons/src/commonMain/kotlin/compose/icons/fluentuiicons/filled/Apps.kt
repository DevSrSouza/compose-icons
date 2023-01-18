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

public val FilledGroup.Apps: ImageVector
    get() {
        if (_apps != null) {
            return _apps!!
        }
        _apps = Builder(name = "Apps", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.4923f, 2.3309f)
                lineTo(21.671f, 5.5097f)
                curveTo(22.5497f, 6.3883f, 22.5497f, 7.813f, 21.671f, 8.6916f)
                lineTo(19.2476f, 11.1143f)
                curveTo(20.2631f, 11.4321f, 21.0f, 12.3803f, 21.0f, 13.5006f)
                verticalLineTo(18.5006f)
                curveTo(21.0f, 19.8813f, 19.8807f, 21.0006f, 18.5f, 21.0006f)
                horizontalLineTo(5.5f)
                curveTo(4.1193f, 21.0006f, 3.0f, 19.8813f, 3.0f, 18.5006f)
                verticalLineTo(5.5005f)
                curveTo(3.0f, 4.1198f, 4.1193f, 3.0006f, 5.5f, 3.0006f)
                horizontalLineTo(10.5f)
                curveTo(11.621f, 3.0006f, 12.5697f, 3.7384f, 12.8869f, 4.755f)
                lineTo(15.3103f, 2.3309f)
                curveTo(16.189f, 1.4522f, 17.6136f, 1.4522f, 18.4923f, 2.3309f)
                close()
                moveTo(11.0f, 13.0006f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.5006f)
                curveTo(5.0f, 18.7767f, 5.2239f, 19.0006f, 5.5f, 19.0006f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0006f)
                close()
                moveTo(18.5f, 13.0006f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0006f)
                horizontalLineTo(18.5f)
                curveTo(18.7761f, 19.0006f, 19.0f, 18.7767f, 19.0f, 18.5006f)
                verticalLineTo(13.5006f)
                curveTo(19.0f, 13.2244f, 18.7761f, 13.0006f, 18.5f, 13.0006f)
                close()
                moveTo(14.44f, 10.9999f)
                lineTo(13.0f, 9.5599f)
                verticalLineTo(11.0006f)
                lineTo(14.44f, 10.9999f)
                close()
                moveTo(10.5f, 5.0005f)
                horizontalLineTo(5.5f)
                curveTo(5.2239f, 5.0005f, 5.0f, 5.2244f, 5.0f, 5.5005f)
                verticalLineTo(11.0006f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.5005f)
                curveTo(11.0f, 5.2244f, 10.7761f, 5.0005f, 10.5f, 5.0005f)
                close()
            }
        }
        .build()
        return _apps!!
    }

private var _apps: ImageVector? = null
