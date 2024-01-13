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

public val SolidGroup.ScaleBalanced: ImageVector
    get() {
        if (_scaleBalanced != null) {
            return _scaleBalanced!!
        }
        _scaleBalanced = Builder(name = "ScaleBalanced", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 32.0f)
                lineTo(512.0f, 32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(398.4f, 96.0f)
                curveToRelative(-5.2f, 25.8f, -22.9f, 47.1f, -46.4f, 57.3f)
                lineTo(352.0f, 448.0f)
                lineTo(512.0f, 448.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(320.0f, 512.0f)
                lineTo(128.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineTo(288.0f, 448.0f)
                lineTo(288.0f, 153.3f)
                curveToRelative(-23.5f, -10.3f, -41.2f, -31.6f, -46.4f, -57.3f)
                lineTo(128.0f, 96.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineTo(256.0f, 32.0f)
                curveToRelative(14.6f, -19.4f, 37.8f, -32.0f, 64.0f, -32.0f)
                reflectiveCurveToRelative(49.4f, 12.6f, 64.0f, 32.0f)
                close()
                moveTo(439.6f, 320.0f)
                lineTo(584.4f, 320.0f)
                lineTo(512.0f, 195.8f)
                lineTo(439.6f, 320.0f)
                close()
                moveTo(512.0f, 416.0f)
                curveToRelative(-62.9f, 0.0f, -115.2f, -34.0f, -126.0f, -78.9f)
                curveToRelative(-2.6f, -11.0f, 1.0f, -22.3f, 6.7f, -32.1f)
                lineToRelative(95.2f, -163.2f)
                curveToRelative(5.0f, -8.6f, 14.2f, -13.8f, 24.1f, -13.8f)
                reflectiveCurveToRelative(19.1f, 5.3f, 24.1f, 13.8f)
                lineToRelative(95.2f, 163.2f)
                curveToRelative(5.7f, 9.8f, 9.3f, 21.1f, 6.7f, 32.1f)
                curveTo(627.2f, 382.0f, 574.9f, 416.0f, 512.0f, 416.0f)
                close()
                moveTo(126.8f, 195.8f)
                lineTo(54.4f, 320.0f)
                lineTo(199.3f, 320.0f)
                lineTo(126.8f, 195.8f)
                close()
                moveTo(0.9f, 337.1f)
                curveToRelative(-2.6f, -11.0f, 1.0f, -22.3f, 6.7f, -32.1f)
                lineToRelative(95.2f, -163.2f)
                curveToRelative(5.0f, -8.6f, 14.2f, -13.8f, 24.1f, -13.8f)
                reflectiveCurveToRelative(19.1f, 5.3f, 24.1f, 13.8f)
                lineToRelative(95.2f, 163.2f)
                curveToRelative(5.7f, 9.8f, 9.3f, 21.1f, 6.7f, 32.1f)
                curveTo(242.0f, 382.0f, 189.7f, 416.0f, 126.8f, 416.0f)
                reflectiveCurveTo(11.7f, 382.0f, 0.9f, 337.1f)
                close()
            }
        }
        .build()
        return _scaleBalanced!!
    }

private var _scaleBalanced: ImageVector? = null
