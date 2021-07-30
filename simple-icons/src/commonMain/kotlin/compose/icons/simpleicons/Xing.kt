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

public val SimpleIcons.Xing: ImageVector
    get() {
        if (_xing != null) {
            return _xing!!
        }
        _xing = Builder(name = "Xing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.188f, 0.0f)
                curveToRelative(-0.517f, 0.0f, -0.741f, 0.325f, -0.927f, 0.66f)
                curveToRelative(0.0f, 0.0f, -7.455f, 13.224f, -7.702f, 13.657f)
                curveToRelative(0.015f, 0.024f, 4.919f, 9.023f, 4.919f, 9.023f)
                curveToRelative(0.17f, 0.308f, 0.436f, 0.66f, 0.967f, 0.66f)
                horizontalLineToRelative(3.454f)
                curveToRelative(0.211f, 0.0f, 0.375f, -0.078f, 0.463f, -0.22f)
                curveToRelative(0.089f, -0.151f, 0.089f, -0.346f, -0.009f, -0.536f)
                lineToRelative(-4.879f, -8.916f)
                curveToRelative(-0.004f, -0.006f, -0.004f, -0.016f, 0.0f, -0.022f)
                lineTo(22.139f, 0.756f)
                curveToRelative(0.095f, -0.191f, 0.097f, -0.387f, 0.006f, -0.535f)
                curveTo(22.056f, 0.078f, 21.894f, 0.0f, 21.686f, 0.0f)
                horizontalLineToRelative(-3.498f)
                close()
                moveTo(3.648f, 4.74f)
                curveToRelative(-0.211f, 0.0f, -0.385f, 0.074f, -0.473f, 0.216f)
                curveToRelative(-0.09f, 0.149f, -0.078f, 0.339f, 0.02f, 0.531f)
                lineToRelative(2.34f, 4.05f)
                curveToRelative(0.004f, 0.01f, 0.004f, 0.016f, 0.0f, 0.021f)
                lineTo(1.86f, 16.051f)
                curveToRelative(-0.099f, 0.188f, -0.093f, 0.381f, 0.0f, 0.529f)
                curveToRelative(0.085f, 0.142f, 0.239f, 0.234f, 0.45f, 0.234f)
                horizontalLineToRelative(3.461f)
                curveToRelative(0.518f, 0.0f, 0.766f, -0.348f, 0.945f, -0.667f)
                lineToRelative(3.734f, -6.609f)
                lineToRelative(-2.378f, -4.155f)
                curveToRelative(-0.172f, -0.315f, -0.434f, -0.659f, -0.962f, -0.659f)
                horizontalLineTo(3.648f)
                verticalLineToRelative(0.016f)
                close()
            }
        }
        .build()
        return _xing!!
    }

private var _xing: ImageVector? = null
