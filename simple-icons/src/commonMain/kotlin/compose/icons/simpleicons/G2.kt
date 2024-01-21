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

public val SimpleIcons.G2: ImageVector
    get() {
        if (_g2 != null) {
            return _g2!!
        }
        _g2 = Builder(name = "G2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 0.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(12.122f, 5.143f)
                curveToRelative(0.45f, 0.0f, 0.9f, 0.044f, 1.342f, 0.132f)
                lineToRelative(-1.342f, 2.806f)
                curveTo(9.962f, 8.08f, 8.203f, 9.84f, 8.203f, 12.0f)
                reflectiveCurveToRelative(1.76f, 3.92f, 3.92f, 3.92f)
                curveToRelative(0.937f, 0.0f, 1.844f, -0.338f, 2.553f, -0.951f)
                lineToRelative(1.483f, 2.572f)
                arcTo(6.856f, 6.856f, 0.0f, false, true, 5.266f, 12.0f)
                arcToRelative(6.856f, 6.856f, 0.0f, false, true, 6.856f, -6.856f)
                close()
                moveTo(15.62f, 5.633f)
                arcToRelative(1.262f, 1.262f, 0.0f, false, true, 0.026f, 0.0f)
                curveToRelative(0.427f, 0.0f, 0.792f, 0.113f, 1.101f, 0.34f)
                curveToRelative(0.31f, 0.229f, 0.466f, 0.546f, 0.466f, 0.946f)
                curveToRelative(0.0f, 0.639f, -0.36f, 1.03f, -1.035f, 1.376f)
                lineToRelative(-0.377f, 0.191f)
                curveToRelative(-0.403f, 0.204f, -0.602f, 0.385f, -0.657f, 0.706f)
                horizontalLineToRelative(2.05f)
                verticalLineToRelative(0.85f)
                horizontalLineToRelative(-3.101f)
                verticalLineToRelative(-0.144f)
                curveToRelative(0.0f, -0.526f, 0.103f, -0.96f, 0.314f, -1.306f)
                curveToRelative(0.211f, -0.345f, 0.576f, -0.65f, 1.102f, -0.917f)
                lineToRelative(0.242f, -0.117f)
                curveToRelative(0.427f, -0.216f, 0.538f, -0.401f, 0.538f, -0.625f)
                curveToRelative(0.0f, -0.266f, -0.228f, -0.458f, -0.6f, -0.458f)
                curveToRelative(-0.44f, 0.0f, -0.773f, 0.228f, -1.004f, 0.694f)
                lineToRelative(-0.592f, -0.595f)
                curveToRelative(0.13f, -0.279f, 0.338f, -0.502f, 0.619f, -0.675f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, 0.908f, -0.266f)
                close()
                moveTo(13.526f, 11.021f)
                horizontalLineToRelative(3.394f)
                lineToRelative(1.697f, 2.937f)
                lineToRelative(-1.697f, 2.94f)
                lineToRelative(-1.697f, -2.94f)
                lineTo(11.83f, 13.958f)
                lineToRelative(1.696f, -2.937f)
                close()
            }
        }
        .build()
        return _g2!!
    }

private var _g2: ImageVector? = null
