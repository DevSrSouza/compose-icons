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

public val MaterialDesignIcons.LockClock: ImageVector
    get() {
        if (_lockClock != null) {
            return _lockClock!!
        }
        _lockClock = Builder(name = "LockClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 2.0f)
                curveTo(6.0f, 2.0f, 4.0f, 4.0f, 4.0f, 6.5f)
                verticalLineTo(7.0f)
                curveTo(2.89f, 7.0f, 2.0f, 7.89f, 2.0f, 9.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.11f, 2.89f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(8.72f)
                curveTo(10.18f, 21.29f, 12.06f, 22.0f, 14.0f, 22.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 22.0f, 14.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 14.0f, 6.0f)
                curveTo(13.66f, 6.0f, 13.32f, 6.03f, 13.0f, 6.08f)
                curveTo(12.76f, 3.77f, 10.82f, 2.0f, 8.5f, 2.0f)
                moveTo(8.5f, 4.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 11.0f, 6.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 8.5f, 4.0f)
                moveTo(14.0f, 8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 20.0f, 14.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 14.0f, 20.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 8.0f, 14.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 14.0f, 8.0f)
                moveTo(13.0f, 10.0f)
                verticalLineTo(15.0f)
                lineTo(16.64f, 17.19f)
                lineTo(17.42f, 15.9f)
                lineTo(14.5f, 14.15f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _lockClock!!
    }

private var _lockClock: ImageVector? = null
