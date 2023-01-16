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

public val MaterialDesignIcons.Fountain: ImageVector
    get() {
        if (_fountain != null) {
            return _fountain!!
        }
        _fountain = Builder(name = "Fountain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 2.0f)
                curveTo(4.47f, 2.0f, 2.0f, 4.46f, 2.0f, 7.5f)
                verticalLineTo(7.5f)
                lineTo(2.0f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 7.5f, 4.0f)
                curveTo(9.0f, 4.0f, 10.26f, 4.93f, 10.76f, 6.24f)
                curveTo(10.37f, 6.08f, 9.95f, 6.0f, 9.5f, 6.0f)
                curveTo(8.11f, 6.0f, 6.9f, 6.82f, 6.34f, 8.0f)
                lineTo(8.08f, 9.0f)
                curveTo(8.29f, 8.42f, 8.85f, 8.0f, 9.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.0f, 9.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 8.0f)
                curveTo(15.16f, 8.0f, 15.71f, 8.42f, 15.92f, 9.0f)
                lineTo(17.66f, 8.0f)
                curveTo(17.1f, 6.82f, 15.9f, 6.0f, 14.5f, 6.0f)
                curveTo(14.05f, 6.0f, 13.63f, 6.08f, 13.24f, 6.24f)
                curveTo(13.74f, 4.93f, 15.0f, 4.0f, 16.5f, 4.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 20.0f, 7.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(22.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 16.5f, 2.0f)
                curveTo(14.64f, 2.0f, 13.0f, 2.93f, 12.0f, 4.34f)
                curveTo(11.0f, 2.93f, 9.36f, 2.0f, 7.5f, 2.0f)
                moveTo(6.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.42f)
                curveTo(7.92f, 15.15f, 8.85f, 16.07f, 10.0f, 16.57f)
                curveTo(10.0f, 17.38f, 10.0f, 18.19f, 10.0f, 19.0f)
                horizontalLineTo(2.0f)
                curveTo(2.0f, 19.0f, 2.82f, 20.23f, 3.41f, 21.11f)
                curveTo(3.78f, 21.67f, 4.4f, 22.0f, 5.07f, 22.0f)
                horizontalLineTo(18.93f)
                curveTo(19.6f, 22.0f, 20.22f, 21.67f, 20.59f, 21.11f)
                lineTo(22.0f, 19.0f)
                horizontalLineTo(14.0f)
                curveTo(14.0f, 18.19f, 14.0f, 17.38f, 14.0f, 16.57f)
                curveTo(15.15f, 16.07f, 16.08f, 15.15f, 16.58f, 14.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _fountain!!
    }

private var _fountain: ImageVector? = null
