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

public val SimpleIcons.Underarmour: ImageVector
    get() {
        if (_underarmour != null) {
            return _underarmour!!
        }
        _underarmour = Builder(name = "Underarmour", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.954f, 12.0f)
                curveToRelative(-0.089f, 0.066f, -0.195f, 0.142f, -0.324f, 0.233f)
                curveToRelative(-0.826f, 0.585f, -2.023f, 0.985f, -3.58f, 0.985f)
                horizontalLineToRelative(-0.104f)
                curveToRelative(-1.556f, 0.0f, -2.755f, -0.4f, -3.58f, -0.985f)
                arcTo(36.43f, 36.43f, 0.0f, false, true, 8.042f, 12.0f)
                curveToRelative(0.09f, -0.067f, 0.196f, -0.143f, 0.324f, -0.234f)
                curveToRelative(0.825f, -0.584f, 2.024f, -0.985f, 3.58f, -0.985f)
                horizontalLineToRelative(0.104f)
                curveToRelative(1.557f, 0.0f, 2.756f, 0.401f, 3.58f, 0.985f)
                curveToRelative(0.129f, 0.09f, 0.235f, 0.167f, 0.325f, 0.234f)
                moveTo(24.0f, 7.181f)
                reflectiveCurveToRelative(-0.709f, -0.541f, -2.95f, -1.365f)
                curveToRelative(-1.968f, -0.721f, -3.452f, -0.883f, -3.452f, -0.883f)
                lineToRelative(0.006f, 4.243f)
                curveToRelative(0.0f, 0.598f, -0.162f, 1.143f, -0.618f, 1.765f)
                curveToRelative(-1.672f, -0.61f, -3.254f, -0.985f, -4.981f, -0.985f)
                curveToRelative(-1.728f, 0.0f, -3.308f, 0.375f, -4.98f, 0.985f)
                curveToRelative(-0.457f, -0.619f, -0.62f, -1.168f, -0.62f, -1.765f)
                lineToRelative(0.007f, -4.243f)
                reflectiveCurveToRelative(-1.494f, 0.16f, -3.463f, 0.883f)
                curveTo(0.709f, 6.642f, 0.0f, 7.181f, 0.0f, 7.181f)
                curveToRelative(0.093f, 1.926f, 1.78f, 3.638f, 4.435f, 4.82f)
                curveTo(1.777f, 13.18f, 0.09f, 14.887f, 0.0f, 16.818f)
                curveToRelative(0.0f, 0.0f, 0.709f, 0.54f, 2.949f, 1.365f)
                curveToRelative(1.968f, 0.721f, 3.453f, 0.883f, 3.453f, 0.883f)
                lineToRelative(-0.007f, -4.244f)
                curveToRelative(0.0f, -0.597f, 0.164f, -1.143f, 0.619f, -1.764f)
                curveToRelative(1.672f, 0.61f, 3.252f, 0.983f, 4.98f, 0.983f)
                curveToRelative(1.727f, 0.0f, 3.309f, -0.374f, 4.98f, -0.983f)
                curveToRelative(0.457f, 0.62f, 0.62f, 1.167f, 0.62f, 1.764f)
                lineToRelative(-0.006f, 4.244f)
                reflectiveCurveToRelative(1.484f, -0.16f, 3.452f, -0.883f)
                curveToRelative(2.241f, -0.826f, 2.95f, -1.365f, 2.95f, -1.365f)
                curveToRelative(-0.093f, -1.927f, -1.78f, -3.64f, -4.435f, -4.819f)
                curveToRelative(2.657f, -1.182f, 4.343f, -2.888f, 4.435f, -4.82f)
            }
        }
        .build()
        return _underarmour!!
    }

private var _underarmour: ImageVector? = null
