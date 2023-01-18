package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.GitlabLogoSimple: ImageVector
    get() {
        if (_gitlabLogoSimple != null) {
            return _gitlabLogoSimple!!
        }
        _gitlabLogoSimple = Builder(name = "GitlabLogoSimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.3f, 152.5f)
                lineTo(211.0f, 50.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -22.9f, -1.1f)
                lineTo(167.5f, 104.0f)
                horizontalLineToRelative(-79.0f)
                lineTo(67.9f, 48.9f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 45.0f, 50.0f)
                lineTo(17.7f, 152.5f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 6.4f, 17.3f)
                lineToRelative(94.8f, 65.6f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, false, 18.2f, 0.0f)
                lineToRelative(94.8f, -65.6f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 238.3f, 152.5f)
                close()
                moveTo(128.0f, 222.3f)
                lineTo(33.2f, 156.6f)
                lineTo(57.3f, 66.2f)
                lineToRelative(18.2f, 48.6f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 83.0f, 120.0f)
                horizontalLineToRelative(90.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 7.5f, -5.2f)
                lineToRelative(18.2f, -48.6f)
                lineToRelative(24.1f, 90.4f)
                close()
            }
        }
        .build()
        return _gitlabLogoSimple!!
    }

private var _gitlabLogoSimple: ImageVector? = null
