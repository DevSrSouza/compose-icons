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

public val SimpleIcons.Buddy: ImageVector
    get() {
        if (_buddy != null) {
            return _buddy!!
        }
        _buddy = Builder(name = "Buddy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7f, 5.307f)
                lineTo(12.945f, 0.253f)
                arcToRelative(1.892f, 1.892f, 0.0f, false, false, -1.891f, 0.0f)
                lineTo(2.299f, 5.306f)
                arcToRelative(1.892f, 1.892f, 0.0f, false, false, -0.945f, 1.638f)
                verticalLineToRelative(10.11f)
                curveToRelative(0.0f, 0.675f, 0.36f, 1.3f, 0.945f, 1.637f)
                lineToRelative(8.756f, 5.056f)
                arcToRelative(1.892f, 1.892f, 0.0f, false, false, 1.89f, 0.0f)
                lineToRelative(8.756f, -5.055f)
                curveToRelative(0.585f, -0.338f, 0.945f, -0.962f, 0.945f, -1.638f)
                lineTo(22.646f, 6.945f)
                curveToRelative(0.0f, -0.675f, -0.36f, -1.3f, -0.945f, -1.638f)
                close()
                moveTo(14.25f, 13.06f)
                lineToRelative(-3.805f, 3.804f)
                lineToRelative(-1.351f, -1.351f)
                lineToRelative(3.804f, -3.805f)
                lineToRelative(-3.804f, -3.806f)
                lineToRelative(1.35f, -1.35f)
                lineToRelative(3.805f, 3.805f)
                lineToRelative(1.351f, 1.35f)
                lineToRelative(-1.35f, 1.353f)
                close()
            }
        }
        .build()
        return _buddy!!
    }

private var _buddy: ImageVector? = null
