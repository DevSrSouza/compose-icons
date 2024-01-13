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

public val Octicons.Bookmark16: ImageVector
    get() {
        if (_bookmark16 != null) {
            return _bookmark16!!
        }
        _bookmark16 = Builder(name = "Bookmark16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.75f)
                curveTo(3.0f, 1.784f, 3.784f, 1.0f, 4.75f, 1.0f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(11.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.227f, 0.579f)
                lineTo(8.0f, 11.722f)
                lineToRelative(-3.773f, 3.107f)
                arcTo(0.751f, 0.751f, 0.0f, false, true, 3.0f, 14.25f)
                close()
                moveTo(4.75f, 2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(9.91f)
                lineToRelative(3.023f, -2.489f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.954f, 0.0f)
                lineToRelative(3.023f, 2.49f)
                lineTo(11.5f, 2.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
            }
        }
        .build()
        return _bookmark16!!
    }

private var _bookmark16: ImageVector? = null
