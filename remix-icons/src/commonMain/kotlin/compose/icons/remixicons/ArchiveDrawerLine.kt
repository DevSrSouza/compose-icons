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

public val RemixIcons.ArchiveDrawerLine: ImageVector
    get() {
        if (_archiveDrawerLine != null) {
            return _archiveDrawerLine!!
        }
        _archiveDrawerLine = Builder(name = "ArchiveDrawerLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.992f)
                curveTo(3.0f, 2.444f, 3.445f, 2.0f, 3.993f, 2.0f)
                horizontalLineToRelative(16.014f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.993f, 0.992f)
                verticalLineToRelative(18.016f)
                arcToRelative(0.993f, 0.993f, 0.0f, false, true, -0.993f, 0.992f)
                lineTo(3.993f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 21.008f)
                lineTo(3.0f, 2.992f)
                close()
                moveTo(19.0f, 11.0f)
                lineTo(19.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(19.0f, 13.0f)
                lineTo(5.0f, 13.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(9.0f, 6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 8.0f)
                lineTo(9.0f, 6.0f)
                close()
                moveTo(9.0f, 15.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                lineTo(9.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _archiveDrawerLine!!
    }

private var _archiveDrawerLine: ImageVector? = null
