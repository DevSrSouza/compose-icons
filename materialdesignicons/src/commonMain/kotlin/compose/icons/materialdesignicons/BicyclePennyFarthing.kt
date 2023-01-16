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

public val MaterialDesignIcons.BicyclePennyFarthing: ImageVector
    get() {
        if (_bicyclePennyFarthing != null) {
            return _bicyclePennyFarthing!!
        }
        _bicyclePennyFarthing = Builder(name = "BicyclePennyFarthing", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 5.06f)
                verticalLineTo(2.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(5.04f)
                curveTo(12.71f, 5.11f, 11.94f, 5.27f, 11.2f, 5.5f)
                curveTo(11.03f, 5.2f, 10.72f, 5.0f, 10.36f, 5.0f)
                horizontalLineTo(7.0f)
                curveTo(6.45f, 5.0f, 6.0f, 5.45f, 6.0f, 6.0f)
                reflectiveCurveTo(6.45f, 7.0f, 7.0f, 7.0f)
                horizontalLineTo(8.05f)
                curveTo(5.09f, 9.0f, 3.12f, 12.36f, 3.0f, 16.18f)
                curveTo(1.85f, 16.59f, 1.0f, 17.69f, 1.0f, 19.0f)
                curveTo(1.0f, 20.66f, 2.34f, 22.0f, 4.0f, 22.0f)
                reflectiveCurveTo(7.0f, 20.66f, 7.0f, 19.0f)
                curveTo(7.0f, 17.7f, 6.17f, 16.61f, 5.0f, 16.19f)
                curveTo(5.07f, 14.67f, 5.46f, 13.25f, 6.14f, 12.0f)
                curveTo(6.05f, 12.5f, 6.0f, 13.0f, 6.0f, 13.5f)
                curveTo(6.0f, 18.19f, 9.81f, 22.0f, 14.5f, 22.0f)
                curveTo(19.19f, 22.0f, 23.0f, 18.19f, 23.0f, 13.5f)
                curveTo(23.0f, 9.14f, 19.72f, 5.56f, 15.5f, 5.06f)
                moveTo(4.0f, 20.0f)
                curveTo(3.45f, 20.0f, 3.0f, 19.55f, 3.0f, 19.0f)
                reflectiveCurveTo(3.45f, 18.0f, 4.0f, 18.0f)
                reflectiveCurveTo(5.0f, 18.45f, 5.0f, 19.0f)
                reflectiveCurveTo(4.55f, 20.0f, 4.0f, 20.0f)
                moveTo(14.5f, 20.0f)
                curveTo(10.92f, 20.0f, 8.0f, 17.08f, 8.0f, 13.5f)
                curveTo(8.0f, 10.26f, 10.39f, 7.57f, 13.5f, 7.09f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(7.09f)
                curveTo(18.61f, 7.57f, 21.0f, 10.26f, 21.0f, 13.5f)
                curveTo(21.0f, 17.08f, 18.08f, 20.0f, 14.5f, 20.0f)
                close()
            }
        }
        .build()
        return _bicyclePennyFarthing!!
    }

private var _bicyclePennyFarthing: ImageVector? = null
