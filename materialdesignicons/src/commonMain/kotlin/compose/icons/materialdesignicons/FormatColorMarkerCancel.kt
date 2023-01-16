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

public val MaterialDesignIcons.FormatColorMarkerCancel: ImageVector
    get() {
        if (_formatColorMarkerCancel != null) {
            return _formatColorMarkerCancel!!
        }
        _formatColorMarkerCancel = Builder(name = "FormatColorMarkerCancel", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 8.0f)
                curveTo(14.0f, 8.0f, 12.0f, 10.0f, 12.0f, 12.5f)
                reflectiveCurveTo(14.0f, 17.0f, 16.5f, 17.0f)
                reflectiveCurveTo(21.0f, 15.0f, 21.0f, 12.5f)
                reflectiveCurveTo(19.0f, 8.0f, 16.5f, 8.0f)
                moveTo(16.5f, 15.5f)
                curveTo(14.8f, 15.5f, 13.5f, 14.2f, 13.5f, 12.5f)
                curveTo(13.5f, 11.9f, 13.7f, 11.4f, 13.9f, 11.0f)
                lineTo(18.0f, 15.1f)
                curveTo(17.6f, 15.3f, 17.1f, 15.5f, 16.5f, 15.5f)
                moveTo(19.1f, 14.0f)
                lineTo(15.0f, 9.9f)
                curveTo(15.4f, 9.6f, 15.9f, 9.5f, 16.5f, 9.5f)
                curveTo(18.2f, 9.5f, 19.5f, 10.8f, 19.5f, 12.5f)
                curveTo(19.5f, 13.1f, 19.3f, 13.6f, 19.1f, 14.0f)
                moveTo(12.1f, 7.7f)
                lineTo(10.6f, 6.2f)
                lineTo(13.9f, 2.9f)
                curveTo(14.5f, 2.3f, 15.4f, 2.3f, 16.0f, 2.9f)
                lineTo(18.2f, 5.0f)
                curveTo(18.6f, 5.4f, 18.7f, 5.8f, 18.6f, 6.3f)
                curveTo(18.0f, 6.1f, 17.3f, 6.0f, 16.6f, 6.0f)
                curveTo(14.8f, 6.0f, 13.3f, 6.7f, 12.1f, 7.7f)
                moveTo(10.5f, 14.9f)
                lineTo(9.0f, 16.3f)
                curveTo(8.4f, 16.9f, 7.5f, 16.9f, 6.9f, 16.3f)
                lineTo(6.2f, 17.0f)
                horizontalLineTo(2.0f)
                lineTo(4.8f, 14.2f)
                curveTo(4.2f, 13.6f, 4.2f, 12.7f, 4.8f, 12.1f)
                lineTo(9.5f, 7.4f)
                lineTo(11.1f, 9.0f)
                curveTo(10.4f, 10.0f, 10.0f, 11.2f, 10.0f, 12.5f)
                curveTo(10.0f, 13.3f, 10.2f, 14.1f, 10.5f, 14.9f)
                close()
            }
        }
        .build()
        return _formatColorMarkerCancel!!
    }

private var _formatColorMarkerCancel: ImageVector? = null
