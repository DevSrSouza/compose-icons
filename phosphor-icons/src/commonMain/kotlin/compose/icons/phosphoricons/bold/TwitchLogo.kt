package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.TwitchLogo: ImageVector
    get() {
        if (_twitchLogo != null) {
            return _twitchLogo!!
        }
        _twitchLogo = Builder(name = "TwitchLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 252.0f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, true, -5.1f, -1.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 60.0f, 240.0f)
                verticalLineTo(212.0f)
                horizontalLineTo(48.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                verticalLineTo(48.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 48.0f, 28.0f)
                horizontalLineTo(208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineTo(156.3f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, -7.2f, 15.3f)
                lineToRelative(-42.9f, 35.8f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -12.8f, 4.6f)
                horizontalLineTo(124.3f)
                lineTo(79.7f, 249.2f)
                arcTo(11.6f, 11.6f, 0.0f, false, true, 72.0f, 252.0f)
                close()
                moveTo(52.0f, 188.0f)
                horizontalLineTo(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(14.4f)
                lineToRelative(26.1f, -21.8f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 12.8f, -4.6f)
                horizontalLineToRelative(40.8f)
                lineTo(204.0f, 154.4f)
                verticalLineTo(52.0f)
                horizontalLineTo(52.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineTo(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 168.0f, 148.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineTo(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 120.0f, 148.0f)
                close()
            }
        }
        .build()
        return _twitchLogo!!
    }

private var _twitchLogo: ImageVector? = null
