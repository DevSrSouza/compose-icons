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

public val MaterialDesignIcons.MailboxOpenUpOutline: ImageVector
    get() {
        if (_mailboxOpenUpOutline != null) {
            return _mailboxOpenUpOutline!!
        }
        _mailboxOpenUpOutline = Builder(name = "MailboxOpenUpOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.85f)
                verticalLineTo(6.85f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.85f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.85f)
                horizontalLineTo(14.0f)
                moveTo(18.0f, 3.85f)
                horizontalLineTo(8.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 3.0f, 8.85f)
                verticalLineTo(17.85f)
                horizontalLineTo(1.0f)
                verticalLineTo(19.85f)
                horizontalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 23.0f, 17.85f)
                verticalLineTo(8.85f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 18.0f, 3.85f)
                moveTo(11.0f, 17.85f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.85f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 8.0f, 5.85f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 11.0f, 8.85f)
                verticalLineTo(17.85f)
                moveTo(21.0f, 17.85f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.85f)
                curveTo(13.0f, 7.76f, 12.65f, 6.71f, 12.0f, 5.85f)
                horizontalLineTo(18.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 21.0f, 8.85f)
                verticalLineTo(17.85f)
                close()
            }
        }
        .build()
        return _mailboxOpenUpOutline!!
    }

private var _mailboxOpenUpOutline: ImageVector? = null
