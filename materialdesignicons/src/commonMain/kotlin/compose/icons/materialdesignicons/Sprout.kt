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

public val MaterialDesignIcons.Sprout: ImageVector
    get() {
        if (_sprout != null) {
            return _sprout!!
        }
        _sprout = Builder(name = "Sprout", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.0f, 7.0f, 18.0f, 12.0f, 18.0f)
                curveTo(17.0f, 18.0f, 22.0f, 20.0f, 22.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                moveTo(11.3f, 9.1f)
                curveTo(10.1f, 5.2f, 4.0f, 6.1f, 4.0f, 6.1f)
                curveTo(4.0f, 6.1f, 4.2f, 13.9f, 9.9f, 12.7f)
                curveTo(9.5f, 9.8f, 8.0f, 9.0f, 8.0f, 9.0f)
                curveTo(10.8f, 9.0f, 11.0f, 12.4f, 11.0f, 12.4f)
                verticalLineTo(17.0f)
                curveTo(11.3f, 17.0f, 11.7f, 17.0f, 12.0f, 17.0f)
                curveTo(12.3f, 17.0f, 12.7f, 17.0f, 13.0f, 17.0f)
                verticalLineTo(12.8f)
                curveTo(13.0f, 12.8f, 13.0f, 8.9f, 16.0f, 7.9f)
                curveTo(16.0f, 7.9f, 14.0f, 10.9f, 14.0f, 12.9f)
                curveTo(21.0f, 13.6f, 21.0f, 4.0f, 21.0f, 4.0f)
                curveTo(21.0f, 4.0f, 12.1f, 3.0f, 11.3f, 9.1f)
                close()
            }
        }
        .build()
        return _sprout!!
    }

private var _sprout: ImageVector? = null
