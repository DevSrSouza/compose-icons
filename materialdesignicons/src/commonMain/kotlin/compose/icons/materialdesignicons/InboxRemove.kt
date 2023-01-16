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

public val MaterialDesignIcons.InboxRemove: ImageVector
    get() {
        if (_inboxRemove != null) {
            return _inboxRemove!!
        }
        _inboxRemove = Builder(name = "InboxRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 15.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 16.7f, 13.7f, 18.0f, 12.0f, 18.0f)
                reflectiveCurveTo(9.0f, 16.7f, 9.0f, 15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 21.0f, 21.0f, 20.1f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                moveTo(14.1f, 6.5f)
                lineTo(15.5f, 7.9f)
                lineTo(13.4f, 10.0f)
                lineTo(15.5f, 12.1f)
                lineTo(14.1f, 13.5f)
                lineTo(12.0f, 11.4f)
                lineTo(9.9f, 13.5f)
                lineTo(8.5f, 12.1f)
                lineTo(10.6f, 10.0f)
                lineTo(8.5f, 7.9f)
                lineTo(9.9f, 6.5f)
                lineTo(12.0f, 8.6f)
                lineTo(14.1f, 6.5f)
                close()
            }
        }
        .build()
        return _inboxRemove!!
    }

private var _inboxRemove: ImageVector? = null
