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

public val RemixIcons.FileZipFill: ImageVector
    get() {
        if (_fileZipFill != null) {
            return _fileZipFill!!
        }
        _fileZipFill = Builder(name = "FileZipFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(12.0f, 2.0f)
                horizontalLineToRelative(8.007f)
                curveToRelative(0.548f, 0.0f, 0.993f, 0.444f, 0.993f, 0.992f)
                verticalLineToRelative(18.016f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.993f, 0.992f)
                lineTo(3.993f, 22.0f)
                arcTo(0.993f, 0.993f, 0.0f, false, true, 3.0f, 21.008f)
                lineTo(3.0f, 2.992f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.993f, 2.0f)
                lineTo(10.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(14.0f, 4.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(10.0f, 6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(12.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(12.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(14.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(10.0f, 10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(12.0f, 12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _fileZipFill!!
    }

private var _fileZipFill: ImageVector? = null
