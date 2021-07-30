package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
                    pathFillType = EvenOdd) {
                moveTo(3.232f, 2.175f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -0.964f, 1.15f)
                lineToRelative(2.679f, 2.244f)
                lineTo(5.0f, 21.253f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.219f, 0.583f)
                lineTo(12.0f, 17.21f)
                lineToRelative(5.782f, 4.625f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 19.0f, 21.25f)
                verticalLineToRelative(-3.907f)
                lineToRelative(1.768f, 1.482f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.964f, -1.15f)
                lineToRelative(-18.5f, -15.5f)
                close()
                moveTo(7.422f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.482f, 1.325f)
                lineToRelative(10.828f, 9.073f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 19.0f, 11.823f)
                verticalLineTo(3.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 17.25f, 2.0f)
                horizontalLineTo(7.421f)
                horizontalLineToRelative(0.001f)
                close()
            }
        }
        .build()
        return _bookmarkSlashFill24!!
    }

private var _bookmarkSlashFill24: ImageVector? = null
