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

public val Octicons.MoveToStart24: ImageVector
    get() {
        if (_moveToStart24 != null) {
            return _moveToStart24!!
        }
        _moveToStart24 = Builder(name = "MoveToStart24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.78f, 18.78f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -1.06f, 0.0f)
                lineToRelative(-6.25f, -6.25f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.0f, -1.06f)
                lineToRelative(6.25f, -6.25f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, 1.06f, 1.06f)
                lineToRelative(-4.969f, 4.97f)
                horizontalLineTo(22.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(7.811f)
                lineToRelative(4.969f, 4.97f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.0f, 1.06f)
                close()
                moveTo(2.75f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(15.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-15.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                close()
            }
        }
        .build()
        return _moveToStart24!!
    }

private var _moveToStart24: ImageVector? = null
