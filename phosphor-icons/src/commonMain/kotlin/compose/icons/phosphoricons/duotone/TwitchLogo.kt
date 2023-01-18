package compose.icons.phosphoricons.duotone

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
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.TwitchLogo: ImageVector
    get() {
        if (_twitchLogo != null) {
            return _twitchLogo!!
        }
        _twitchLogo = Builder(name = "TwitchLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(165.1f, 200.0f)
                horizontalLineTo(122.9f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -5.1f, 1.9f)
                lineTo(72.0f, 240.0f)
                verticalLineTo(200.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineTo(156.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -2.9f, 6.1f)
                lineToRelative(-42.9f, 35.7f)
                arcTo(7.8f, 7.8f, 0.0f, false, true, 165.1f, 200.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(64.0f, 208.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 4.6f, 7.2f)
                arcToRelative(6.8f, 6.8f, 0.0f, false, false, 3.4f, 0.8f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 5.1f, -1.9f)
                lineTo(122.9f, 208.0f)
                horizontalLineToRelative(42.2f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, false, 10.2f, -3.7f)
                lineToRelative(42.9f, -35.8f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, false, 5.8f, -12.2f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(208.0f, 156.3f)
                lineTo(165.1f, 192.0f)
                lineTo(122.9f, 192.0f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, false, -10.2f, 3.7f)
                lineTo(80.0f, 222.9f)
                lineTo(80.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(48.0f, 192.0f)
                lineTo(48.0f, 48.0f)
                lineTo(208.0f, 48.0f)
                close()
                moveTo(160.0f, 136.0f)
                lineTo(160.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(112.0f, 136.0f)
                lineTo(112.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _twitchLogo!!
    }

private var _twitchLogo: ImageVector? = null