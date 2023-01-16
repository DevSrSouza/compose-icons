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

public val MaterialDesignIcons.MessageTextLock: ImageVector
    get() {
        if (_messageTextLock != null) {
            return _messageTextLock!!
        }
        _messageTextLock = Builder(name = "MessageTextLock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 0.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.0f, 2.5f)
                verticalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 4.0f)
                verticalLineTo(8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 9.0f)
                horizontalLineTo(23.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 24.0f, 8.0f)
                verticalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.0f, 3.0f)
                verticalLineTo(2.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 20.5f, 0.0f)
                moveTo(20.5f, 1.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 22.0f, 2.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.5f, 1.0f)
                moveTo(4.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 4.0f)
                verticalLineTo(22.0f)
                lineTo(6.0f, 18.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                curveTo(15.89f, 11.0f, 15.0f, 10.11f, 15.0f, 9.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(4.0f)
                moveTo(6.0f, 6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                moveTo(6.0f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                moveTo(6.0f, 12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _messageTextLock!!
    }

private var _messageTextLock: ImageVector? = null
