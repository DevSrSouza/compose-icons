package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Hotjar: ImageVector
    get() {
        if (_hotjar != null) {
            return _hotjar!!
        }
        _hotjar = Builder(name = "Hotjar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.055f, 7.814f)
                curveTo(17.512f, 1.404f, 7.118f, 0.0f, 7.118f, 0.0f)
                reflectiveCurveToRelative(4.798f, 5.34f, -1.334f, 9.567f)
                curveToRelative(-3.876f, 2.666f, -5.41f, 6.13f, -3.75f, 9.914f)
                curveToRelative(1.27f, 2.9f, 3.96f, 4.076f, 6.86f, 4.519f)
                curveToRelative(-0.745f, -1.434f, -0.932f, -3.505f, -0.381f, -5.628f)
                curveToRelative(0.055f, -0.212f, 0.116f, -0.434f, 0.186f, -0.636f)
                curveToRelative(0.813f, 1.258f, 2.148f, 1.946f, 3.45f, 1.629f)
                curveToRelative(1.783f, -0.424f, 2.829f, -2.582f, 2.342f, -4.799f)
                arcToRelative(5.104f, 5.104f, 0.0f, false, false, -0.536f, -1.372f)
                curveToRelative(0.07f, 0.017f, 0.14f, 0.024f, 0.212f, 0.047f)
                curveToRelative(2.225f, 0.635f, 3.301f, 3.962f, 2.403f, 7.434f)
                arcToRelative(9.266f, 9.266f, 0.0f, false, true, -1.325f, 2.946f)
                curveToRelative(3.82f, -1.23f, 6.36f, -4.311f, 7.06f, -7.056f)
                curveToRelative(0.736f, -2.856f, 0.177f, -6.185f, -1.25f, -8.751f)
                close()
            }
        }
        .build()
        return _hotjar!!
    }

private var _hotjar: ImageVector? = null
