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

public val SolidGroup.CloudBolt: ImageVector
    get() {
        if (_cloudBolt != null) {
            return _cloudBolt!!
        }
        _cloudBolt = Builder(name = "CloudBolt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 224.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                horizontalLineToRelative(47.2f)
                lineTo(290.0f, 202.5f)
                curveToRelative(17.6f, -14.1f, 42.6f, -14.0f, 60.2f, 0.2f)
                reflectiveCurveToRelative(22.8f, 38.6f, 12.8f, 58.8f)
                lineTo(333.7f, 320.0f)
                lineTo(352.0f, 320.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(-43.0f, -96.0f, -96.0f, -96.0f)
                curveToRelative(-0.5f, 0.0f, -1.1f, 0.0f, -1.6f, 0.0f)
                curveToRelative(1.1f, -5.2f, 1.6f, -10.5f, 1.6f, -16.0f)
                curveToRelative(0.0f, -44.2f, -35.8f, -80.0f, -80.0f, -80.0f)
                curveToRelative(-24.3f, 0.0f, -46.1f, 10.9f, -60.8f, 28.0f)
                curveTo(256.5f, 24.3f, 219.1f, 0.0f, 176.0f, 0.0f)
                curveTo(114.1f, 0.0f, 64.0f, 50.1f, 64.0f, 112.0f)
                curveToRelative(0.0f, 7.1f, 0.7f, 14.1f, 1.9f, 20.8f)
                curveTo(27.6f, 145.4f, 0.0f, 181.5f, 0.0f, 224.0f)
                close()
                moveTo(330.1f, 227.6f)
                curveToRelative(-5.8f, -4.7f, -14.2f, -4.7f, -20.1f, -0.1f)
                lineToRelative(-160.0f, 128.0f)
                curveToRelative(-5.3f, 4.2f, -7.4f, 11.4f, -5.1f, 17.8f)
                reflectiveCurveToRelative(8.3f, 10.7f, 15.1f, 10.7f)
                horizontalLineToRelative(70.1f)
                lineTo(177.7f, 488.8f)
                curveToRelative(-3.4f, 6.7f, -1.6f, 14.9f, 4.3f, 19.6f)
                reflectiveCurveToRelative(14.2f, 4.7f, 20.1f, 0.1f)
                lineToRelative(160.0f, -128.0f)
                curveToRelative(5.3f, -4.2f, 7.4f, -11.4f, 5.1f, -17.8f)
                reflectiveCurveToRelative(-8.3f, -10.7f, -15.1f, -10.7f)
                lineTo(281.9f, 352.0f)
                lineToRelative(52.4f, -104.8f)
                curveToRelative(3.4f, -6.7f, 1.6f, -14.9f, -4.2f, -19.6f)
                close()
            }
        }
        .build()
        return _cloudBolt!!
    }

private var _cloudBolt: ImageVector? = null
