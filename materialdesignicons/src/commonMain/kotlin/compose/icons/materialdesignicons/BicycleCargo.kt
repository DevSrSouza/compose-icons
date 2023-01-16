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

public val MaterialDesignIcons.BicycleCargo: ImageVector
    get() {
        if (_bicycleCargo != null) {
            return _bicycleCargo!!
        }
        _bicycleCargo = Builder(name = "BicycleCargo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.5f)
                verticalLineTo(10.0f)
                lineTo(13.5f, 9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.5f)
                horizontalLineTo(12.0f)
                verticalLineTo(14.3f)
                horizontalLineTo(11.0f)
                lineTo(9.0f, 10.0f)
                curveTo(9.3f, 9.9f, 9.5f, 9.6f, 9.5f, 9.3f)
                curveTo(9.5f, 8.9f, 9.2f, 8.5f, 8.8f, 8.5f)
                horizontalLineTo(6.8f)
                curveTo(6.3f, 8.5f, 6.0f, 8.8f, 6.0f, 9.2f)
                reflectiveCurveTo(6.3f, 10.0f, 6.8f, 10.0f)
                horizontalLineTo(7.4f)
                lineTo(9.4f, 14.2f)
                horizontalLineTo(7.9f)
                curveTo(7.6f, 12.4f, 6.0f, 11.0f, 4.0f, 11.0f)
                curveTo(1.8f, 11.0f, 0.0f, 12.8f, 0.0f, 15.0f)
                reflectiveCurveTo(1.8f, 19.0f, 4.0f, 19.0f)
                curveTo(6.0f, 19.0f, 7.6f, 17.6f, 7.9f, 15.8f)
                horizontalLineTo(16.5f)
                curveTo(16.7f, 13.4f, 18.6f, 11.5f, 21.0f, 11.5f)
                moveTo(6.4f, 15.8f)
                curveTo(6.1f, 16.8f, 5.1f, 17.6f, 4.0f, 17.6f)
                curveTo(2.6f, 17.6f, 1.5f, 16.5f, 1.5f, 15.1f)
                reflectiveCurveTo(2.6f, 12.6f, 4.0f, 12.6f)
                curveTo(5.1f, 12.6f, 6.1f, 13.3f, 6.4f, 14.4f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.9f)
                horizontalLineTo(6.4f)
                moveTo(21.0f, 13.0f)
                curveTo(19.3f, 13.0f, 18.0f, 14.3f, 18.0f, 16.0f)
                reflectiveCurveTo(19.3f, 19.0f, 21.0f, 19.0f)
                reflectiveCurveTo(24.0f, 17.7f, 24.0f, 16.0f)
                reflectiveCurveTo(22.7f, 13.0f, 21.0f, 13.0f)
                moveTo(21.0f, 17.5f)
                curveTo(20.2f, 17.5f, 19.5f, 16.8f, 19.5f, 16.0f)
                reflectiveCurveTo(20.2f, 14.5f, 21.0f, 14.5f)
                reflectiveCurveTo(22.5f, 15.2f, 22.5f, 16.0f)
                reflectiveCurveTo(21.8f, 17.5f, 21.0f, 17.5f)
                close()
            }
        }
        .build()
        return _bicycleCargo!!
    }

private var _bicycleCargo: ImageVector? = null
