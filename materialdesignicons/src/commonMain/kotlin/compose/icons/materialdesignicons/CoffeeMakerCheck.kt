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

public val MaterialDesignIcons.CoffeeMakerCheck: ImageVector
    get() {
        if (_coffeeMakerCheck != null) {
            return _coffeeMakerCheck!!
        }
        _coffeeMakerCheck = Builder(name = "CoffeeMakerCheck", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 21.16f)
                lineTo(15.0f, 18.16f)
                lineTo(16.16f, 17.0f)
                lineTo(17.75f, 18.59f)
                lineTo(21.34f, 15.0f)
                lineTo(22.5f, 16.41f)
                lineTo(17.75f, 21.16f)
                moveTo(13.0f, 18.0f)
                curveTo(13.0f, 15.78f, 14.21f, 13.85f, 16.0f, 12.81f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.0f)
                curveTo(6.0f, 17.64f, 6.81f, 19.09f, 8.03f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                curveTo(6.0f, 6.55f, 6.45f, 7.0f, 7.0f, 7.0f)
                horizontalLineTo(15.0f)
                curveTo(15.55f, 7.0f, 16.0f, 6.55f, 16.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.1f, 2.9f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(14.54f)
                curveTo(13.58f, 20.94f, 13.0f, 19.54f, 13.0f, 18.0f)
                moveTo(10.0f, 9.0f)
                curveTo(10.0f, 9.55f, 10.45f, 10.0f, 11.0f, 10.0f)
                reflectiveCurveTo(12.0f, 9.55f, 12.0f, 9.0f)
                reflectiveCurveTo(11.55f, 8.0f, 11.0f, 8.0f)
                reflectiveCurveTo(10.0f, 8.45f, 10.0f, 9.0f)
                close()
            }
        }
        .build()
        return _coffeeMakerCheck!!
    }

private var _coffeeMakerCheck: ImageVector? = null
