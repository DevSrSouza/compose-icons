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

public val Octicons.MoveToEnd16: ImageVector
    get() {
        if (_moveToEnd16 != null) {
            return _moveToEnd16!!
        }
        _moveToEnd16 = Builder(name = "MoveToEnd16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.78f, 8.53f)
                lineToRelative(-3.75f, 3.75f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(2.469f, -2.47f)
                horizontalLineTo(1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(6.689f)
                lineTo(5.97f, 4.78f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(3.75f, 3.75f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.0f, 1.06f)
                close()
                moveTo(13.0f, 12.25f)
                verticalLineToRelative(-8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                close()
            }
        }
        .build()
        return _moveToEnd16!!
    }

private var _moveToEnd16: ImageVector? = null
