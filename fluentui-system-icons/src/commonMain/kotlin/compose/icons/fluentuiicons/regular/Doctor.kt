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

public val RegularGroup.Doctor: ImageVector
    get() {
        if (_doctor != null) {
            return _doctor!!
        }
        _doctor = Builder(name = "Doctor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.75f, 4.5f)
                curveTo(9.6119f, 4.5f, 9.5f, 4.6119f, 9.5f, 4.75f)
                verticalLineTo(8.75f)
                curveTo(9.5f, 9.1642f, 9.1642f, 9.5f, 8.75f, 9.5f)
                horizontalLineTo(4.75f)
                curveTo(4.6119f, 9.5f, 4.5f, 9.6119f, 4.5f, 9.75f)
                verticalLineTo(14.25f)
                curveTo(4.5f, 14.3881f, 4.6119f, 14.5f, 4.75f, 14.5f)
                horizontalLineTo(8.75f)
                curveTo(9.1642f, 14.5f, 9.5f, 14.8358f, 9.5f, 15.25f)
                verticalLineTo(19.25f)
                curveTo(9.5f, 19.3881f, 9.6119f, 19.5f, 9.75f, 19.5f)
                horizontalLineTo(14.25f)
                curveTo(14.3881f, 19.5f, 14.5f, 19.3881f, 14.5f, 19.25f)
                verticalLineTo(15.25f)
                curveTo(14.5f, 14.8358f, 14.8358f, 14.5f, 15.25f, 14.5f)
                horizontalLineTo(19.25f)
                curveTo(19.3881f, 14.5f, 19.5f, 14.3881f, 19.5f, 14.25f)
                verticalLineTo(9.75f)
                curveTo(19.5f, 9.6119f, 19.3881f, 9.5f, 19.25f, 9.5f)
                horizontalLineTo(15.25f)
                curveTo(14.8358f, 9.5f, 14.5f, 9.1642f, 14.5f, 8.75f)
                verticalLineTo(4.75f)
                curveTo(14.5f, 4.6119f, 14.3881f, 4.5f, 14.25f, 4.5f)
                horizontalLineTo(9.75f)
                close()
                moveTo(8.0f, 4.75f)
                curveTo(8.0f, 3.7835f, 8.7835f, 3.0f, 9.75f, 3.0f)
                horizontalLineTo(14.25f)
                curveTo(15.2165f, 3.0f, 16.0f, 3.7835f, 16.0f, 4.75f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.25f)
                curveTo(20.2165f, 8.0f, 21.0f, 8.7835f, 21.0f, 9.75f)
                verticalLineTo(14.25f)
                curveTo(21.0f, 15.2165f, 20.2165f, 16.0f, 19.25f, 16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.25f)
                curveTo(16.0f, 20.2165f, 15.2165f, 21.0f, 14.25f, 21.0f)
                horizontalLineTo(9.75f)
                curveTo(8.7835f, 21.0f, 8.0f, 20.2165f, 8.0f, 19.25f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.75f)
                curveTo(3.7835f, 16.0f, 3.0f, 15.2165f, 3.0f, 14.25f)
                verticalLineTo(9.75f)
                curveTo(3.0f, 8.7835f, 3.7835f, 8.0f, 4.75f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.75f)
                close()
            }
        }
        .build()
        return _doctor!!
    }

private var _doctor: ImageVector? = null
