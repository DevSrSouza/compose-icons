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

public val SimpleIcons.Wordpress: ImageVector
    get() {
        if (_wordpress != null) {
            return _wordpress!!
        }
        _wordpress = Builder(name = "Wordpress", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.469f, 6.825f)
                curveToRelative(0.84f, 1.537f, 1.318f, 3.3f, 1.318f, 5.175f)
                curveToRelative(0.0f, 3.979f, -2.156f, 7.456f, -5.363f, 9.325f)
                lineToRelative(3.295f, -9.527f)
                curveToRelative(0.615f, -1.54f, 0.82f, -2.771f, 0.82f, -3.864f)
                curveToRelative(0.0f, -0.405f, -0.026f, -0.78f, -0.07f, -1.11f)
                moveToRelative(-7.981f, 0.105f)
                curveToRelative(0.647f, -0.03f, 1.232f, -0.105f, 1.232f, -0.105f)
                curveToRelative(0.582f, -0.075f, 0.514f, -0.93f, -0.067f, -0.899f)
                curveToRelative(0.0f, 0.0f, -1.755f, 0.135f, -2.88f, 0.135f)
                curveToRelative(-1.064f, 0.0f, -2.85f, -0.15f, -2.85f, -0.15f)
                curveToRelative(-0.585f, -0.03f, -0.661f, 0.855f, -0.075f, 0.885f)
                curveToRelative(0.0f, 0.0f, 0.54f, 0.061f, 1.125f, 0.09f)
                lineToRelative(1.68f, 4.605f)
                lineToRelative(-2.37f, 7.08f)
                lineTo(5.354f, 6.9f)
                curveToRelative(0.649f, -0.03f, 1.234f, -0.1f, 1.234f, -0.1f)
                curveToRelative(0.585f, -0.075f, 0.516f, -0.93f, -0.065f, -0.896f)
                curveToRelative(0.0f, 0.0f, -1.746f, 0.138f, -2.874f, 0.138f)
                curveToRelative(-0.2f, 0.0f, -0.438f, -0.008f, -0.69f, -0.015f)
                curveTo(4.911f, 3.15f, 8.235f, 1.215f, 12.0f, 1.215f)
                curveToRelative(2.809f, 0.0f, 5.365f, 1.072f, 7.286f, 2.833f)
                curveToRelative(-0.046f, -0.003f, -0.091f, -0.009f, -0.141f, -0.009f)
                curveToRelative(-1.06f, 0.0f, -1.812f, 0.923f, -1.812f, 1.914f)
                curveToRelative(0.0f, 0.89f, 0.513f, 1.643f, 1.06f, 2.531f)
                curveToRelative(0.411f, 0.72f, 0.89f, 1.643f, 0.89f, 2.977f)
                curveToRelative(0.0f, 0.915f, -0.354f, 1.994f, -0.821f, 3.479f)
                lineToRelative(-1.075f, 3.585f)
                lineToRelative(-3.9f, -11.61f)
                lineToRelative(0.001f, 0.014f)
                close()
                moveTo(12.0f, 22.784f)
                curveToRelative(-1.059f, 0.0f, -2.081f, -0.153f, -3.048f, -0.437f)
                lineToRelative(3.237f, -9.406f)
                lineToRelative(3.315f, 9.087f)
                curveToRelative(0.024f, 0.053f, 0.05f, 0.101f, 0.078f, 0.149f)
                curveToRelative(-1.12f, 0.393f, -2.325f, 0.609f, -3.582f, 0.609f)
                moveTo(1.211f, 12.0f)
                curveToRelative(0.0f, -1.564f, 0.336f, -3.05f, 0.935f, -4.39f)
                lineTo(7.29f, 21.709f)
                curveTo(3.694f, 19.96f, 1.212f, 16.271f, 1.211f, 12.0f)
                moveTo(12.0f, 0.0f)
                curveTo(5.385f, 0.0f, 0.0f, 5.385f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.385f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.385f, 12.0f, -12.0f)
                reflectiveCurveTo(18.615f, 0.0f, 12.0f, 0.0f)
            }
        }
        .build()
        return _wordpress!!
    }

private var _wordpress: ImageVector? = null
