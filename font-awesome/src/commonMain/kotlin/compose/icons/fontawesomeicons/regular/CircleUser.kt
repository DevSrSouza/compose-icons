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

public val RegularGroup.CircleUser: ImageVector
    get() {
        if (_circleUser != null) {
            return _circleUser!!
        }
        _circleUser = Builder(name = "CircleUser", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(406.5f, 399.6f)
                curveTo(387.4f, 352.9f, 341.5f, 320.0f, 288.0f, 320.0f)
                lineTo(224.0f, 320.0f)
                curveToRelative(-53.5f, 0.0f, -99.4f, 32.9f, -118.5f, 79.6f)
                curveTo(69.9f, 362.2f, 48.0f, 311.7f, 48.0f, 256.0f)
                curveTo(48.0f, 141.1f, 141.1f, 48.0f, 256.0f, 48.0f)
                reflectiveCurveToRelative(208.0f, 93.1f, 208.0f, 208.0f)
                curveToRelative(0.0f, 55.7f, -21.9f, 106.2f, -57.5f, 143.6f)
                close()
                moveTo(366.4f, 432.3f)
                curveTo(334.4f, 452.4f, 296.6f, 464.0f, 256.0f, 464.0f)
                reflectiveCurveToRelative(-78.4f, -11.6f, -110.5f, -31.7f)
                curveToRelative(7.3f, -36.7f, 39.7f, -64.3f, 78.5f, -64.3f)
                horizontalLineToRelative(64.0f)
                curveToRelative(38.8f, 0.0f, 71.2f, 27.6f, 78.5f, 64.3f)
                close()
                moveTo(256.0f, 512.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, false, 256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(256.0f, 240.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 0.0f, -80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 0.0f, 80.0f)
                close()
                moveTo(168.0f, 200.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, false, 176.0f, 0.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, false, -176.0f, 0.0f)
                close()
            }
        }
        .build()
        return _circleUser!!
    }

private var _circleUser: ImageVector? = null
