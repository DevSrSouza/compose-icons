package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.BookmarkSlashFill24: ImageVector
    get() {
        if (_bookmarkSlashFill24 != null) {
            return _bookmarkSlashFill24!!
        }
        _bookmarkSlashFill24 = Builder(name = "BookmarkSlashFill24", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.232f, 2.175f)
                lineToRelative(18.5f, 15.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.964f, 1.15f)
                lineTo(19.0f, 17.343f)
                verticalLineToRelative(3.907f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.218f, 0.585f)
                lineTo(12.0f, 17.21f)
                lineToRelative(-5.781f, 4.626f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 5.0f, 21.253f)
                lineTo(4.947f, 5.569f)
                lineTo(2.268f, 3.325f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.964f, -1.15f)
                close()
                moveTo(7.421f, 2.0f)
                horizontalLineToRelative(9.829f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(8.073f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.232f, 0.575f)
                lineTo(6.94f, 3.325f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 7.421f, 2.0f)
                close()
            }
        }
        .build()
        return _bookmarkSlashFill24!!
    }

private var _bookmarkSlashFill24: ImageVector? = null
