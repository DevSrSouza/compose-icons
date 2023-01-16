package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.Tea: ImageVector
    get() {
        if (_tea != null) {
            return _tea!!
        }
        _tea = Builder(name = "Tea", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                moveTo(20.0f, 8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                moveTo(20.0f, 3.0f)
                curveTo(20.6f, 3.0f, 21.0f, 3.2f, 21.4f, 3.6f)
                curveTo(21.8f, 4.0f, 22.0f, 4.5f, 22.0f, 5.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 8.6f, 21.8f, 9.0f, 21.4f, 9.4f)
                curveTo(21.0f, 9.8f, 20.6f, 10.0f, 20.0f, 10.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                curveTo(18.0f, 14.1f, 17.6f, 15.0f, 16.8f, 15.8f)
                curveTo(16.0f, 16.6f, 15.1f, 17.0f, 14.0f, 17.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 17.0f, 6.0f, 16.6f, 5.2f, 15.8f)
                curveTo(4.4f, 15.0f, 4.0f, 14.1f, 4.0f, 13.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.4f)
                lineTo(7.2f, 6.8f)
                curveTo(7.1f, 6.9f, 7.0f, 7.1f, 7.0f, 7.2f)
                verticalLineTo(11.5f)
                curveTo(7.0f, 11.8f, 7.2f, 12.0f, 7.5f, 12.0f)
                horizontalLineTo(11.5f)
                curveTo(11.8f, 12.0f, 12.0f, 11.8f, 12.0f, 11.5f)
                verticalLineTo(7.2f)
                curveTo(12.0f, 7.0f, 11.9f, 6.9f, 11.8f, 6.8f)
                lineTo(10.0f, 5.4f)
                verticalLineTo(3.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _tea!!
    }

private var _tea: ImageVector? = null
