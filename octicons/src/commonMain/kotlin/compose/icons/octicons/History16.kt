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

public val Octicons.History16: ImageVector
    get() {
        if (_history16 != null) {
            return _history16!!
        }
        _history16 = Builder(name = "History16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(0.427f, 1.927f)
                lineToRelative(1.215f, 1.215f)
                arcToRelative(8.002f, 8.002f, 0.0f, true, true, -1.6f, 5.685f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.493f, -0.154f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 1.18f, -4.458f)
                lineToRelative(1.358f, 1.358f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 3.896f, 6.0f)
                horizontalLineTo(0.25f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 0.0f, 5.75f)
                verticalLineTo(2.104f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.427f, -0.177f)
                close()
                moveTo(7.75f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(2.992f)
                lineToRelative(2.028f, 0.812f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.557f, 1.392f)
                lineToRelative(-2.5f, -1.0f)
                arcTo(0.751f, 0.751f, 0.0f, false, true, 7.0f, 8.25f)
                verticalLineToRelative(-3.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 7.75f, 4.0f)
                close()
            }
        }
        .build()
        return _history16!!
    }

private var _history16: ImageVector? = null
