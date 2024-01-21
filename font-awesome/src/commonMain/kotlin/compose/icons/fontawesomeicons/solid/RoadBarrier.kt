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

public val SolidGroup.RoadBarrier: ImageVector
    get() {
        if (_roadBarrier != null) {
            return _roadBarrier!!
        }
        _roadBarrier = Builder(name = "RoadBarrier", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 32.0f)
                curveTo(14.3f, 32.0f, 0.0f, 46.3f, 0.0f, 64.0f)
                lineTo(0.0f, 448.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(64.0f, 266.3f)
                lineTo(149.2f, 96.0f)
                lineTo(64.0f, 96.0f)
                lineTo(64.0f, 64.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(405.2f, 96.0f)
                lineTo(330.8f, 96.0f)
                lineToRelative(-5.4f, 10.7f)
                lineTo(234.8f, 288.0f)
                horizontalLineToRelative(74.3f)
                lineToRelative(5.4f, -10.7f)
                lineTo(405.2f, 96.0f)
                close()
                moveTo(362.8f, 288.0f)
                horizontalLineToRelative(74.3f)
                lineToRelative(5.4f, -10.7f)
                lineTo(533.2f, 96.0f)
                lineTo(458.8f, 96.0f)
                lineToRelative(-5.4f, 10.7f)
                lineTo(362.8f, 288.0f)
                close()
                moveTo(202.8f, 96.0f)
                lineToRelative(-5.4f, 10.7f)
                lineTo(106.8f, 288.0f)
                horizontalLineToRelative(74.3f)
                lineToRelative(5.4f, -10.7f)
                lineTo(277.2f, 96.0f)
                lineTo(202.8f, 96.0f)
                close()
                moveTo(490.8f, 288.0f)
                lineTo(576.0f, 288.0f)
                lineTo(576.0f, 448.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(640.0f, 64.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(53.7f)
                lineTo(490.8f, 288.0f)
                close()
            }
        }
        .build()
        return _roadBarrier!!
    }

private var _roadBarrier: ImageVector? = null
