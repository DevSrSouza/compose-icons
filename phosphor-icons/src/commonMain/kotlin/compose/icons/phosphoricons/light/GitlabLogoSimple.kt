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

public val LightGroup.GitlabLogoSimple: ImageVector
    get() {
        if (_gitlabLogoSimple != null) {
            return _gitlabLogoSimple!!
        }
        _gitlabLogoSimple = Builder(name = "GitlabLogoSimple", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.3f, 153.0f)
                lineTo(209.0f, 50.5f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -19.0f, -0.9f)
                lineTo(168.8f, 106.0f)
                horizontalLineTo(87.2f)
                lineTo(66.0f, 49.6f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -19.0f, 0.9f)
                lineTo(19.7f, 153.0f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 5.5f, 15.1f)
                lineTo(120.0f, 233.8f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 16.0f, 0.0f)
                lineToRelative(94.8f, -65.7f)
                arcTo(13.9f, 13.9f, 0.0f, false, false, 236.3f, 153.0f)
                close()
                moveTo(224.0f, 158.3f)
                lineToRelative(-94.9f, 65.6f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -2.2f, 0.0f)
                lineTo(32.0f, 158.3f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -0.8f, -2.2f)
                lineTo(57.0f, 59.7f)
                lineToRelative(20.4f, 54.4f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 83.0f, 118.0f)
                horizontalLineToRelative(90.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 5.6f, -3.9f)
                lineTo(199.0f, 59.7f)
                lineToRelative(25.8f, 96.4f)
                arcTo(2.1f, 2.1f, 0.0f, false, true, 224.0f, 158.3f)
                close()
            }
        }
        .build()
        return _gitlabLogoSimple!!
    }

private var _gitlabLogoSimple: ImageVector? = null
