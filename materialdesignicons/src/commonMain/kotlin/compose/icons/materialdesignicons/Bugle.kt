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

public val MaterialDesignIcons.Bugle: ImageVector
    get() {
        if (_bugle != null) {
            return _bugle!!
        }
        _bugle = Builder(name = "Bugle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                curveTo(21.0f, 11.0f, 12.0f, 11.0f, 12.0f, 11.0f)
                curveTo(12.0f, 11.0f, 6.0f, 11.0f, 5.0f, 11.0f)
                curveTo(4.0f, 11.0f, 3.0f, 10.0f, 3.0f, 10.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 14.0f, 4.0f, 13.0f, 5.0f, 13.0f)
                curveTo(5.2f, 13.0f, 5.7f, 13.0f, 6.3f, 13.0f)
                curveTo(5.5f, 13.5f, 5.0f, 14.2f, 5.0f, 15.0f)
                curveTo(5.0f, 16.8f, 7.3f, 18.0f, 10.5f, 18.0f)
                curveTo(13.7f, 18.0f, 16.0f, 16.8f, 16.0f, 15.0f)
                curveTo(16.0f, 14.4f, 15.7f, 13.8f, 15.2f, 13.3f)
                curveTo(17.8f, 13.8f, 21.0f, 15.0f, 21.0f, 18.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(21.0f)
                moveTo(10.5f, 16.7f)
                curveTo(8.2f, 16.7f, 6.4f, 15.9f, 6.4f, 15.0f)
                curveTo(6.4f, 14.1f, 8.2f, 13.3f, 10.5f, 13.3f)
                curveTo(12.8f, 13.3f, 14.6f, 14.1f, 14.6f, 15.0f)
                curveTo(14.6f, 15.9f, 12.8f, 16.7f, 10.5f, 16.7f)
                close()
            }
        }
        .build()
        return _bugle!!
    }

private var _bugle: ImageVector? = null
