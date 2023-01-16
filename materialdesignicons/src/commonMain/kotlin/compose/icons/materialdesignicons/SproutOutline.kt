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

public val MaterialDesignIcons.SproutOutline: ImageVector
    get() {
        if (_sproutOutline != null) {
            return _sproutOutline!!
        }
        _sproutOutline = Builder(name = "SproutOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 4.1f)
                verticalLineTo(2.3f)
                lineTo(21.2f, 2.1f)
                curveTo(21.1f, 2.1f, 20.5f, 2.0f, 19.5f, 2.0f)
                curveTo(15.4f, 2.0f, 12.4f, 3.2f, 10.7f, 5.3f)
                curveTo(9.4f, 4.5f, 7.6f, 4.0f, 5.5f, 4.0f)
                curveTo(4.5f, 4.0f, 3.8f, 4.1f, 3.8f, 4.1f)
                lineTo(1.9f, 4.4f)
                lineTo(2.0f, 6.1f)
                curveTo(2.1f, 9.1f, 3.6f, 14.8f, 8.8f, 14.8f)
                curveTo(8.9f, 14.8f, 8.9f, 14.8f, 9.0f, 14.8f)
                verticalLineTo(18.2f)
                curveTo(5.2f, 18.7f, 2.0f, 20.0f, 2.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.0f, 18.8f, 18.7f, 15.0f, 18.2f)
                verticalLineTo(15.0f)
                curveTo(21.3f, 14.9f, 23.0f, 7.8f, 23.0f, 4.1f)
                moveTo(12.0f, 18.0f)
                curveTo(11.7f, 18.0f, 11.3f, 18.0f, 11.0f, 18.0f)
                verticalLineTo(12.4f)
                curveTo(11.0f, 12.4f, 10.8f, 9.0f, 8.0f, 9.0f)
                curveTo(8.0f, 9.0f, 9.5f, 9.8f, 9.9f, 12.7f)
                curveTo(9.5f, 12.8f, 9.1f, 12.8f, 8.8f, 12.8f)
                curveTo(4.2f, 12.8f, 4.0f, 6.1f, 4.0f, 6.1f)
                curveTo(4.0f, 6.1f, 4.6f, 6.0f, 5.5f, 6.0f)
                curveTo(7.4f, 6.0f, 10.5f, 6.4f, 11.4f, 9.1f)
                curveTo(11.9f, 4.6f, 17.0f, 4.0f, 19.5f, 4.0f)
                curveTo(20.4f, 4.0f, 21.0f, 4.1f, 21.0f, 4.1f)
                curveTo(21.0f, 4.1f, 21.0f, 13.1f, 14.7f, 13.1f)
                curveTo(14.5f, 13.1f, 14.2f, 13.1f, 14.0f, 13.1f)
                curveTo(14.0f, 11.1f, 16.0f, 8.1f, 16.0f, 8.1f)
                curveTo(13.0f, 9.1f, 13.0f, 13.0f, 13.0f, 13.0f)
                verticalLineTo(18.0f)
                curveTo(12.7f, 18.0f, 12.3f, 18.0f, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _sproutOutline!!
    }

private var _sproutOutline: ImageVector? = null
