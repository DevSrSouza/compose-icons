package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.LinkBreak: ImageVector
    get() {
        if (_linkBreak != null) {
            return _linkBreak!!
        }
        _linkBreak = Builder(name = "LinkBreak", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(84.0f, 68.0f)
                lineTo(84.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(108.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(160.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(172.0f, 188.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 160.0f, 176.0f)
                close()
                moveTo(48.0f, 108.0f)
                lineTo(68.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(48.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(208.0f, 148.0f)
                lineTo(188.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(115.1f, 180.5f)
                lineTo(107.8f, 187.8f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -39.6f, -39.6f)
                lineToRelative(7.3f, -7.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineToRelative(-7.3f, 7.3f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 73.6f, 73.6f)
                lineToRelative(7.3f, -7.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                close()
                moveTo(187.8f, 68.2f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, 0.0f, 39.6f)
                lineToRelative(-7.3f, 7.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.5f, 20.5f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, false, 8.5f, -3.5f)
                lineToRelative(7.3f, -7.3f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -73.6f, -73.6f)
                lineToRelative(-7.3f, 7.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineToRelative(7.3f, -7.3f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 187.8f, 68.2f)
                close()
            }
        }
        .build()
        return _linkBreak!!
    }

private var _linkBreak: ImageVector? = null
