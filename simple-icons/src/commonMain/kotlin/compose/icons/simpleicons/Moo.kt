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

public val SimpleIcons.Moo: ImageVector
    get() {
        if (_moo != null) {
            return _moo!!
        }
        _moo = Builder(name = "Moo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.964f, 24.0f)
                curveToRelative(-2.525f, 0.0f, -4.801f, -1.107f, -6.34f, -3.138f)
                curveToRelative(-1.109f, -1.417f, -1.661f, -3.078f, -1.661f, -4.86f)
                curveToRelative(0.0f, -0.555f, 0.06f, -1.109f, 0.185f, -1.602f)
                curveToRelative(0.299f, -1.785f, 1.59f, -4.678f, 3.93f, -8.678f)
                curveTo(9.805f, 2.767f, 11.215f, 0.554f, 11.289f, 0.554f)
                curveToRelative(0.123f, -0.246f, 0.308f, -0.554f, 0.675f, -0.554f)
                curveToRelative(0.372f, 0.0f, 0.555f, 0.308f, 0.741f, 0.555f)
                curveToRelative(0.0f, 0.0f, 1.477f, 2.215f, 3.199f, 5.168f)
                curveToRelative(2.342f, 4.0f, 3.631f, 6.893f, 3.939f, 8.678f)
                curveToRelative(0.131f, 0.492f, 0.193f, 1.045f, 0.193f, 1.6f)
                curveToRelative(0.0f, 1.785f, -0.555f, 3.445f, -1.65f, 4.861f)
                curveTo(16.766f, 22.834f, 14.424f, 24.0f, 11.964f, 24.0f)
                close()
                moveTo(11.964f, 21.908f)
                curveToRelative(1.905f, 0.0f, 3.629f, -0.861f, 4.801f, -2.341f)
                curveToRelative(0.799f, -1.044f, 1.229f, -2.337f, 1.229f, -3.69f)
                curveToRelative(0.0f, -0.432f, -0.059f, -0.801f, -0.123f, -1.229f)
                curveToRelative(-0.246f, -1.354f, -1.293f, -3.692f, -3.074f, -6.833f)
                curveToRelative(-1.357f, -2.399f, -2.525f, -4.121f, -2.525f, -4.121f)
                lineToRelative(-0.31f, -0.433f)
                lineToRelative(-0.254f, 0.37f)
                reflectiveCurveToRelative(-1.171f, 1.785f, -2.521f, 4.125f)
                curveToRelative(-1.843f, 3.149f, -2.893f, 5.474f, -3.072f, 6.839f)
                curveToRelative(-0.061f, 0.431f, -0.123f, 0.8f, -0.123f, 1.229f)
                curveToRelative(0.0f, 1.355f, 0.429f, 2.587f, 1.229f, 3.693f)
                curveToRelative(1.11f, 1.538f, 2.831f, 2.399f, 4.74f, 2.399f)
                lineToRelative(0.003f, -0.008f)
                close()
            }
        }
        .build()
        return _moo!!
    }

private var _moo: ImageVector? = null
