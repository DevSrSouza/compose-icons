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

public val MaterialDesignIcons.BasketPlusOutline: ImageVector
    get() {
        if (_basketPlusOutline != null) {
            return _basketPlusOutline!!
        }
        _basketPlusOutline = Builder(name = "BasketPlusOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                moveTo(12.0f, 13.0f)
                curveTo(10.9f, 13.0f, 10.0f, 13.9f, 10.0f, 15.0f)
                reflectiveCurveTo(10.9f, 17.0f, 12.0f, 17.0f)
                reflectiveCurveTo(14.0f, 16.1f, 14.0f, 15.0f)
                reflectiveCurveTo(13.1f, 13.0f, 12.0f, 13.0f)
                moveTo(13.35f, 21.0f)
                horizontalLineTo(5.5f)
                curveTo(4.58f, 21.0f, 3.81f, 20.38f, 3.58f, 19.54f)
                lineTo(1.04f, 10.27f)
                curveTo(1.0f, 10.18f, 1.0f, 10.09f, 1.0f, 10.0f)
                curveTo(1.0f, 9.45f, 1.45f, 9.0f, 2.0f, 9.0f)
                horizontalLineTo(6.79f)
                lineTo(11.17f, 2.45f)
                curveTo(11.36f, 2.16f, 11.68f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(12.64f, 2.16f, 12.83f, 2.44f)
                lineTo(17.21f, 9.0f)
                horizontalLineTo(22.0f)
                curveTo(22.55f, 9.0f, 23.0f, 9.45f, 23.0f, 10.0f)
                lineTo(22.97f, 10.27f)
                lineTo(22.0f, 13.81f)
                curveTo(21.43f, 13.5f, 20.79f, 13.24f, 20.12f, 13.11f)
                lineTo(20.7f, 11.0f)
                horizontalLineTo(3.31f)
                lineTo(5.5f, 19.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 19.7f, 13.13f, 20.37f, 13.35f, 21.0f)
                moveTo(9.2f, 9.0f)
                horizontalLineTo(14.8f)
                lineTo(12.0f, 4.8f)
                lineTo(9.2f, 9.0f)
                close()
            }
        }
        .build()
        return _basketPlusOutline!!
    }

private var _basketPlusOutline: ImageVector? = null
