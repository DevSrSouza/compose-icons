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

public val MaterialDesignIcons.RoutesClock: ImageVector
    get() {
        if (_routesClock != null) {
            return _routesClock!!
        }
        _routesClock = Builder(name = "RoutesClock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.69f)
                lineTo(18.19f, 18.53f)
                lineTo(18.94f, 17.23f)
                lineTo(16.5f, 15.82f)
                verticalLineTo(13.0f)
                moveTo(16.0f, 9.0f)
                curveTo(14.04f, 9.0f, 12.27f, 9.82f, 11.0f, 11.12f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                lineTo(19.0f, 5.0f)
                lineTo(17.0f, 3.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                lineTo(10.0f, 1.0f)
                lineTo(9.0f, 2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                lineTo(1.0f, 8.0f)
                lineTo(3.0f, 10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                curveTo(7.9f, 20.0f, 7.0f, 20.9f, 7.0f, 22.0f)
                horizontalLineTo(12.41f)
                curveTo(13.46f, 22.63f, 14.69f, 23.0f, 16.0f, 23.0f)
                curveTo(19.87f, 23.0f, 23.0f, 19.87f, 23.0f, 16.0f)
                reflectiveCurveTo(19.87f, 9.0f, 16.0f, 9.0f)
                moveTo(16.0f, 20.85f)
                curveTo(13.32f, 20.85f, 11.15f, 18.68f, 11.15f, 16.0f)
                reflectiveCurveTo(13.32f, 11.15f, 16.0f, 11.15f)
                reflectiveCurveTo(20.85f, 13.32f, 20.85f, 16.0f)
                reflectiveCurveTo(18.68f, 20.85f, 16.0f, 20.85f)
                close()
            }
        }
        .build()
        return _routesClock!!
    }

private var _routesClock: ImageVector? = null
