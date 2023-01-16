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

public val MaterialDesignIcons.SendOutline: ImageVector
    get() {
        if (_sendOutline != null) {
            return _sendOutline!!
        }
        _sendOutline = Builder(name = "SendOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.03f)
                lineTo(11.5f, 9.25f)
                lineTo(4.0f, 8.25f)
                lineTo(4.0f, 6.03f)
                moveTo(11.5f, 14.75f)
                lineTo(4.0f, 17.97f)
                verticalLineTo(15.75f)
                lineTo(11.5f, 14.75f)
                moveTo(2.0f, 3.0f)
                lineTo(2.0f, 10.0f)
                lineTo(17.0f, 12.0f)
                lineTo(2.0f, 14.0f)
                lineTo(2.0f, 21.0f)
                lineTo(23.0f, 12.0f)
                lineTo(2.0f, 3.0f)
                close()
            }
        }
        .build()
        return _sendOutline!!
    }

private var _sendOutline: ImageVector? = null
