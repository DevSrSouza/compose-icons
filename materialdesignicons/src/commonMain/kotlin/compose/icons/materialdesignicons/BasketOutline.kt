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

public val MaterialDesignIcons.BasketOutline: ImageVector
    get() {
        if (_basketOutline != null) {
            return _basketOutline!!
        }
        _basketOutline = Builder(name = "BasketOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
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
                horizontalLineTo(18.5f)
                curveTo(19.42f, 21.0f, 20.19f, 20.38f, 20.43f, 19.54f)
                lineTo(22.97f, 10.27f)
                lineTo(23.0f, 10.0f)
                curveTo(23.0f, 9.45f, 22.55f, 9.0f, 22.0f, 9.0f)
                moveTo(12.0f, 4.8f)
                lineTo(14.8f, 9.0f)
                horizontalLineTo(9.2f)
                lineTo(12.0f, 4.8f)
                moveTo(18.5f, 19.0f)
                lineTo(5.5f, 19.0f)
                lineTo(3.31f, 11.0f)
                horizontalLineTo(20.7f)
                lineTo(18.5f, 19.0f)
                moveTo(12.0f, 13.0f)
                curveTo(10.9f, 13.0f, 10.0f, 13.9f, 10.0f, 15.0f)
                reflectiveCurveTo(10.9f, 17.0f, 12.0f, 17.0f)
                reflectiveCurveTo(14.0f, 16.1f, 14.0f, 15.0f)
                reflectiveCurveTo(13.1f, 13.0f, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _basketOutline!!
    }

private var _basketOutline: ImageVector? = null
