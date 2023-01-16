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

public val MaterialDesignIcons.Atv: ImageVector
    get() {
        if (_atv != null) {
            return _atv!!
        }
        _atv = Builder(name = "Atv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 11.0f)
                curveTo(19.8f, 11.0f, 19.6f, 11.0f, 19.5f, 11.1f)
                lineTo(17.4f, 9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                lineTo(16.3f, 7.9f)
                lineTo(13.4f, 5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.6f)
                lineTo(14.6f, 9.0f)
                horizontalLineTo(11.0f)
                lineTo(7.0f, 11.0f)
                lineTo(5.0f, 9.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                curveTo(1.8f, 11.0f, 0.0f, 12.8f, 0.0f, 15.0f)
                reflectiveCurveTo(1.8f, 19.0f, 4.0f, 19.0f)
                reflectiveCurveTo(8.0f, 17.2f, 8.0f, 15.0f)
                lineTo(10.0f, 17.0f)
                horizontalLineTo(13.0f)
                lineTo(16.5f, 10.9f)
                lineTo(17.5f, 11.9f)
                curveTo(16.6f, 12.6f, 16.0f, 13.8f, 16.0f, 15.0f)
                curveTo(16.0f, 17.2f, 17.8f, 19.0f, 20.0f, 19.0f)
                reflectiveCurveTo(24.0f, 17.2f, 24.0f, 15.0f)
                reflectiveCurveTo(22.2f, 11.0f, 20.0f, 11.0f)
                moveTo(4.0f, 17.0f)
                curveTo(2.9f, 17.0f, 2.0f, 16.1f, 2.0f, 15.0f)
                reflectiveCurveTo(2.9f, 13.0f, 4.0f, 13.0f)
                reflectiveCurveTo(6.0f, 13.9f, 6.0f, 15.0f)
                reflectiveCurveTo(5.1f, 17.0f, 4.0f, 17.0f)
                moveTo(20.0f, 17.0f)
                curveTo(18.9f, 17.0f, 18.0f, 16.1f, 18.0f, 15.0f)
                reflectiveCurveTo(18.9f, 13.0f, 20.0f, 13.0f)
                reflectiveCurveTo(22.0f, 13.9f, 22.0f, 15.0f)
                reflectiveCurveTo(21.1f, 17.0f, 20.0f, 17.0f)
                close()
            }
        }
        .build()
        return _atv!!
    }

private var _atv: ImageVector? = null
