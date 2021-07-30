package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.UserAltSlashSolid: ImageVector
    get() {
        if (_userAltSlashSolid != null) {
            return _userAltSlashSolid!!
        }
        _userAltSlashSolid = Builder(name = "UserAltSlashSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6992f, 2.3008f)
                lineTo(2.3008f, 3.6992f)
                lineTo(9.1426f, 10.541f)
                curveTo(9.1296f, 10.5943f, 9.1114f, 10.6455f, 9.0996f, 10.6992f)
                lineTo(11.0f, 12.5f)
                lineTo(11.0f, 12.3984f)
                lineTo(15.6016f, 17.0f)
                lineTo(15.5f, 17.0f)
                lineTo(17.8008f, 19.3008f)
                curveTo(17.8411f, 19.3008f, 17.8815f, 19.3138f, 17.9219f, 19.3203f)
                lineTo(18.3008f, 19.6992f)
                lineTo(19.8008f, 21.1992f)
                lineTo(23.9004f, 25.2988f)
                curveTo(23.9005f, 25.2994f, 23.9002f, 25.3002f, 23.9004f, 25.3008f)
                lineTo(25.6992f, 27.0996f)
                lineTo(25.7012f, 27.0996f)
                lineTo(28.3008f, 29.6992f)
                lineTo(29.6992f, 28.3008f)
                lineTo(25.5566f, 24.1582f)
                curveTo(24.6873f, 21.3396f, 22.6047f, 19.0272f, 19.9004f, 17.9004f)
                curveTo(21.8004f, 16.6004f, 23.0f, 14.4996f, 23.0f, 12.0996f)
                curveTo(23.0f, 8.1996f, 19.9f, 5.0996f, 16.0f, 5.0996f)
                curveTo(13.4174f, 5.0996f, 11.1879f, 6.4884f, 9.9551f, 8.5566f)
                lineTo(3.6992f, 2.3008f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(18.8f, 7.0f, 21.0f, 9.2f, 21.0f, 12.0f)
                curveTo(21.0f, 14.087f, 19.776f, 15.8379f, 17.9941f, 16.5957f)
                lineTo(11.4043f, 10.0059f)
                curveTo(12.1621f, 8.224f, 13.913f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(9.1992f, 13.3008f)
                curveTo(9.5992f, 15.2008f, 10.5992f, 16.8008f, 12.1992f, 17.8008f)
                curveTo(8.4992f, 19.3008f, 6.0f, 22.9f, 6.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                curveTo(8.0f, 24.1f, 9.5008f, 21.5992f, 11.8008f, 20.1992f)
                curveTo(12.5008f, 21.7992f, 14.1f, 23.0f, 16.0f, 23.0f)
                curveTo(16.8f, 23.0f, 17.5992f, 22.8004f, 18.1992f, 22.4004f)
                lineTo(16.6992f, 20.9004f)
                curveTo(16.4992f, 21.0004f, 16.2f, 21.0f, 16.0f, 21.0f)
                curveTo(14.9f, 21.0f, 13.9992f, 20.3008f, 13.6992f, 19.3008f)
                lineTo(14.9004f, 19.0f)
                lineTo(9.1992f, 13.3008f)
                close()
            }
        }
        .build()
        return _userAltSlashSolid!!
    }

private var _userAltSlashSolid: ImageVector? = null
