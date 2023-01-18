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

public val RegularGroup.Steps: ImageVector
    get() {
        if (_steps != null) {
            return _steps!!
        }
        _steps = Builder(name = "Steps", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.375f)
                curveTo(12.0f, 2.6156f, 12.6156f, 2.0f, 13.375f, 2.0f)
                horizontalLineTo(17.125f)
                curveTo(17.8844f, 2.0f, 18.5f, 2.6156f, 18.5f, 3.375f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(3.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(7.125f)
                curveTo(13.5f, 7.8844f, 12.8844f, 8.5f, 12.125f, 8.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(12.125f)
                curveTo(8.5f, 12.8844f, 7.8844f, 13.5f, 7.125f, 13.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.5f)
                horizontalLineTo(3.375f)
                curveTo(2.6156f, 18.5f, 2.0f, 17.8844f, 2.0f, 17.125f)
                verticalLineTo(13.375f)
                curveTo(2.0f, 12.6156f, 2.6156f, 12.0f, 3.375f, 12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.375f)
                curveTo(7.0f, 7.6156f, 7.6156f, 7.0f, 8.375f, 7.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(3.375f)
                close()
                moveTo(16.375f, 10.0f)
                curveTo(15.6156f, 10.0f, 15.0f, 10.6156f, 15.0f, 11.375f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.375f)
                curveTo(10.6156f, 15.0f, 10.0f, 15.6156f, 10.0f, 16.375f)
                verticalLineTo(20.125f)
                curveTo(10.0f, 20.8844f, 10.6156f, 21.5f, 11.375f, 21.5f)
                horizontalLineTo(18.25f)
                curveTo(20.0449f, 21.5f, 21.5f, 20.0449f, 21.5f, 18.25f)
                verticalLineTo(11.375f)
                curveTo(21.5f, 10.6156f, 20.8844f, 10.0f, 20.125f, 10.0f)
                horizontalLineTo(16.375f)
                close()
                moveTo(16.5f, 15.125f)
                verticalLineTo(11.5f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.25f)
                curveTo(20.0f, 19.2165f, 19.2165f, 20.0f, 18.25f, 20.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(16.5f)
                horizontalLineTo(15.125f)
                curveTo(15.8844f, 16.5f, 16.5f, 15.8844f, 16.5f, 15.125f)
                close()
            }
        }
        .build()
        return _steps!!
    }

private var _steps: ImageVector? = null
