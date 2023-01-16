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

public val MaterialDesignIcons.BasketOffOutline: ImageVector
    get() {
        if (_basketOffOutline != null) {
            return _basketOffOutline!!
        }
        _basketOffOutline = Builder(name = "BasketOffOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(6.92f, 8.81f)
                lineTo(6.79f, 9.0f)
                horizontalLineTo(2.0f)
                curveTo(1.45f, 9.0f, 1.0f, 9.45f, 1.0f, 10.0f)
                curveTo(1.0f, 10.09f, 1.0f, 10.18f, 1.04f, 10.27f)
                lineTo(3.58f, 19.54f)
                curveTo(3.81f, 20.38f, 4.58f, 21.0f, 5.5f, 21.0f)
                horizontalLineTo(18.5f)
                curveTo(18.68f, 21.0f, 18.86f, 20.96f, 19.03f, 20.92f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(5.5f, 19.0f)
                lineTo(3.31f, 11.0f)
                horizontalLineTo(9.11f)
                lineTo(11.26f, 13.15f)
                curveTo(10.5f, 13.44f, 10.0f, 14.16f, 10.0f, 15.0f)
                curveTo(10.0f, 16.1f, 10.9f, 17.0f, 12.0f, 17.0f)
                curveTo(12.84f, 17.0f, 13.56f, 16.5f, 13.85f, 15.74f)
                lineTo(17.11f, 19.0f)
                horizontalLineTo(5.5f)
                moveTo(23.0f, 10.0f)
                lineTo(22.97f, 10.27f)
                lineTo(20.93f, 17.73f)
                lineTo(19.3f, 16.1f)
                lineTo(20.7f, 11.0f)
                horizontalLineTo(14.2f)
                lineTo(12.2f, 9.0f)
                horizontalLineTo(14.8f)
                lineTo(12.0f, 4.8f)
                lineTo(10.4f, 7.2f)
                lineTo(8.96f, 5.76f)
                lineTo(11.17f, 2.45f)
                curveTo(11.36f, 2.16f, 11.68f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(12.64f, 2.16f, 12.83f, 2.44f)
                lineTo(17.21f, 9.0f)
                horizontalLineTo(22.0f)
                curveTo(22.55f, 9.0f, 23.0f, 9.45f, 23.0f, 10.0f)
                close()
            }
        }
        .build()
        return _basketOffOutline!!
    }

private var _basketOffOutline: ImageVector? = null
