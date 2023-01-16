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

public val MaterialDesignIcons.Rice: ImageVector
    get() {
        if (_rice != null) {
            return _rice!!
        }
        _rice = Builder(name = "Rice", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 11.0f)
                horizontalLineTo(19.7f)
                curveTo(19.4f, 9.9f, 18.9f, 8.8f, 18.2f, 8.0f)
                lineTo(21.6f, 2.6f)
                lineTo(19.9f, 1.5f)
                lineTo(16.7f, 6.6f)
                curveTo(16.3f, 6.3f, 16.0f, 6.1f, 15.5f, 5.9f)
                lineTo(16.4f, 2.3f)
                lineTo(14.5f, 1.8f)
                lineTo(13.7f, 5.2f)
                curveTo(13.1f, 5.1f, 12.6f, 5.0f, 12.0f, 5.0f)
                curveTo(8.3f, 5.0f, 5.2f, 7.6f, 4.3f, 11.0f)
                horizontalLineTo(2.0f)
                curveTo(2.0f, 15.1f, 4.5f, 18.6f, 8.0f, 20.2f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.2f)
                curveTo(19.5f, 18.6f, 22.0f, 15.1f, 22.0f, 11.0f)
                moveTo(12.0f, 7.0f)
                curveTo(14.6f, 7.0f, 16.8f, 8.7f, 17.6f, 11.0f)
                horizontalLineTo(6.4f)
                curveTo(7.2f, 8.7f, 9.4f, 7.0f, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _rice!!
    }

private var _rice: ImageVector? = null
