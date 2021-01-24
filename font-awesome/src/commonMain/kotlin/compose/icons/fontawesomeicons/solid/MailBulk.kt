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

public val SolidGroup.MailBulk: ImageVector
    get() {
        if (_mailBulk != null) {
            return _mailBulk!!
        }
        _mailBulk = Builder(name = "MailBulk", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 448.0f)
                curveToRelative(-25.6f, 0.0f, -51.2f, -22.4f, -64.0f, -32.0f)
                curveToRelative(-64.0f, -44.8f, -83.2f, -60.8f, -96.0f, -70.4f)
                lineTo(0.0f, 480.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(256.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                lineTo(320.0f, 345.6f)
                curveToRelative(-12.8f, 9.6f, -32.0f, 25.6f, -96.0f, 70.4f)
                curveToRelative(-12.8f, 9.6f, -38.4f, 32.0f, -64.0f, 32.0f)
                close()
                moveTo(288.0f, 256.0f)
                lineTo(32.0f, 256.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(25.6f, 19.2f, 22.4f, 19.2f, 115.2f, 86.4f)
                curveToRelative(9.6f, 6.4f, 28.8f, 25.6f, 44.8f, 25.6f)
                reflectiveCurveToRelative(35.2f, -19.2f, 44.8f, -22.4f)
                curveToRelative(92.8f, -67.2f, 89.6f, -67.2f, 115.2f, -86.4f)
                lineTo(320.0f, 288.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(544.0f, 160.0f)
                lineTo(224.0f, 160.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(33.21f, 0.0f, 60.59f, 25.42f, 63.71f, 57.82f)
                lineToRelative(0.29f, -0.22f)
                lineTo(352.0f, 416.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                lineTo(576.0f, 192.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(512.0f, 288.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(-64.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(64.0f)
                close()
                moveTo(160.0f, 192.0f)
                curveToRelative(0.0f, -35.29f, 28.71f, -64.0f, 64.0f, -64.0f)
                horizontalLineToRelative(224.0f)
                lineTo(448.0f, 32.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                lineTo(96.0f, 0.0f)
                curveTo(78.33f, 0.0f, 64.0f, 14.33f, 64.0f, 32.0f)
                verticalLineToRelative(192.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(-32.0f)
                close()
            }
        }
        .build()
        return _mailBulk!!
    }

private var _mailBulk: ImageVector? = null
