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

public val DuotoneGroup.SlackLogo: ImageVector
    get() {
        if (_slackLogo != null) {
            return _slackLogo!!
        }
        _slackLogo = Builder(name = "SlackLogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 152.0f)
                lineToRelative(0.0f, -24.0f)
                arcToRelative(0.0f, 0.0f, 0.0f, false, true, 0.0f, -0.0f)
                lineToRelative(72.0f, -0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f)
                lineToRelative(0.0f, -0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                lineTo(152.0f, 176.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 176.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, true, 24.0f, 24.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, true, -24.0f, 24.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, true, -24.0f, -24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 104.0f)
                lineToRelative(-0.0f, 24.0f)
                arcToRelative(0.0f, 0.0f, 0.0f, false, true, -0.0f, 0.0f)
                lineToRelative(-72.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                lineToRelative(-0.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, -24.0f)
                lineTo(104.0f, 80.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 104.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 80.0f)
                horizontalLineTo(104.0f)
                arcTo(23.9f, 23.9f, 0.0f, false, true, 80.0f, 56.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, true, 24.0f, -24.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, true, 24.0f, 24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.1f, 128.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 200.0f, 72.0f)
                arcToRelative(32.2f, 32.2f, 0.0f, false, false, -16.0f, 4.3f)
                lineTo(184.0f, 56.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -56.0f, -21.1f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 72.0f, 56.0f)
                arcToRelative(32.2f, 32.2f, 0.0f, false, false, 4.3f, 16.0f)
                lineTo(56.0f, 72.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -21.1f, 56.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 56.0f, 184.0f)
                arcToRelative(32.2f, 32.2f, 0.0f, false, false, 16.0f, -4.3f)
                lineTo(72.0f, 200.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 56.0f, 21.1f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 184.0f, 200.0f)
                arcToRelative(32.2f, 32.2f, 0.0f, false, false, -4.3f, -16.0f)
                lineTo(200.0f, 184.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 21.1f, -56.0f)
                close()
                moveTo(200.0f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f)
                lineTo(184.0f, 120.0f)
                lineTo(184.0f, 104.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 200.0f, 88.0f)
                close()
                moveTo(152.0f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(136.0f, 120.0f)
                lineTo(136.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 152.0f, 40.0f)
                close()
                moveTo(88.0f, 56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                lineTo(120.0f, 72.0f)
                lineTo(104.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 88.0f, 56.0f)
                close()
                moveTo(40.0f, 104.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 88.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                lineTo(56.0f, 120.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 104.0f)
                close()
                moveTo(56.0f, 168.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -32.0f)
                lineTo(72.0f, 136.0f)
                verticalLineToRelative(16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 168.0f)
                close()
                moveTo(104.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(88.0f, 152.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 104.0f, 216.0f)
                close()
                moveTo(168.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                lineTo(136.0f, 184.0f)
                horizontalLineToRelative(16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 168.0f, 200.0f)
                close()
                moveTo(200.0f, 168.0f)
                lineTo(152.0f, 168.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(136.0f, 136.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f)
                close()
            }
        }
        .build()
        return _slackLogo!!
    }

private var _slackLogo: ImageVector? = null
