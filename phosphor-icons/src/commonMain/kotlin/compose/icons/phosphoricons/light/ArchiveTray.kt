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

public val LightGroup.ArchiveTray: ImageVector
    get() {
        if (_archiveTray != null) {
            return _archiveTray!!
        }
        _archiveTray = Builder(name = "ArchiveTray", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 34.0f)
                horizontalLineTo(48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 48.0f)
                verticalLineTo(159.9f)
                horizontalLineToRelative(0.0f)
                verticalLineTo(208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineTo(208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 34.0f)
                close()
                moveTo(48.0f, 46.0f)
                horizontalLineTo(208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineTo(154.0f)
                horizontalLineTo(179.3f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, false, -9.9f, 4.1f)
                lineToRelative(-19.3f, 19.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.4f, 0.6f)
                horizontalLineTo(107.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.4f, -0.6f)
                lineTo(86.6f, 158.1f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, false, -9.9f, -4.1f)
                horizontalLineTo(46.0f)
                verticalLineTo(48.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 48.0f, 46.0f)
                close()
                moveTo(208.0f, 210.0f)
                horizontalLineTo(48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(166.0f)
                horizontalLineTo(76.7f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.4f, 0.6f)
                lineToRelative(19.3f, 19.3f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, false, 9.9f, 4.1f)
                horizontalLineToRelative(41.4f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, false, 9.9f, -4.1f)
                lineToRelative(19.3f, -19.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.4f, -0.6f)
                horizontalLineTo(210.0f)
                verticalLineToRelative(42.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 208.0f, 210.0f)
                close()
                moveTo(89.8f, 122.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.5f, -8.5f)
                lineTo(122.0f, 137.5f)
                verticalLineTo(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(65.5f)
                lineToRelative(23.7f, -23.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.5f, 8.5f)
                lineToRelative(-34.0f, 33.9f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.4f, 0.4f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.4f, 0.3f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.4f, 0.2f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.4f, 0.2f)
                horizontalLineToRelative(-4.6f)
                lineToRelative(-0.4f, -0.2f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.4f, -0.2f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.4f, -0.3f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.4f, -0.4f)
                close()
            }
        }
        .build()
        return _archiveTray!!
    }

private var _archiveTray: ImageVector? = null
