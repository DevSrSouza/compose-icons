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

public val MaterialDesignIcons.Paragliding: ImageVector
    get() {
        if (_paragliding != null) {
            return _paragliding!!
        }
        _paragliding = Builder(name = "Paragliding", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                curveTo(10.9f, 17.0f, 10.0f, 16.11f, 10.0f, 15.0f)
                reflectiveCurveTo(10.9f, 13.0f, 12.0f, 13.0f)
                reflectiveCurveTo(14.0f, 13.9f, 14.0f, 15.0f)
                reflectiveCurveTo(13.11f, 17.0f, 12.0f, 17.0f)
                moveTo(19.0f, 14.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 16.76f, 14.76f, 19.0f, 12.0f, 19.0f)
                reflectiveCurveTo(7.0f, 16.76f, 7.0f, 14.0f)
                horizontalLineTo(5.0f)
                curveTo(5.0f, 16.79f, 6.64f, 19.19f, 9.0f, 20.32f)
                verticalLineTo(23.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.32f)
                curveTo(17.36f, 19.19f, 19.0f, 16.79f, 19.0f, 14.0f)
                moveTo(23.0f, 7.76f)
                curveTo(23.04f, 8.56f, 22.05f, 9.06f, 21.41f, 8.6f)
                curveTo(21.27f, 8.46f, 21.16f, 8.44f, 21.0f, 8.32f)
                lineTo(18.97f, 13.0f)
                horizontalLineTo(17.0f)
                lineTo(15.5f, 6.73f)
                curveTo(13.21f, 6.5f, 10.79f, 6.5f, 8.5f, 6.73f)
                lineTo(7.0f, 13.0f)
                horizontalLineTo(5.03f)
                lineTo(3.0f, 8.32f)
                curveTo(2.84f, 8.44f, 2.73f, 8.46f, 2.59f, 8.6f)
                curveTo(1.95f, 9.06f, 0.959f, 8.56f, 1.0f, 7.76f)
                verticalLineTo(4.0f)
                curveTo(1.0f, 4.0f, 1.0f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveTo(23.0f, 4.0f, 23.0f, 4.0f)
                moveTo(6.9f, 7.0f)
                curveTo(6.0f, 7.2f, 5.15f, 7.43f, 4.37f, 7.71f)
                lineTo(5.87f, 11.27f)
                lineTo(6.9f, 7.0f)
                moveTo(19.63f, 7.71f)
                curveTo(18.85f, 7.43f, 18.0f, 7.2f, 17.1f, 7.0f)
                lineTo(18.13f, 11.27f)
                lineTo(19.63f, 7.71f)
                close()
            }
        }
        .build()
        return _paragliding!!
    }

private var _paragliding: ImageVector? = null
