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

public val ThinGroup.InstagramLogo: ImageVector
    get() {
        if (_instagramLogo != null) {
            return _instagramLogo!!
        }
        _instagramLogo = Builder(name = "InstagramLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 84.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 44.0f, 44.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 128.0f, 84.0f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 128.0f, 164.0f)
                close()
                moveTo(172.0f, 32.0f)
                lineTo(84.0f, 32.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 32.0f, 84.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 52.0f, 52.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 52.0f, -52.0f)
                lineTo(224.0f, 84.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 172.0f, 32.0f)
                close()
                moveTo(216.0f, 172.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -44.0f, 44.0f)
                lineTo(84.0f, 216.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -44.0f, -44.0f)
                lineTo(40.0f, 84.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 84.0f, 40.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 44.0f, 44.0f)
                close()
                moveTo(188.0f, 76.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 188.0f, 76.0f)
                close()
            }
        }
        .build()
        return _instagramLogo!!
    }

private var _instagramLogo: ImageVector? = null
