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

public val LineAwesomeIcons.SpinnerSolid: ImageVector
    get() {
        if (_spinnerSolid != null) {
            return _spinnerSolid!!
        }
        _spinnerSolid = Builder(name = "SpinnerSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(14.3438f, 3.0f, 13.0f, 4.3438f, 13.0f, 6.0f)
                curveTo(13.0f, 7.6563f, 14.3438f, 9.0f, 16.0f, 9.0f)
                curveTo(17.6563f, 9.0f, 19.0f, 7.6563f, 19.0f, 6.0f)
                curveTo(19.0f, 4.3438f, 17.6563f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(8.9375f, 6.4375f)
                curveTo(7.5586f, 6.4375f, 6.4375f, 7.5586f, 6.4375f, 8.9375f)
                curveTo(6.4375f, 10.3164f, 7.5586f, 11.4375f, 8.9375f, 11.4375f)
                curveTo(10.3164f, 11.4375f, 11.4375f, 10.3164f, 11.4375f, 8.9375f)
                curveTo(11.4375f, 7.5586f, 10.3164f, 6.4375f, 8.9375f, 6.4375f)
                close()
                moveTo(23.0625f, 7.9375f)
                curveTo(22.5117f, 7.9375f, 22.0625f, 8.3867f, 22.0625f, 8.9375f)
                curveTo(22.0625f, 9.4883f, 22.5117f, 9.9375f, 23.0625f, 9.9375f)
                curveTo(23.6133f, 9.9375f, 24.0625f, 9.4883f, 24.0625f, 8.9375f)
                curveTo(24.0625f, 8.3867f, 23.6133f, 7.9375f, 23.0625f, 7.9375f)
                close()
                moveTo(6.0f, 13.75f)
                curveTo(4.7578f, 13.75f, 3.75f, 14.7578f, 3.75f, 16.0f)
                curveTo(3.75f, 17.2422f, 4.7578f, 18.25f, 6.0f, 18.25f)
                curveTo(7.2422f, 18.25f, 8.25f, 17.2422f, 8.25f, 16.0f)
                curveTo(8.25f, 14.7578f, 7.2422f, 13.75f, 6.0f, 13.75f)
                close()
                moveTo(26.0f, 14.75f)
                curveTo(25.3086f, 14.75f, 24.75f, 15.3086f, 24.75f, 16.0f)
                curveTo(24.75f, 16.6914f, 25.3086f, 17.25f, 26.0f, 17.25f)
                curveTo(26.6914f, 17.25f, 27.25f, 16.6914f, 27.25f, 16.0f)
                curveTo(27.25f, 15.3086f, 26.6914f, 14.75f, 26.0f, 14.75f)
                close()
                moveTo(8.9375f, 21.0625f)
                curveTo(7.832f, 21.0625f, 6.9375f, 21.957f, 6.9375f, 23.0625f)
                curveTo(6.9375f, 24.168f, 7.832f, 25.0625f, 8.9375f, 25.0625f)
                curveTo(10.043f, 25.0625f, 10.9375f, 24.168f, 10.9375f, 23.0625f)
                curveTo(10.9375f, 21.957f, 10.043f, 21.0625f, 8.9375f, 21.0625f)
                close()
                moveTo(23.0625f, 21.5625f)
                curveTo(22.2344f, 21.5625f, 21.5625f, 22.2344f, 21.5625f, 23.0625f)
                curveTo(21.5625f, 23.8906f, 22.2344f, 24.5625f, 23.0625f, 24.5625f)
                curveTo(23.8906f, 24.5625f, 24.5625f, 23.8906f, 24.5625f, 23.0625f)
                curveTo(24.5625f, 22.2344f, 23.8906f, 21.5625f, 23.0625f, 21.5625f)
                close()
                moveTo(16.0f, 24.25f)
                curveTo(15.0352f, 24.25f, 14.25f, 25.0352f, 14.25f, 26.0f)
                curveTo(14.25f, 26.9648f, 15.0352f, 27.75f, 16.0f, 27.75f)
                curveTo(16.9648f, 27.75f, 17.75f, 26.9648f, 17.75f, 26.0f)
                curveTo(17.75f, 25.0352f, 16.9648f, 24.25f, 16.0f, 24.25f)
                close()
            }
        }
        .build()
        return _spinnerSolid!!
    }

private var _spinnerSolid: ImageVector? = null
