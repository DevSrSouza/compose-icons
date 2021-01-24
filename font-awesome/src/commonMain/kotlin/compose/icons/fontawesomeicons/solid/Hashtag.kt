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

public val SolidGroup.Hashtag: ImageVector
    get() {
        if (_hashtag != null) {
            return _hashtag!!
        }
        _hashtag = Builder(name = "Hashtag", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(440.667f, 182.109f)
                lineToRelative(7.143f, -40.0f)
                curveToRelative(1.313f, -7.355f, -4.342f, -14.109f, -11.813f, -14.109f)
                horizontalLineToRelative(-74.81f)
                lineToRelative(14.623f, -81.891f)
                curveTo(377.123f, 38.754f, 371.468f, 32.0f, 363.997f, 32.0f)
                horizontalLineToRelative(-40.632f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.813f, 9.891f)
                lineTo(296.175f, 128.0f)
                horizontalLineTo(197.54f)
                lineToRelative(14.623f, -81.891f)
                curveTo(213.477f, 38.754f, 207.822f, 32.0f, 200.35f, 32.0f)
                horizontalLineToRelative(-40.632f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.813f, 9.891f)
                lineTo(132.528f, 128.0f)
                horizontalLineTo(53.432f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.813f, 9.891f)
                lineToRelative(-7.143f, 40.0f)
                curveTo(33.163f, 185.246f, 38.818f, 192.0f, 46.289f, 192.0f)
                horizontalLineToRelative(74.81f)
                lineTo(98.242f, 320.0f)
                horizontalLineTo(19.146f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.813f, 9.891f)
                lineToRelative(-7.143f, 40.0f)
                curveTo(-1.123f, 377.246f, 4.532f, 384.0f, 12.003f, 384.0f)
                horizontalLineToRelative(74.81f)
                lineTo(72.19f, 465.891f)
                curveTo(70.877f, 473.246f, 76.532f, 480.0f, 84.003f, 480.0f)
                horizontalLineToRelative(40.632f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.813f, -9.891f)
                lineTo(151.826f, 384.0f)
                horizontalLineToRelative(98.634f)
                lineToRelative(-14.623f, 81.891f)
                curveTo(234.523f, 473.246f, 240.178f, 480.0f, 247.65f, 480.0f)
                horizontalLineToRelative(40.632f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.813f, -9.891f)
                lineTo(315.472f, 384.0f)
                horizontalLineToRelative(79.096f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.813f, -9.891f)
                lineToRelative(7.143f, -40.0f)
                curveToRelative(1.313f, -7.355f, -4.342f, -14.109f, -11.813f, -14.109f)
                horizontalLineToRelative(-74.81f)
                lineToRelative(22.857f, -128.0f)
                horizontalLineToRelative(79.096f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.813f, -9.891f)
                close()
                moveTo(261.889f, 320.0f)
                horizontalLineToRelative(-98.634f)
                lineToRelative(22.857f, -128.0f)
                horizontalLineToRelative(98.634f)
                lineToRelative(-22.857f, 128.0f)
                close()
            }
        }
        .build()
        return _hashtag!!
    }

private var _hashtag: ImageVector? = null
