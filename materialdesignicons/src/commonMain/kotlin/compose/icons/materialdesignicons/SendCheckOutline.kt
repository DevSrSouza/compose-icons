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

public val MaterialDesignIcons.SendCheckOutline: ImageVector
    get() {
        if (_sendCheckOutline != null) {
            return _sendCheckOutline!!
        }
        _sendCheckOutline = Builder(name = "SendCheckOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.0f)
                verticalLineTo(10.0f)
                lineTo(17.0f, 12.0f)
                lineTo(2.0f, 14.0f)
                verticalLineTo(21.0f)
                lineTo(23.0f, 12.0f)
                moveTo(4.0f, 6.03f)
                lineTo(11.53f, 9.25f)
                lineTo(4.0f, 8.25f)
                moveTo(11.53f, 14.75f)
                lineTo(4.0f, 17.97f)
                verticalLineTo(15.75f)
                moveTo(22.0f, 15.5f)
                lineTo(18.5f, 19.0f)
                lineTo(16.5f, 17.0f)
                lineTo(15.0f, 18.5f)
                lineTo(18.5f, 22.0f)
                lineTo(23.5f, 17.0f)
                close()
            }
        }
        .build()
        return _sendCheckOutline!!
    }

private var _sendCheckOutline: ImageVector? = null
