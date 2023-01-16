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

public val MaterialDesignIcons.CakeVariant: ImageVector
    get() {
        if (_cakeVariant != null) {
            return _cakeVariant!!
        }
        _cakeVariant = Builder(name = "CakeVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveTo(13.11f, 6.0f, 14.0f, 5.1f, 14.0f, 4.0f)
                curveTo(14.0f, 3.62f, 13.9f, 3.27f, 13.71f, 2.97f)
                lineTo(12.0f, 0.0f)
                lineTo(10.29f, 2.97f)
                curveTo(10.1f, 3.27f, 10.0f, 3.62f, 10.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 6.0f)
                moveTo(16.6f, 16.0f)
                lineTo(15.53f, 14.92f)
                lineTo(14.45f, 16.0f)
                curveTo(13.15f, 17.29f, 10.87f, 17.3f, 9.56f, 16.0f)
                lineTo(8.5f, 14.92f)
                lineTo(7.4f, 16.0f)
                curveTo(6.75f, 16.64f, 5.88f, 17.0f, 4.96f, 17.0f)
                curveTo(4.23f, 17.0f, 3.56f, 16.77f, 3.0f, 16.39f)
                verticalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 21.0f)
                verticalLineTo(16.39f)
                curveTo(20.44f, 16.77f, 19.77f, 17.0f, 19.04f, 17.0f)
                curveTo(18.12f, 17.0f, 17.25f, 16.64f, 16.6f, 16.0f)
                moveTo(18.0f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.0f, 12.0f)
                verticalLineTo(13.54f)
                curveTo(3.0f, 14.62f, 3.88f, 15.5f, 4.96f, 15.5f)
                curveTo(5.5f, 15.5f, 6.0f, 15.3f, 6.34f, 14.93f)
                lineTo(8.5f, 12.8f)
                lineTo(10.61f, 14.93f)
                curveTo(11.35f, 15.67f, 12.64f, 15.67f, 13.38f, 14.93f)
                lineTo(15.5f, 12.8f)
                lineTo(17.65f, 14.93f)
                curveTo(18.0f, 15.3f, 18.5f, 15.5f, 19.03f, 15.5f)
                curveTo(20.11f, 15.5f, 21.0f, 14.62f, 21.0f, 13.54f)
                verticalLineTo(12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 18.0f, 9.0f)
                close()
            }
        }
        .build()
        return _cakeVariant!!
    }

private var _cakeVariant: ImageVector? = null
