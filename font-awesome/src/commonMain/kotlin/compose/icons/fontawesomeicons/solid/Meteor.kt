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

public val SolidGroup.Meteor: ImageVector
    get() {
        if (_meteor != null) {
            return _meteor!!
        }
        _meteor = Builder(name = "Meteor", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(493.7f, 0.9f)
                lineTo(299.4f, 75.6f)
                lineToRelative(2.3f, -29.3f)
                curveToRelative(1.0f, -12.8f, -12.8f, -21.5f, -24.0f, -15.1f)
                lineTo(101.3f, 133.4f)
                curveTo(38.6f, 169.7f, 0.0f, 236.6f, 0.0f, 309.0f)
                curveTo(0.0f, 421.1f, 90.9f, 512.0f, 203.0f, 512.0f)
                curveToRelative(72.4f, 0.0f, 139.4f, -38.6f, 175.7f, -101.3f)
                lineTo(480.8f, 234.3f)
                curveToRelative(6.5f, -11.1f, -2.2f, -25.0f, -15.1f, -24.0f)
                lineToRelative(-29.3f, 2.3f)
                lineTo(511.1f, 18.3f)
                curveToRelative(0.6f, -1.5f, 0.9f, -3.2f, 0.9f, -4.8f)
                curveTo(512.0f, 6.0f, 506.0f, 0.0f, 498.5f, 0.0f)
                curveToRelative(-1.7f, 0.0f, -3.3f, 0.3f, -4.8f, 0.9f)
                close()
                moveTo(192.0f, 192.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, true, 0.0f, 256.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, true, 0.0f, -256.0f)
                close()
                moveTo(192.0f, 288.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(208.0f, 384.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, -32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, 32.0f)
                close()
            }
        }
        .build()
        return _meteor!!
    }

private var _meteor: ImageVector? = null
