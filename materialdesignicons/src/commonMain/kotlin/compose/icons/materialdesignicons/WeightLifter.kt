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

public val MaterialDesignIcons.WeightLifter: ImageVector
    get() {
        if (_weightLifter != null) {
            return _weightLifter!!
        }
        _weightLifter = Builder(name = "WeightLifter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                curveTo(10.89f, 5.0f, 10.0f, 5.89f, 10.0f, 7.0f)
                reflectiveCurveTo(10.89f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveTo(14.0f, 8.11f, 14.0f, 7.0f)
                reflectiveCurveTo(13.11f, 5.0f, 12.0f, 5.0f)
                moveTo(22.0f, 1.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(22.0f)
                moveTo(15.0f, 11.26f)
                verticalLineTo(23.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.26f)
                curveTo(6.93f, 10.17f, 5.5f, 8.0f, 5.5f, 5.5f)
                lineTo(5.5f, 5.0f)
                horizontalLineTo(7.5f)
                lineTo(7.5f, 5.5f)
                curveTo(7.5f, 8.0f, 9.5f, 10.0f, 12.0f, 10.0f)
                reflectiveCurveTo(16.5f, 8.0f, 16.5f, 5.5f)
                lineTo(16.5f, 5.0f)
                horizontalLineTo(18.5f)
                lineTo(18.5f, 5.5f)
                curveTo(18.5f, 8.0f, 17.07f, 10.17f, 15.0f, 11.26f)
                close()
            }
        }
        .build()
        return _weightLifter!!
    }

private var _weightLifter: ImageVector? = null
