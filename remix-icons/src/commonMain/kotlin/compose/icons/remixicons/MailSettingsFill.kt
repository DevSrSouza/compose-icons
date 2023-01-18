package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.MailSettingsFill: ImageVector
    get() {
        if (_mailSettingsFill != null) {
            return _mailSettingsFill!!
        }
        _mailSettingsFill = Builder(name = "MailSettingsFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.341f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 14.341f, 21.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(9.341f)
                close()
                moveTo(12.06f, 11.683f)
                lineTo(5.648f, 6.238f)
                lineTo(4.353f, 7.762f)
                lineToRelative(7.72f, 6.555f)
                lineToRelative(7.581f, -6.56f)
                lineToRelative(-1.308f, -1.513f)
                lineToRelative(-6.285f, 5.439f)
                close()
                moveTo(17.05f, 19.548f)
                arcToRelative(3.017f, 3.017f, 0.0f, false, true, 0.0f, -1.096f)
                lineToRelative(-1.014f, -0.586f)
                lineToRelative(1.0f, -1.732f)
                lineToRelative(1.014f, 0.586f)
                curveToRelative(0.278f, -0.238f, 0.599f, -0.425f, 0.95f, -0.55f)
                lineTo(19.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.17f)
                curveToRelative(0.351f, 0.125f, 0.672f, 0.312f, 0.95f, 0.55f)
                lineToRelative(1.014f, -0.586f)
                lineToRelative(1.0f, 1.732f)
                lineToRelative(-1.014f, 0.586f)
                arcToRelative(3.017f, 3.017f, 0.0f, false, true, 0.0f, 1.096f)
                lineToRelative(1.014f, 0.586f)
                lineToRelative(-1.0f, 1.732f)
                lineToRelative(-1.014f, -0.586f)
                arcToRelative(2.997f, 2.997f, 0.0f, false, true, -0.95f, 0.55f)
                lineTo(21.0f, 23.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.17f)
                arcToRelative(2.997f, 2.997f, 0.0f, false, true, -0.95f, -0.55f)
                lineToRelative(-1.014f, 0.586f)
                lineToRelative(-1.0f, -1.732f)
                lineToRelative(1.014f, -0.586f)
                close()
                moveTo(20.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _mailSettingsFill!!
    }

private var _mailSettingsFill: ImageVector? = null
