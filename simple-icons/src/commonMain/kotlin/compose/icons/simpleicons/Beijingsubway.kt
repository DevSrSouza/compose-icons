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

public val SimpleIcons.Beijingsubway: ImageVector
    get() {
        if (_beijingsubway != null) {
            return _beijingsubway!!
        }
        _beijingsubway = Builder(name = "Beijingsubway", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.886f, 0.754f)
                curveTo(11.209f, -0.5f, 15.09f, -0.182f, 18.155f, 1.649f)
                curveToRelative(2.826f, 1.692f, 5.055f, 4.717f, 5.553f, 7.503f)
                curveToRelative(-1.254f, 0.0f, -1.552f, 0.04f, -2.786f, 0.04f)
                curveToRelative(-0.796f, -2.587f, -3.722f, -5.473f, -6.11f, -6.07f)
                curveToRelative(-3.125f, -0.657f, -5.632f, -0.199f, -7.801f, 1.334f)
                curveTo(5.418f, 5.55f, 3.925f, 7.46f, 3.368f, 9.331f)
                curveToRelative(-0.816f, 2.408f, -0.159f, 5.811f, 1.234f, 7.921f)
                curveToRelative(1.094f, 1.572f, 3.005f, 3.065f, 4.836f, 3.642f)
                curveToRelative(1.791f, 0.557f, 4.717f, 0.04f, 6.488f, -0.597f)
                curveToRelative(2.488f, -0.915f, 4.319f, -3.184f, 5.115f, -5.692f)
                lineToRelative(-3.463f, 0.04f)
                curveToRelative(-0.159f, 1.154f, -0.338f, 1.552f, -1.035f, 2.886f)
                lineToRelative(-9.493f, -0.02f)
                verticalLineTo(6.426f)
                horizontalLineToRelative(9.473f)
                curveToRelative(1.135f, 1.433f, 1.314f, 3.682f, 1.334f, 5.572f)
                curveToRelative(0.0f, 0.0f, 3.801f, 0.02f, 6.13f, 0.0f)
                curveToRelative(-0.04f, 3.602f, -1.552f, 7.165f, -4.418f, 9.394f)
                curveToRelative(-2.09f, 1.652f, -4.717f, 2.607f, -7.383f, 2.607f)
                curveToRelative(-3.722f, 0.06f, -7.423f, -1.731f, -9.652f, -4.717f)
                curveTo(1.099f, 17.451f, 0.343f, 15.202f, 0.045f, 12.933f)
                curveToRelative(-0.08f, -1.393f, 0.02f, -2.09f, 0.04f, -2.169f)
                curveTo(0.343f, 9.152f, 0.761f, 7.56f, 1.577f, 6.167f)
                curveTo(2.95f, 3.679f, 5.219f, 1.729f, 7.886f, 0.754f)
                moveToRelative(1.811f, 8.179f)
                verticalLineToRelative(6.229f)
                lineToRelative(4.597f, 0.02f)
                curveToRelative(1.035f, -1.194f, 0.995f, -1.97f, -0.04f, -3.065f)
                curveToRelative(1.035f, -1.095f, 1.095f, -2.249f, 0.02f, -3.184f)
                horizontalLineTo(9.697f)
                close()
            }
        }
        .build()
        return _beijingsubway!!
    }

private var _beijingsubway: ImageVector? = null
