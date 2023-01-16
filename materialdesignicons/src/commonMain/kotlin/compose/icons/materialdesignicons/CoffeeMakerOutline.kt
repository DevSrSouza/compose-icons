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

public val MaterialDesignIcons.CoffeeMakerOutline: ImageVector
    get() {
        if (_coffeeMakerOutline != null) {
            return _coffeeMakerOutline!!
        }
        _coffeeMakerOutline = Builder(name = "CoffeeMakerOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.1f, 4.9f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.97f)
                curveTo(17.2f, 19.09f, 18.0f, 17.64f, 18.0f, 16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                curveTo(8.0f, 17.64f, 8.81f, 19.09f, 10.03f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                curveTo(8.0f, 6.55f, 8.45f, 7.0f, 9.0f, 7.0f)
                horizontalLineTo(17.0f)
                curveTo(17.55f, 7.0f, 18.0f, 6.55f, 18.0f, 6.0f)
                moveTo(10.0f, 16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                curveTo(16.0f, 17.65f, 14.65f, 19.0f, 13.0f, 19.0f)
                reflectiveCurveTo(10.0f, 17.65f, 10.0f, 16.0f)
                moveTo(13.0f, 8.0f)
                curveTo(13.55f, 8.0f, 14.0f, 8.45f, 14.0f, 9.0f)
                reflectiveCurveTo(13.55f, 10.0f, 13.0f, 10.0f)
                reflectiveCurveTo(12.0f, 9.55f, 12.0f, 9.0f)
                reflectiveCurveTo(12.45f, 8.0f, 13.0f, 8.0f)
                close()
            }
        }
        .build()
        return _coffeeMakerOutline!!
    }

private var _coffeeMakerOutline: ImageVector? = null
