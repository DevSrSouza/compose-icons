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

public val MaterialDesignIcons.Middleware: ImageVector
    get() {
        if (_middleware != null) {
            return _middleware!!
        }
        _middleware = Builder(name = "Middleware", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 12.0f)
                lineTo(19.0f, 8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.82f)
                curveTo(14.4f, 9.84f, 13.3f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveTo(9.6f, 9.84f, 9.18f, 11.0f)
                horizontalLineTo(5.0f)
                lineTo(2.0f, 8.0f)
                verticalLineTo(16.0f)
                lineTo(5.0f, 13.0f)
                horizontalLineTo(9.18f)
                curveTo(9.6f, 14.16f, 10.7f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveTo(14.4f, 14.16f, 14.82f, 13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                lineTo(23.0f, 12.0f)
                close()
            }
        }
        .build()
        return _middleware!!
    }

private var _middleware: ImageVector? = null
