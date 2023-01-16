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

public val MaterialDesignIcons.Ampersand: ImageVector
    get() {
        if (_ampersand != null) {
            return _ampersand!!
        }
        _ampersand = Builder(name = "Ampersand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.4f, 16.5f)
                curveTo(4.4f, 15.6f, 4.7f, 14.7f, 5.2f, 13.9f)
                curveTo(5.7f, 13.1f, 6.7f, 12.2f, 8.2f, 11.2f)
                curveTo(7.3f, 10.1f, 6.8f, 9.3f, 6.5f, 8.7f)
                curveTo(6.1f, 8.0f, 6.0f, 7.4f, 6.0f, 6.7f)
                curveTo(6.0f, 5.2f, 6.4f, 4.1f, 7.3f, 3.2f)
                curveTo(8.2f, 2.3f, 9.4f, 2.0f, 10.9f, 2.0f)
                curveTo(12.2f, 2.0f, 13.3f, 2.4f, 14.2f, 3.2f)
                curveTo(15.1f, 4.0f, 15.5f, 5.0f, 15.5f, 6.1f)
                curveTo(15.5f, 6.9f, 15.3f, 7.6f, 14.9f, 8.3f)
                curveTo(14.5f, 9.0f, 13.8f, 9.7f, 12.8f, 10.4f)
                lineTo(11.4f, 11.5f)
                lineTo(15.7f, 16.7f)
                curveTo(16.3f, 15.5f, 16.6f, 14.3f, 16.6f, 12.8f)
                horizontalLineTo(18.8f)
                curveTo(18.8f, 15.1f, 18.3f, 17.0f, 17.2f, 18.5f)
                lineTo(20.0f, 21.8f)
                horizontalLineTo(17.0f)
                lineTo(15.7f, 20.3f)
                curveTo(15.0f, 20.9f, 14.3f, 21.3f, 13.4f, 21.6f)
                curveTo(12.5f, 21.9f, 11.6f, 22.1f, 10.7f, 22.1f)
                curveTo(8.8f, 22.1f, 7.3f, 21.6f, 6.1f, 20.6f)
                curveTo(5.0f, 19.5f, 4.4f, 18.2f, 4.4f, 16.5f)
                moveTo(10.7f, 20.0f)
                curveTo(12.0f, 20.0f, 13.2f, 19.5f, 14.3f, 18.5f)
                lineTo(9.6f, 12.8f)
                lineTo(9.2f, 13.1f)
                curveTo(7.7f, 14.2f, 7.0f, 15.3f, 7.0f, 16.5f)
                curveTo(7.0f, 17.6f, 7.3f, 18.4f, 8.0f, 19.0f)
                curveTo(8.7f, 19.6f, 9.5f, 20.0f, 10.7f, 20.0f)
                moveTo(8.5f, 6.7f)
                curveTo(8.5f, 7.6f, 9.0f, 8.6f, 10.1f, 9.9f)
                lineTo(11.7f, 8.8f)
                curveTo(12.3f, 8.4f, 12.7f, 8.0f, 12.9f, 7.6f)
                curveTo(13.1f, 7.2f, 13.2f, 6.7f, 13.2f, 6.2f)
                curveTo(13.2f, 5.6f, 13.0f, 5.1f, 12.5f, 4.7f)
                curveTo(12.1f, 4.3f, 11.5f, 4.1f, 10.8f, 4.1f)
                curveTo(10.1f, 4.1f, 9.5f, 4.3f, 9.1f, 4.8f)
                curveTo(8.7f, 5.3f, 8.5f, 5.9f, 8.5f, 6.7f)
                close()
            }
        }
        .build()
        return _ampersand!!
    }

private var _ampersand: ImageVector? = null
