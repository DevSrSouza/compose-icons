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

public val MaterialDesignIcons.MessageTextLockOutline: ImageVector
    get() {
        if (_messageTextLockOutline != null) {
            return _messageTextLockOutline!!
        }
        _messageTextLockOutline = Builder(name = "MessageTextLockOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 3.0f)
                verticalLineTo(2.5f)
                curveTo(23.0f, 1.12f, 21.88f, 0.0f, 20.5f, 0.0f)
                reflectiveCurveTo(18.0f, 1.12f, 18.0f, 2.5f)
                verticalLineTo(3.0f)
                curveTo(17.45f, 3.0f, 17.0f, 3.45f, 17.0f, 4.0f)
                verticalLineTo(8.0f)
                curveTo(17.0f, 8.55f, 17.45f, 9.0f, 18.0f, 9.0f)
                horizontalLineTo(23.0f)
                curveTo(23.55f, 9.0f, 24.0f, 8.55f, 24.0f, 8.0f)
                verticalLineTo(4.0f)
                curveTo(24.0f, 3.45f, 23.55f, 3.0f, 23.0f, 3.0f)
                moveTo(22.0f, 3.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(2.5f)
                curveTo(19.0f, 1.67f, 19.67f, 1.0f, 20.5f, 1.0f)
                reflectiveCurveTo(22.0f, 1.67f, 22.0f, 2.5f)
                verticalLineTo(3.0f)
                moveTo(6.0f, 11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                moveTo(6.0f, 7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.0f)
                moveTo(22.0f, 11.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 17.11f, 21.11f, 18.0f, 20.0f, 18.0f)
                horizontalLineTo(6.0f)
                lineTo(2.0f, 22.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 2.89f, 2.9f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.17f)
                lineTo(5.17f, 16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _messageTextLockOutline!!
    }

private var _messageTextLockOutline: ImageVector? = null
