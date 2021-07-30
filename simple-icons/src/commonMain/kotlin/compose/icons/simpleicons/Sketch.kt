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

public val SimpleIcons.Sketch: ImageVector
    get() {
        if (_sketch != null) {
            return _sketch!!
        }
        _sketch = Builder(name = "Sketch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.25f)
                lineToRelative(6.75f, 6.637f)
                lineTo(18.75f, 2.0f)
                lineTo(12.0f, 1.25f)
                close()
                moveTo(12.0f, 1.25f)
                lineToRelative(-6.05f, 7.0f)
                horizontalLineToRelative(12.1f)
                lineToRelative(-6.05f, -7.0f)
                close()
                moveTo(12.0f, 1.25f)
                lineTo(5.25f, 2.0f)
                verticalLineToRelative(5.887f)
                lineTo(12.0f, 1.25f)
                close()
                moveTo(5.25f, 2.0f)
                lineTo(0.0f, 9.0f)
                lineToRelative(4.416f, -0.68f)
                lineTo(5.25f, 2.0f)
                close()
                moveTo(0.0f, 9.0f)
                lineToRelative(11.959f, 13.703f)
                lineToRelative(0.008f, -0.014f)
                lineTo(4.443f, 9.0f)
                lineTo(0.0f, 9.0f)
                close()
                moveTo(18.75f, 2.0f)
                lineToRelative(0.834f, 6.32f)
                lineTo(24.0f, 9.0f)
                lineToRelative(-5.25f, -7.0f)
                close()
                moveTo(24.0f, 9.0f)
                horizontalLineToRelative(-4.506f)
                lineToRelative(-7.523f, 13.69f)
                lineToRelative(0.029f, 0.06f)
                lineTo(24.0f, 9.0f)
                close()
                moveTo(12.0f, 22.75f)
                lineToRelative(-0.031f, -0.057f)
                lineToRelative(-0.008f, 0.012f)
                lineToRelative(0.039f, 0.045f)
                close()
                moveTo(5.436f, 9.0f)
                lineToRelative(6.533f, 13.686f)
                lineTo(18.564f, 9.0f)
                lineTo(5.436f, 9.0f)
                close()
            }
        }
        .build()
        return _sketch!!
    }

private var _sketch: ImageVector? = null
