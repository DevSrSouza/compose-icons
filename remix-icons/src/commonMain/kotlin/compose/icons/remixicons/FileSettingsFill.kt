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

public val RemixIcons.FileSettingsFill: ImageVector
    get() {
        if (_fileSettingsFill != null) {
            return _fileSettingsFill!!
        }
        _fileSettingsFill = Builder(name = "FileSettingsFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                lineToRelative(5.0f, 5.0f)
                verticalLineToRelative(14.008f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, true, -0.993f, 0.992f)
                horizontalLineTo(3.993f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 21.008f)
                verticalLineTo(2.992f)
                curveTo(3.0f, 2.444f, 3.445f, 2.0f, 3.993f, 2.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(8.595f, 12.812f)
                lineToRelative(-0.992f, 0.572f)
                lineToRelative(1.0f, 1.732f)
                lineToRelative(0.992f, -0.573f)
                curveToRelative(0.393f, 0.372f, 0.873f, 0.654f, 1.405f, 0.812f)
                verticalLineTo(16.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.145f)
                arcToRelative(3.496f, 3.496f, 0.0f, false, false, 1.405f, -0.812f)
                lineToRelative(0.992f, 0.573f)
                lineToRelative(1.0f, -1.732f)
                lineToRelative(-0.992f, -0.573f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, false, 0.0f, -1.622f)
                lineToRelative(0.992f, -0.573f)
                lineToRelative(-1.0f, -1.732f)
                lineToRelative(-0.992f, 0.573f)
                arcTo(3.496f, 3.496f, 0.0f, false, false, 13.0f, 8.645f)
                verticalLineTo(7.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.145f)
                arcToRelative(3.496f, 3.496f, 0.0f, false, false, -1.405f, 0.812f)
                lineToRelative(-0.992f, -0.573f)
                lineToRelative(-1.0f, 1.732f)
                lineToRelative(0.992f, 0.573f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, false, 0.0f, 1.623f)
                close()
                moveTo(12.0f, 13.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
            }
        }
        .build()
        return _fileSettingsFill!!
    }

private var _fileSettingsFill: ImageVector? = null
