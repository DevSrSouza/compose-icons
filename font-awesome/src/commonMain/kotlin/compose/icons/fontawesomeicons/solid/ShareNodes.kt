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

public val SolidGroup.ShareNodes: ImageVector
    get() {
        if (_shareNodes != null) {
            return _shareNodes!!
        }
        _shareNodes = Builder(name = "ShareNodes", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 224.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(-43.0f, -96.0f, -96.0f, -96.0f)
                reflectiveCurveToRelative(-96.0f, 43.0f, -96.0f, 96.0f)
                curveToRelative(0.0f, 4.0f, 0.2f, 8.0f, 0.7f, 11.9f)
                lineToRelative(-94.1f, 47.0f)
                curveTo(145.4f, 170.2f, 121.9f, 160.0f, 96.0f, 160.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, 43.0f, -96.0f, 96.0f)
                reflectiveCurveToRelative(43.0f, 96.0f, 96.0f, 96.0f)
                curveToRelative(25.9f, 0.0f, 49.4f, -10.2f, 66.6f, -26.9f)
                lineToRelative(94.1f, 47.0f)
                curveToRelative(-0.5f, 3.9f, -0.7f, 7.8f, -0.7f, 11.9f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                reflectiveCurveToRelative(96.0f, -43.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(-43.0f, -96.0f, -96.0f, -96.0f)
                curveToRelative(-25.9f, 0.0f, -49.4f, 10.2f, -66.6f, 26.9f)
                lineToRelative(-94.1f, -47.0f)
                curveToRelative(0.5f, -3.9f, 0.7f, -7.8f, 0.7f, -11.9f)
                reflectiveCurveToRelative(-0.2f, -8.0f, -0.7f, -11.9f)
                lineToRelative(94.1f, -47.0f)
                curveTo(302.6f, 213.8f, 326.1f, 224.0f, 352.0f, 224.0f)
                close()
            }
        }
        .build()
        return _shareNodes!!
    }

private var _shareNodes: ImageVector? = null
