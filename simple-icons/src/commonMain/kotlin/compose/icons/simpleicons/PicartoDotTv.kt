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

public val SimpleIcons.Picartodottv: ImageVector
    get() {
        if (_picartodottv != null) {
            return _picartodottv!!
        }
        _picartodottv = Builder(name = "Picartodottv", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.628f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.628f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(7.08f, 4.182f)
                horizontalLineToRelative(2.781f)
                curveToRelative(0.233f, 0.0f, 0.42f, 0.21f, 0.42f, 0.47f)
                verticalLineToRelative(14.696f)
                curveToRelative(0.0f, 0.26f, -0.187f, 0.47f, -0.42f, 0.47f)
                horizontalLineToRelative(-2.78f)
                curveToRelative(-0.233f, 0.0f, -0.42f, -0.21f, -0.42f, -0.47f)
                lineTo(6.661f, 4.652f)
                curveToRelative(0.0f, -0.26f, 0.187f, -0.47f, 0.42f, -0.47f)
                close()
                moveTo(11.744f, 4.182f)
                arcToRelative(0.624f, 0.624f, 0.0f, false, true, 0.326f, 0.091f)
                curveToRelative(0.355f, 0.209f, 7.451f, 4.42f, 8.057f, 4.78f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, true, 0.0f, 1.039f)
                curveToRelative(-0.436f, 0.264f, -7.558f, 4.495f, -8.074f, 4.789f)
                arcToRelative(0.577f, 0.577f, 0.0f, false, true, -0.873f, -0.512f)
                verticalLineToRelative(-1.812f)
                curveToRelative(0.0f, -1.712f, 2.962f, -2.201f, 3.398f, -2.465f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, false, 0.0f, -1.04f)
                curveToRelative(-0.605f, -0.36f, -3.398f, -0.746f, -3.398f, -2.452f)
                lineTo(11.18f, 4.79f)
                curveToRelative(0.0f, -0.334f, 0.251f, -0.605f, 0.564f, -0.61f)
                close()
            }
        }
        .build()
        return _picartodottv!!
    }

private var _picartodottv: ImageVector? = null
