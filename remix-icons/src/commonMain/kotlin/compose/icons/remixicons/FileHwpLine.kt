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

public val RemixIcons.FileHwpLine: ImageVector
    get() {
        if (_fileHwpLine != null) {
            return _fileHwpLine!!
        }
        _fileHwpLine = Builder(name = "FileHwpLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                lineToRelative(5.0f, 5.0f)
                verticalLineToRelative(13.993f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.007f, 22.0f)
                lineTo(3.993f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 21.008f)
                lineTo(3.0f, 2.992f)
                curveTo(3.0f, 2.444f, 3.447f, 2.0f, 3.999f, 2.0f)
                lineTo(16.0f, 2.0f)
                close()
                moveTo(16.0f, 8.667f)
                lineTo(8.0f, 8.667f)
                lineTo(8.0f, 7.333f)
                horizontalLineToRelative(3.333f)
                lineTo(11.333f, 6.0f)
                horizontalLineToRelative(1.334f)
                lineToRelative(-0.001f, 1.333f)
                horizontalLineToRelative(2.333f)
                lineTo(15.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 8.0f)
                lineToRelative(-3.0f, -0.001f)
                verticalLineToRelative(0.668f)
                close()
                moveTo(9.333f, 14.667f)
                verticalLineToRelative(1.999f)
                lineTo(16.0f, 16.666f)
                lineTo(16.0f, 18.0f)
                lineTo(8.0f, 18.0f)
                verticalLineToRelative(-3.333f)
                horizontalLineToRelative(1.333f)
                close()
                moveTo(12.0f, 14.333f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                close()
                moveTo(12.0f, 9.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                close()
                moveTo(12.0f, 10.333f)
                arcToRelative(1.167f, 1.167f, 0.0f, true, false, 0.0f, 2.334f)
                arcToRelative(1.167f, 1.167f, 0.0f, false, false, 0.0f, -2.334f)
                close()
            }
        }
        .build()
        return _fileHwpLine!!
    }

private var _fileHwpLine: ImageVector? = null
