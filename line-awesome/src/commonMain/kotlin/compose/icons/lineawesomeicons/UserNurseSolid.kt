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

public val LineAwesomeIcons.UserNurseSolid: ImageVector
    get() {
        if (_userNurseSolid != null) {
            return _userNurseSolid!!
        }
        _userNurseSolid = Builder(name = "UserNurseSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.1563f, 4.0f)
                lineTo(10.0f, 4.8125f)
                lineTo(9.0f, 10.4375f)
                lineTo(9.0f, 14.0f)
                lineTo(9.0938f, 14.0f)
                curveTo(9.3828f, 15.9922f, 10.4961f, 17.7305f, 12.0938f, 18.8125f)
                curveTo(8.5273f, 20.3438f, 6.0f, 23.8828f, 6.0f, 28.0f)
                lineTo(8.0f, 28.0f)
                curveTo(8.0f, 25.4688f, 9.1719f, 23.2148f, 11.0f, 21.75f)
                lineTo(11.0f, 22.4063f)
                lineTo(11.2813f, 22.7188f)
                lineTo(15.2813f, 26.7188f)
                lineTo(16.0f, 27.4063f)
                lineTo(16.7188f, 26.7188f)
                lineTo(20.7188f, 22.7188f)
                lineTo(21.0f, 22.4063f)
                lineTo(21.0f, 21.75f)
                curveTo(22.8281f, 23.2148f, 24.0f, 25.4688f, 24.0f, 28.0f)
                lineTo(26.0f, 28.0f)
                curveTo(26.0f, 23.8828f, 23.4727f, 20.3438f, 19.9063f, 18.8125f)
                curveTo(21.5039f, 17.7305f, 22.6172f, 15.9922f, 22.9063f, 14.0f)
                lineTo(23.0f, 14.0f)
                lineTo(23.0f, 10.4375f)
                lineTo(22.0f, 4.8125f)
                lineTo(21.8438f, 4.0f)
                close()
                moveTo(11.8438f, 6.0f)
                lineTo(20.1563f, 6.0f)
                lineTo(21.0f, 10.7813f)
                lineTo(21.0f, 12.0f)
                lineTo(11.0f, 12.0f)
                lineTo(11.0f, 10.7813f)
                close()
                moveTo(15.0f, 7.0f)
                lineTo(15.0f, 8.0f)
                lineTo(14.0f, 8.0f)
                lineTo(14.0f, 10.0f)
                lineTo(15.0f, 10.0f)
                lineTo(15.0f, 11.0f)
                lineTo(17.0f, 11.0f)
                lineTo(17.0f, 10.0f)
                lineTo(18.0f, 10.0f)
                lineTo(18.0f, 8.0f)
                lineTo(17.0f, 8.0f)
                lineTo(17.0f, 7.0f)
                close()
                moveTo(11.0938f, 14.0f)
                lineTo(20.9063f, 14.0f)
                curveTo(20.4414f, 16.2852f, 18.4258f, 18.0f, 16.0f, 18.0f)
                curveTo(13.5742f, 18.0f, 11.5586f, 16.2852f, 11.0938f, 14.0f)
                close()
                moveTo(16.0f, 20.0f)
                curveTo(17.0586f, 20.0f, 18.0742f, 20.1914f, 19.0f, 20.5625f)
                lineTo(19.0f, 21.5625f)
                lineTo(16.0f, 24.5625f)
                lineTo(13.0f, 21.5625f)
                lineTo(13.0f, 20.5625f)
                curveTo(13.9258f, 20.1914f, 14.9414f, 20.0f, 16.0f, 20.0f)
                close()
            }
        }
        .build()
        return _userNurseSolid!!
    }

private var _userNurseSolid: ImageVector? = null
