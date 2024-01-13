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

public val SolidGroup.Users: ImageVector
    get() {
        if (_users != null) {
            return _users!!
        }
        _users = Builder(name = "Users", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 0.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 0.0f, 160.0f)
                arcTo(80.0f, 80.0f, 0.0f, true, true, 144.0f, 0.0f)
                close()
                moveTo(512.0f, 0.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 0.0f, 160.0f)
                arcTo(80.0f, 80.0f, 0.0f, true, true, 512.0f, 0.0f)
                close()
                moveTo(0.0f, 298.7f)
                curveTo(0.0f, 239.8f, 47.8f, 192.0f, 106.7f, 192.0f)
                horizontalLineToRelative(42.7f)
                curveToRelative(15.9f, 0.0f, 31.0f, 3.5f, 44.6f, 9.7f)
                curveToRelative(-1.3f, 7.2f, -1.9f, 14.7f, -1.9f, 22.3f)
                curveToRelative(0.0f, 38.2f, 16.8f, 72.5f, 43.3f, 96.0f)
                curveToRelative(-0.2f, 0.0f, -0.4f, 0.0f, -0.7f, 0.0f)
                horizontalLineTo(21.3f)
                curveTo(9.6f, 320.0f, 0.0f, 310.4f, 0.0f, 298.7f)
                close()
                moveTo(405.3f, 320.0f)
                curveToRelative(-0.2f, 0.0f, -0.4f, 0.0f, -0.7f, 0.0f)
                curveToRelative(26.6f, -23.5f, 43.3f, -57.8f, 43.3f, -96.0f)
                curveToRelative(0.0f, -7.6f, -0.7f, -15.0f, -1.9f, -22.3f)
                curveToRelative(13.6f, -6.3f, 28.7f, -9.7f, 44.6f, -9.7f)
                horizontalLineToRelative(42.7f)
                curveTo(592.2f, 192.0f, 640.0f, 239.8f, 640.0f, 298.7f)
                curveToRelative(0.0f, 11.8f, -9.6f, 21.3f, -21.3f, 21.3f)
                horizontalLineTo(405.3f)
                close()
                moveTo(224.0f, 224.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 192.0f, 0.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, -192.0f, 0.0f)
                close()
                moveTo(128.0f, 485.3f)
                curveTo(128.0f, 411.7f, 187.7f, 352.0f, 261.3f, 352.0f)
                horizontalLineTo(378.7f)
                curveTo(452.3f, 352.0f, 512.0f, 411.7f, 512.0f, 485.3f)
                curveToRelative(0.0f, 14.7f, -11.9f, 26.7f, -26.7f, 26.7f)
                horizontalLineTo(154.7f)
                curveToRelative(-14.7f, 0.0f, -26.7f, -11.9f, -26.7f, -26.7f)
                close()
            }
        }
        .build()
        return _users!!
    }

private var _users: ImageVector? = null
