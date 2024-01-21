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

public val SolidGroup.PlugCircleBolt: ImageVector
    get() {
        if (_plugCircleBolt != null) {
            return _plugCircleBolt!!
        }
        _plugCircleBolt = Builder(name = "PlugCircleBolt", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 0.0f)
                curveTo(78.3f, 0.0f, 64.0f, 14.3f, 64.0f, 32.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(64.0f)
                lineTo(128.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(288.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(64.0f)
                lineTo(320.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(32.0f, 160.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 77.4f, 55.0f, 142.0f, 128.0f, 156.8f)
                lineTo(160.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(224.0f, 412.8f)
                curveToRelative(12.3f, -2.5f, 24.1f, -6.4f, 35.1f, -11.5f)
                curveToRelative(-2.1f, -10.8f, -3.1f, -21.9f, -3.1f, -33.3f)
                curveToRelative(0.0f, -80.3f, 53.8f, -148.0f, 127.3f, -169.2f)
                curveToRelative(0.5f, -2.2f, 0.7f, -4.5f, 0.7f, -6.8f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(32.0f, 160.0f)
                close()
                moveTo(432.0f, 512.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 0.0f, -288.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 0.0f, 288.0f)
                close()
                moveTo(479.9f, 287.0f)
                curveToRelative(4.3f, 3.7f, 5.4f, 9.9f, 2.6f, 14.9f)
                lineTo(452.4f, 356.0f)
                lineTo(488.0f, 356.0f)
                curveToRelative(5.2f, 0.0f, 9.8f, 3.3f, 11.4f, 8.2f)
                reflectiveCurveToRelative(-0.1f, 10.3f, -4.2f, 13.4f)
                lineToRelative(-96.0f, 72.0f)
                curveToRelative(-4.5f, 3.4f, -10.8f, 3.2f, -15.1f, -0.6f)
                reflectiveCurveToRelative(-5.4f, -9.9f, -2.6f, -14.9f)
                lineTo(411.6f, 380.0f)
                lineTo(376.0f, 380.0f)
                curveToRelative(-5.2f, 0.0f, -9.8f, -3.3f, -11.4f, -8.2f)
                reflectiveCurveToRelative(0.1f, -10.3f, 4.2f, -13.4f)
                lineToRelative(96.0f, -72.0f)
                curveToRelative(4.5f, -3.4f, 10.8f, -3.2f, 15.1f, 0.6f)
                close()
            }
        }
        .build()
        return _plugCircleBolt!!
    }

private var _plugCircleBolt: ImageVector? = null
