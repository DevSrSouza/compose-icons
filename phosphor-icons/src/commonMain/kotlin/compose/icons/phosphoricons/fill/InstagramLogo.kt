package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.InstagramLogo: ImageVector
    get() {
        if (_instagramLogo != null) {
            return _instagramLogo!!
        }
        _instagramLogo = Builder(name = "InstagramLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -32.0f, -32.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 160.0f, 128.0f)
                close()
                moveTo(228.0f, 84.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -56.0f, 56.0f)
                lineTo(84.0f, 228.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -56.0f, -56.0f)
                lineTo(28.0f, 84.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 84.0f, 28.0f)
                horizontalLineToRelative(88.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 228.0f, 84.0f)
                close()
                moveTo(176.0f, 128.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -48.0f, 48.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 176.0f, 128.0f)
                close()
                moveTo(192.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 192.0f, 76.0f)
                close()
            }
        }
        .build()
        return _instagramLogo!!
    }

private var _instagramLogo: ImageVector? = null
