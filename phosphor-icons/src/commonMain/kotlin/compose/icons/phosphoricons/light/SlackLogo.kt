package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.SlackLogo: ImageVector
    get() {
        if (_slackLogo != null) {
            return _slackLogo!!
        }
        _slackLogo = Builder(name = "SlackLogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.0f, 128.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -36.0f, -48.0f)
                lineTo(182.0f, 56.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -54.0f, -18.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 80.0f, 74.0f)
                lineTo(56.0f, 74.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -18.0f, 54.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 36.0f, 48.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 54.0f, 18.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 48.0f, -36.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 18.0f, -54.0f)
                close()
                moveTo(200.0f, 86.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 0.0f, 36.0f)
                lineTo(182.0f, 122.0f)
                lineTo(182.0f, 104.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 200.0f, 86.0f)
                close()
                moveTo(152.0f, 38.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, true, 18.0f, 18.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, true, -18.0f, 18.0f)
                lineTo(134.0f, 122.0f)
                lineTo(134.0f, 56.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 152.0f, 38.0f)
                close()
                moveTo(86.0f, 56.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 36.0f, 0.0f)
                lineTo(122.0f, 74.0f)
                lineTo(104.0f, 74.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 86.0f, 56.0f)
                close()
                moveTo(38.0f, 104.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 56.0f, 86.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, true, 18.0f, 18.0f)
                verticalLineToRelative(18.0f)
                lineTo(56.0f, 122.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 38.0f, 104.0f)
                close()
                moveTo(56.0f, 170.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 0.0f, -36.0f)
                lineTo(74.0f, 134.0f)
                verticalLineToRelative(18.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 56.0f, 170.0f)
                close()
                moveTo(104.0f, 218.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, true, -18.0f, -18.0f)
                lineTo(86.0f, 152.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, true, 18.0f, -18.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(66.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 104.0f, 218.0f)
                close()
                moveTo(170.0f, 200.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -36.0f, 0.0f)
                lineTo(134.0f, 182.0f)
                horizontalLineToRelative(18.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 170.0f, 200.0f)
                close()
                moveTo(200.0f, 170.0f)
                lineTo(152.0f, 170.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, true, -18.0f, -18.0f)
                lineTo(134.0f, 134.0f)
                horizontalLineToRelative(66.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 0.0f, 36.0f)
                close()
            }
        }
        .build()
        return _slackLogo!!
    }

private var _slackLogo: ImageVector? = null
