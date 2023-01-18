package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.LinkBreak: ImageVector
    get() {
        if (_linkBreak != null) {
            return _linkBreak!!
        }
        _linkBreak = Builder(name = "LinkBreak", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(90.0f, 72.0f)
                lineTo(90.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(102.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(160.0f, 178.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(166.0f, 184.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 160.0f, 178.0f)
                close()
                moveTo(48.0f, 102.0f)
                lineTo(72.0f, 102.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(48.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(208.0f, 154.0f)
                lineTo(184.0f, 154.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(123.4f, 180.7f)
                lineTo(112.0f, 192.0f)
                arcToRelative(33.9f, 33.9f, 0.0f, false, true, -48.0f, -48.0f)
                lineToRelative(11.3f, -11.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.5f, -8.4f)
                lineTo(55.5f, 135.5f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, 65.0f, 65.0f)
                lineToRelative(11.3f, -11.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.4f, -8.5f)
                close()
                moveTo(192.0f, 112.0f)
                lineToRelative(-11.3f, 11.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.5f, 8.4f)
                lineToRelative(11.3f, -11.3f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -65.0f, -65.0f)
                lineTo(124.2f, 66.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.4f, 8.5f)
                lineTo(144.0f, 64.0f)
                arcToRelative(33.9f, 33.9f, 0.0f, false, true, 48.0f, 48.0f)
                close()
            }
        }
        .build()
        return _linkBreak!!
    }

private var _linkBreak: ImageVector? = null
