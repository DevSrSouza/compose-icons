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

public val FillGroup.GitlabLogoSimple: ImageVector
    get() {
        if (_gitlabLogoSimple != null) {
            return _gitlabLogoSimple!!
        }
        _gitlabLogoSimple = Builder(name = "GitlabLogoSimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.9f, 169.8f)
                lineToRelative(-94.8f, 65.6f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, true, -18.2f, 0.0f)
                lineTo(24.1f, 169.8f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, -6.4f, -17.3f)
                lineTo(45.0f, 50.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 22.9f, -1.1f)
                lineTo(88.5f, 104.0f)
                horizontalLineToRelative(79.0f)
                lineToRelative(20.6f, -55.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 211.0f, 50.0f)
                lineToRelative(27.3f, 102.5f)
                arcTo(16.1f, 16.1f, 0.0f, false, true, 231.9f, 169.8f)
                close()
            }
        }
        .build()
        return _gitlabLogoSimple!!
    }

private var _gitlabLogoSimple: ImageVector? = null
