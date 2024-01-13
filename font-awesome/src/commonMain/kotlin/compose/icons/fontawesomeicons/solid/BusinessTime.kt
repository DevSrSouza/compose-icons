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

public val SolidGroup.BusinessTime: ImageVector
    get() {
        if (_businessTime != null) {
            return _businessTime!!
        }
        _businessTime = Builder(name = "BusinessTime", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 48.0f)
                lineTo(328.0f, 48.0f)
                curveToRelative(4.4f, 0.0f, 8.0f, 3.6f, 8.0f, 8.0f)
                lineTo(336.0f, 96.0f)
                lineTo(176.0f, 96.0f)
                lineTo(176.0f, 56.0f)
                curveToRelative(0.0f, -4.4f, 3.6f, -8.0f, 8.0f, -8.0f)
                close()
                moveTo(128.0f, 56.0f)
                lineTo(128.0f, 96.0f)
                lineTo(64.0f, 96.0f)
                curveTo(28.7f, 96.0f, 0.0f, 124.7f, 0.0f, 160.0f)
                verticalLineToRelative(96.0f)
                lineTo(192.0f, 256.0f)
                lineTo(352.0f, 256.0f)
                horizontalLineToRelative(8.2f)
                curveToRelative(32.3f, -39.1f, 81.1f, -64.0f, 135.8f, -64.0f)
                curveToRelative(5.4f, 0.0f, 10.7f, 0.2f, 16.0f, 0.7f)
                lineTo(512.0f, 160.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(384.0f, 96.0f)
                lineTo(384.0f, 56.0f)
                curveToRelative(0.0f, -30.9f, -25.1f, -56.0f, -56.0f, -56.0f)
                lineTo(184.0f, 0.0f)
                curveToRelative(-30.9f, 0.0f, -56.0f, 25.1f, -56.0f, 56.0f)
                close()
                moveTo(320.0f, 352.0f)
                lineTo(224.0f, 352.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(192.0f, 288.0f)
                lineTo(0.0f, 288.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(360.2f, 480.0f)
                curveTo(335.1f, 449.6f, 320.0f, 410.5f, 320.0f, 368.0f)
                curveToRelative(0.0f, -5.4f, 0.2f, -10.7f, 0.7f, -16.0f)
                lineToRelative(-0.7f, 0.0f)
                close()
                moveTo(640.0f, 368.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, -288.0f, 0.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, false, 288.0f, 0.0f)
                close()
                moveTo(496.0f, 288.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(496.0f, 384.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineTo(480.0f, 304.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _businessTime!!
    }

private var _businessTime: ImageVector? = null
