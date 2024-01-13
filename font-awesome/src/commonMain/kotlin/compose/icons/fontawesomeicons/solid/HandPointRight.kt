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

public val SolidGroup.HandPointRight: ImageVector
    get() {
        if (_handPointRight != null) {
            return _handPointRight!!
        }
        _handPointRight = Builder(name = "HandPointRight", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 96.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-208.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(208.0f, 0.0f)
                close()
                moveTo(320.0f, 288.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(64.0f, 0.0f)
                close()
                moveTo(384.0f, 224.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                close()
                moveTo(288.0f, 384.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(64.0f, 0.0f)
                close()
                moveTo(200.0f, 288.0f)
                lineToRelative(0.6f, 0.0f)
                curveToRelative(-5.4f, 9.4f, -8.6f, 20.3f, -8.6f, 32.0f)
                curveToRelative(0.0f, 13.2f, 4.0f, 25.4f, 10.8f, 35.6f)
                curveTo(177.9f, 364.3f, 160.0f, 388.1f, 160.0f, 416.0f)
                curveToRelative(0.0f, 11.7f, 3.1f, 22.6f, 8.6f, 32.0f)
                lineToRelative(-8.6f, 0.0f)
                curveTo(71.6f, 448.0f, 0.0f, 376.4f, 0.0f, 288.0f)
                lineToRelative(0.0f, -61.7f)
                curveToRelative(0.0f, -42.4f, 16.9f, -83.1f, 46.9f, -113.1f)
                lineToRelative(11.6f, -11.6f)
                curveTo(82.5f, 77.5f, 115.1f, 64.0f, 149.0f, 64.0f)
                lineToRelative(27.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 88.0f)
                curveToRelative(0.0f, 22.1f, -17.9f, 40.0f, -40.0f, 40.0f)
                reflectiveCurveToRelative(-40.0f, -17.9f, -40.0f, -40.0f)
                lineToRelative(0.0f, -56.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                reflectiveCurveToRelative(-16.0f, 7.2f, -16.0f, 16.0f)
                lineToRelative(0.0f, 56.0f)
                curveToRelative(0.0f, 39.8f, 32.2f, 72.0f, 72.0f, 72.0f)
                close()
            }
        }
        .build()
        return _handPointRight!!
    }

private var _handPointRight: ImageVector? = null
