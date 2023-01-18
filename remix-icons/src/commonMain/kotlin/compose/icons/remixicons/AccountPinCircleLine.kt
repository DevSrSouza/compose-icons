package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.AccountPinCircleLine: ImageVector
    get() {
        if (_accountPinCircleLine != null) {
            return _accountPinCircleLine!!
        }
        _accountPinCircleLine = Builder(name = "AccountPinCircleLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.745f, 21.745f)
                curveTo(5.308f, 20.722f, 2.0f, 16.747f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                curveToRelative(0.0f, 4.747f, -3.308f, 8.722f, -7.745f, 9.745f)
                lineTo(12.0f, 24.0f)
                lineToRelative(-2.255f, -2.255f)
                close()
                moveTo(7.012f, 18.257f)
                arcToRelative(7.953f, 7.953f, 0.0f, false, false, 3.182f, 1.539f)
                lineToRelative(0.56f, 0.129f)
                lineTo(12.0f, 21.172f)
                lineToRelative(1.247f, -1.247f)
                lineToRelative(0.56f, -0.13f)
                arcToRelative(7.956f, 7.956f, 0.0f, false, false, 3.36f, -1.686f)
                arcTo(6.979f, 6.979f, 0.0f, false, false, 12.16f, 16.0f)
                curveToRelative(-2.036f, 0.0f, -3.87f, 0.87f, -5.148f, 2.257f)
                close()
                moveTo(5.616f, 16.82f)
                arcTo(8.975f, 8.975f, 0.0f, false, true, 12.16f, 14.0f)
                arcToRelative(8.972f, 8.972f, 0.0f, false, true, 6.362f, 2.634f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -12.906f, 0.187f)
                close()
                moveTo(12.0f, 13.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _accountPinCircleLine!!
    }

private var _accountPinCircleLine: ImageVector? = null
