package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Users: ImageVector
    get() {
        if (_users != null) {
            return _users!!
        }
        _users = Builder(name = "Users", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(88.0f, 108.0f)
                moveToRelative(-52.0f, 0.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 104.0f, 0.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, -104.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(121.2f, 157.9f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, false, -66.4f, 0.0f)
                arcTo(95.5f, 95.5f, 0.0f, false, false, 9.5f, 192.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.0f, 9.2f)
                arcToRelative(80.1f, 80.1f, 0.0f, false, true, 131.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.0f, -9.2f)
                arcTo(95.5f, 95.5f, 0.0f, false, false, 121.2f, 157.9f)
                close()
                moveTo(44.0f, 108.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 44.0f, 44.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 44.0f, 108.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.1f, 192.8f)
                arcToRelative(96.3f, 96.3f, 0.0f, false, false, -45.4f, -34.9f)
                arcTo(59.9f, 59.9f, 0.0f, false, false, 169.5f, 48.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -16.3f, 2.2f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -5.5f, 9.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.9f, 5.5f)
                arcTo(47.4f, 47.4f, 0.0f, false, true, 169.5f, 64.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 0.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                arcTo(80.2f, 80.2f, 0.0f, false, true, 235.0f, 202.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 11.1f, 1.9f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 248.1f, 192.8f)
                close()
            }
        }
        .build()
        return _users!!
    }

private var _users: ImageVector? = null
