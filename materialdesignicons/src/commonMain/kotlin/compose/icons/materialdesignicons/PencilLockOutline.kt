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

public val MaterialDesignIcons.PencilLockOutline: ImageVector
    get() {
        if (_pencilLockOutline != null) {
            return _pencilLockOutline!!
        }
        _pencilLockOutline = Builder(name = "PencilLockOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.1f, 9.0f)
                lineTo(17.0f, 9.9f)
                lineTo(7.9f, 19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.1f)
                lineTo(16.1f, 9.0f)
                moveTo(19.7f, 3.0f)
                curveTo(19.5f, 3.0f, 19.2f, 3.1f, 19.0f, 3.3f)
                lineTo(17.2f, 5.1f)
                lineTo(20.9f, 8.9f)
                lineTo(22.7f, 7.0f)
                curveTo(23.1f, 6.6f, 23.1f, 6.0f, 22.7f, 5.6f)
                lineTo(20.4f, 3.3f)
                curveTo(20.2f, 3.1f, 19.9f, 3.0f, 19.7f, 3.0f)
                moveTo(16.1f, 6.2f)
                lineTo(5.0f, 17.2f)
                verticalLineTo(21.0f)
                horizontalLineTo(8.8f)
                lineTo(19.8f, 9.9f)
                lineTo(16.1f, 6.2f)
                moveTo(8.0f, 5.0f)
                verticalLineTo(4.5f)
                curveTo(8.0f, 3.1f, 6.9f, 2.0f, 5.5f, 2.0f)
                curveTo(4.1f, 2.0f, 3.0f, 3.1f, 3.0f, 4.5f)
                verticalLineTo(5.0f)
                curveTo(2.4f, 5.0f, 2.0f, 5.4f, 2.0f, 6.0f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 10.6f, 2.4f, 11.0f, 3.0f, 11.0f)
                horizontalLineTo(8.0f)
                curveTo(8.6f, 11.0f, 9.0f, 10.6f, 9.0f, 10.0f)
                verticalLineTo(6.0f)
                curveTo(9.0f, 5.4f, 8.6f, 5.0f, 8.0f, 5.0f)
                moveTo(7.0f, 5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.5f)
                curveTo(4.0f, 3.7f, 4.7f, 3.0f, 5.5f, 3.0f)
                curveTo(6.3f, 3.0f, 7.0f, 3.7f, 7.0f, 4.5f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _pencilLockOutline!!
    }

private var _pencilLockOutline: ImageVector? = null
