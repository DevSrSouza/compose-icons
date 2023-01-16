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

public val MaterialDesignIcons.SunAngleOutline: ImageVector
    get() {
        if (_sunAngleOutline != null) {
            return _sunAngleOutline!!
        }
        _sunAngleOutline = Builder(name = "SunAngleOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.8f, 5.2f)
                curveTo(13.0f, 5.0f, 12.2f, 5.0f, 11.4f, 5.0f)
                lineTo(14.6f, 2.3f)
                lineTo(16.0f, 6.3f)
                curveTo(15.3f, 5.8f, 14.6f, 5.5f, 13.8f, 5.2f)
                moveTo(7.0f, 7.1f)
                curveTo(7.6f, 6.5f, 8.3f, 6.0f, 9.0f, 5.7f)
                lineTo(4.9f, 4.9f)
                lineTo(5.6f, 9.0f)
                curveTo(6.0f, 8.3f, 6.4f, 7.6f, 7.0f, 7.1f)
                moveTo(5.2f, 13.8f)
                curveTo(5.0f, 13.0f, 5.0f, 12.2f, 5.0f, 11.4f)
                lineTo(2.3f, 14.6f)
                lineTo(6.3f, 16.0f)
                curveTo(5.8f, 15.4f, 5.4f, 14.6f, 5.2f, 13.8f)
                moveTo(22.0f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                lineTo(8.4f, 15.5f)
                curveTo(6.5f, 13.5f, 6.5f, 10.4f, 8.4f, 8.4f)
                curveTo(10.3f, 6.5f, 13.5f, 6.5f, 15.4f, 8.4f)
                lineTo(18.4f, 5.4f)
                lineTo(19.8f, 6.8f)
                lineTo(7.7f, 19.0f)
                horizontalLineTo(22.0f)
                moveTo(9.8f, 14.1f)
                lineTo(14.0f, 9.8f)
                curveTo(12.8f, 8.7f, 11.0f, 8.7f, 9.8f, 9.8f)
                curveTo(8.7f, 11.0f, 8.7f, 12.9f, 9.8f, 14.1f)
                close()
            }
        }
        .build()
        return _sunAngleOutline!!
    }

private var _sunAngleOutline: ImageVector? = null
