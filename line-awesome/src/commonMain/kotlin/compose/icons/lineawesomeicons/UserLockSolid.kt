package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.UserLockSolid: ImageVector
    get() {
        if (_userLockSolid != null) {
            return _userLockSolid!!
        }
        _userLockSolid = Builder(name = "UserLockSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(12.1f, 5.0f, 9.0f, 8.1f, 9.0f, 12.0f)
                curveTo(9.0f, 14.4375f, 10.21f, 16.5615f, 12.0703f, 17.8125f)
                curveTo(8.51f, 19.3473f, 6.0f, 22.8936f, 6.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                curveTo(8.0f, 22.6f, 11.6f, 19.0f, 16.0f, 19.0f)
                curveTo(17.2f, 19.0f, 18.4004f, 19.3008f, 19.4004f, 19.8008f)
                curveTo(19.7004f, 19.2008f, 20.0f, 18.5996f, 20.5f, 18.0996f)
                curveTo(20.301f, 18.0001f, 20.0956f, 17.9211f, 19.8926f, 17.834f)
                curveTo(21.7723f, 16.5861f, 23.0f, 14.4524f, 23.0f, 12.0f)
                curveTo(23.0f, 8.1f, 19.9f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(18.8f, 7.0f, 21.0f, 9.2f, 21.0f, 12.0f)
                curveTo(21.0f, 14.8f, 18.8f, 17.0f, 16.0f, 17.0f)
                curveTo(13.2f, 17.0f, 11.0f, 14.8f, 11.0f, 12.0f)
                curveTo(11.0f, 9.2f, 13.2f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(25.0f, 18.0f)
                curveTo(22.8f, 18.0f, 21.0f, 19.8f, 21.0f, 22.0f)
                lineTo(21.0f, 24.0f)
                lineTo(18.0f, 24.0f)
                lineTo(18.0f, 32.0f)
                lineTo(32.0f, 32.0f)
                lineTo(32.0f, 24.0f)
                lineTo(29.0f, 24.0f)
                lineTo(29.0f, 22.0f)
                curveTo(29.0f, 19.8f, 27.2f, 18.0f, 25.0f, 18.0f)
                close()
                moveTo(25.0f, 20.0f)
                curveTo(26.1f, 20.0f, 27.0f, 20.9f, 27.0f, 22.0f)
                lineTo(27.0f, 24.0f)
                lineTo(23.0f, 24.0f)
                lineTo(23.0f, 22.0f)
                curveTo(23.0f, 20.9f, 23.9f, 20.0f, 25.0f, 20.0f)
                close()
                moveTo(20.0f, 26.0f)
                lineTo(30.0f, 26.0f)
                lineTo(30.0f, 30.0f)
                lineTo(20.0f, 30.0f)
                lineTo(20.0f, 26.0f)
                close()
            }
        }
        .build()
        return _userLockSolid!!
    }

private var _userLockSolid: ImageVector? = null
