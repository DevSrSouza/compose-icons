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

public val MaterialDesignIcons.SharkFinOutline: ImageVector
    get() {
        if (_sharkFinOutline != null) {
            return _sharkFinOutline!!
        }
        _sharkFinOutline = Builder(name = "SharkFinOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                curveTo(18.6f, 18.0f, 17.2f, 17.6f, 16.0f, 17.0f)
                curveTo(13.5f, 18.3f, 10.5f, 18.3f, 8.0f, 17.0f)
                curveTo(6.8f, 17.6f, 5.4f, 18.0f, 4.0f, 18.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                curveTo(5.4f, 16.0f, 6.8f, 15.5f, 8.0f, 14.7f)
                curveTo(10.4f, 16.4f, 13.6f, 16.4f, 16.0f, 14.7f)
                curveTo(17.2f, 15.5f, 18.6f, 16.0f, 20.0f, 16.0f)
                horizontalLineTo(22.0f)
                moveTo(5.28f, 13.79f)
                curveTo(5.82f, 13.63f, 6.37f, 13.38f, 6.89f, 13.04f)
                lineTo(8.0f, 12.28f)
                curveTo(8.69f, 10.0f, 8.78f, 7.27f, 7.59f, 4.14f)
                curveTo(11.95f, 4.89f, 15.89f, 8.65f, 17.37f, 13.19f)
                curveTo(18.12f, 13.64f, 18.91f, 13.91f, 19.66f, 13.97f)
                curveTo(18.24f, 7.4f, 12.37f, 2.0f, 6.0f, 2.0f)
                curveTo(5.65f, 2.0f, 5.33f, 2.18f, 5.15f, 2.47f)
                curveTo(4.97f, 2.77f, 4.95f, 3.14f, 5.11f, 3.45f)
                curveTo(7.28f, 7.79f, 6.61f, 11.29f, 5.28f, 13.79f)
                moveTo(16.0f, 18.7f)
                curveTo(13.6f, 20.4f, 10.4f, 20.4f, 8.0f, 18.7f)
                curveTo(6.8f, 19.5f, 5.4f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                curveTo(5.4f, 22.0f, 6.8f, 21.6f, 8.0f, 21.0f)
                curveTo(10.5f, 22.3f, 13.5f, 22.3f, 16.0f, 21.0f)
                curveTo(17.2f, 21.6f, 18.6f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                curveTo(18.6f, 20.0f, 17.2f, 19.5f, 16.0f, 18.7f)
                close()
            }
        }
        .build()
        return _sharkFinOutline!!
    }

private var _sharkFinOutline: ImageVector? = null
