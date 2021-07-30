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

public val LineAwesomeIcons.UserShieldSolid: ImageVector
    get() {
        if (_userShieldSolid != null) {
            return _userShieldSolid!!
        }
        _userShieldSolid = Builder(name = "UserShieldSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(12.1f, 5.0f, 9.0f, 8.1f, 9.0f, 12.0f)
                curveTo(9.0f, 14.4375f, 10.21f, 16.5615f, 12.0703f, 17.8125f)
                curveTo(8.51f, 19.3473f, 6.0f, 22.8936f, 6.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                curveTo(8.0f, 22.6f, 11.6f, 19.0f, 16.0f, 19.0f)
                curveTo(16.3412f, 19.0f, 16.6726f, 18.9678f, 17.0f, 18.9219f)
                lineTo(17.0f, 23.5f)
                curveTo(17.0f, 28.7f, 23.7996f, 31.7008f, 24.0996f, 31.8008f)
                lineTo(24.5f, 32.0f)
                lineTo(24.9004f, 31.8008f)
                curveTo(25.2004f, 31.7008f, 32.0f, 28.7f, 32.0f, 23.5f)
                lineTo(32.0f, 18.0f)
                lineTo(31.0996f, 18.0f)
                curveTo(29.1996f, 18.0f, 28.0992f, 17.3008f, 27.1992f, 16.8008f)
                curveTo(26.2992f, 16.4008f, 25.5f, 16.0f, 24.5f, 16.0f)
                curveTo(23.5f, 16.0f, 22.7f, 16.4008f, 22.0f, 16.8008f)
                curveTo(21.4937f, 17.082f, 20.8864f, 17.4223f, 20.1191f, 17.6699f)
                curveTo(21.8682f, 16.4042f, 23.0f, 14.3509f, 23.0f, 12.0f)
                curveTo(23.0f, 8.1f, 19.9f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(18.8f, 7.0f, 21.0f, 9.2f, 21.0f, 12.0f)
                curveTo(21.0f, 14.8f, 18.8f, 17.0f, 16.0f, 17.0f)
                curveTo(13.2f, 17.0f, 11.0f, 14.8f, 11.0f, 12.0f)
                curveTo(11.0f, 9.2f, 13.2f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(24.5f, 18.0f)
                curveTo(25.0f, 18.0f, 25.3992f, 18.1996f, 26.1992f, 18.5996f)
                lineTo(26.5f, 18.6992f)
                curveTo(27.3f, 19.0992f, 28.4f, 19.7004f, 30.0f, 19.9004f)
                lineTo(30.0f, 23.4004f)
                curveTo(30.0f, 26.7004f, 25.7f, 29.0992f, 24.5f, 29.6992f)
                curveTo(23.3f, 29.0992f, 19.0f, 26.7004f, 19.0f, 23.4004f)
                lineTo(19.0f, 19.9004f)
                curveTo(20.7f, 19.7004f, 21.7996f, 19.0992f, 22.5996f, 18.6992f)
                lineTo(22.9004f, 18.5996f)
                lineTo(23.0f, 18.5996f)
                lineTo(23.0996f, 18.5996f)
                curveTo(23.6996f, 18.0996f, 24.0f, 18.0f, 24.5f, 18.0f)
                close()
            }
        }
        .build()
        return _userShieldSolid!!
    }

private var _userShieldSolid: ImageVector? = null
