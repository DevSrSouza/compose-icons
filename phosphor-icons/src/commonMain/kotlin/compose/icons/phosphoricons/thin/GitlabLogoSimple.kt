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

public val ThinGroup.GitlabLogoSimple: ImageVector
    get() {
        if (_gitlabLogoSimple != null) {
            return _gitlabLogoSimple!!
        }
        _gitlabLogoSimple = Builder(name = "GitlabLogoSimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.4f, 153.5f)
                lineTo(207.1f, 51.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -7.4f, -5.9f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -7.8f, 5.2f)
                lineTo(170.2f, 108.0f)
                lineTo(85.8f, 108.0f)
                lineTo(64.1f, 50.3f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -7.8f, -5.2f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 48.9f, 51.0f)
                lineTo(21.6f, 153.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 4.7f, 13.0f)
                lineToRelative(94.9f, 65.6f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, 13.6f, 0.0f)
                lineToRelative(94.9f, -65.6f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 234.4f, 153.5f)
                close()
                moveTo(225.1f, 159.9f)
                lineTo(130.3f, 225.6f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -4.6f, 0.0f)
                lineTo(30.9f, 159.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.6f, -4.3f)
                lineTo(56.6f, 53.1f)
                lineToRelative(22.7f, 60.3f)
                arcTo(3.8f, 3.8f, 0.0f, false, false, 83.0f, 116.0f)
                horizontalLineToRelative(90.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 3.7f, -2.6f)
                lineToRelative(22.7f, -60.3f)
                lineToRelative(27.3f, 102.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 225.1f, 159.9f)
                close()
            }
        }
        .build()
        return _gitlabLogoSimple!!
    }

private var _gitlabLogoSimple: ImageVector? = null
