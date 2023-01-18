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

public val LightGroup.ApplePodcastsLogo: ImageVector
    get() {
        if (_applePodcastsLogo != null) {
            return _applePodcastsLogo!!
        }
        _applePodcastsLogo = Builder(name = "ApplePodcastsLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(150.1f, 140.2f)
                arcTo(29.7f, 29.7f, 0.0f, false, false, 158.0f, 120.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -60.0f, 0.0f)
                arcToRelative(29.7f, 29.7f, 0.0f, false, false, 7.9f, 20.2f)
                arcToRelative(22.2f, 22.2f, 0.0f, false, false, -7.4f, 5.9f)
                arcToRelative(21.8f, 21.8f, 0.0f, false, false, -4.6f, 18.2f)
                lineToRelative(9.6f, 48.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, false, 125.1f, 230.0f)
                horizontalLineToRelative(5.8f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, 21.6f, -17.7f)
                lineToRelative(9.6f, -48.0f)
                arcToRelative(21.8f, 21.8f, 0.0f, false, false, -4.6f, -18.2f)
                arcTo(22.2f, 22.2f, 0.0f, false, false, 150.1f, 140.2f)
                close()
                moveTo(128.0f, 102.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 128.0f, 102.0f)
                close()
                moveTo(150.3f, 162.0f)
                lineTo(140.7f, 210.0f)
                arcToRelative(10.1f, 10.1f, 0.0f, false, true, -9.8f, 8.0f)
                horizontalLineToRelative(-5.8f)
                arcToRelative(10.1f, 10.1f, 0.0f, false, true, -9.8f, -8.0f)
                lineToRelative(-9.6f, -48.0f)
                arcToRelative(9.9f, 9.9f, 0.0f, false, true, 2.1f, -8.3f)
                arcToRelative(9.7f, 9.7f, 0.0f, false, true, 7.7f, -3.7f)
                horizontalLineToRelative(25.0f)
                arcToRelative(9.7f, 9.7f, 0.0f, false, true, 7.7f, 3.7f)
                arcTo(9.9f, 9.9f, 0.0f, false, true, 150.3f, 162.0f)
                close()
                moveTo(186.0f, 128.0f)
                arcTo(58.0f, 58.0f, 0.0f, true, false, 73.9f, 149.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.4f, 7.8f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -2.2f, 0.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.6f, -3.9f)
                arcToRelative(70.0f, 70.0f, 0.0f, true, true, 130.6f, 0.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -7.8f, 3.5f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -3.4f, -7.8f)
                arcTo(57.9f, 57.9f, 0.0f, false, false, 186.0f, 128.0f)
                close()
                moveTo(230.0f, 128.0f)
                arcToRelative(101.7f, 101.7f, 0.0f, false, true, -47.1f, 86.0f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, -3.2f, 0.9f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -5.1f, -2.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.8f, -8.3f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, false, -96.8f, 0.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 73.1f, 214.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, true, 230.0f, 128.0f)
                close()
            }
        }
        .build()
        return _applePodcastsLogo!!
    }

private var _applePodcastsLogo: ImageVector? = null
