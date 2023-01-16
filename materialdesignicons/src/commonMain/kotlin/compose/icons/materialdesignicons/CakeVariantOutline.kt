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

public val MaterialDesignIcons.CakeVariantOutline: ImageVector
    get() {
        if (_cakeVariantOutline != null) {
            return _cakeVariantOutline!!
        }
        _cakeVariantOutline = Builder(name = "CakeVariantOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveTo(13.11f, 6.0f, 14.0f, 5.1f, 14.0f, 4.0f)
                curveTo(14.0f, 3.62f, 13.9f, 3.27f, 13.71f, 2.97f)
                lineTo(12.0f, 0.0f)
                lineTo(10.29f, 2.97f)
                curveTo(10.1f, 3.27f, 10.0f, 3.62f, 10.0f, 4.0f)
                curveTo(10.0f, 5.1f, 10.9f, 6.0f, 12.0f, 6.0f)
                moveTo(18.0f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                curveTo(4.34f, 9.0f, 3.0f, 10.34f, 3.0f, 12.0f)
                verticalLineTo(21.0f)
                curveTo(3.0f, 21.55f, 3.45f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(20.55f, 22.0f, 21.0f, 21.55f, 21.0f, 21.0f)
                verticalLineTo(12.0f)
                curveTo(21.0f, 10.34f, 19.66f, 9.0f, 18.0f, 9.0f)
                moveTo(19.0f, 20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                curveTo(5.9f, 17.0f, 6.76f, 16.63f, 7.4f, 16.0f)
                lineTo(8.5f, 14.92f)
                lineTo(9.56f, 16.0f)
                curveTo(10.87f, 17.3f, 13.15f, 17.29f, 14.45f, 16.0f)
                lineTo(15.53f, 14.92f)
                lineTo(16.6f, 16.0f)
                curveTo(17.24f, 16.63f, 18.1f, 17.0f, 19.0f, 17.0f)
                verticalLineTo(20.0f)
                moveTo(19.0f, 15.5f)
                curveTo(18.5f, 15.5f, 18.0f, 15.3f, 17.65f, 14.93f)
                lineTo(15.5f, 12.8f)
                lineTo(13.38f, 14.93f)
                curveTo(12.64f, 15.67f, 11.35f, 15.67f, 10.61f, 14.93f)
                lineTo(8.5f, 12.8f)
                lineTo(6.34f, 14.93f)
                curveTo(6.0f, 15.29f, 5.5f, 15.5f, 5.0f, 15.5f)
                verticalLineTo(12.0f)
                curveTo(5.0f, 11.45f, 5.45f, 11.0f, 6.0f, 11.0f)
                horizontalLineTo(18.0f)
                curveTo(18.55f, 11.0f, 19.0f, 11.45f, 19.0f, 12.0f)
                verticalLineTo(15.5f)
                close()
            }
        }
        .build()
        return _cakeVariantOutline!!
    }

private var _cakeVariantOutline: ImageVector? = null
