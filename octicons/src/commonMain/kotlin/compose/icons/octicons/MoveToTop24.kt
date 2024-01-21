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

public val Octicons.MoveToTop24: ImageVector
    get() {
        if (_moveToTop24 != null) {
            return _moveToTop24!!
        }
        _moveToTop24 = Builder(name = "MoveToTop24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.75f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(4.75f, 3.5f)
                close()
                moveTo(5.22f, 12.97f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, 1.06f, 1.06f)
                lineToRelative(4.97f, -4.969f)
                lineTo(11.25f, 21.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                lineTo(12.75f, 9.061f)
                lineToRelative(4.97f, 4.969f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, 1.06f, -1.06f)
                lineToRelative(-6.25f, -6.25f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, -1.06f, 0.0f)
                lineToRelative(-6.25f, 6.25f)
                close()
            }
        }
        .build()
        return _moveToTop24!!
    }

private var _moveToTop24: ImageVector? = null
