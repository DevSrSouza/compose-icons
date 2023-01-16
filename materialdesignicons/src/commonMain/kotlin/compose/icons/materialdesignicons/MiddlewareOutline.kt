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

public val MaterialDesignIcons.MiddlewareOutline: ImageVector
    get() {
        if (_middlewareOutline != null) {
            return _middlewareOutline!!
        }
        _middlewareOutline = Builder(name = "MiddlewareOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 12.0f)
                lineTo(19.0f, 8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.86f)
                curveTo(15.41f, 9.28f, 13.86f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveTo(8.59f, 9.28f, 8.14f, 11.0f)
                horizontalLineTo(5.0f)
                lineTo(2.0f, 8.0f)
                verticalLineTo(16.0f)
                lineTo(5.0f, 13.0f)
                horizontalLineTo(8.14f)
                curveTo(8.59f, 14.72f, 10.14f, 16.0f, 12.0f, 16.0f)
                reflectiveCurveTo(15.41f, 14.72f, 15.86f, 13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                lineTo(23.0f, 12.0f)
                moveTo(12.0f, 14.0f)
                curveTo(10.9f, 14.0f, 10.0f, 13.1f, 10.0f, 12.0f)
                curveTo(10.0f, 10.9f, 10.9f, 10.0f, 12.0f, 10.0f)
                reflectiveCurveTo(14.0f, 10.9f, 14.0f, 12.0f)
                curveTo(14.0f, 13.1f, 13.1f, 14.0f, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return _middlewareOutline!!
    }

private var _middlewareOutline: ImageVector? = null
