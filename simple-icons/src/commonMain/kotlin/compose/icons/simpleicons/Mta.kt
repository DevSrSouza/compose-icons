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

public val SimpleIcons.Mta: ImageVector
    get() {
        if (_mta != null) {
            return _mta!!
        }
        _mta = Builder(name = "Mta", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.171f, 10.07f)
                lineToRelative(-1.293f, -0.109f)
                verticalLineToRelative(6.861f)
                lineToRelative(-1.926f, 0.34f)
                lineToRelative(-0.004f, -7.371f)
                lineToRelative(-1.637f, -0.145f)
                lineTo(10.311f, 6.944f)
                lineToRelative(4.86f, 0.85f)
                close()
                moveTo(18.839f, 15.954f)
                lineToRelative(-1.142f, 0.198f)
                lineToRelative(-0.134f, -1.0f)
                lineToRelative(-1.113f, 0.145f)
                lineToRelative(-0.14f, 1.1f)
                lineToRelative(-1.473f, 0.26f)
                lineToRelative(1.458f, -8.651f)
                lineToRelative(1.385f, 0.24f)
                close()
                moveTo(17.359f, 13.462f)
                lineToRelative(-0.305f, -2.642f)
                horizontalLineToRelative(-0.068f)
                lineToRelative(-0.31f, 2.682f)
                close()
                moveTo(10.991f, 24.0f)
                curveToRelative(6.59f, 0.0f, 11.932f, -5.373f, 11.932f, -12.0f)
                curveToRelative(0.0f, -6.628f, -5.342f, -12.0f, -11.932f, -12.0f)
                curveTo(6.86f, 0.0f, 3.22f, 2.112f, 1.077f, 5.323f)
                lineToRelative(3.307f, 0.583f)
                lineToRelative(0.91f, 6.965f)
                curveToRelative(0.003f, -0.012f, 0.066f, -0.004f, 0.066f, -0.004f)
                lineToRelative(0.998f, -6.615f)
                lineToRelative(3.309f, 0.58f)
                verticalLineToRelative(10.735f)
                lineToRelative(-2.089f, 0.367f)
                lineTo(7.578f, 13.32f)
                reflectiveCurveToRelative(0.078f, -1.987f, 0.032f, -2.327f)
                curveToRelative(0.0f, 0.0f, -0.09f, 0.002f, -0.092f, -0.005f)
                lineToRelative(-1.246f, 7.18f)
                lineToRelative(-2.075f, 0.366f)
                lineTo(2.672f, 10.8f)
                lineToRelative(-0.092f, -0.007f)
                curveToRelative(-0.032f, 0.28f, 0.112f, 2.707f, 0.112f, 2.707f)
                verticalLineToRelative(5.298f)
                lineToRelative(-1.364f, 0.24f)
                curveTo(3.498f, 22.044f, 7.016f, 24.0f, 10.991f, 24.0f)
                close()
            }
        }
        .build()
        return _mta!!
    }

private var _mta: ImageVector? = null
