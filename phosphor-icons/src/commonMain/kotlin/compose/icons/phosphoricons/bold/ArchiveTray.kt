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

public val BoldGroup.ArchiveTray: ImageVector
    get() {
        if (_archiveTray != null) {
            return _archiveTray!!
        }
        _archiveTray = Builder(name = "ArchiveTray", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 28.0f)
                lineTo(48.0f, 28.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 28.0f, 48.0f)
                lineTo(28.0f, 155.9f)
                horizontalLineToRelative(0.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 48.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 208.0f, 28.0f)
                close()
                moveTo(204.0f, 52.0f)
                verticalLineToRelative(92.0f)
                lineTo(179.3f, 144.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, -14.1f, 5.9f)
                lineTo(147.0f, 168.0f)
                lineTo(109.0f, 168.0f)
                lineTo(90.8f, 149.9f)
                arcTo(19.8f, 19.8f, 0.0f, false, false, 76.7f, 144.0f)
                lineTo(52.0f, 144.0f)
                lineTo(52.0f, 52.0f)
                close()
                moveTo(52.0f, 204.0f)
                lineTo(52.0f, 168.0f)
                lineTo(75.0f, 168.0f)
                lineToRelative(18.2f, 18.1f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, 14.1f, 5.9f)
                horizontalLineToRelative(41.4f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 14.1f, -5.9f)
                lineTo(181.0f, 168.0f)
                horizontalLineToRelative(23.0f)
                verticalLineToRelative(36.0f)
                close()
                moveTo(91.2f, 124.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(116.0f, 115.0f)
                lineTo(116.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(39.0f)
                lineToRelative(7.8f, -7.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineToRelative(-28.3f, 28.3f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.8f, 0.8f)
                lineToRelative(-0.4f, 0.3f)
                lineToRelative(-0.5f, 0.4f)
                lineToRelative(-0.6f, 0.3f)
                lineToRelative(-0.4f, 0.3f)
                lineToRelative(-0.6f, 0.2f)
                lineToRelative(-0.5f, 0.3f)
                lineToRelative(-0.5f, 0.2f)
                lineToRelative(-0.6f, 0.2f)
                horizontalLineToRelative(-0.6f)
                lineToRelative(-0.6f, 0.2f)
                horizontalLineToRelative(-4.6f)
                lineToRelative(-0.6f, -0.2f)
                horizontalLineToRelative(-0.6f)
                lineToRelative(-0.6f, -0.2f)
                lineToRelative(-0.5f, -0.2f)
                lineToRelative(-0.5f, -0.3f)
                lineToRelative(-0.6f, -0.2f)
                lineToRelative(-0.4f, -0.3f)
                lineToRelative(-0.6f, -0.3f)
                lineToRelative(-0.5f, -0.4f)
                lineToRelative(-0.4f, -0.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.8f, -0.8f)
                horizontalLineToRelative(-0.1f)
                close()
            }
        }
        .build()
        return _archiveTray!!
    }

private var _archiveTray: ImageVector? = null
