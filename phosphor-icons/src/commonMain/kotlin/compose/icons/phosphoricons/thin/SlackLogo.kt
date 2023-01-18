package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.SlackLogo: ImageVector
    get() {
        if (_slackLogo != null) {
            return _slackLogo!!
        }
        _slackLogo = Builder(name = "SlackLogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.4f, 128.0f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 180.0f, 84.4f)
                lineTo(180.0f, 56.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -52.0f, -14.4f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 84.4f, 76.0f)
                lineTo(56.0f, 76.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -14.4f, 52.0f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 76.0f, 171.6f)
                lineTo(76.0f, 200.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 52.0f, 14.4f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 171.6f, 180.0f)
                lineTo(200.0f, 180.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 14.4f, -52.0f)
                close()
                moveTo(200.0f, 84.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, 40.0f)
                lineTo(180.0f, 124.0f)
                lineTo(180.0f, 104.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 200.0f, 84.0f)
                close()
                moveTo(171.6f, 124.0f)
                lineTo(172.0f, 123.6f)
                verticalLineToRelative(0.4f)
                close()
                moveTo(152.0f, 36.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(132.0f, 124.0f)
                lineTo(132.0f, 56.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 152.0f, 36.0f)
                close()
                moveTo(132.0f, 171.6f)
                lineToRelative(0.4f, 0.4f)
                lineTo(132.0f, 172.0f)
                close()
                moveTo(124.0f, 84.4f)
                lineTo(123.6f, 84.0f)
                horizontalLineToRelative(0.4f)
                close()
                moveTo(84.0f, 56.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                lineTo(124.0f, 76.0f)
                lineTo(104.0f, 76.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 84.0f, 56.0f)
                close()
                moveTo(36.0f, 104.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 56.0f, 84.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineToRelative(20.0f)
                lineTo(56.0f, 124.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 36.0f, 104.0f)
                close()
                moveTo(84.4f, 132.0f)
                lineTo(84.0f, 132.4f)
                lineTo(84.0f, 132.0f)
                close()
                moveTo(56.0f, 172.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, -40.0f)
                lineTo(76.0f, 132.0f)
                verticalLineToRelative(20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 56.0f, 172.0f)
                close()
                moveTo(104.0f, 220.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(84.0f, 152.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, -20.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(68.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 104.0f, 220.0f)
                close()
                moveTo(172.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                lineTo(132.0f, 180.0f)
                horizontalLineToRelative(20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 172.0f, 200.0f)
                close()
                moveTo(200.0f, 172.0f)
                lineTo(152.0f, 172.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(132.0f, 132.0f)
                horizontalLineToRelative(68.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, 40.0f)
                close()
            }
        }
        .build()
        return _slackLogo!!
    }

private var _slackLogo: ImageVector? = null
