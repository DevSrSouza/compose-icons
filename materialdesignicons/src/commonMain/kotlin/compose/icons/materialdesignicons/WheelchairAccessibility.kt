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

public val MaterialDesignIcons.WheelchairAccessibility: ImageVector
    get() {
        if (_wheelchairAccessibility != null) {
            return _wheelchairAccessibility!!
        }
        _wheelchairAccessibility = Builder(name = "WheelchairAccessibility", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.4f, 11.2f)
                lineTo(14.3f, 11.4f)
                lineTo(16.6f, 8.8f)
                curveTo(16.8f, 8.5f, 16.9f, 8.0f, 16.8f, 7.5f)
                curveTo(16.7f, 7.2f, 16.6f, 6.9f, 16.3f, 6.7f)
                lineTo(10.9f, 3.5f)
                curveTo(10.5f, 3.2f, 9.9f, 3.3f, 9.5f, 3.6f)
                lineTo(6.8f, 6.1f)
                curveTo(6.3f, 6.6f, 6.2f, 7.3f, 6.7f, 7.8f)
                curveTo(7.1f, 8.3f, 7.9f, 8.3f, 8.4f, 7.9f)
                lineTo(10.4f, 6.1f)
                lineTo(12.3f, 7.2f)
                lineTo(8.1f, 11.5f)
                curveTo(8.0f, 11.6f, 8.0f, 11.7f, 7.9f, 11.7f)
                curveTo(7.4f, 11.9f, 6.9f, 12.1f, 6.5f, 12.4f)
                lineTo(8.0f, 13.9f)
                curveTo(8.5f, 13.7f, 9.0f, 13.5f, 9.5f, 13.5f)
                curveTo(11.4f, 13.5f, 13.0f, 15.1f, 13.0f, 17.0f)
                curveTo(13.0f, 17.6f, 12.9f, 18.1f, 12.6f, 18.5f)
                lineTo(14.1f, 20.0f)
                curveTo(14.7f, 19.1f, 15.0f, 18.1f, 15.0f, 17.0f)
                curveTo(15.0f, 15.8f, 14.6f, 14.6f, 13.9f, 13.7f)
                lineTo(17.2f, 13.4f)
                lineTo(17.0f, 18.2f)
                curveTo(16.9f, 18.9f, 17.4f, 19.4f, 18.1f, 19.5f)
                horizontalLineTo(18.2f)
                curveTo(18.8f, 19.5f, 19.3f, 19.0f, 19.4f, 18.4f)
                lineTo(19.6f, 12.5f)
                curveTo(19.6f, 12.2f, 19.5f, 11.8f, 19.3f, 11.6f)
                curveTo(19.0f, 11.3f, 18.7f, 11.2f, 18.4f, 11.2f)
                moveTo(18.0f, 5.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 3.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 1.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.0f, 3.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 5.5f)
                moveTo(12.5f, 21.6f)
                curveTo(11.6f, 22.2f, 10.6f, 22.5f, 9.5f, 22.5f)
                curveTo(6.5f, 22.5f, 4.0f, 20.0f, 4.0f, 17.0f)
                curveTo(4.0f, 15.9f, 4.3f, 14.9f, 4.9f, 14.0f)
                lineTo(6.4f, 15.5f)
                curveTo(6.2f, 16.0f, 6.0f, 16.5f, 6.0f, 17.0f)
                curveTo(6.0f, 18.9f, 7.6f, 20.5f, 9.5f, 20.5f)
                curveTo(10.1f, 20.5f, 10.6f, 20.4f, 11.0f, 20.1f)
                lineTo(12.5f, 21.6f)
                close()
            }
        }
        .build()
        return _wheelchairAccessibility!!
    }

private var _wheelchairAccessibility: ImageVector? = null
