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

public val MaterialDesignIcons.MessageAlertOutline: ImageVector
    get() {
        if (_messageAlertOutline != null) {
            return _messageAlertOutline!!
        }
        _messageAlertOutline = Builder(name = "MessageAlertOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.0f)
                moveTo(13.0f, 12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                moveTo(22.0f, 4.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 18.0f)
                horizontalLineTo(6.0f)
                lineTo(2.0f, 22.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 2.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 4.0f)
                moveTo(20.0f, 4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.2f)
                lineTo(5.2f, 16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _messageAlertOutline!!
    }

private var _messageAlertOutline: ImageVector? = null
