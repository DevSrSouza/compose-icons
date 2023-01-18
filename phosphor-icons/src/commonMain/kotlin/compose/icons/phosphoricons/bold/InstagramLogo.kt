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

public val BoldGroup.InstagramLogo: ImageVector
    get() {
        if (_instagramLogo != null) {
            return _instagramLogo!!
        }
        _instagramLogo = Builder(name = "InstagramLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 82.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, 46.0f, 46.0f)
                arcTo(46.0f, 46.0f, 0.0f, false, false, 128.0f, 82.0f)
                close()
                moveTo(128.0f, 150.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 128.0f, 150.0f)
                close()
                moveTo(176.0f, 20.0f)
                lineTo(80.0f, 20.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 20.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 60.0f, 60.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 60.0f, -60.0f)
                lineTo(236.0f, 80.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 176.0f, 20.0f)
                close()
                moveTo(212.0f, 176.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, 36.0f)
                lineTo(80.0f, 212.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f)
                lineTo(44.0f, 80.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 80.0f, 44.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, 36.0f)
                close()
                moveTo(196.0f, 76.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 196.0f, 76.0f)
                close()
            }
        }
        .build()
        return _instagramLogo!!
    }

private var _instagramLogo: ImageVector? = null
