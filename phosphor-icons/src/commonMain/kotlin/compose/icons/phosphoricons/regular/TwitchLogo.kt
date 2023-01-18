package compose.icons.phosphoricons.regular

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
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.TwitchLogo: ImageVector
    get() {
        if (_twitchLogo != null) {
            return _twitchLogo!!
        }
        _twitchLogo = Builder(name = "TwitchLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 248.0f)
                arcToRelative(6.8f, 6.8f, 0.0f, false, true, -3.4f, -0.8f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 64.0f, 240.0f)
                verticalLineTo(208.0f)
                horizontalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineTo(156.3f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, true, -5.8f, 12.2f)
                lineToRelative(-42.9f, 35.8f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, true, -10.2f, 3.7f)
                horizontalLineTo(122.9f)
                lineTo(77.1f, 246.1f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 72.0f, 248.0f)
                close()
                moveTo(48.0f, 48.0f)
                verticalLineTo(192.0f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(22.9f)
                lineToRelative(32.7f, -27.2f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, true, 10.2f, -3.7f)
                horizontalLineToRelative(42.2f)
                lineTo(208.0f, 156.3f)
                verticalLineTo(48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 144.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 144.0f)
                close()
            }
        }
        .build()
        return _twitchLogo!!
    }

private var _twitchLogo: ImageVector? = null
