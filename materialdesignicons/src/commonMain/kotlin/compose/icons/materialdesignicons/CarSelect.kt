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

public val MaterialDesignIcons.CarSelect: ImageVector
    get() {
        if (_carSelect != null) {
            return _carSelect!!
        }
        _carSelect = Builder(name = "CarSelect", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 13.0f)
                lineTo(6.5f, 8.5f)
                horizontalLineTo(17.5f)
                lineTo(19.0f, 13.0f)
                moveTo(17.5f, 18.0f)
                curveTo(16.7f, 18.0f, 16.0f, 17.3f, 16.0f, 16.5f)
                reflectiveCurveTo(16.7f, 15.0f, 17.5f, 15.0f)
                reflectiveCurveTo(19.0f, 15.7f, 19.0f, 16.5f)
                reflectiveCurveTo(18.3f, 18.0f, 17.5f, 18.0f)
                moveTo(6.5f, 18.0f)
                curveTo(5.7f, 18.0f, 5.0f, 17.3f, 5.0f, 16.5f)
                reflectiveCurveTo(5.7f, 15.0f, 6.5f, 15.0f)
                reflectiveCurveTo(8.0f, 15.7f, 8.0f, 16.5f)
                reflectiveCurveTo(7.3f, 18.0f, 6.5f, 18.0f)
                moveTo(18.9f, 8.0f)
                curveTo(18.7f, 7.4f, 18.1f, 7.0f, 17.5f, 7.0f)
                horizontalLineTo(6.5f)
                curveTo(5.8f, 7.0f, 5.3f, 7.4f, 5.1f, 8.0f)
                lineTo(3.0f, 14.0f)
                verticalLineTo(22.0f)
                curveTo(3.0f, 22.6f, 3.4f, 23.0f, 4.0f, 23.0f)
                horizontalLineTo(5.0f)
                curveTo(5.6f, 23.0f, 6.0f, 22.6f, 6.0f, 22.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                curveTo(18.0f, 22.6f, 18.4f, 23.0f, 19.0f, 23.0f)
                horizontalLineTo(20.0f)
                curveTo(20.6f, 23.0f, 21.0f, 22.6f, 21.0f, 22.0f)
                verticalLineTo(14.0f)
                moveTo(8.0f, 1.0f)
                lineTo(12.0f, 5.5f)
                lineTo(16.0f, 1.0f)
                close()
            }
        }
        .build()
        return _carSelect!!
    }

private var _carSelect: ImageVector? = null
