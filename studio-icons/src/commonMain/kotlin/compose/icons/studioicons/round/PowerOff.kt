package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.PowerOff: ImageVector
    get() {
        if (_powerOff != null) {
            return _powerOff!!
        }
        _powerOff = Builder(name = "PowerOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.66f)
                lineTo(18.0f, 8.99f)
                curveToRelative(0.0f, -1.0f, -1.01f, -2.0f, -2.0f, -1.99f)
                lineTo(16.0f, 4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.88f)
                lineToRelative(7.63f, 7.63f)
                curveToRelative(0.15f, -0.3f, 0.25f, -0.63f, 0.25f, -0.97f)
                close()
                moveTo(10.0f, 4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(0.88f)
                lineToRelative(2.0f, 2.0f)
                lineTo(10.0f, 4.0f)
                close()
                moveTo(20.15f, 19.86f)
                lineToRelative(-7.66f, -7.66f)
                lineToRelative(-5.1f, -5.1f)
                lineToRelative(-2.56f, -2.56f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(2.63f, 2.63f)
                curveToRelative(-0.03f, 0.13f, -0.05f, 0.27f, -0.05f, 0.41f)
                verticalLineToRelative(4.66f)
                curveToRelative(0.0f, 0.53f, 0.21f, 1.04f, 0.58f, 1.41f)
                lineTo(9.5f, 18.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(0.48f, -0.48f)
                lineToRelative(3.76f, 3.76f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f)
                close()
            }
        }
        .build()
        return _powerOff!!
    }

private var _powerOff: ImageVector? = null
