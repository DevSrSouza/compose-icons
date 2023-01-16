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

public val MaterialDesignIcons.ShareOffOutline: ImageVector
    get() {
        if (_shareOffOutline != null) {
            return _shareOffOutline!!
        }
        _shareOffOutline = Builder(name = "ShareOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3.0f)
                lineTo(8.9f, 10.8f)
                curveTo(5.4f, 12.9f, 3.7f, 16.4f, 3.0f, 20.0f)
                curveTo(5.3f, 16.7f, 8.6f, 15.1f, 13.0f, 14.9f)
                lineTo(14.0f, 15.9f)
                verticalLineTo(19.0f)
                lineTo(15.6f, 17.4f)
                lineTo(20.8f, 22.7f)
                moveTo(8.3f, 13.8f)
                curveTo(8.94f, 13.22f, 9.65f, 12.71f, 10.4f, 12.3f)
                lineTo(11.3f, 13.1f)
                moveTo(14.2f, 11.0f)
                lineTo(12.5f, 9.3f)
                lineTo(14.0f, 9.0f)
                verticalLineTo(5.0f)
                lineTo(21.0f, 12.0f)
                lineTo(18.1f, 14.9f)
                lineTo(16.7f, 13.5f)
                lineTo(18.2f, 12.0f)
                lineTo(16.0f, 9.8f)
                verticalLineTo(10.7f)
            }
        }
        .build()
        return _shareOffOutline!!
    }

private var _shareOffOutline: ImageVector? = null
