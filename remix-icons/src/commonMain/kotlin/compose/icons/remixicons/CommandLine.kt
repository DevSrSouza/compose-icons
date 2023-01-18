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

public val RemixIcons.CommandLine: ImageVector
    get() {
        if (_commandLine != null) {
            return _commandLine!!
        }
        _commandLine = Builder(name = "CommandLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 8.0f)
                horizontalLineToRelative(4.0f)
                lineTo(14.0f, 6.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 3.5f, 3.5f)
                lineTo(16.0f, 10.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -3.5f, 3.5f)
                lineTo(14.0f, 16.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.5f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 6.5f, 14.0f)
                lineTo(8.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                lineTo(6.5f, 10.0f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 10.0f, 6.5f)
                lineTo(10.0f, 8.0f)
                close()
                moveTo(8.0f, 8.0f)
                lineTo(8.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 6.5f, 8.0f)
                lineTo(8.0f, 8.0f)
                close()
                moveTo(8.0f, 16.0f)
                lineTo(6.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 8.0f, 17.5f)
                lineTo(8.0f, 16.0f)
                close()
                moveTo(16.0f, 8.0f)
                horizontalLineToRelative(1.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 16.0f, 6.5f)
                lineTo(16.0f, 8.0f)
                close()
                moveTo(16.0f, 16.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 1.5f, -1.5f)
                lineTo(16.0f, 16.0f)
                close()
                moveTo(10.0f, 10.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _commandLine!!
    }

private var _commandLine: ImageVector? = null
