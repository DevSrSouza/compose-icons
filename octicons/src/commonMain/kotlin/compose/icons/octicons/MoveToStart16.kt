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

public val Octicons.MoveToStart16: ImageVector
    get() {
        if (_moveToStart16 != null) {
            return _moveToStart16!!
        }
        _moveToStart16 = Builder(name = "MoveToStart16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.22f, 7.47f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, 0.0f, 1.06f)
                lineToRelative(3.75f, 3.75f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, 1.06f, -1.06f)
                lineTo(7.561f, 8.75f)
                horizontalLineToRelative(6.689f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineTo(7.561f)
                lineToRelative(2.469f, -2.47f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, false, -1.06f, -1.06f)
                lineTo(5.22f, 7.47f)
                close()
                moveTo(3.0f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-8.5f)
                close()
            }
        }
        .build()
        return _moveToStart16!!
    }

private var _moveToStart16: ImageVector? = null
