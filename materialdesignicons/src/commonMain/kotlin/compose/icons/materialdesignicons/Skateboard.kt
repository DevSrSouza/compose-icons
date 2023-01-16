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

public val MaterialDesignIcons.Skateboard: ImageVector
    get() {
        if (_skateboard != null) {
            return _skateboard!!
        }
        _skateboard = Builder(name = "Skateboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 14.5f)
                curveTo(9.0f, 15.33f, 8.33f, 16.0f, 7.5f, 16.0f)
                reflectiveCurveTo(6.0f, 15.33f, 6.0f, 14.5f)
                reflectiveCurveTo(6.67f, 13.0f, 7.5f, 13.0f)
                reflectiveCurveTo(9.0f, 13.67f, 9.0f, 14.5f)
                moveTo(16.5f, 13.0f)
                curveTo(15.67f, 13.0f, 15.0f, 13.67f, 15.0f, 14.5f)
                reflectiveCurveTo(15.67f, 16.0f, 16.5f, 16.0f)
                curveTo(17.33f, 16.0f, 18.0f, 15.33f, 18.0f, 14.5f)
                reflectiveCurveTo(17.33f, 13.0f, 16.5f, 13.0f)
                moveTo(21.59f, 9.19f)
                curveTo(21.14f, 8.87f, 20.5f, 8.97f, 20.19f, 9.41f)
                lineTo(20.06f, 9.59f)
                curveTo(19.88f, 9.85f, 19.57f, 10.0f, 19.26f, 10.0f)
                lineTo(4.74f, 10.0f)
                curveTo(4.43f, 10.0f, 4.13f, 9.85f, 3.94f, 9.59f)
                lineTo(3.81f, 9.41f)
                curveTo(3.5f, 8.97f, 2.86f, 8.87f, 2.41f, 9.19f)
                curveTo(1.96f, 9.5f, 1.87f, 10.15f, 2.19f, 10.59f)
                lineTo(2.32f, 10.77f)
                curveTo(2.88f, 11.54f, 3.79f, 12.0f, 4.74f, 12.0f)
                horizontalLineTo(19.26f)
                curveTo(20.21f, 12.0f, 21.12f, 11.54f, 21.68f, 10.77f)
                lineTo(21.81f, 10.59f)
                curveTo(22.13f, 10.15f, 22.04f, 9.5f, 21.59f, 9.19f)
                close()
            }
        }
        .build()
        return _skateboard!!
    }

private var _skateboard: ImageVector? = null
