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

public val MaterialDesignIcons.ApproximatelyEqual: ImageVector
    get() {
        if (_approximatelyEqual != null) {
            return _approximatelyEqual!!
        }
        _approximatelyEqual = Builder(name = "ApproximatelyEqual", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9f, 9.2f)
                curveTo(18.1f, 10.1f, 16.6f, 11.0f, 15.0f, 11.0f)
                curveTo(13.5f, 11.0f, 12.6f, 10.5f, 11.8f, 10.1f)
                curveTo(11.0f, 9.8f, 10.2f, 9.3f, 8.9f, 9.3f)
                curveTo(7.7f, 9.3f, 6.6f, 10.0f, 6.0f, 10.6f)
                lineTo(5.0f, 9.1f)
                curveTo(5.9f, 8.2f, 7.3f, 7.2f, 8.9f, 7.2f)
                curveTo(10.4f, 7.2f, 11.3f, 7.8f, 12.1f, 8.1f)
                curveTo(12.9f, 8.4f, 13.7f, 9.0f, 15.0f, 9.0f)
                curveTo(16.2f, 9.0f, 17.3f, 8.2f, 17.9f, 7.6f)
                lineTo(18.9f, 9.2f)
                moveTo(19.0f, 14.1f)
                curveTo(18.1f, 15.0f, 16.7f, 16.0f, 15.1f, 16.0f)
                curveTo(13.6f, 16.0f, 12.7f, 15.5f, 11.9f, 15.1f)
                curveTo(11.1f, 14.8f, 10.3f, 14.2f, 9.0f, 14.2f)
                curveTo(7.8f, 14.2f, 6.7f, 15.0f, 6.1f, 15.6f)
                lineTo(5.1f, 14.0f)
                curveTo(6.0f, 13.1f, 7.4f, 12.1f, 9.0f, 12.1f)
                curveTo(10.5f, 12.1f, 11.4f, 12.6f, 12.2f, 13.0f)
                curveTo(13.0f, 13.3f, 13.8f, 13.8f, 15.1f, 13.8f)
                curveTo(16.3f, 13.8f, 17.4f, 13.0f, 18.0f, 12.4f)
                lineTo(19.0f, 14.1f)
                close()
            }
        }
        .build()
        return _approximatelyEqual!!
    }

private var _approximatelyEqual: ImageVector? = null
