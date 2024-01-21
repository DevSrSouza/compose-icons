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

public val SolidGroup.PlugCircleMinus: ImageVector
    get() {
        if (_plugCircleMinus != null) {
            return _plugCircleMinus!!
        }
        _plugCircleMinus = Builder(name = "PlugCircleMinus", defaultWidth = 576.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
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
                moveTo(576.0f, 368.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, -288.0f, 0.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 288.0f, 0.0f)
                close()
                moveTo(512.0f, 368.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(368.0f, 384.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                lineTo(496.0f, 352.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _plugCircleMinus!!
    }

private var _plugCircleMinus: ImageVector? = null
