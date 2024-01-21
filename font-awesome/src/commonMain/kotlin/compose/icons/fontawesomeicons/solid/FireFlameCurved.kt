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

public val SolidGroup.FireFlameCurved: ImageVector
    get() {
        if (_fireFlameCurved != null) {
            return _fireFlameCurved!!
        }
        _fireFlameCurved = Builder(name = "FireFlameCurved", defaultWidth = 384.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(153.6f, 29.9f)
                lineToRelative(16.0f, -21.3f)
                curveTo(173.6f, 3.2f, 180.0f, 0.0f, 186.7f, 0.0f)
                curveTo(198.4f, 0.0f, 208.0f, 9.6f, 208.0f, 21.3f)
                verticalLineTo(43.5f)
                curveToRelative(0.0f, 13.1f, 5.4f, 25.7f, 14.9f, 34.7f)
                lineTo(307.6f, 159.0f)
                curveTo(356.4f, 205.6f, 384.0f, 270.2f, 384.0f, 337.7f)
                curveTo(384.0f, 434.0f, 306.0f, 512.0f, 209.7f, 512.0f)
                horizontalLineTo(192.0f)
                curveTo(86.0f, 512.0f, 0.0f, 426.0f, 0.0f, 320.0f)
                verticalLineToRelative(-3.8f)
                curveToRelative(0.0f, -48.8f, 19.4f, -95.6f, 53.9f, -130.1f)
                lineToRelative(3.5f, -3.5f)
                curveToRelative(4.2f, -4.2f, 10.0f, -6.6f, 16.0f, -6.6f)
                curveTo(85.9f, 176.0f, 96.0f, 186.1f, 96.0f, 198.6f)
                verticalLineTo(288.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                reflectiveCurveToRelative(64.0f, -28.7f, 64.0f, -64.0f)
                verticalLineToRelative(-3.9f)
                curveToRelative(0.0f, -18.0f, -7.2f, -35.3f, -19.9f, -48.0f)
                lineToRelative(-38.6f, -38.6f)
                curveToRelative(-24.0f, -24.0f, -37.5f, -56.7f, -37.5f, -90.7f)
                curveToRelative(0.0f, -27.7f, 9.0f, -54.8f, 25.6f, -76.9f)
                close()
            }
        }
        .build()
        return _fireFlameCurved!!
    }

private var _fireFlameCurved: ImageVector? = null
