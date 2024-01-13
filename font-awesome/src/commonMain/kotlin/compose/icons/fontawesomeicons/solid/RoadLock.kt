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

public val SolidGroup.RoadLock: ImageVector
    get() {
        if (_roadLock != null) {
            return _roadLock!!
        }
        _roadLock = Builder(name = "RoadLock", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 32.0f)
                lineTo(213.2f, 32.0f)
                curveToRelative(-27.1f, 0.0f, -51.3f, 17.1f, -60.3f, 42.6f)
                lineTo(35.1f, 407.2f)
                curveToRelative(-2.1f, 5.9f, -3.1f, 12.0f, -3.1f, 18.2f)
                curveTo(32.0f, 455.5f, 56.5f, 480.0f, 86.6f, 480.0f)
                lineTo(288.0f, 480.0f)
                lineTo(288.0f, 416.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(32.0f)
                lineTo(384.0f, 352.0f)
                curveToRelative(0.0f, -23.7f, 12.9f, -44.4f, 32.0f, -55.4f)
                lineTo(416.0f, 272.0f)
                curveToRelative(0.0f, -58.3f, 44.6f, -106.2f, 101.5f, -111.5f)
                lineTo(487.1f, 74.6f)
                curveTo(478.0f, 49.1f, 453.9f, 32.0f, 426.8f, 32.0f)
                lineTo(352.0f, 32.0f)
                lineTo(352.0f, 96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(288.0f, 32.0f)
                close()
                moveTo(352.0f, 224.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(288.0f, 224.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                close()
                moveTo(528.0f, 240.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(48.0f)
                lineTo(496.0f, 320.0f)
                lineTo(496.0f, 272.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(448.0f, 272.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineTo(416.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(608.0f, 512.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(640.0f, 352.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(608.0f, 272.0f)
                curveToRelative(0.0f, -44.2f, -35.8f, -80.0f, -80.0f, -80.0f)
                reflectiveCurveToRelative(-80.0f, 35.8f, -80.0f, 80.0f)
                close()
            }
        }
        .build()
        return _roadLock!!
    }

private var _roadLock: ImageVector? = null
