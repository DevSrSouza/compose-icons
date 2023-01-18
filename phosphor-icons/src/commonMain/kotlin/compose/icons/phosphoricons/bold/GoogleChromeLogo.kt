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

public val BoldGroup.GoogleChromeLogo: ImageVector
    get() {
        if (_googleChromeLogo != null) {
            return _googleChromeLogo!!
        }
        _googleChromeLogo = Builder(name = "GoogleChromeLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 44.0f)
                arcToRelative(84.1f, 84.1f, 0.0f, false, true, 68.9f, 36.0f)
                lineTo(128.0f, 80.0f)
                arcToRelative(48.3f, 48.3f, 0.0f, false, false, -41.6f, 24.0f)
                lineTo(67.0f, 70.3f)
                arcTo(83.7f, 83.7f, 0.0f, false, true, 128.0f, 44.0f)
                close()
                moveTo(152.0f, 128.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 152.0f, 128.0f)
                close()
                moveTo(44.0f, 128.0f)
                arcToRelative(83.7f, 83.7f, 0.0f, false, true, 8.0f, -35.7f)
                lineTo(86.4f, 152.0f)
                curveToRelative(0.1f, 0.1f, 0.2f, 0.2f, 0.2f, 0.3f)
                arcTo(48.1f, 48.1f, 0.0f, false, false, 128.0f, 176.0f)
                lineToRelative(-19.5f, 33.7f)
                arcTo(84.2f, 84.2f, 0.0f, false, true, 44.0f, 128.0f)
                close()
                moveTo(135.1f, 211.7f)
                lineTo(169.6f, 152.0f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.2f, -0.4f)
                arcToRelative(47.8f, 47.8f, 0.0f, false, false, -0.3f, -47.6f)
                horizontalLineToRelative(39.0f)
                arcToRelative(82.9f, 82.9f, 0.0f, false, true, 3.5f, 24.0f)
                arcTo(84.1f, 84.1f, 0.0f, false, true, 135.1f, 211.7f)
                close()
            }
        }
        .build()
        return _googleChromeLogo!!
    }

private var _googleChromeLogo: ImageVector? = null
