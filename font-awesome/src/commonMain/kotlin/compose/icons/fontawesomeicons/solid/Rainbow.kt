package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Rainbow: ImageVector
    get() {
        if (_rainbow != null) {
            return _rainbow!!
        }
        _rainbow = Builder(name = "Rainbow", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(268.3f, 32.7f)
                curveTo(115.4f, 42.9f, 0.0f, 176.9f, 0.0f, 330.2f)
                lineTo(0.0f, 464.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(64.0f, 320.0f)
                curveTo(64.0f, 186.8f, 180.9f, 80.3f, 317.5f, 97.9f)
                curveTo(430.4f, 112.4f, 512.0f, 214.0f, 512.0f, 327.8f)
                lineTo(512.0f, 464.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(576.0f, 320.0f)
                curveToRelative(0.0f, -165.3f, -140.0f, -298.6f, -307.7f, -287.3f)
                close()
                moveTo(262.7f, 129.6f)
                curveTo(166.0f, 142.0f, 96.0f, 229.1f, 96.0f, 326.7f)
                lineTo(96.0f, 464.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(160.0f, 320.0f)
                curveToRelative(0.0f, -74.8f, 64.5f, -134.8f, 140.8f, -127.4f)
                curveToRelative(66.5f, 6.5f, 115.2f, 66.2f, 115.2f, 133.1f)
                lineTo(416.0f, 464.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(480.0f, 320.0f)
                curveToRelative(0.0f, -114.2f, -100.2f, -205.4f, -217.3f, -190.4f)
                close()
                moveTo(268.9f, 225.9f)
                curveToRelative(-45.6f, 8.9f, -76.9f, 51.5f, -76.9f, 97.9f)
                lineTo(192.0f, 464.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(256.0f, 320.0f)
                curveToRelative(0.0f, -17.6f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.4f, 32.0f, 32.0f)
                verticalLineToRelative(144.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(384.0f, 320.0f)
                curveToRelative(0.0f, -59.2f, -53.8f, -106.0f, -115.1f, -94.1f)
                close()
            }
        }
        .build()
        return _rainbow!!
    }

private var _rainbow: ImageVector? = null
