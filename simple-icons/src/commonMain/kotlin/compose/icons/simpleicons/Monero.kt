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

public val SimpleIcons.Monero: ImageVector
    get() {
        if (_monero != null) {
            return _monero!!
        }
        _monero = Builder(name = "Monero", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.365f, 0.0f, 0.0f, 5.373f, 0.0f, 12.015f)
                curveToRelative(0.0f, 1.335f, 0.228f, 2.607f, 0.618f, 3.81f)
                horizontalLineToRelative(3.577f)
                lineTo(4.195f, 5.729f)
                lineTo(12.0f, 13.545f)
                lineToRelative(7.805f, -7.815f)
                verticalLineToRelative(10.095f)
                horizontalLineToRelative(3.577f)
                curveToRelative(0.389f, -1.203f, 0.618f, -2.475f, 0.618f, -3.81f)
                curveTo(24.0f, 5.375f, 18.635f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(10.212f, 15.307f)
                lineToRelative(-3.417f, -3.421f)
                verticalLineToRelative(6.351f)
                lineTo(1.758f, 18.237f)
                curveTo(3.87f, 21.689f, 7.678f, 24.0f, 12.0f, 24.0f)
                reflectiveCurveToRelative(8.162f, -2.311f, 10.245f, -5.764f)
                horizontalLineToRelative(-5.04f)
                verticalLineToRelative(-6.351f)
                lineToRelative(-3.386f, 3.421f)
                lineToRelative(-1.788f, 1.79f)
                lineToRelative(-1.814f, -1.79f)
                horizontalLineToRelative(-0.005f)
                close()
            }
        }
        .build()
        return _monero!!
    }

private var _monero: ImageVector? = null
