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

public val Octicons.Bold16: ImageVector
    get() {
        if (_bold16 != null) {
            return _bold16!!
        }
        _bold16 = Builder(name = "Bold16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                horizontalLineToRelative(4.5f)
                arcToRelative(3.501f, 3.501f, 0.0f, false, true, 2.852f, 5.53f)
                arcTo(3.499f, 3.499f, 0.0f, false, true, 9.5f, 14.0f)
                lineTo(4.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(5.0f, 9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(8.5f, 7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _bold16!!
    }

private var _bold16: ImageVector? = null
