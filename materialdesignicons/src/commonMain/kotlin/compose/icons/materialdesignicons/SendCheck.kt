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

public val MaterialDesignIcons.SendCheck: ImageVector
    get() {
        if (_sendCheck != null) {
            return _sendCheck!!
        }
        _sendCheck = Builder(name = "SendCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.0f)
                verticalLineTo(10.0f)
                lineTo(17.0f, 12.0f)
                lineTo(2.0f, 14.0f)
                verticalLineTo(21.0f)
                lineTo(23.0f, 12.0f)
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
        return _sendCheck!!
    }

private var _sendCheck: ImageVector? = null
