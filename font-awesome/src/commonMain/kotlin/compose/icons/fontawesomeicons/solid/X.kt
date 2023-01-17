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

public val SolidGroup.X: ImageVector
    get() {
        if (_x != null) {
            return _x!!
        }
        _x = Builder(name = "X", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(376.6f, 84.5f)
                curveToRelative(11.3f, -13.6f, 9.5f, -33.8f, -4.1f, -45.1f)
                reflectiveCurveToRelative(-33.8f, -9.5f, -45.1f, 4.1f)
                lineTo(192.0f, 206.0f)
                lineTo(56.6f, 43.5f)
                curveTo(45.3f, 29.9f, 25.1f, 28.1f, 11.5f, 39.4f)
                reflectiveCurveTo(-3.9f, 70.9f, 7.4f, 84.5f)
                lineTo(150.3f, 256.0f)
                lineTo(7.4f, 427.5f)
                curveToRelative(-11.3f, 13.6f, -9.5f, 33.8f, 4.1f, 45.1f)
                reflectiveCurveToRelative(33.8f, 9.5f, 45.1f, -4.1f)
                lineTo(192.0f, 306.0f)
                lineTo(327.4f, 468.5f)
                curveToRelative(11.3f, 13.6f, 31.5f, 15.4f, 45.1f, 4.1f)
                reflectiveCurveToRelative(15.4f, -31.5f, 4.1f, -45.1f)
                lineTo(233.7f, 256.0f)
                lineTo(376.6f, 84.5f)
                close()
            }
        }
        .build()
        return _x!!
    }

private var _x: ImageVector? = null
