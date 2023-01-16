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

public val MaterialDesignIcons.PencilLock: ImageVector
    get() {
        if (_pencilLock != null) {
            return _pencilLock!!
        }
        _pencilLock = Builder(name = "PencilLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 2.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 3.0f, 4.5f)
                verticalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 6.0f)
                verticalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 11.0f)
                horizontalLineTo(8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 10.0f)
                verticalLineTo(6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 5.0f)
                verticalLineTo(4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 2.0f)
                moveTo(5.5f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 4.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.5f, 3.0f)
                moveTo(19.66f, 3.0f)
                curveTo(19.4f, 3.0f, 19.16f, 3.09f, 18.97f, 3.28f)
                lineTo(17.13f, 5.13f)
                lineTo(20.88f, 8.88f)
                lineTo(22.72f, 7.03f)
                curveTo(23.11f, 6.64f, 23.11f, 6.0f, 22.72f, 5.63f)
                lineTo(20.38f, 3.28f)
                curveTo(20.18f, 3.09f, 19.91f, 3.0f, 19.66f, 3.0f)
                moveTo(16.06f, 6.19f)
                lineTo(5.0f, 17.25f)
                verticalLineTo(21.0f)
                horizontalLineTo(8.75f)
                lineTo(19.81f, 9.94f)
                lineTo(16.06f, 6.19f)
                close()
            }
        }
        .build()
        return _pencilLock!!
    }

private var _pencilLock: ImageVector? = null
