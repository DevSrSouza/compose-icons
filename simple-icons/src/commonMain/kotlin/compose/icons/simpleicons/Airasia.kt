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

public val SimpleIcons.Airasia: ImageVector
    get() {
        if (_airasia != null) {
            return _airasia!!
        }
        _airasia = Builder(name = "Airasia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.54f, 14.49f)
                curveToRelative(-1.278f, 0.0f, -2.264f, -0.998f, -2.264f, -2.276f)
                curveToRelative(0.0f, -1.252f, 0.98f, -2.27f, 2.264f, -2.27f)
                curveToRelative(1.232f, 0.0f, 2.238f, 1.018f, 2.238f, 2.27f)
                curveToRelative(0.0f, 1.278f, -1.005f, 2.277f, -2.239f, 2.277f)
                close()
                moveTo(14.614f, 6.636f)
                lineToRelative(-0.214f, 0.998f)
                curveToRelative(-0.59f, -1.18f, -2.348f, -1.297f, -3.295f, -1.297f)
                curveToRelative(-2.952f, 0.0f, -5.527f, 2.841f, -5.527f, 6.746f)
                curveToRelative(0.0f, 3.14f, 1.875f, 5.111f, 4.23f, 5.111f)
                curveToRelative(1.316f, 0.0f, 2.432f, -0.304f, 3.353f, -1.4f)
                lineToRelative(-0.24f, 1.102f)
                horizontalLineToRelative(3.711f)
                lineToRelative(1.692f, -11.26f)
                curveToRelative(-1.238f, -0.001f, -2.482f, 0.01f, -3.71f, 0.0f)
                close()
                moveTo(12.0f, 0.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, 5.37f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.37f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.63f, 0.0f, 12.0f)
                reflectiveCurveTo(5.37f, 0.0f, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _airasia!!
    }

private var _airasia: ImageVector? = null
