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

public val MaterialDesignIcons.BasketCheckOutline: ImageVector
    get() {
        if (_basketCheckOutline != null) {
            return _basketCheckOutline!!
        }
        _basketCheckOutline = Builder(name = "BasketCheckOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.63f, 16.27f)
                lineTo(17.76f, 20.17f)
                lineTo(16.41f, 18.8f)
                lineTo(15.0f, 20.22f)
                lineTo(17.75f, 23.0f)
                lineTo(23.03f, 17.68f)
                lineTo(21.63f, 16.27f)
                moveTo(14.0f, 15.0f)
                curveTo(14.0f, 16.1f, 13.1f, 17.0f, 12.0f, 17.0f)
                reflectiveCurveTo(10.0f, 16.1f, 10.0f, 15.0f)
                reflectiveCurveTo(10.9f, 13.0f, 12.0f, 13.0f)
                reflectiveCurveTo(14.0f, 13.9f, 14.0f, 15.0f)
                moveTo(13.0f, 20.0f)
                curveTo(13.0f, 19.66f, 13.04f, 19.33f, 13.09f, 19.0f)
                horizontalLineTo(5.5f)
                lineTo(3.31f, 11.0f)
                horizontalLineTo(20.7f)
                lineTo(19.86f, 14.07f)
                curveTo(20.54f, 14.17f, 21.18f, 14.37f, 21.76f, 14.68f)
                lineTo(22.97f, 10.27f)
                lineTo(23.0f, 10.0f)
                curveTo(23.0f, 9.45f, 22.55f, 9.0f, 22.0f, 9.0f)
                horizontalLineTo(17.21f)
                lineTo(12.83f, 2.44f)
                curveTo(12.64f, 2.16f, 12.32f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(11.36f, 2.16f, 11.17f, 2.45f)
                lineTo(6.79f, 9.0f)
                horizontalLineTo(2.0f)
                curveTo(1.45f, 9.0f, 1.0f, 9.45f, 1.0f, 10.0f)
                curveTo(1.0f, 10.09f, 1.0f, 10.18f, 1.04f, 10.27f)
                lineTo(3.58f, 19.54f)
                curveTo(3.81f, 20.38f, 4.58f, 21.0f, 5.5f, 21.0f)
                horizontalLineTo(13.09f)
                curveTo(13.04f, 20.67f, 13.0f, 20.34f, 13.0f, 20.0f)
                moveTo(12.0f, 4.8f)
                lineTo(14.8f, 9.0f)
                horizontalLineTo(9.2f)
                lineTo(12.0f, 4.8f)
                close()
            }
        }
        .build()
        return _basketCheckOutline!!
    }

private var _basketCheckOutline: ImageVector? = null
