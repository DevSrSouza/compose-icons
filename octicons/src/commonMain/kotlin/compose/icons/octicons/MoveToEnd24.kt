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

public val Octicons.MoveToEnd24: ImageVector
    get() {
        if (_moveToEnd24 != null) {
            return _moveToEnd24!!
        }
        _moveToEnd24 = Builder(name = "MoveToEnd24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.22f, 5.22f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 1.06f, 0.0f)
                lineToRelative(6.25f, 6.25f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.0f, 1.06f)
                lineToRelative(-6.25f, 6.25f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(4.969f, -4.97f)
                lineTo(1.75f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(14.439f)
                lineTo(11.22f, 6.28f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.0f, -1.06f)
                close()
                moveTo(21.25f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(15.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-15.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                close()
            }
        }
        .build()
        return _moveToEnd24!!
    }

private var _moveToEnd24: ImageVector? = null
