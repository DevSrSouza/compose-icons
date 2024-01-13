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

public val SolidGroup.ListCheck: ImageVector
    get() {
        if (_listCheck != null) {
            return _listCheck!!
        }
        _listCheck = Builder(name = "ListCheck", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.1f, 38.2f)
                curveToRelative(9.9f, 8.9f, 10.7f, 24.0f, 1.8f, 33.9f)
                lineToRelative(-72.0f, 80.0f)
                curveToRelative(-4.4f, 4.9f, -10.6f, 7.8f, -17.2f, 7.9f)
                reflectiveCurveToRelative(-12.9f, -2.4f, -17.6f, -7.0f)
                lineTo(7.0f, 113.0f)
                curveTo(-2.3f, 103.6f, -2.3f, 88.4f, 7.0f, 79.0f)
                reflectiveCurveToRelative(24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(22.1f, 22.1f)
                lineToRelative(55.1f, -61.2f)
                curveToRelative(8.9f, -9.9f, 24.0f, -10.7f, 33.9f, -1.8f)
                close()
                moveTo(152.1f, 198.2f)
                curveToRelative(9.9f, 8.9f, 10.7f, 24.0f, 1.8f, 33.9f)
                lineToRelative(-72.0f, 80.0f)
                curveToRelative(-4.4f, 4.9f, -10.6f, 7.8f, -17.2f, 7.9f)
                reflectiveCurveToRelative(-12.9f, -2.4f, -17.6f, -7.0f)
                lineTo(7.0f, 273.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(22.1f, 22.1f)
                lineToRelative(55.1f, -61.2f)
                curveToRelative(8.9f, -9.9f, 24.0f, -10.7f, 33.9f, -1.8f)
                close()
                moveTo(224.0f, 96.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineTo(480.0f, 64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(256.0f, 128.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                close()
                moveTo(224.0f, 256.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineTo(480.0f, 224.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(256.0f, 288.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                close()
                moveTo(160.0f, 416.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineTo(480.0f, 384.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(192.0f, 448.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                close()
                moveTo(48.0f, 368.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, -96.0f)
                close()
            }
        }
        .build()
        return _listCheck!!
    }

private var _listCheck: ImageVector? = null
