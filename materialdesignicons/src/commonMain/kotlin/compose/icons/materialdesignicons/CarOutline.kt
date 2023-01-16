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

public val MaterialDesignIcons.CarOutline: ImageVector
    get() {
        if (_carOutline != null) {
            return _carOutline!!
        }
        _carOutline = Builder(name = "CarOutline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9f, 6.0f)
                curveTo(18.7f, 5.4f, 18.1f, 5.0f, 17.5f, 5.0f)
                horizontalLineTo(6.5f)
                curveTo(5.8f, 5.0f, 5.3f, 5.4f, 5.1f, 6.0f)
                lineTo(3.0f, 12.0f)
                verticalLineTo(20.0f)
                curveTo(3.0f, 20.5f, 3.5f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(5.6f, 21.0f, 6.0f, 20.5f, 6.0f, 20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                curveTo(18.0f, 20.5f, 18.5f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5f, 21.0f, 21.0f, 20.5f, 21.0f, 20.0f)
                verticalLineTo(12.0f)
                lineTo(18.9f, 6.0f)
                moveTo(6.8f, 7.0f)
                horizontalLineTo(17.1f)
                lineTo(18.2f, 10.0f)
                horizontalLineTo(5.8f)
                lineTo(6.8f, 7.0f)
                moveTo(19.0f, 17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                moveTo(7.5f, 13.0f)
                curveTo(8.3f, 13.0f, 9.0f, 13.7f, 9.0f, 14.5f)
                reflectiveCurveTo(8.3f, 16.0f, 7.5f, 16.0f)
                reflectiveCurveTo(6.0f, 15.3f, 6.0f, 14.5f)
                reflectiveCurveTo(6.7f, 13.0f, 7.5f, 13.0f)
                moveTo(16.5f, 13.0f)
                curveTo(17.3f, 13.0f, 18.0f, 13.7f, 18.0f, 14.5f)
                reflectiveCurveTo(17.3f, 16.0f, 16.5f, 16.0f)
                curveTo(15.7f, 16.0f, 15.0f, 15.3f, 15.0f, 14.5f)
                reflectiveCurveTo(15.7f, 13.0f, 16.5f, 13.0f)
                close()
            }
        }
        .build()
        return _carOutline!!
    }

private var _carOutline: ImageVector? = null
