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

public val MaterialDesignIcons.PenLock: ImageVector
    get() {
        if (_penLock != null) {
            return _penLock!!
        }
        _penLock = Builder(name = "PenLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7f, 7.0f)
                curveTo(21.4f, 7.4f, 21.0f, 7.7f, 21.0f, 8.0f)
                curveTo(21.0f, 8.3f, 21.3f, 8.6f, 21.6f, 9.0f)
                curveTo(22.1f, 9.5f, 22.6f, 9.9f, 22.5f, 10.4f)
                curveTo(22.5f, 10.9f, 22.0f, 11.4f, 21.5f, 11.9f)
                lineTo(17.4f, 16.0f)
                lineTo(16.0f, 14.7f)
                lineTo(20.2f, 10.5f)
                lineTo(19.2f, 9.5f)
                lineTo(17.8f, 10.9f)
                lineTo(14.0f, 7.1f)
                lineTo(18.0f, 3.3f)
                curveTo(18.4f, 2.9f, 19.0f, 2.9f, 19.4f, 3.3f)
                lineTo(21.7f, 5.6f)
                curveTo(22.1f, 6.0f, 22.1f, 6.7f, 21.7f, 7.0f)
                moveTo(4.0f, 17.2f)
                lineTo(13.6f, 7.6f)
                lineTo(17.3f, 11.4f)
                lineTo(7.8f, 21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.2f)
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
        return _penLock!!
    }

private var _penLock: ImageVector? = null
