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

public val MaterialDesignIcons.ShareOff: ImageVector
    get() {
        if (_shareOff != null) {
            return _shareOff!!
        }
        _shareOff = Builder(name = "ShareOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8f, 22.7f)
                lineTo(15.6f, 17.5f)
                lineTo(14.0f, 19.0f)
                verticalLineTo(15.9f)
                lineTo(13.1f, 14.9f)
                curveTo(8.6f, 15.2f, 5.4f, 16.8f, 3.0f, 20.1f)
                curveTo(3.58f, 16.31f, 5.72f, 12.94f, 8.9f, 10.8f)
                lineTo(1.1f, 3.0f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.5f)
                moveTo(18.1f, 14.9f)
                lineTo(21.0f, 12.0f)
                lineTo(14.0f, 5.0f)
                verticalLineTo(9.0f)
                lineTo(12.5f, 9.3f)
            }
        }
        .build()
        return _shareOff!!
    }

private var _shareOff: ImageVector? = null
