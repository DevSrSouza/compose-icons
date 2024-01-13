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

public val Octicons.Mention24: ImageVector
    get() {
        if (_mention24 != null) {
            return _mention24!!
        }
        _mention24 = Builder(name = "Mention24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.226f, 7.25f)
                curveToRelative(-2.623f, -4.542f, -8.432f, -6.098f, -12.974f, -3.475f)
                curveToRelative(-4.543f, 2.622f, -6.099f, 8.431f, -3.477f, 12.974f)
                curveToRelative(2.623f, 4.542f, 8.431f, 6.099f, 12.974f, 3.477f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 1.299f)
                curveToRelative(-5.26f, 3.037f, -11.987f, 1.235f, -15.024f, -4.026f)
                curveTo(-0.562f, 12.24f, 1.24f, 5.512f, 6.501f, 2.475f)
                curveTo(11.76f, -0.562f, 18.488f, 1.24f, 21.525f, 6.501f)
                arcToRelative(10.959f, 10.959f, 0.0f, false, true, 1.455f, 4.826f)
                curveToRelative(0.013f, 0.056f, 0.02f, 0.113f, 0.02f, 0.173f)
                verticalLineToRelative(2.25f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -6.623f, 1.581f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, true, 1.112f, -3.682f)
                arcToRelative(0.802f, 0.802f, 0.0f, false, true, 0.011f, 0.129f)
                verticalLineToRelative(1.972f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                verticalLineToRelative(-1.766f)
                arcToRelative(9.456f, 9.456f, 0.0f, false, false, -1.274f, -4.733f)
                close()
                moveTo(16.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _mention24!!
    }

private var _mention24: ImageVector? = null
