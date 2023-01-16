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

public val MaterialDesignIcons.ClockEditOutline: ImageVector
    get() {
        if (_clockEditOutline != null) {
            return _clockEditOutline!!
        }
        _clockEditOutline = Builder(name = "ClockEditOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 13.1f)
                curveTo(20.9f, 13.1f, 20.7f, 13.2f, 20.6f, 13.3f)
                lineTo(19.6f, 14.3f)
                lineTo(21.7f, 16.4f)
                lineTo(22.7f, 15.4f)
                curveTo(22.9f, 15.2f, 22.9f, 14.8f, 22.7f, 14.6f)
                lineTo(21.4f, 13.3f)
                curveTo(21.3f, 13.2f, 21.2f, 13.1f, 21.0f, 13.1f)
                moveTo(19.1f, 14.9f)
                lineTo(13.0f, 20.9f)
                verticalLineTo(23.0f)
                horizontalLineTo(15.1f)
                lineTo(21.2f, 16.9f)
                lineTo(19.1f, 14.9f)
                moveTo(12.5f, 7.0f)
                verticalLineTo(12.2f)
                lineTo(16.5f, 14.6f)
                lineTo(15.5f, 15.6f)
                lineTo(11.0f, 13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.5f)
                moveTo(11.0f, 21.9f)
                curveTo(5.9f, 21.4f, 2.0f, 17.1f, 2.0f, 12.0f)
                curveTo(2.0f, 6.5f, 6.5f, 2.0f, 12.0f, 2.0f)
                curveTo(17.3f, 2.0f, 21.6f, 6.1f, 22.0f, 11.3f)
                curveTo(21.7f, 11.2f, 21.4f, 11.1f, 21.0f, 11.1f)
                curveTo(20.6f, 11.1f, 20.3f, 11.2f, 20.0f, 11.3f)
                curveTo(19.6f, 7.2f, 16.2f, 4.0f, 12.0f, 4.0f)
                curveTo(7.6f, 4.0f, 4.0f, 7.6f, 4.0f, 12.0f)
                curveTo(4.0f, 16.1f, 7.1f, 19.5f, 11.1f, 19.9f)
                lineTo(11.0f, 20.1f)
                verticalLineTo(21.9f)
                close()
            }
        }
        .build()
        return _clockEditOutline!!
    }

private var _clockEditOutline: ImageVector? = null
