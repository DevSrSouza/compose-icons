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

public val SimpleIcons.Themodelsresource: ImageVector
    get() {
        if (_themodelsresource != null) {
            return _themodelsresource!!
        }
        _themodelsresource = Builder(name = "Themodelsresource", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.25f, 0.0f)
                curveTo(0.557f, 0.0f, 0.0f, 0.557f, 0.0f, 1.25f)
                verticalLineToRelative(21.5f)
                curveTo(0.0f, 23.442f, 0.557f, 24.0f, 1.25f, 24.0f)
                horizontalLineToRelative(21.5f)
                curveToRelative(0.692f, 0.0f, 1.25f, -0.558f, 1.25f, -1.25f)
                verticalLineTo(1.25f)
                curveTo(24.0f, 0.557f, 23.442f, 0.0f, 22.75f, 0.0f)
                horizontalLineToRelative(-2.734f)
                curveToRelative(1.667f, 1.037f, 1.521f, 11.428f, 1.68f, 18.734f)
                curveToRelative(0.023f, 1.1f, 0.616f, 3.805f, 0.616f, 3.805f)
                reflectiveCurveToRelative(-1.702f, 0.913f, -3.15f, 1.373f)
                curveToRelative(-0.652f, -2.478f, -0.633f, -3.488f, -0.633f, -3.488f)
                lineToRelative(-0.181f, -10.67f)
                lineToRelative(-0.4f, -4.62f)
                curveToRelative(-2.156f, 3.08f, -3.445f, 6.123f, -3.987f, 8.007f)
                curveToRelative(-1.442f, 0.915f, -1.92f, 1.09f, -2.957f, 1.384f)
                curveToRelative(-1.056f, -0.552f, -3.91f, -3.216f, -4.961f, -3.921f)
                curveToRelative(2.096f, 6.826f, 2.238f, 9.642f, 2.238f, 9.642f)
                reflectiveCurveToRelative(-2.231f, 1.759f, -2.797f, 1.606f)
                curveToRelative(-0.232f, -0.064f, -0.495f, -0.275f, -0.507f, -0.516f)
                curveToRelative(-0.183f, -3.672f, -0.76f, -5.902f, -1.508f, -8.773f)
                curveTo(2.576f, 9.13f, 0.32f, 4.07f, 0.32f, 4.07f)
                curveToRelative(0.948f, -0.641f, 1.52f, -0.883f, 2.836f, -1.265f)
                lineTo(11.61f, 11.0f)
                reflectiveCurveTo(16.073f, 3.616f, 17.104f, 0.906f)
                curveToRelative(0.0f, 0.0f, 2.244f, -0.748f, 2.71f, -0.906f)
                horizontalLineTo(1.25f)
                close()
            }
        }
        .build()
        return _themodelsresource!!
    }

private var _themodelsresource: ImageVector? = null
