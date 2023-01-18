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

public val RemixIcons.FileSettingsLine: ImageVector
    get() {
        if (_fileSettingsLine != null) {
            return _fileSettingsLine!!
        }
        _fileSettingsLine = Builder(name = "FileSettingsLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.595f, 12.812f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, true, 0.0f, -1.623f)
                lineToRelative(-0.992f, -0.573f)
                lineToRelative(1.0f, -1.732f)
                lineToRelative(0.992f, 0.573f)
                arcTo(3.496f, 3.496f, 0.0f, false, true, 11.0f, 8.645f)
                verticalLineTo(7.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.145f)
                curveToRelative(0.532f, 0.158f, 1.012f, 0.44f, 1.405f, 0.812f)
                lineToRelative(0.992f, -0.573f)
                lineToRelative(1.0f, 1.732f)
                lineToRelative(-0.992f, 0.573f)
                arcToRelative(3.51f, 3.51f, 0.0f, false, true, 0.0f, 1.622f)
                lineToRelative(0.992f, 0.573f)
                lineToRelative(-1.0f, 1.732f)
                lineToRelative(-0.992f, -0.573f)
                arcToRelative(3.496f, 3.496f, 0.0f, false, true, -1.405f, 0.812f)
                verticalLineTo(16.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.145f)
                arcToRelative(3.496f, 3.496f, 0.0f, false, true, -1.405f, -0.812f)
                lineToRelative(-0.992f, 0.573f)
                lineToRelative(-1.0f, -1.732f)
                lineToRelative(0.992f, -0.572f)
                close()
                moveTo(12.0f, 13.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
                moveTo(15.0f, 4.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(3.0f, 2.992f)
                curveTo(3.0f, 2.444f, 3.447f, 2.0f, 3.999f, 2.0f)
                horizontalLineTo(16.0f)
                lineToRelative(5.0f, 5.0f)
                verticalLineToRelative(13.993f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.007f, 22.0f)
                horizontalLineTo(3.993f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 21.008f)
                verticalLineTo(2.992f)
                close()
            }
        }
        .build()
        return _fileSettingsLine!!
    }

private var _fileSettingsLine: ImageVector? = null
