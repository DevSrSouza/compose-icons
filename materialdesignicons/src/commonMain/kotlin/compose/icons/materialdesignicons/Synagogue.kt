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

public val MaterialDesignIcons.Synagogue: ImageVector
    get() {
        if (_synagogue != null) {
            return _synagogue!!
        }
        _synagogue = Builder(name = "Synagogue", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 8.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(16.0f)
                curveTo(10.0f, 14.9f, 10.9f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveTo(14.0f, 14.9f, 14.0f, 16.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                lineTo(12.0f, 3.0f)
                lineTo(6.0f, 8.0f)
                moveTo(13.5f, 10.0f)
                curveTo(13.5f, 10.8f, 12.8f, 11.5f, 12.0f, 11.5f)
                reflectiveCurveTo(10.5f, 10.8f, 10.5f, 10.0f)
                reflectiveCurveTo(11.2f, 8.5f, 12.0f, 8.5f)
                reflectiveCurveTo(13.5f, 9.2f, 13.5f, 10.0f)
                moveTo(3.0f, 5.0f)
                curveTo(1.9f, 5.0f, 1.0f, 5.9f, 1.0f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                curveTo(5.0f, 5.9f, 4.1f, 5.0f, 3.0f, 5.0f)
                moveTo(1.0f, 9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(9.0f)
                moveTo(21.0f, 5.0f)
                curveTo(19.9f, 5.0f, 19.0f, 5.9f, 19.0f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(7.0f)
                curveTo(23.0f, 5.9f, 22.1f, 5.0f, 21.0f, 5.0f)
                moveTo(19.0f, 9.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _synagogue!!
    }

private var _synagogue: ImageVector? = null
