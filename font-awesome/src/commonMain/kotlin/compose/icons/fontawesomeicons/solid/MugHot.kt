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

public val SolidGroup.MugHot: ImageVector
    get() {
        if (_mugHot != null) {
            return _mugHot!!
        }
        _mugHot = Builder(name = "MugHot", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 0.0f)
                curveTo(74.7f, 0.0f, 64.0f, 10.7f, 64.0f, 24.0f)
                curveToRelative(0.0f, 38.9f, 23.4f, 59.4f, 39.1f, 73.1f)
                lineToRelative(1.1f, 1.0f)
                curveTo(120.5f, 112.3f, 128.0f, 119.9f, 128.0f, 136.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                curveToRelative(0.0f, -38.9f, -23.4f, -59.4f, -39.1f, -73.1f)
                lineToRelative(-1.1f, -1.0f)
                curveTo(119.5f, 47.7f, 112.0f, 40.1f, 112.0f, 24.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                close()
                moveTo(32.0f, 192.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                lineTo(288.0f, 512.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(61.9f, 0.0f, 112.0f, -50.1f, 112.0f, -112.0f)
                reflectiveCurveToRelative(-50.1f, -112.0f, -112.0f, -112.0f)
                lineTo(352.0f, 192.0f)
                lineTo(32.0f, 192.0f)
                close()
                moveTo(384.0f, 256.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(384.0f, 352.0f)
                lineTo(384.0f, 256.0f)
                close()
                moveTo(224.0f, 24.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                curveToRelative(0.0f, 38.9f, 23.4f, 59.4f, 39.1f, 73.1f)
                lineToRelative(1.1f, 1.0f)
                curveTo(232.5f, 112.3f, 240.0f, 119.9f, 240.0f, 136.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                curveToRelative(0.0f, -38.9f, -23.4f, -59.4f, -39.1f, -73.1f)
                lineToRelative(-1.1f, -1.0f)
                curveTo(231.5f, 47.7f, 224.0f, 40.1f, 224.0f, 24.0f)
                close()
            }
        }
        .build()
        return _mugHot!!
    }

private var _mugHot: ImageVector? = null
