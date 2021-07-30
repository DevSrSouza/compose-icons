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

public val SimpleIcons.Singlestore: ImageVector
    get() {
        if (_singlestore != null) {
            return _singlestore!!
        }
        _singlestore = Builder(name = "Singlestore", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.029f, 5.063f)
                curveToRelative(-0.914f, -1.916f, -2.8f, -3.432f, -5.114f, -4.033f)
                curveTo(11.4f, 0.887f, 10.858f, 0.83f, 10.258f, 0.8f)
                curveToRelative(-0.886f, 0.0f, -1.743f, 0.114f, -2.629f, 0.343f)
                curveToRelative(-2.2f, 0.658f, -3.742f, 1.945f, -4.657f, 2.947f)
                curveTo(1.801f, 5.435f, 1.03f, 6.837f, 0.572f, 8.238f)
                curveToRelative(0.0f, 0.029f, -0.028f, 0.057f, -0.028f, 0.115f)
                curveTo(0.515f, 8.467f, 0.4f, 8.81f, 0.4f, 8.896f)
                curveToRelative(-0.029f, 0.057f, -0.029f, 0.143f, -0.057f, 0.2f)
                lineToRelative(-0.086f, 0.344f)
                curveToRelative(0.0f, 0.028f, 0.0f, 0.057f, -0.028f, 0.086f)
                curveToRelative(-0.743f, 3.69f, 0.49f, 7.001f, 1.234f, 8.231f)
                curveToRelative(0.185f, 0.308f, 0.338f, 0.564f, 0.49f, 0.8f)
                curveTo(0.27f, 9.403f, 5.116f, 5.035f, 10.63f, 4.92f)
                curveToRelative(2.886f, -0.057f, 5.771f, 1.116f, 7.171f, 3.461f)
                curveToRelative(-0.086f, -1.287f, -0.171f, -2.002f, -0.771f, -3.318f)
                close()
                moveTo(12.543f, 0.0f)
                curveToRelative(2.572f, 0.715f, 4.914f, 2.517f, 5.886f, 4.72f)
                curveToRelative(1.485f, 3.575f, 1.143f, 8.095f, -0.486f, 10.784f)
                curveToRelative(-1.371f, 2.203f, -3.485f, 3.375f, -5.914f, 3.347f)
                curveToRelative(-3.771f, -0.029f, -6.828f, -3.032f, -6.857f, -6.808f)
                curveToRelative(0.0f, -3.776f, 2.971f, -6.894f, 6.857f, -6.894f)
                curveToRelative(0.629f, 0.0f, 1.535f, 0.087f, 2.563f, 0.516f)
                curveToRelative(0.0f, 0.0f, -0.739f, -0.438f, -2.638f, -0.732f)
                curveTo(6.497f, 4.218f, 0.058f, 8.353f, 1.544f, 17.878f)
                curveToRelative(2.057f, 3.662f, 6.0f, 6.15f, 10.485f, 6.122f)
                curveToRelative(6.6f, -0.029f, 12.0f, -5.435f, 11.97f, -12.072f)
                curveTo(24.0f, 5.578f, 18.83f, 0.172f, 12.544f, 0.0f)
                close()
            }
        }
        .build()
        return _singlestore!!
    }

private var _singlestore: ImageVector? = null
