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

public val SolidGroup.Tools: ImageVector
    get() {
        if (_tools != null) {
            return _tools!!
        }
        _tools = Builder(name = "Tools", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(501.1f, 395.7f)
                lineTo(384.0f, 278.6f)
                curveToRelative(-23.1f, -23.1f, -57.6f, -27.6f, -85.4f, -13.9f)
                lineTo(192.0f, 158.1f)
                lineTo(192.0f, 96.0f)
                lineTo(64.0f, 0.0f)
                lineTo(0.0f, 64.0f)
                lineToRelative(96.0f, 128.0f)
                horizontalLineToRelative(62.1f)
                lineToRelative(106.6f, 106.6f)
                curveToRelative(-13.6f, 27.8f, -9.2f, 62.3f, 13.9f, 85.4f)
                lineToRelative(117.1f, 117.1f)
                curveToRelative(14.6f, 14.6f, 38.2f, 14.6f, 52.7f, 0.0f)
                lineToRelative(52.7f, -52.7f)
                curveToRelative(14.5f, -14.6f, 14.5f, -38.2f, 0.0f, -52.7f)
                close()
                moveTo(331.7f, 225.0f)
                curveToRelative(28.3f, 0.0f, 54.9f, 11.0f, 74.9f, 31.0f)
                lineToRelative(19.4f, 19.4f)
                curveToRelative(15.8f, -6.9f, 30.8f, -16.5f, 43.8f, -29.5f)
                curveToRelative(37.1f, -37.1f, 49.7f, -89.3f, 37.9f, -136.7f)
                curveToRelative(-2.2f, -9.0f, -13.5f, -12.1f, -20.1f, -5.5f)
                lineToRelative(-74.4f, 74.4f)
                lineToRelative(-67.9f, -11.3f)
                lineTo(334.0f, 98.9f)
                lineToRelative(74.4f, -74.4f)
                curveToRelative(6.6f, -6.6f, 3.4f, -17.9f, -5.7f, -20.2f)
                curveToRelative(-47.4f, -11.7f, -99.6f, 0.9f, -136.6f, 37.9f)
                curveToRelative(-28.5f, 28.5f, -41.9f, 66.1f, -41.2f, 103.6f)
                lineToRelative(82.1f, 82.1f)
                curveToRelative(8.1f, -1.9f, 16.5f, -2.9f, 24.7f, -2.9f)
                close()
                moveTo(227.8f, 307.0f)
                lineToRelative(-56.7f, -56.7f)
                lineTo(18.7f, 402.8f)
                curveToRelative(-25.0f, 25.0f, -25.0f, 65.5f, 0.0f, 90.5f)
                reflectiveCurveToRelative(65.5f, 25.0f, 90.5f, 0.0f)
                lineToRelative(123.6f, -123.6f)
                curveToRelative(-7.6f, -19.9f, -9.9f, -41.6f, -5.0f, -62.7f)
                close()
                moveTo(64.0f, 472.0f)
                curveToRelative(-13.2f, 0.0f, -24.0f, -10.8f, -24.0f, -24.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                curveToRelative(0.0f, 13.2f, -10.7f, 24.0f, -24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _tools!!
    }

private var _tools: ImageVector? = null
