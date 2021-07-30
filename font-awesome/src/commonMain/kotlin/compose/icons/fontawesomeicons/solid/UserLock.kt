package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.UserLock: ImageVector
    get() {
        if (_userLock != null) {
            return _userLock!!
        }
        _userLock = Builder(name = "UserLock", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 256.0f)
                arcTo(128.0f, 128.0f, 0.0f, true, false, 96.0f, 128.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, false, false, 128.0f, 128.0f)
                close()
                moveTo(320.0f, 320.0f)
                arcToRelative(63.08f, 63.08f, 0.0f, false, true, 8.1f, -30.5f)
                curveToRelative(-4.8f, -0.5f, -9.5f, -1.5f, -14.5f, -1.5f)
                horizontalLineToRelative(-16.7f)
                arcToRelative(174.08f, 174.08f, 0.0f, false, true, -145.8f, 0.0f)
                horizontalLineToRelative(-16.7f)
                arcTo(134.43f, 134.43f, 0.0f, false, false, 0.0f, 422.4f)
                lineTo(0.0f, 464.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.0f, 48.0f)
                horizontalLineToRelative(280.9f)
                arcToRelative(63.54f, 63.54f, 0.0f, false, true, -8.9f, -32.0f)
                close()
                moveTo(608.0f, 288.0f)
                horizontalLineToRelative(-32.0f)
                verticalLineToRelative(-80.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, -160.0f, 0.0f)
                verticalLineToRelative(80.0f)
                horizontalLineToRelative(-32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                verticalLineToRelative(160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineToRelative(224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(640.0f, 320.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, -32.0f)
                close()
                moveTo(496.0f, 432.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                close()
                moveTo(528.0f, 288.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(-80.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _userLock!!
    }

private var _userLock: ImageVector? = null
