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

public val BoldGroup.ArchiveBox: ImageVector
    get() {
        if (_archiveBox != null) {
            return _archiveBox!!
        }
        _archiveBox = Builder(name = "ArchiveBox", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.0f, 71.1f)
                lineToRelative(-16.0f, -36.0f)
                arcTo(12.2f, 12.2f, 0.0f, false, false, 200.0f, 28.0f)
                lineTo(56.0f, 28.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -11.0f, 7.1f)
                lineToRelative(-16.0f, 36.0f)
                arcTo(13.8f, 13.8f, 0.0f, false, false, 28.0f, 76.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 76.0f)
                arcTo(13.8f, 13.8f, 0.0f, false, false, 227.0f, 71.1f)
                close()
                moveTo(192.2f, 52.0f)
                lineToRelative(5.3f, 12.0f)
                lineTo(58.5f, 64.0f)
                lineToRelative(5.3f, -12.0f)
                close()
                moveTo(52.0f, 204.0f)
                lineTo(52.0f, 88.0f)
                lineTo(204.0f, 88.0f)
                lineTo(204.0f, 204.0f)
                close()
                moveTo(164.8f, 143.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-28.3f, 28.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                lineTo(91.2f, 160.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(116.0f, 151.0f)
                lineTo(116.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(39.0f)
                lineToRelative(7.8f, -7.8f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.8f, 143.2f)
                close()
            }
        }
        .build()
        return _archiveBox!!
    }

private var _archiveBox: ImageVector? = null
