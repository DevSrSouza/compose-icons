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

public val MaterialDesignIcons.Rss: ImageVector
    get() {
        if (_rss != null) {
            return _rss!!
        }
        _rss = Builder(name = "Rss", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.18f, 15.64f)
                arcTo(2.18f, 2.18f, 0.0f, false, true, 8.36f, 17.82f)
                curveTo(8.36f, 19.0f, 7.38f, 20.0f, 6.18f, 20.0f)
                curveTo(5.0f, 20.0f, 4.0f, 19.0f, 4.0f, 17.82f)
                arcTo(2.18f, 2.18f, 0.0f, false, true, 6.18f, 15.64f)
                moveTo(4.0f, 4.44f)
                arcTo(15.56f, 15.56f, 0.0f, false, true, 19.56f, 20.0f)
                horizontalLineTo(16.73f)
                arcTo(12.73f, 12.73f, 0.0f, false, false, 4.0f, 7.27f)
                verticalLineTo(4.44f)
                moveTo(4.0f, 10.1f)
                arcTo(9.9f, 9.9f, 0.0f, false, true, 13.9f, 20.0f)
                horizontalLineTo(11.07f)
                arcTo(7.07f, 7.07f, 0.0f, false, false, 4.0f, 12.93f)
                verticalLineTo(10.1f)
                close()
            }
        }
        .build()
        return _rss!!
    }

private var _rss: ImageVector? = null
