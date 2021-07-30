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

public val LineAwesomeIcons.UserSlashSolid: ImageVector
    get() {
        if (_userSlashSolid != null) {
            return _userSlashSolid!!
        }
        _userSlashSolid = Builder(name = "UserSlashSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.6992f, 2.3008f)
                lineTo(2.3008f, 3.6992f)
                lineTo(9.1211f, 10.5195f)
                curveTo(9.1148f, 10.5466f, 9.1056f, 10.5724f, 9.0996f, 10.5996f)
                lineTo(11.0f, 12.5f)
                lineTo(11.0f, 12.3984f)
                lineTo(15.6016f, 17.0f)
                lineTo(15.5f, 17.0f)
                lineTo(17.6992f, 19.1992f)
                curveTo(17.7494f, 19.2109f, 17.7959f, 19.2316f, 17.8457f, 19.2441f)
                lineTo(23.6602f, 25.0586f)
                curveTo(23.6708f, 25.1066f, 23.6896f, 25.1509f, 23.6992f, 25.1992f)
                lineTo(25.5f, 27.0f)
                lineTo(25.6016f, 27.0f)
                lineTo(28.3008f, 29.6992f)
                lineTo(29.6992f, 28.3008f)
                lineTo(25.5938f, 24.1953f)
                curveTo(24.7503f, 21.3148f, 22.6483f, 18.9458f, 19.9004f, 17.8008f)
                curveTo(21.8004f, 16.5008f, 23.0f, 14.4f, 23.0f, 12.0f)
                curveTo(23.0f, 8.1f, 19.9f, 5.0f, 16.0f, 5.0f)
                curveTo(13.391f, 5.0f, 11.1465f, 6.42f, 9.9219f, 8.5234f)
                lineTo(3.6992f, 2.3008f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(18.8f, 7.0f, 21.0f, 9.2f, 21.0f, 12.0f)
                curveTo(21.0f, 14.087f, 19.776f, 15.8379f, 17.9941f, 16.5957f)
                lineTo(11.4043f, 10.0059f)
                curveTo(12.1621f, 8.224f, 13.913f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(9.0996f, 13.3008f)
                curveTo(9.4996f, 15.2008f, 10.4996f, 16.8008f, 12.0996f, 17.8008f)
                curveTo(8.4996f, 19.3008f, 6.0f, 22.9f, 6.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                curveTo(8.0f, 22.9f, 11.0004f, 19.5996f, 14.9004f, 19.0996f)
                lineTo(9.0996f, 13.3008f)
                close()
            }
        }
        .build()
        return _userSlashSolid!!
    }

private var _userSlashSolid: ImageVector? = null
