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

public val SimpleIcons.Formstack: ImageVector
    get() {
        if (_formstack != null) {
            return _formstack!!
        }
        _formstack = Builder(name = "Formstack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 4.035f)
                horizontalLineToRelative(1.4f)
                curveToRelative(0.331f, 0.0f, 0.6f, 0.269f, 0.6f, 0.6f)
                verticalLineToRelative(14.73f)
                curveToRelative(0.0f, 0.331f, -0.269f, 0.6f, -0.6f, 0.6f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.035f)
                close()
                moveTo(22.0f, 6.026f)
                horizontalLineToRelative(1.4f)
                curveToRelative(0.331f, 0.0f, 0.6f, 0.269f, 0.6f, 0.6f)
                verticalLineToRelative(10.747f)
                curveToRelative(0.0f, 0.331f, -0.269f, 0.6f, -0.6f, 0.6f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.026f)
                close()
                moveTo(0.6f, 2.044f)
                horizontalLineToRelative(16.8f)
                curveToRelative(0.331f, 0.0f, 0.6f, 0.269f, 0.6f, 0.6f)
                verticalLineToRelative(18.712f)
                curveToRelative(0.0f, 0.331f, -0.269f, 0.6f, -0.6f, 0.6f)
                horizontalLineTo(0.6f)
                curveToRelative(-0.331f, 0.0f, -0.6f, -0.269f, -0.6f, -0.6f)
                verticalLineTo(2.644f)
                curveTo(0.0f, 2.313f, 0.269f, 2.044f, 0.6f, 2.044f)
                close()
                moveTo(4.2f, 5.23f)
                curveToRelative(-0.11f, 0.0f, -0.2f, 0.09f, -0.2f, 0.2f)
                verticalLineToRelative(7.35f)
                curveToRelative(0.0f, 0.045f, 0.015f, 0.089f, 0.044f, 0.125f)
                curveToRelative(0.069f, 0.086f, 0.195f, 0.101f, 0.281f, 0.032f)
                lineToRelative(9.228f, -7.35f)
                curveToRelative(0.048f, -0.038f, 0.075f, -0.096f, 0.075f, -0.156f)
                curveToRelative(0.0f, -0.11f, -0.09f, -0.2f, -0.2f, -0.2f)
                lineTo(4.2f, 5.23f)
                close()
                moveTo(4.0f, 17.185f)
                curveToRelative(0.0f, 0.04f, 0.012f, 0.08f, 0.035f, 0.113f)
                curveToRelative(0.062f, 0.091f, 0.187f, 0.114f, 0.278f, 0.052f)
                lineToRelative(7.576f, -5.184f)
                curveToRelative(0.054f, -0.037f, 0.087f, -0.099f, 0.087f, -0.165f)
                curveToRelative(0.0f, -0.11f, -0.09f, -0.2f, -0.2f, -0.2f)
                horizontalLineTo(6.89f)
                curveToRelative(-0.045f, 0.0f, -0.088f, 0.015f, -0.123f, 0.042f)
                lineToRelative(-2.69f, 2.102f)
                curveTo(4.028f, 13.983f, 4.0f, 14.041f, 4.0f, 14.103f)
                lineTo(4.0f, 17.185f)
                close()
                moveTo(4.086f, 18.342f)
                curveTo(4.032f, 18.379f, 4.0f, 18.441f, 4.0f, 18.506f)
                verticalLineToRelative(0.087f)
                curveToRelative(0.0f, 0.106f, 0.086f, 0.192f, 0.192f, 0.192f)
                horizontalLineTo(7.0f)
                curveToRelative(0.11f, 0.0f, 0.2f, -0.09f, 0.2f, -0.2f)
                verticalLineToRelative(-2.022f)
                curveToRelative(0.0f, -0.041f, -0.012f, -0.081f, -0.036f, -0.114f)
                curveToRelative(-0.063f, -0.091f, -0.188f, -0.113f, -0.278f, -0.05f)
                lineTo(4.086f, 18.342f)
                close()
            }
        }
        .build()
        return _formstack!!
    }

private var _formstack: ImageVector? = null
