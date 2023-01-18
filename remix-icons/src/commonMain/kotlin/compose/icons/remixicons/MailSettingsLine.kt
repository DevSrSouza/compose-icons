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

public val RemixIcons.MailSettingsLine: ImageVector
    get() {
        if (_mailSettingsLine != null) {
            return _mailSettingsLine!!
        }
        _mailSettingsLine = Builder(name = "MailSettingsLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.238f)
                lineToRelative(-7.928f, 7.1f)
                lineTo(4.0f, 7.216f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(7.238f)
                close()
                moveTo(19.501f, 5.0f)
                horizontalLineTo(4.511f)
                lineToRelative(7.55f, 6.662f)
                lineTo(19.502f, 5.0f)
                close()
                moveTo(17.05f, 19.548f)
                arcToRelative(3.017f, 3.017f, 0.0f, false, true, 0.0f, -1.096f)
                lineToRelative(-1.014f, -0.586f)
                lineToRelative(1.0f, -1.732f)
                lineToRelative(1.014f, 0.586f)
                curveToRelative(0.278f, -0.238f, 0.599f, -0.425f, 0.95f, -0.55f)
                verticalLineTo(15.0f)
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
                verticalLineTo(23.0f)
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
        return _mailSettingsLine!!
    }

private var _mailSettingsLine: ImageVector? = null
