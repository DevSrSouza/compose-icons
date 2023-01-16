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

public val MaterialDesignIcons.InboxFull: ImageVector
    get() {
        if (_inboxFull != null) {
            return _inboxFull!!
        }
        _inboxFull = Builder(name = "InboxFull", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 16.66f, 10.34f, 18.0f, 12.0f, 18.0f)
                curveTo(13.66f, 18.0f, 15.0f, 16.66f, 15.0f, 15.0f)
                horizontalLineTo(19.0f)
                moveTo(19.0f, 3.0f)
                curveTo(20.1f, 3.0f, 21.0f, 3.9f, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 20.1f, 20.1f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 21.0f, 3.0f, 20.1f, 3.0f, 19.0f)
                lineTo(3.0f, 5.0f)
                curveTo(3.0f, 3.9f, 3.89f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                moveTo(7.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                moveTo(7.0f, 9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _inboxFull!!
    }

private var _inboxFull: ImageVector? = null
