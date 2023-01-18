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

public val RemixIcons.FolderShieldLine: ImageVector
    get() {
        if (_folderShieldLine != null) {
            return _folderShieldLine!!
        }
        _folderShieldLine = Builder(name = "FolderShieldLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(4.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 7.0f)
                horizontalLineToRelative(-8.414f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(4.0f, 5.0f)
                close()
                moveTo(8.0f, 9.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(4.904f)
                curveToRelative(0.0f, 0.892f, -0.446f, 1.724f, -1.187f, 2.219f)
                lineTo(12.0f, 17.998f)
                lineToRelative(-2.813f, -1.875f)
                arcTo(2.667f, 2.667f, 0.0f, false, true, 8.0f, 13.904f)
                lineTo(8.0f, 9.0f)
                close()
                moveTo(10.0f, 13.904f)
                curveToRelative(0.0f, 0.223f, 0.111f, 0.431f, 0.297f, 0.555f)
                lineTo(12.0f, 15.594f)
                lineToRelative(1.703f, -1.135f)
                arcToRelative(0.667f, 0.667f, 0.0f, false, false, 0.297f, -0.555f)
                lineTo(14.0f, 11.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.904f)
                close()
            }
        }
        .build()
        return _folderShieldLine!!
    }

private var _folderShieldLine: ImageVector? = null
