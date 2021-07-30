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

public val SolidGroup.Compass: ImageVector
    get() {
        if (_compass != null) {
            return _compass!!
        }
        _compass = Builder(name = "Compass", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.38f, 233.37f)
                curveToRelative(-12.5f, 12.5f, -12.5f, 32.76f, 0.0f, 45.25f)
                curveToRelative(12.49f, 12.5f, 32.76f, 12.5f, 45.25f, 0.0f)
                curveToRelative(12.5f, -12.5f, 12.5f, -32.76f, 0.0f, -45.25f)
                curveToRelative(-12.5f, -12.49f, -32.76f, -12.49f, -45.25f, 0.0f)
                close()
                moveTo(248.0f, 8.0f)
                curveTo(111.03f, 8.0f, 0.0f, 119.03f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.03f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.03f, 248.0f, -248.0f)
                reflectiveCurveTo(384.97f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(374.14f, 156.05f)
                lineTo(308.17f, 300.4f)
                arcToRelative(31.938f, 31.938f, 0.0f, false, true, -15.77f, 15.77f)
                lineToRelative(-144.34f, 65.97f)
                curveToRelative(-16.65f, 7.61f, -33.81f, -9.55f, -26.2f, -26.2f)
                lineToRelative(65.98f, -144.35f)
                arcToRelative(31.938f, 31.938f, 0.0f, false, true, 15.77f, -15.77f)
                lineToRelative(144.34f, -65.97f)
                curveToRelative(16.65f, -7.6f, 33.8f, 9.55f, 26.19f, 26.2f)
                close()
            }
        }
        .build()
        return _compass!!
    }

private var _compass: ImageVector? = null
