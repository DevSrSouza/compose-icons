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
                moveTo(127.1f, 146.5f)
                curveToRelative(1.3f, 7.7f, 8.0f, 13.5f, 16.0f, 13.5f)
                horizontalLineToRelative(16.5f)
                curveToRelative(9.8f, 0.0f, 17.6f, -8.5f, 16.3f, -18.0f)
                curveToRelative(-3.8f, -28.2f, -16.4f, -54.2f, -36.6f, -74.7f)
                curveToRelative(-14.4f, -14.7f, -23.6f, -33.3f, -26.4f, -53.5f)
                curveTo(111.8f, 5.9f, 105.0f, 0.0f, 96.8f, 0.0f)
                lineTo(80.4f, 0.0f)
                curveTo(70.6f, 0.0f, 63.0f, 8.5f, 64.1f, 18.0f)
                curveToRelative(3.9f, 31.9f, 18.0f, 61.3f, 40.6f, 84.4f)
                curveToRelative(12.0f, 12.2f, 19.7f, 27.5f, 22.4f, 44.1f)
                close()
                moveTo(239.1f, 146.5f)
                curveToRelative(1.3f, 7.7f, 8.0f, 13.5f, 16.0f, 13.5f)
                horizontalLineToRelative(16.5f)
                curveToRelative(9.8f, 0.0f, 17.6f, -8.5f, 16.3f, -18.0f)
                curveToRelative(-3.8f, -28.2f, -16.4f, -54.2f, -36.6f, -74.7f)
                curveToRelative(-14.4f, -14.7f, -23.6f, -33.3f, -26.4f, -53.5f)
                curveTo(223.8f, 5.9f, 217.0f, 0.0f, 208.8f, 0.0f)
                horizontalLineToRelative(-16.4f)
                curveToRelative(-9.8f, 0.0f, -17.5f, 8.5f, -16.3f, 18.0f)
                curveToRelative(3.9f, 31.9f, 18.0f, 61.3f, 40.6f, 84.4f)
                curveToRelative(12.0f, 12.2f, 19.7f, 27.5f, 22.4f, 44.1f)
                close()
                moveTo(400.0f, 192.0f)
                lineTo(32.0f, 192.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(192.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(61.8f, 0.0f, 112.0f, -50.2f, 112.0f, -112.0f)
                reflectiveCurveToRelative(-50.2f, -112.0f, -112.0f, -112.0f)
                close()
                moveTo(400.0f, 352.0f)
                horizontalLineToRelative(-16.0f)
                verticalLineToRelative(-96.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                reflectiveCurveToRelative(-21.5f, 48.0f, -48.0f, 48.0f)
                close()
            }
        }
        .build()
        return _mugHot!!
    }

private var _mugHot: ImageVector? = null
