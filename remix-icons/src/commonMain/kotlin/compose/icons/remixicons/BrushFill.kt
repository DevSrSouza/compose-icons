package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.BrushFill: ImageVector
    get() {
        if (_brushFill != null) {
            return _brushFill!!
        }
        _brushFill = Builder(name = "BrushFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.289f, 6.216f)
                lineToRelative(4.939f, -3.841f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.32f, 0.082f)
                lineToRelative(2.995f, 2.994f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.082f, 1.321f)
                lineToRelative(-3.84f, 4.938f)
                arcToRelative(7.505f, 7.505f, 0.0f, false, true, -7.283f, 9.292f)
                curveTo(8.0f, 21.002f, 3.5f, 19.5f, 1.0f, 18.0f)
                curveToRelative(3.98f, -3.0f, 3.047f, -4.81f, 3.5f, -6.5f)
                curveToRelative(1.058f, -3.95f, 4.842f, -6.257f, 8.789f, -5.284f)
                close()
                moveTo(16.702f, 8.095f)
                curveToRelative(0.065f, 0.063f, 0.13f, 0.128f, 0.193f, 0.194f)
                lineToRelative(1.135f, 1.134f)
                lineToRelative(2.475f, -3.182f)
                lineToRelative(-1.746f, -1.746f)
                lineToRelative(-3.182f, 2.475f)
                lineToRelative(1.125f, 1.125f)
                close()
            }
        }
        .build()
        return _brushFill!!
    }

private var _brushFill: ImageVector? = null
