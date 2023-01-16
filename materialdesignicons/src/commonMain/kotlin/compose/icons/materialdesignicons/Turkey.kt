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

public val MaterialDesignIcons.Turkey: ImageVector
    get() {
        if (_turkey != null) {
            return _turkey!!
        }
        _turkey = Builder(name = "Turkey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 19.44f)
                curveTo(9.75f, 19.8f, 8.9f, 20.0f, 8.0f, 20.0f)
                curveTo(4.69f, 20.0f, 2.0f, 17.31f, 2.0f, 14.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 5.69f, 4.69f, 3.0f, 8.0f, 3.0f)
                lineTo(10.5f, 7.58f)
                curveTo(8.1f, 8.81f, 6.5f, 11.0f, 6.5f, 13.5f)
                curveTo(6.5f, 16.0f, 8.11f, 18.2f, 10.5f, 19.44f)
                moveTo(16.0f, 18.94f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                curveTo(17.55f, 20.0f, 18.0f, 20.45f, 18.0f, 21.0f)
                reflectiveCurveTo(17.55f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(13.45f, 22.0f, 13.0f, 21.55f, 13.0f, 21.0f)
                reflectiveCurveTo(13.45f, 20.0f, 14.0f, 20.0f)
                verticalLineTo(18.94f)
                curveTo(10.61f, 18.56f, 8.0f, 16.27f, 8.0f, 13.5f)
                curveTo(8.0f, 10.46f, 11.13f, 8.0f, 15.0f, 8.0f)
                curveTo(15.19f, 8.0f, 15.37f, 8.0f, 15.56f, 8.0f)
                curveTo(14.84f, 6.63f, 14.0f, 5.23f, 14.0f, 4.0f)
                curveTo(14.0f, 2.9f, 14.9f, 2.0f, 16.0f, 2.0f)
                curveTo(18.21f, 2.0f, 20.0f, 3.79f, 20.0f, 6.0f)
                horizontalLineTo(18.0f)
                curveTo(18.0f, 6.0f, 22.0f, 9.0f, 22.0f, 13.5f)
                curveTo(22.0f, 16.27f, 19.39f, 18.56f, 16.0f, 18.94f)
                moveTo(16.0f, 4.0f)
                curveTo(16.0f, 4.55f, 16.45f, 5.0f, 17.0f, 5.0f)
                reflectiveCurveTo(18.0f, 4.55f, 18.0f, 4.0f)
                reflectiveCurveTo(17.55f, 3.0f, 17.0f, 3.0f)
                reflectiveCurveTo(16.0f, 3.45f, 16.0f, 4.0f)
                moveTo(17.0f, 12.0f)
                curveTo(17.0f, 10.9f, 16.11f, 10.0f, 15.0f, 10.0f)
                curveTo(12.79f, 10.0f, 11.0f, 11.79f, 11.0f, 14.0f)
                horizontalLineTo(15.0f)
                curveTo(16.11f, 14.0f, 17.0f, 13.11f, 17.0f, 12.0f)
                close()
            }
        }
        .build()
        return _turkey!!
    }

private var _turkey: ImageVector? = null
