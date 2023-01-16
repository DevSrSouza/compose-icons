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

public val MaterialDesignIcons.MouseOff: ImageVector
    get() {
        if (_mouseOff != null) {
            return _mouseOff!!
        }
        _mouseOff = Builder(name = "MouseOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.27f)
                lineTo(3.28f, 4.0f)
                lineTo(20.0f, 20.72f)
                lineTo(18.73f, 22.0f)
                lineTo(17.5f, 20.79f)
                curveTo(16.08f, 22.16f, 14.14f, 23.0f, 12.0f, 23.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 4.0f, 15.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.73f)
                lineTo(5.73f, 9.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 8.46f, 4.05f, 7.93f, 4.15f, 7.42f)
                lineTo(2.0f, 5.27f)
                moveTo(11.0f, 1.07f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.82f)
                lineTo(5.79f, 3.96f)
                curveTo(7.05f, 2.4f, 8.9f, 1.33f, 11.0f, 1.07f)
                moveTo(20.0f, 11.0f)
                verticalLineTo(15.0f)
                curveTo(20.0f, 15.95f, 19.83f, 16.86f, 19.53f, 17.71f)
                lineTo(12.82f, 11.0f)
                horizontalLineTo(20.0f)
                moveTo(13.0f, 1.07f)
                curveTo(16.94f, 1.56f, 20.0f, 4.92f, 20.0f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(1.07f)
                close()
            }
        }
        .build()
        return _mouseOff!!
    }

private var _mouseOff: ImageVector? = null
