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

public val MaterialDesignIcons.EarthOff: ImageVector
    get() {
        if (_earthOff != null) {
            return _earthOff!!
        }
        _earthOff = Builder(name = "EarthOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 5.27f)
                lineTo(20.5f, 6.75f)
                curveTo(21.46f, 8.28f, 22.0f, 10.07f, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                curveTo(10.08f, 22.0f, 8.28f, 21.46f, 6.75f, 20.5f)
                lineTo(5.27f, 22.0f)
                lineTo(4.0f, 20.72f)
                lineTo(20.72f, 4.0f)
                lineTo(22.0f, 5.27f)
                moveTo(17.9f, 17.39f)
                curveTo(19.2f, 15.97f, 20.0f, 14.08f, 20.0f, 12.0f)
                curveTo(20.0f, 10.63f, 19.66f, 9.34f, 19.05f, 8.22f)
                lineTo(14.83f, 12.44f)
                curveTo(14.94f, 12.6f, 15.0f, 12.79f, 15.0f, 13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                curveTo(16.89f, 16.0f, 17.64f, 16.59f, 17.9f, 17.39f)
                moveTo(11.0f, 19.93f)
                verticalLineTo(18.0f)
                curveTo(10.5f, 18.0f, 10.07f, 17.83f, 9.73f, 17.54f)
                lineTo(8.22f, 19.05f)
                curveTo(9.07f, 19.5f, 10.0f, 19.8f, 11.0f, 19.93f)
                moveTo(15.0f, 4.59f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.18f)
                lineTo(8.09f, 14.09f)
                lineTo(4.21f, 10.21f)
                curveTo(4.08f, 10.78f, 4.0f, 11.38f, 4.0f, 12.0f)
                curveTo(4.0f, 13.74f, 4.56f, 15.36f, 5.5f, 16.67f)
                lineTo(4.08f, 18.1f)
                curveTo(2.77f, 16.41f, 2.0f, 14.3f, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                curveTo(14.3f, 2.0f, 16.41f, 2.77f, 18.1f, 4.08f)
                lineTo(16.67f, 5.5f)
                curveTo(16.16f, 5.14f, 15.6f, 4.83f, 15.0f, 4.59f)
                close()
            }
        }
        .build()
        return _earthOff!!
    }

private var _earthOff: ImageVector? = null
