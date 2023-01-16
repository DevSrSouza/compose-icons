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

public val MaterialDesignIcons.ApproximatelyEqualBox: ImageVector
    get() {
        if (_approximatelyEqualBox != null) {
            return _approximatelyEqualBox!!
        }
        _approximatelyEqualBox = Builder(name = "ApproximatelyEqualBox", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 21.0f, 21.0f, 20.1f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                moveTo(9.3f, 8.2f)
                curveTo(10.6f, 8.2f, 11.4f, 8.7f, 12.1f, 9.0f)
                curveTo(12.7f, 9.3f, 13.4f, 9.7f, 14.5f, 9.7f)
                curveTo(15.5f, 9.7f, 16.5f, 9.0f, 17.0f, 8.5f)
                lineTo(17.8f, 9.8f)
                curveTo(17.1f, 10.6f, 15.8f, 11.4f, 14.4f, 11.4f)
                curveTo(13.1f, 11.4f, 12.3f, 10.9f, 11.7f, 10.6f)
                curveTo(11.1f, 10.3f, 10.3f, 9.9f, 9.2f, 9.9f)
                curveTo(8.2f, 9.9f, 7.2f, 10.6f, 6.7f, 11.1f)
                lineTo(6.0f, 9.8f)
                curveTo(6.7f, 9.0f, 8.0f, 8.2f, 9.3f, 8.2f)
                moveTo(14.6f, 15.8f)
                curveTo(13.3f, 15.8f, 12.5f, 15.3f, 11.8f, 15.0f)
                curveTo(11.2f, 14.7f, 10.4f, 14.3f, 9.3f, 14.3f)
                curveTo(8.3f, 14.3f, 7.3f, 15.0f, 6.8f, 15.5f)
                lineTo(6.0f, 14.1f)
                curveTo(6.7f, 13.3f, 8.0f, 12.5f, 9.3f, 12.5f)
                curveTo(10.6f, 12.5f, 11.4f, 13.0f, 12.1f, 13.3f)
                curveTo(12.7f, 13.6f, 13.4f, 14.0f, 14.6f, 14.0f)
                curveTo(15.6f, 14.0f, 16.6f, 13.3f, 17.1f, 12.8f)
                lineTo(17.9f, 14.1f)
                curveTo(17.3f, 15.0f, 16.0f, 15.8f, 14.6f, 15.8f)
                close()
            }
        }
        .build()
        return _approximatelyEqualBox!!
    }

private var _approximatelyEqualBox: ImageVector? = null
