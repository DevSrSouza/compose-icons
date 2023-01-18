package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.GooglePodcastsLogo: ImageVector
    get() {
        if (_googlePodcastsLogo != null) {
            return _googlePodcastsLogo!!
        }
        _googlePodcastsLogo = Builder(name = "GooglePodcastsLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 24.0f)
                lineTo(140.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(176.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                lineTo(164.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(188.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 176.0f, 56.0f)
                close()
                moveTo(128.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 208.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 196.0f)
                close()
                moveTo(128.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 76.0f)
                close()
                moveTo(80.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 68.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(92.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 80.0f, 56.0f)
                close()
                moveTo(176.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(188.0f, 132.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 176.0f, 120.0f)
                close()
                moveTo(32.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(44.0f, 116.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 32.0f, 104.0f)
                close()
                moveTo(80.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(92.0f, 164.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 80.0f, 152.0f)
                close()
                moveTo(224.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(236.0f, 116.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 104.0f)
                close()
            }
        }
        .build()
        return _googlePodcastsLogo!!
    }

private var _googlePodcastsLogo: ImageVector? = null
