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

public val SolidGroup.PersonThroughWindow: ImageVector
    get() {
        if (_personThroughWindow != null) {
            return _personThroughWindow!!
        }
        _personThroughWindow = Builder(name = "PersonThroughWindow", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 64.0f)
                lineToRelative(224.0f, 0.0f)
                lineToRelative(0.0f, 9.8f)
                curveToRelative(0.0f, 39.0f, -23.7f, 74.0f, -59.9f, 88.4f)
                curveTo(167.6f, 186.5f, 128.0f, 245.0f, 128.0f, 310.2f)
                lineToRelative(0.0f, 73.8f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                lineTo(64.0f, 384.0f)
                lineTo(64.0f, 64.0f)
                close()
                moveTo(352.0f, 64.0f)
                lineToRelative(224.0f, 0.0f)
                lineTo(576.0f, 384.0f)
                lineTo(508.3f, 384.0f)
                lineToRelative(-3.7f, -4.5f)
                lineToRelative(-75.2f, -90.2f)
                curveToRelative(-9.1f, -10.9f, -22.6f, -17.3f, -36.9f, -17.3f)
                lineToRelative(-71.1f, 0.0f)
                lineToRelative(-41.0f, -63.1f)
                curveToRelative(-0.3f, -0.5f, -0.6f, -1.0f, -1.0f, -1.4f)
                curveToRelative(44.7f, -29.0f, 72.5f, -79.0f, 72.5f, -133.6f)
                lineToRelative(0.0f, -9.8f)
                close()
                moveTo(425.0f, 384.0f)
                lineTo(379.2f, 384.0f)
                lineToRelative(42.7f, 64.0f)
                lineTo(592.0f, 448.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(640.0f, 48.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineTo(48.0f, 0.0f)
                curveTo(21.5f, 0.0f, 0.0f, 21.5f, 0.0f, 48.0f)
                lineTo(0.0f, 400.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineTo(308.2f, 448.0f)
                lineToRelative(33.2f, 49.8f)
                curveToRelative(9.8f, 14.7f, 29.7f, 18.7f, 44.4f, 8.9f)
                reflectiveCurveToRelative(18.7f, -29.7f, 8.9f, -44.4f)
                lineTo(310.5f, 336.0f)
                lineToRelative(74.6f, 0.0f)
                lineToRelative(40.0f, 48.0f)
                close()
                moveTo(265.5f, 384.0f)
                lineTo(192.0f, 384.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                lineToRelative(0.0f, -73.8f)
                curveToRelative(0.0f, -10.2f, 1.6f, -20.1f, 4.7f, -29.5f)
                lineTo(265.5f, 384.0f)
                close()
                moveTo(192.0f, 128.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 96.0f, 0.0f)
                close()
            }
        }
        .build()
        return _personThroughWindow!!
    }

private var _personThroughWindow: ImageVector? = null
