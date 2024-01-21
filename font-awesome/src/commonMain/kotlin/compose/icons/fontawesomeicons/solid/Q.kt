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

public val SolidGroup.Q: ImageVector
    get() {
        if (_q != null) {
            return _q!!
        }
        _q = Builder(name = "Q", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 256.0f)
                curveToRelative(0.0f, 88.4f, 71.6f, 160.0f, 160.0f, 160.0f)
                curveToRelative(28.9f, 0.0f, 56.0f, -7.7f, 79.4f, -21.1f)
                lineToRelative(-72.0f, -86.4f)
                curveToRelative(-11.3f, -13.6f, -9.5f, -33.8f, 4.1f, -45.1f)
                reflectiveCurveToRelative(33.8f, -9.5f, 45.1f, 4.1f)
                lineToRelative(70.9f, 85.1f)
                curveTo(371.9f, 325.8f, 384.0f, 292.3f, 384.0f, 256.0f)
                curveToRelative(0.0f, -88.4f, -71.6f, -160.0f, -160.0f, -160.0f)
                reflectiveCurveTo(64.0f, 167.6f, 64.0f, 256.0f)
                close()
                moveTo(344.9f, 444.6f)
                curveTo(310.0f, 467.0f, 268.5f, 480.0f, 224.0f, 480.0f)
                curveTo(100.3f, 480.0f, 0.0f, 379.7f, 0.0f, 256.0f)
                reflectiveCurveTo(100.3f, 32.0f, 224.0f, 32.0f)
                reflectiveCurveToRelative(224.0f, 100.3f, 224.0f, 224.0f)
                curveToRelative(0.0f, 56.1f, -20.6f, 107.4f, -54.7f, 146.7f)
                lineToRelative(47.3f, 56.8f)
                curveToRelative(11.3f, 13.6f, 9.5f, 33.8f, -4.1f, 45.1f)
                reflectiveCurveToRelative(-33.8f, 9.5f, -45.1f, -4.1f)
                lineToRelative(-46.6f, -55.9f)
                close()
            }
        }
        .build()
        return _q!!
    }

private var _q: ImageVector? = null
