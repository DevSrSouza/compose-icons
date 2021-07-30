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

public val SimpleIcons.Tesla: ImageVector
    get() {
        if (_tesla != null) {
            return _tesla!!
        }
        _tesla = Builder(name = "Tesla", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.362f)
                lineToRelative(2.475f, -3.026f)
                reflectiveCurveToRelative(4.245f, 0.09f, 8.471f, 2.054f)
                curveToRelative(-1.082f, 1.636f, -3.231f, 2.438f, -3.231f, 2.438f)
                curveToRelative(-0.146f, -1.439f, -1.154f, -1.79f, -4.354f, -1.79f)
                lineTo(12.0f, 24.0f)
                lineTo(8.619f, 5.034f)
                curveToRelative(-3.18f, 0.0f, -4.188f, 0.354f, -4.335f, 1.792f)
                curveToRelative(0.0f, 0.0f, -2.146f, -0.795f, -3.229f, -2.43f)
                curveTo(5.28f, 2.431f, 9.525f, 2.34f, 9.525f, 2.34f)
                lineTo(12.0f, 5.362f)
                lineToRelative(-0.004f, 0.002f)
                lineTo(12.0f, 5.364f)
                verticalLineToRelative(-0.002f)
                close()
                moveTo(12.0f, 1.463f)
                curveToRelative(3.415f, -0.03f, 7.326f, 0.528f, 11.328f, 2.28f)
                curveToRelative(0.535f, -0.968f, 0.672f, -1.395f, 0.672f, -1.395f)
                curveTo(19.625f, 0.612f, 15.528f, 0.015f, 12.0f, 0.0f)
                curveTo(8.472f, 0.015f, 4.375f, 0.61f, 0.0f, 2.349f)
                curveToRelative(0.0f, 0.0f, 0.195f, 0.525f, 0.672f, 1.396f)
                curveTo(4.674f, 1.989f, 8.585f, 1.435f, 12.0f, 1.46f)
                verticalLineToRelative(0.003f)
                close()
            }
        }
        .build()
        return _tesla!!
    }

private var _tesla: ImageVector? = null
