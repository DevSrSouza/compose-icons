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

public val LineAwesomeIcons.UserClockSolid: ImageVector
    get() {
        if (_userClockSolid != null) {
            return _userClockSolid!!
        }
        _userClockSolid = Builder(name = "UserClockSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0996f)
                curveTo(12.1f, 5.0996f, 9.0f, 8.1996f, 9.0f, 12.0996f)
                curveTo(9.0f, 14.4996f, 10.1996f, 16.7004f, 12.0996f, 17.9004f)
                curveTo(8.4996f, 19.3004f, 6.0f, 22.9f, 6.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                curveTo(8.0f, 22.6f, 11.6f, 19.0f, 16.0f, 19.0f)
                curveTo(16.6f, 19.0f, 17.0996f, 19.0992f, 17.5996f, 19.1992f)
                curveTo(17.6464f, 19.1368f, 17.7069f, 19.0828f, 17.7559f, 19.0215f)
                curveTo(16.6607f, 20.3907f, 16.0f, 22.1209f, 16.0f, 24.0f)
                curveTo(16.0f, 28.4f, 19.6f, 32.0f, 24.0f, 32.0f)
                curveTo(28.4f, 32.0f, 32.0f, 28.4f, 32.0f, 24.0f)
                curveTo(32.0f, 19.6f, 28.4f, 16.0f, 24.0f, 16.0f)
                curveTo(23.1119f, 16.0f, 22.2589f, 16.1535f, 21.459f, 16.4238f)
                curveTo(22.4225f, 15.2325f, 23.0f, 13.6669f, 23.0f, 12.0996f)
                curveTo(23.0f, 8.1996f, 19.9f, 5.0996f, 16.0f, 5.0996f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(18.8f, 7.0f, 21.0f, 9.2f, 21.0f, 12.0f)
                curveTo(21.0f, 14.8f, 18.8f, 17.0f, 16.0f, 17.0f)
                curveTo(13.2f, 17.0f, 11.0f, 14.8f, 11.0f, 12.0f)
                curveTo(11.0f, 9.2f, 13.2f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(19.2754f, 17.5664f)
                curveTo(19.2469f, 17.5874f, 19.2177f, 17.6075f, 19.1895f, 17.6289f)
                curveTo(19.2181f, 17.6078f, 19.2464f, 17.5872f, 19.2754f, 17.5664f)
                close()
                moveTo(24.0f, 18.0f)
                curveTo(27.3f, 18.0f, 30.0f, 20.7f, 30.0f, 24.0f)
                curveTo(30.0f, 27.3f, 27.3f, 30.0f, 24.0f, 30.0f)
                curveTo(20.7f, 30.0f, 18.0f, 27.3f, 18.0f, 24.0f)
                curveTo(18.0f, 20.7f, 20.7f, 18.0f, 24.0f, 18.0f)
                close()
                moveTo(18.498f, 18.2148f)
                curveTo(18.3748f, 18.3321f, 18.2562f, 18.4533f, 18.1406f, 18.5781f)
                curveTo(18.2564f, 18.4538f, 18.3729f, 18.3324f, 18.498f, 18.2148f)
                close()
                moveTo(23.0f, 20.0f)
                lineTo(23.0f, 24.5996f)
                lineTo(21.3008f, 26.3008f)
                lineTo(22.6992f, 27.6992f)
                lineTo(25.0f, 25.4004f)
                lineTo(25.0f, 20.0f)
                lineTo(23.0f, 20.0f)
                close()
            }
        }
        .build()
        return _userClockSolid!!
    }

private var _userClockSolid: ImageVector? = null
