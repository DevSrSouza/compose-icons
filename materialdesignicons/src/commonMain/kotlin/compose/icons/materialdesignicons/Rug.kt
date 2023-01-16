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

public val MaterialDesignIcons.Rug: ImageVector
    get() {
        if (_rug != null) {
            return _rug!!
        }
        _rug = Builder(name = "Rug", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                curveTo(10.9f, 14.0f, 10.0f, 13.11f, 10.0f, 12.0f)
                reflectiveCurveTo(10.9f, 10.0f, 12.0f, 10.0f)
                reflectiveCurveTo(14.0f, 10.9f, 14.0f, 12.0f)
                reflectiveCurveTo(13.11f, 14.0f, 12.0f, 14.0f)
                moveTo(23.0f, 19.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(19.0f)
                moveTo(12.0f, 15.92f)
                curveTo(12.62f, 16.62f, 13.66f, 16.81f, 14.5f, 16.33f)
                curveTo(15.34f, 15.85f, 15.69f, 14.84f, 15.4f, 13.96f)
                curveTo(16.31f, 13.78f, 17.0f, 12.97f, 17.0f, 12.0f)
                reflectiveCurveTo(16.31f, 10.22f, 15.4f, 10.04f)
                curveTo(15.69f, 9.16f, 15.34f, 8.15f, 14.5f, 7.67f)
                curveTo(13.66f, 7.19f, 12.62f, 7.38f, 12.0f, 8.08f)
                curveTo(11.38f, 7.38f, 10.34f, 7.19f, 9.5f, 7.67f)
                curveTo(8.66f, 8.15f, 8.31f, 9.16f, 8.61f, 10.04f)
                curveTo(7.69f, 10.22f, 7.0f, 11.03f, 7.0f, 12.0f)
                reflectiveCurveTo(7.69f, 13.78f, 8.61f, 13.96f)
                curveTo(8.31f, 14.84f, 8.66f, 15.85f, 9.5f, 16.33f)
                curveTo(10.34f, 16.82f, 11.38f, 16.62f, 12.0f, 15.92f)
                close()
            }
        }
        .build()
        return _rug!!
    }

private var _rug: ImageVector? = null
