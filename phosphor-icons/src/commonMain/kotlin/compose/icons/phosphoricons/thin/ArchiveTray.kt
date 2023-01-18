package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.ArchiveTray: ImageVector
    get() {
        if (_archiveTray != null) {
            return _archiveTray!!
        }
        _archiveTray = Builder(name = "ArchiveTray", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 36.0f)
                horizontalLineTo(48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 48.0f)
                verticalLineTo(159.9f)
                horizontalLineToRelative(0.0f)
                verticalLineTo(208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 36.0f)
                close()
                moveTo(48.0f, 44.0f)
                horizontalLineTo(208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineTo(156.0f)
                horizontalLineTo(179.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -8.5f, 3.5f)
                lineToRelative(-19.3f, 19.3f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.8f, 1.2f)
                horizontalLineTo(107.3f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, -2.8f, -1.2f)
                lineTo(85.2f, 159.5f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -8.5f, -3.5f)
                horizontalLineTo(44.0f)
                verticalLineTo(48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 48.0f, 44.0f)
                close()
                moveTo(208.0f, 212.0f)
                horizontalLineTo(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(164.0f)
                horizontalLineTo(76.7f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 2.8f, 1.2f)
                lineToRelative(19.3f, 19.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 8.5f, 3.5f)
                horizontalLineToRelative(41.4f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 8.5f, -3.5f)
                lineToRelative(19.3f, -19.3f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, 2.8f, -1.2f)
                horizontalLineTo(212.0f)
                verticalLineToRelative(44.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 208.0f, 212.0f)
                close()
                moveTo(91.2f, 120.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.7f, -5.7f)
                lineTo(124.0f, 142.3f)
                verticalLineTo(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(70.3f)
                lineToRelative(27.1f, -27.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.7f, 5.7f)
                lineToRelative(-34.0f, 33.9f)
                lineToRelative(-0.6f, 0.5f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.6f, 0.3f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-0.6f, -0.3f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.6f, -0.5f)
                close()
            }
        }
        .build()
        return _archiveTray!!
    }

private var _archiveTray: ImageVector? = null
