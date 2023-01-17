package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Obsidian: ImageVector
    get() {
        if (_obsidian != null) {
            return _obsidian!!
        }
        _obsidian = Builder(name = "Obsidian", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.074f, 0.0f)
                curveTo(12.586f, 1.374f, 10.1f, 2.749f, 7.613f, 4.124f)
                lineToRelative(0.823f, 4.266f)
                lineToRelative(6.365f, -5.015f)
                close()
                moveTo(15.246f, 0.059f)
                lineToRelative(-0.269f, 3.314f)
                lineToRelative(4.497f, 2.752f)
                close()
                moveTo(14.893f, 3.525f)
                lineTo(8.487f, 8.576f)
                lineToRelative(7.39f, 15.367f)
                lineToRelative(1.177f, -2.359f)
                lineTo(19.58f, 6.4f)
                curveToRelative(-0.012f, -0.009f, -4.688f, -2.875f, -4.688f, -2.875f)
                close()
                moveTo(7.468f, 4.304f)
                lineToRelative(-3.05f, 6.594f)
                lineTo(9.033f, 21.51f)
                lineToRelative(-0.74f, -12.934f)
                lineToRelative(-0.012f, -0.064f)
                close()
                moveTo(8.493f, 8.992f)
                lineToRelative(0.73f, 12.784f)
                lineTo(15.71f, 24.0f)
                close()
            }
        }
        .build()
        return _obsidian!!
    }

private var _obsidian: ImageVector? = null
