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

public val RemixIcons.FolderShield2Fill: ImageVector
    get() {
        if (_folderShield2Fill != null) {
            return _folderShield2Fill!!
        }
        _folderShield2Fill = Builder(name = "FolderShield2Fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 10.0f)
                lineTo(12.0f, 10.0f)
                verticalLineToRelative(7.382f)
                curveToRelative(0.0f, 1.409f, 0.632f, 2.734f, 1.705f, 3.618f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(7.414f)
                lineToRelative(2.0f, 2.0f)
                lineTo(21.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(14.0f, 12.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(5.382f)
                curveToRelative(0.0f, 0.897f, -0.446f, 1.734f, -1.187f, 2.23f)
                lineTo(18.0f, 21.499f)
                lineToRelative(-2.813f, -1.885f)
                arcTo(2.685f, 2.685f, 0.0f, false, true, 14.0f, 17.383f)
                lineTo(14.0f, 12.0f)
                close()
            }
        }
        .build()
        return _folderShield2Fill!!
    }

private var _folderShield2Fill: ImageVector? = null
