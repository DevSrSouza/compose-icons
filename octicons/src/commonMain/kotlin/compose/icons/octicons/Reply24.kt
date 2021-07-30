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

public val Octicons.Reply24: ImageVector
    get() {
        if (_reply24 != null) {
            return _reply24!!
        }
        _reply24 = Builder(name = "Reply24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.53f, 5.03f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineToRelative(-6.25f, 6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.06f)
                lineToRelative(6.25f, 6.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineTo(5.56f, 11.5f)
                horizontalLineTo(17.0f)
                arcToRelative(3.248f, 3.248f, 0.0f, false, true, 3.25f, 3.248f)
                verticalLineToRelative(4.502f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-4.502f)
                arcTo(4.748f, 4.748f, 0.0f, false, false, 17.0f, 10.0f)
                horizontalLineTo(5.56f)
                lineToRelative(4.97f, -4.97f)
                close()
            }
        }
        .build()
        return _reply24!!
    }

private var _reply24: ImageVector? = null
