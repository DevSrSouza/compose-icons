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

public val SimpleIcons.Tqdm: ImageVector
    get() {
        if (_tqdm != null) {
            return _tqdm!!
        }
        _tqdm = Builder(name = "Tqdm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.562f)
                arcToRelative(2.338f, 2.338f, 0.0f, true, true, 0.0f, -4.677f)
                arcToRelative(2.338f, 2.338f, 0.0f, false, true, 0.0f, 4.677f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.392f, 0.0f, 0.036f, 5.473f, 0.036f, 12.224f)
                curveToRelative(0.0f, 5.579f, 3.659f, 10.281f, 8.658f, 11.746f)
                curveToRelative(0.428f, 0.126f, 0.87f, -0.162f, 0.962f, -0.598f)
                lineToRelative(0.141f, -0.669f)
                curveToRelative(0.086f, -0.41f, -0.169f, -0.799f, -0.57f, -0.92f)
                curveToRelative(-4.039f, -1.221f, -6.986f, -5.037f, -6.986f, -9.559f)
                curveToRelative(0.0f, -5.507f, 4.37f, -9.972f, 9.76f, -9.972f)
                reflectiveCurveToRelative(9.76f, 4.464f, 9.76f, 9.972f)
                curveToRelative(0.0f, 4.515f, -2.938f, 8.325f, -6.967f, 9.552f)
                curveToRelative(-0.4f, 0.122f, -0.654f, 0.511f, -0.567f, 0.919f)
                lineToRelative(0.142f, 0.67f)
                curveToRelative(0.093f, 0.437f, 0.535f, 0.723f, 0.963f, 0.596f)
                curveToRelative(4.986f, -1.474f, 8.633f, -6.169f, 8.633f, -11.738f)
                curveTo(23.964f, 5.473f, 18.608f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(19.152f, 12.224f)
                curveToRelative(0.0f, -4.04f, -3.202f, -7.315f, -7.152f, -7.315f)
                reflectiveCurveToRelative(-7.152f, 3.275f, -7.152f, 7.315f)
                curveToRelative(0.0f, 3.191f, 1.999f, 5.903f, 4.786f, 6.902f)
                arcToRelative(0.79f, 0.79f, 0.0f, false, false, 1.037f, -0.582f)
                lineToRelative(0.042f, -0.199f)
                arcToRelative(0.772f, 0.772f, 0.0f, false, false, -0.489f, -0.889f)
                curveToRelative(-2.118f, -0.752f, -3.639f, -2.809f, -3.639f, -5.232f)
                curveToRelative(0.0f, -3.059f, 2.424f, -5.539f, 5.415f, -5.539f)
                reflectiveCurveToRelative(5.415f, 2.48f, 5.415f, 5.539f)
                curveToRelative(0.0f, 2.418f, -1.516f, 4.472f, -3.628f, 5.227f)
                arcToRelative(0.772f, 0.772f, 0.0f, false, false, -0.487f, 0.89f)
                lineToRelative(0.042f, 0.199f)
                arcToRelative(0.791f, 0.791f, 0.0f, false, false, 1.038f, 0.58f)
                curveToRelative(2.78f, -1.003f, 4.772f, -3.71f, 4.772f, -6.896f)
                close()
            }
        }
        .build()
        return _tqdm!!
    }

private var _tqdm: ImageVector? = null
