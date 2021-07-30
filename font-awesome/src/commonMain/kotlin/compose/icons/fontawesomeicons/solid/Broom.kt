package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Broom: ImageVector
    get() {
        if (_broom != null) {
            return _broom!!
        }
        _broom = Builder(name = "Broom", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.47f, 216.77f)
                lineToRelative(86.73f, 109.18f)
                reflectiveCurveToRelative(-16.6f, 102.36f, -76.57f, 150.12f)
                curveTo(206.66f, 523.85f, 0.0f, 510.19f, 0.0f, 510.19f)
                reflectiveCurveToRelative(3.8f, -23.14f, 11.0f, -55.43f)
                lineToRelative(94.62f, -112.17f)
                curveToRelative(3.97f, -4.7f, -0.87f, -11.62f, -6.65f, -9.5f)
                lineToRelative(-60.4f, 22.09f)
                curveToRelative(14.44f, -41.66f, 32.72f, -80.04f, 54.6f, -97.47f)
                curveToRelative(59.97f, -47.76f, 163.3f, -40.94f, 163.3f, -40.94f)
                close()
                moveTo(636.53f, 31.03f)
                lineToRelative(-19.86f, -25.0f)
                curveToRelative(-5.49f, -6.9f, -15.52f, -8.05f, -22.41f, -2.56f)
                lineToRelative(-232.48f, 177.8f)
                lineToRelative(-34.14f, -42.97f)
                curveToRelative(-5.09f, -6.41f, -15.14f, -5.21f, -18.59f, 2.21f)
                lineToRelative(-25.33f, 54.55f)
                lineToRelative(86.73f, 109.18f)
                lineToRelative(58.8f, -12.45f)
                curveToRelative(8.0f, -1.69f, 11.42f, -11.2f, 6.34f, -17.6f)
                lineToRelative(-34.09f, -42.92f)
                lineToRelative(232.48f, -177.8f)
                curveToRelative(6.89f, -5.48f, 8.04f, -15.53f, 2.55f, -22.44f)
                close()
            }
        }
        .build()
        return _broom!!
    }

private var _broom: ImageVector? = null
