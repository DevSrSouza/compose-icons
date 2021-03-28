package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Eye24: ImageVector
    get() {
        if (_eye24 != null) {
            return _eye24!!
        }
        _eye24 = Builder(name = "Eye24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 12.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 7.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 3.5f)
                curveToRelative(-3.432f, 0.0f, -6.125f, 1.534f, -8.054f, 3.24f)
                curveTo(2.02f, 8.445f, 0.814f, 10.352f, 0.33f, 11.202f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, 0.0f, 1.598f)
                curveToRelative(0.484f, 0.85f, 1.69f, 2.758f, 3.616f, 4.46f)
                curveTo(5.876f, 18.966f, 8.568f, 20.5f, 12.0f, 20.5f)
                curveToRelative(3.432f, 0.0f, 6.125f, -1.534f, 8.054f, -3.24f)
                curveToRelative(1.926f, -1.704f, 3.132f, -3.611f, 3.616f, -4.461f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, 0.0f, -1.598f)
                curveToRelative(-0.484f, -0.85f, -1.69f, -2.757f, -3.616f, -4.46f)
                curveTo(18.124f, 5.034f, 15.432f, 3.5f, 12.0f, 3.5f)
                close()
                moveTo(1.633f, 11.945f)
                curveToRelative(0.441f, -0.774f, 1.551f, -2.528f, 3.307f, -4.08f)
                curveTo(6.69f, 6.314f, 9.045f, 5.0f, 12.0f, 5.0f)
                curveToRelative(2.955f, 0.0f, 5.309f, 1.315f, 7.06f, 2.864f)
                curveToRelative(1.756f, 1.553f, 2.866f, 3.307f, 3.307f, 4.08f)
                arcToRelative(0.111f, 0.111f, 0.0f, false, true, 0.017f, 0.056f)
                arcToRelative(0.111f, 0.111f, 0.0f, false, true, -0.017f, 0.056f)
                curveToRelative(-0.441f, 0.774f, -1.551f, 2.527f, -3.307f, 4.08f)
                curveTo(17.31f, 17.685f, 14.955f, 19.0f, 12.0f, 19.0f)
                curveToRelative(-2.955f, 0.0f, -5.309f, -1.315f, -7.06f, -2.864f)
                curveToRelative(-1.756f, -1.553f, -2.866f, -3.306f, -3.307f, -4.08f)
                arcTo(0.11f, 0.11f, 0.0f, false, true, 1.616f, 12.0f)
                arcToRelative(0.11f, 0.11f, 0.0f, false, true, 0.017f, -0.055f)
                close()
            }
        }
        .build()
        return _eye24!!
    }

private var _eye24: ImageVector? = null
