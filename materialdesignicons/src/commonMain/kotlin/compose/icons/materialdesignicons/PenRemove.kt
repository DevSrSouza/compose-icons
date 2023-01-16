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

public val MaterialDesignIcons.PenRemove: ImageVector
    get() {
        if (_penRemove != null) {
            return _penRemove!!
        }
        _penRemove = Builder(name = "PenRemove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.7f, 7.0f)
                curveTo(20.4f, 7.4f, 20.0f, 7.7f, 20.0f, 8.0f)
                curveTo(20.0f, 8.3f, 20.3f, 8.6f, 20.6f, 9.0f)
                curveTo(21.1f, 9.5f, 21.6f, 9.9f, 21.5f, 10.4f)
                curveTo(21.5f, 10.9f, 21.0f, 11.4f, 20.5f, 11.9f)
                lineTo(16.4f, 16.0f)
                lineTo(15.0f, 14.7f)
                lineTo(19.2f, 10.5f)
                lineTo(18.2f, 9.5f)
                lineTo(16.8f, 10.9f)
                lineTo(13.0f, 7.1f)
                lineTo(17.0f, 3.3f)
                curveTo(17.4f, 2.9f, 18.0f, 2.9f, 18.4f, 3.3f)
                lineTo(20.7f, 5.6f)
                curveTo(21.1f, 6.0f, 21.1f, 6.7f, 20.7f, 7.0f)
                moveTo(3.0f, 17.2f)
                lineTo(12.6f, 7.6f)
                lineTo(16.3f, 11.4f)
                lineTo(6.8f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.2f)
                moveTo(3.88f, 2.46f)
                lineTo(6.0f, 4.59f)
                lineTo(8.12f, 2.46f)
                lineTo(9.54f, 3.88f)
                lineTo(7.41f, 6.0f)
                lineTo(9.54f, 8.12f)
                lineTo(8.12f, 9.54f)
                lineTo(6.0f, 7.41f)
                lineTo(3.88f, 9.54f)
                lineTo(2.46f, 8.12f)
                lineTo(4.59f, 6.0f)
                lineTo(2.46f, 3.88f)
                lineTo(3.88f, 2.46f)
                close()
            }
        }
        .build()
        return _penRemove!!
    }

private var _penRemove: ImageVector? = null
