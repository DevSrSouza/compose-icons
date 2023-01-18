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

public val RemixIcons.AccountPinCircleFill: ImageVector
    get() {
        if (_accountPinCircleFill != null) {
            return _accountPinCircleFill!!
        }
        _accountPinCircleFill = Builder(name = "AccountPinCircleFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.256f, 21.744f)
                lineTo(12.0f, 24.0f)
                lineToRelative(-2.256f, -2.256f)
                curveTo(5.31f, 20.72f, 2.0f, 16.744f, 2.0f, 12.0f)
                curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.48f, 10.0f, 10.0f)
                curveToRelative(0.0f, 4.744f, -3.31f, 8.72f, -7.744f, 9.744f)
                close()
                moveTo(6.023f, 15.416f)
                curveTo(7.491f, 17.606f, 9.695f, 19.0f, 12.16f, 19.0f)
                curveToRelative(2.464f, 0.0f, 4.669f, -1.393f, 6.136f, -3.584f)
                arcTo(8.968f, 8.968f, 0.0f, false, false, 12.16f, 13.0f)
                arcToRelative(8.968f, 8.968f, 0.0f, false, false, -6.137f, 2.416f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                close()
            }
        }
        .build()
        return _accountPinCircleFill!!
    }

private var _accountPinCircleFill: ImageVector? = null
