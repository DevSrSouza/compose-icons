package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.FaceSadTear: ImageVector
    get() {
        if (_faceSadTear != null) {
            return _faceSadTear!!
        }
        _faceSadTear = Builder(name = "FaceSadTear", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(175.9f, 448.0f)
                curveToRelative(-35.0f, -0.1f, -65.5f, -22.6f, -76.0f, -54.6f)
                curveTo(67.6f, 356.8f, 48.0f, 308.7f, 48.0f, 256.0f)
                curveTo(48.0f, 141.1f, 141.1f, 48.0f, 256.0f, 48.0f)
                reflectiveCurveToRelative(208.0f, 93.1f, 208.0f, 208.0f)
                reflectiveCurveToRelative(-93.1f, 208.0f, -208.0f, 208.0f)
                curveToRelative(-28.4f, 0.0f, -55.5f, -5.7f, -80.1f, -16.0f)
                close()
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 512.0f, 0.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, false, 0.0f, 256.0f)
                close()
                moveTo(128.0f, 369.0f)
                curveToRelative(0.0f, 26.0f, 21.5f, 47.0f, 48.0f, 47.0f)
                reflectiveCurveToRelative(48.0f, -21.0f, 48.0f, -47.0f)
                curveToRelative(0.0f, -20.0f, -28.4f, -60.4f, -41.6f, -77.7f)
                curveToRelative(-3.2f, -4.4f, -9.6f, -4.4f, -12.8f, 0.0f)
                curveTo(156.6f, 308.6f, 128.0f, 349.0f, 128.0f, 369.0f)
                close()
                moveTo(256.0f, 304.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                curveToRelative(30.7f, 0.0f, 58.7f, 11.5f, 80.0f, 30.6f)
                curveToRelative(9.9f, 8.8f, 25.0f, 8.0f, 33.9f, -1.9f)
                reflectiveCurveToRelative(8.0f, -25.0f, -1.9f, -33.9f)
                curveTo(338.3f, 320.2f, 299.0f, 304.0f, 256.0f, 304.0f)
                close()
                moveTo(303.6f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                close()
                moveTo(175.6f, 240.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _faceSadTear!!
    }

private var _faceSadTear: ImageVector? = null
