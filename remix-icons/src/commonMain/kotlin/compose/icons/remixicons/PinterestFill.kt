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

public val RemixIcons.PinterestFill: ImageVector
    get() {
        if (_pinterestFill != null) {
            return _pinterestFill!!
        }
        _pinterestFill = Builder(name = "PinterestFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.37f, 2.094f)
                arcTo(10.003f, 10.003f, 0.0f, false, false, 8.002f, 21.17f)
                arcToRelative(7.757f, 7.757f, 0.0f, false, true, 0.163f, -2.293f)
                curveToRelative(0.185f, -0.839f, 1.296f, -5.463f, 1.296f, -5.463f)
                arcToRelative(3.739f, 3.739f, 0.0f, false, true, -0.324f, -1.577f)
                curveToRelative(0.0f, -1.485f, 0.857f, -2.593f, 1.923f, -2.593f)
                arcToRelative(1.334f, 1.334f, 0.0f, false, true, 1.342f, 1.508f)
                curveToRelative(0.0f, 0.9f, -0.578f, 2.262f, -0.88f, 3.54f)
                arcToRelative(1.544f, 1.544f, 0.0f, false, false, 1.575f, 1.923f)
                curveToRelative(1.898f, 0.0f, 3.17f, -2.431f, 3.17f, -5.301f)
                curveToRelative(0.0f, -2.2f, -1.457f, -3.848f, -4.143f, -3.848f)
                arcToRelative(4.746f, 4.746f, 0.0f, false, false, -4.93f, 4.794f)
                arcToRelative(2.96f, 2.96f, 0.0f, false, false, 0.648f, 1.97f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, true, 0.162f, 0.554f)
                curveToRelative(-0.046f, 0.184f, -0.162f, 0.623f, -0.208f, 0.784f)
                arcToRelative(0.354f, 0.354f, 0.0f, false, true, -0.51f, 0.254f)
                curveToRelative(-1.384f, -0.554f, -2.036f, -2.077f, -2.036f, -3.816f)
                curveToRelative(0.0f, -2.847f, 2.384f, -6.255f, 7.154f, -6.255f)
                curveToRelative(3.796f, 0.0f, 6.32f, 2.777f, 6.32f, 5.747f)
                curveToRelative(0.0f, 3.909f, -2.177f, 6.848f, -5.394f, 6.848f)
                arcToRelative(2.861f, 2.861f, 0.0f, false, true, -2.454f, -1.246f)
                reflectiveCurveToRelative(-0.578f, 2.316f, -0.692f, 2.754f)
                arcToRelative(8.026f, 8.026f, 0.0f, false, true, -1.019f, 2.131f)
                curveToRelative(0.923f, 0.28f, 1.882f, 0.42f, 2.846f, 0.416f)
                arcToRelative(9.988f, 9.988f, 0.0f, false, false, 9.996f, -10.003f)
                arcToRelative(10.002f, 10.002f, 0.0f, false, false, -8.635f, -9.903f)
                close()
            }
        }
        .build()
        return _pinterestFill!!
    }

private var _pinterestFill: ImageVector? = null
