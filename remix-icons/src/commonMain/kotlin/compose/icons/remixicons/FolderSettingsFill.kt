package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.FolderSettingsFill: ImageVector
    get() {
        if (_folderSettingsFill != null) {
            return _folderSettingsFill!!
        }
        _folderSettingsFill = Builder(name = "FolderSettingsFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.414f, 5.0f)
                lineTo(21.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(7.414f)
                lineToRelative(2.0f, 2.0f)
                close()
                moveTo(8.591f, 13.809f)
                lineToRelative(-0.991f, 0.572f)
                lineToRelative(1.0f, 1.731f)
                lineToRelative(0.991f, -0.572f)
                curveToRelative(0.393f, 0.371f, 0.872f, 0.653f, 1.405f, 0.811f)
                verticalLineToRelative(1.145f)
                horizontalLineToRelative(1.999f)
                lineTo(12.995f, 16.35f)
                arcToRelative(3.495f, 3.495f, 0.0f, false, false, 1.404f, -0.811f)
                lineToRelative(0.991f, 0.572f)
                lineToRelative(1.0f, -1.73f)
                lineToRelative(-0.991f, -0.573f)
                arcToRelative(3.508f, 3.508f, 0.0f, false, false, 0.0f, -1.622f)
                lineToRelative(0.99f, -0.573f)
                lineToRelative(-0.999f, -1.73f)
                lineToRelative(-0.992f, 0.572f)
                arcToRelative(3.495f, 3.495f, 0.0f, false, false, -1.404f, -0.812f)
                lineTo(12.994f, 8.5f)
                horizontalLineToRelative(-1.999f)
                verticalLineToRelative(1.144f)
                arcToRelative(3.495f, 3.495f, 0.0f, false, false, -1.404f, 0.812f)
                lineTo(8.6f, 9.883f)
                lineTo(7.6f, 11.615f)
                lineToRelative(0.991f, 0.572f)
                arcToRelative(3.508f, 3.508f, 0.0f, false, false, 0.0f, 1.622f)
                close()
                moveTo(11.995f, 14.497f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -2.998f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 2.998f)
                close()
            }
        }
        .build()
        return _folderSettingsFill!!
    }

private var _folderSettingsFill: ImageVector? = null
