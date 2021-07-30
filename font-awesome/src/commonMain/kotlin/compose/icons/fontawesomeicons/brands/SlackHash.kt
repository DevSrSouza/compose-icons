package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.SlackHash: ImageVector
    get() {
        if (_slackHash != null) {
            return _slackHash!!
        }
        _slackHash = Builder(name = "SlackHash", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(446.2f, 270.4f)
                curveToRelative(-6.2f, -19.0f, -26.9f, -29.1f, -46.0f, -22.9f)
                lineToRelative(-45.4f, 15.1f)
                lineToRelative(-30.3f, -90.0f)
                lineToRelative(45.4f, -15.1f)
                curveToRelative(19.1f, -6.2f, 29.1f, -26.8f, 23.0f, -45.9f)
                curveToRelative(-6.2f, -19.0f, -26.9f, -29.1f, -46.0f, -22.9f)
                lineToRelative(-45.4f, 15.1f)
                lineToRelative(-15.7f, -47.0f)
                curveToRelative(-6.2f, -19.0f, -26.9f, -29.1f, -46.0f, -22.9f)
                curveToRelative(-19.1f, 6.2f, -29.1f, 26.8f, -23.0f, 45.9f)
                lineToRelative(15.7f, 47.0f)
                lineToRelative(-93.4f, 31.2f)
                lineToRelative(-15.7f, -47.0f)
                curveToRelative(-6.2f, -19.0f, -26.9f, -29.1f, -46.0f, -22.9f)
                curveToRelative(-19.1f, 6.2f, -29.1f, 26.8f, -23.0f, 45.9f)
                lineToRelative(15.7f, 47.0f)
                lineToRelative(-45.3f, 15.0f)
                curveToRelative(-19.1f, 6.2f, -29.1f, 26.8f, -23.0f, 45.9f)
                curveToRelative(5.0f, 14.5f, 19.1f, 24.0f, 33.6f, 24.6f)
                curveToRelative(6.8f, 1.0f, 12.0f, -1.6f, 57.7f, -16.8f)
                lineToRelative(30.3f, 90.0f)
                lineTo(78.0f, 354.8f)
                curveToRelative(-19.0f, 6.2f, -29.1f, 26.9f, -23.0f, 45.9f)
                curveToRelative(5.0f, 14.5f, 19.1f, 24.0f, 33.6f, 24.6f)
                curveToRelative(6.8f, 1.0f, 12.0f, -1.6f, 57.7f, -16.8f)
                lineToRelative(15.7f, 47.0f)
                curveToRelative(5.9f, 16.9f, 24.7f, 29.0f, 46.0f, 22.9f)
                curveToRelative(19.1f, -6.2f, 29.1f, -26.8f, 23.0f, -45.9f)
                lineToRelative(-15.7f, -47.0f)
                lineToRelative(93.6f, -31.3f)
                lineToRelative(15.7f, 47.0f)
                curveToRelative(5.9f, 16.9f, 24.7f, 29.0f, 46.0f, 22.9f)
                curveToRelative(19.1f, -6.2f, 29.1f, -26.8f, 23.0f, -45.9f)
                lineToRelative(-15.7f, -47.0f)
                lineToRelative(45.4f, -15.1f)
                curveToRelative(19.0f, -6.0f, 29.1f, -26.7f, 22.9f, -45.7f)
                close()
                moveTo(192.1f, 317.6f)
                lineToRelative(-30.3f, -90.2f)
                lineToRelative(93.5f, -31.3f)
                lineToRelative(30.3f, 90.2f)
                lineToRelative(-93.5f, 31.3f)
                close()
            }
        }
        .build()
        return _slackHash!!
    }

private var _slackHash: ImageVector? = null
