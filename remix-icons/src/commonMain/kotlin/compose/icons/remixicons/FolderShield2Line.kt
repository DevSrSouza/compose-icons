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

public val RemixIcons.FolderShield2Line: ImageVector
    get() {
        if (_folderShield2Line != null) {
            return _folderShield2Line!!
        }
        _folderShield2Line = Builder(name = "FolderShield2Line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(20.0f, 7.0f)
                horizontalLineToRelative(-8.414f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(7.447f)
                arcToRelative(4.97f, 4.97f, 0.0f, false, false, 1.664f, 2.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(7.414f)
                lineToRelative(2.0f, 2.0f)
                lineTo(21.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(5.949f)
                curveToRelative(0.0f, 0.99f, -0.501f, 1.916f, -1.336f, 2.465f)
                lineTo(17.5f, 21.498f)
                lineToRelative(-3.164f, -2.084f)
                arcTo(2.953f, 2.953f, 0.0f, false, true, 13.0f, 16.95f)
                lineTo(13.0f, 11.0f)
                close()
                moveTo(15.0f, 16.949f)
                curveToRelative(0.0f, 0.316f, 0.162f, 0.614f, 0.436f, 0.795f)
                lineToRelative(2.064f, 1.36f)
                lineToRelative(2.064f, -1.36f)
                arcToRelative(0.954f, 0.954f, 0.0f, false, false, 0.436f, -0.795f)
                lineTo(20.0f, 13.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(3.949f)
                close()
            }
        }
        .build()
        return _folderShield2Line!!
    }

private var _folderShield2Line: ImageVector? = null
