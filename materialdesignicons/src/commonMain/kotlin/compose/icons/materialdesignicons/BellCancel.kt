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

public val MaterialDesignIcons.BellCancel: ImageVector
    get() {
        if (_bellCancel != null) {
            return _bellCancel!!
        }
        _bellCancel = Builder(name = "BellCancel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 13.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 13.0f, 17.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 17.5f, 22.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 22.0f, 17.5f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 17.5f, 13.0f)
                moveTo(17.5f, 14.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 20.5f, 17.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 20.08f, 19.0f)
                lineTo(16.0f, 14.92f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.5f, 14.5f)
                moveTo(14.92f, 16.0f)
                lineTo(19.0f, 20.08f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.5f, 20.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 14.5f, 17.5f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 14.92f, 16.0f)
                moveTo(12.0f, 2.0f)
                curveTo(10.9f, 2.0f, 10.0f, 2.9f, 10.0f, 4.0f)
                curveTo(10.0f, 4.1f, 10.0f, 4.19f, 10.0f, 4.29f)
                curveTo(7.12f, 5.14f, 5.0f, 7.82f, 5.0f, 11.0f)
                verticalLineTo(17.0f)
                lineTo(3.0f, 19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 11.0f, 17.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 17.5f, 11.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 19.0f, 11.18f)
                verticalLineTo(11.0f)
                curveTo(19.0f, 7.82f, 16.88f, 5.14f, 14.0f, 4.29f)
                curveTo(14.0f, 4.19f, 14.0f, 4.1f, 14.0f, 4.0f)
                curveTo(14.0f, 2.9f, 13.11f, 2.0f, 12.0f, 2.0f)
                moveTo(10.0f, 21.0f)
                curveTo(10.0f, 22.11f, 10.9f, 23.0f, 12.0f, 23.0f)
                curveTo(12.5f, 23.0f, 12.97f, 22.81f, 13.33f, 22.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 12.03f, 21.0f)
                close()
            }
        }
        .build()
        return _bellCancel!!
    }

private var _bellCancel: ImageVector? = null
