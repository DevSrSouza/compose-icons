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

public val MaterialDesignIcons.Clouds: ImageVector
    get() {
        if (_clouds != null) {
            return _clouds!!
        }
        _clouds = Builder(name = "Clouds", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.19f, 12.07f)
                curveTo(19.69f, 11.54f, 20.0f, 10.82f, 20.0f, 10.0f)
                curveTo(20.0f, 8.3f, 18.7f, 6.84f, 17.0f, 6.84f)
                horizontalLineTo(14.2f)
                curveTo(14.2f, 4.17f, 12.03f, 2.0f, 9.36f, 2.0f)
                curveTo(7.31f, 2.0f, 5.56f, 3.28f, 4.85f, 5.08f)
                curveTo(2.72f, 5.14f, 1.0f, 6.89f, 1.0f, 9.04f)
                curveTo(1.0f, 11.22f, 2.78f, 13.0f, 4.96f, 13.0f)
                horizontalLineTo(8.1f)
                curveTo(8.04f, 13.33f, 8.0f, 13.66f, 8.0f, 14.0f)
                horizontalLineTo(7.5f)
                curveTo(5.57f, 14.0f, 4.0f, 15.57f, 4.0f, 17.5f)
                reflectiveCurveTo(5.57f, 21.0f, 7.5f, 21.0f)
                horizontalLineTo(18.5f)
                curveTo(21.0f, 21.0f, 23.0f, 19.0f, 23.0f, 16.5f)
                curveTo(23.0f, 14.26f, 21.34f, 12.41f, 19.19f, 12.07f)
                moveTo(18.5f, 19.0f)
                horizontalLineTo(7.5f)
                curveTo(6.67f, 19.0f, 6.0f, 18.33f, 6.0f, 17.5f)
                reflectiveCurveTo(6.67f, 16.0f, 7.5f, 16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                curveTo(10.0f, 12.07f, 11.57f, 10.5f, 13.5f, 10.5f)
                reflectiveCurveTo(17.0f, 12.07f, 17.0f, 14.0f)
                horizontalLineTo(18.5f)
                curveTo(19.88f, 14.0f, 21.0f, 15.12f, 21.0f, 16.5f)
                reflectiveCurveTo(19.88f, 19.0f, 18.5f, 19.0f)
                close()
            }
        }
        .build()
        return _clouds!!
    }

private var _clouds: ImageVector? = null
