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

public val MaterialDesignIcons.MailboxOpenUp: ImageVector
    get() {
        if (_mailboxOpenUp != null) {
            return _mailboxOpenUp!!
        }
        _mailboxOpenUp = Builder(name = "MailboxOpenUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 3.0f, 9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 23.0f, 18.0f)
                verticalLineTo(9.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 18.0f, 4.0f)
                horizontalLineTo(8.0f)
                moveTo(8.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 11.0f, 9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 8.0f, 6.0f)
                moveTo(13.0f, 13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _mailboxOpenUp!!
    }

private var _mailboxOpenUp: ImageVector? = null
