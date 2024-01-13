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

public val SolidGroup.UserTag: ImageVector
    get() {
        if (_userTag != null) {
            return _userTag!!
        }
        _userTag = Builder(name = "UserTag", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 256.0f)
                arcTo(128.0f, 128.0f, 0.0f, true, false, 224.0f, 0.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, 0.0f, 256.0f)
                close()
                moveTo(178.3f, 304.0f)
                curveTo(79.8f, 304.0f, 0.0f, 383.8f, 0.0f, 482.3f)
                curveTo(0.0f, 498.7f, 13.3f, 512.0f, 29.7f, 512.0f)
                lineTo(418.3f, 512.0f)
                curveToRelative(10.0f, 0.0f, 18.8f, -4.9f, 24.2f, -12.5f)
                lineToRelative(-99.2f, -99.2f)
                curveToRelative(-14.9f, -14.9f, -23.3f, -35.1f, -23.3f, -56.1f)
                verticalLineToRelative(-33.0f)
                curveToRelative(-15.9f, -4.7f, -32.8f, -7.2f, -50.3f, -7.2f)
                lineTo(178.3f, 304.0f)
                close()
                moveTo(384.0f, 224.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(82.7f)
                curveToRelative(0.0f, 17.0f, 6.7f, 33.3f, 18.7f, 45.3f)
                lineTo(478.1f, 491.3f)
                curveToRelative(18.7f, 18.7f, 49.1f, 18.7f, 67.9f, 0.0f)
                lineToRelative(73.4f, -73.4f)
                curveToRelative(18.7f, -18.7f, 18.7f, -49.1f, 0.0f, -67.9f)
                lineTo(512.0f, 242.7f)
                curveToRelative(-12.0f, -12.0f, -28.3f, -18.7f, -45.3f, -18.7f)
                lineTo(384.0f, 224.0f)
                close()
                moveTo(408.0f, 304.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _userTag!!
    }

private var _userTag: ImageVector? = null
