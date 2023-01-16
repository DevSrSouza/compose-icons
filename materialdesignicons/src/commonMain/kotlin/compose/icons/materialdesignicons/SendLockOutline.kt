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

public val MaterialDesignIcons.SendLockOutline: ImageVector
    get() {
        if (_sendLockOutline != null) {
            return _sendLockOutline!!
        }
        _sendLockOutline = Builder(name = "SendLockOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 18.0f)
                verticalLineTo(17.5f)
                curveTo(23.0f, 16.12f, 21.88f, 15.0f, 20.5f, 15.0f)
                reflectiveCurveTo(18.0f, 16.12f, 18.0f, 17.5f)
                verticalLineTo(18.0f)
                curveTo(17.45f, 18.0f, 17.0f, 18.45f, 17.0f, 19.0f)
                verticalLineTo(23.0f)
                curveTo(17.0f, 23.55f, 17.45f, 24.0f, 18.0f, 24.0f)
                horizontalLineTo(23.0f)
                curveTo(23.55f, 24.0f, 24.0f, 23.55f, 24.0f, 23.0f)
                verticalLineTo(19.0f)
                curveTo(24.0f, 18.45f, 23.55f, 18.0f, 23.0f, 18.0f)
                moveTo(22.0f, 18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.5f)
                curveTo(19.0f, 16.67f, 19.67f, 16.0f, 20.5f, 16.0f)
                reflectiveCurveTo(22.0f, 16.67f, 22.0f, 17.5f)
                verticalLineTo(18.0f)
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
        return _sendLockOutline!!
    }

private var _sendLockOutline: ImageVector? = null
