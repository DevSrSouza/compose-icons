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

public val MaterialDesignIcons.Watch: ImageVector
    get() {
        if (_watch != null) {
            return _watch!!
        }
        _watch = Builder(name = "Watch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.0f, 6.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 18.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.0f, 18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 6.0f, 12.0f)
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 9.45f, 18.81f, 7.19f, 16.95f, 5.73f)
                lineTo(16.0f, 0.0f)
                horizontalLineTo(8.0f)
                lineTo(7.05f, 5.73f)
                curveTo(5.19f, 7.19f, 4.0f, 9.45f, 4.0f, 12.0f)
                curveTo(4.0f, 14.54f, 5.19f, 16.81f, 7.05f, 18.27f)
                lineTo(8.0f, 24.0f)
                horizontalLineTo(16.0f)
                lineTo(16.95f, 18.27f)
                curveTo(18.81f, 16.81f, 20.0f, 14.54f, 20.0f, 12.0f)
                close()
            }
        }
        .build()
        return _watch!!
    }

private var _watch: ImageVector? = null
