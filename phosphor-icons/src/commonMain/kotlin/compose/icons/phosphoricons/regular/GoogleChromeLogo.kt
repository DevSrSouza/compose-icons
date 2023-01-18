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

public val RegularGroup.GoogleChromeLogo: ImageVector
    get() {
        if (_googleChromeLogo != null) {
            return _googleChromeLogo!!
        }
        _googleChromeLogo = Builder(name = "GoogleChromeLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 40.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, true, 76.2f, 44.0f)
                lineTo(128.0f, 84.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -41.2f, 28.6f)
                lineTo(62.1f, 69.8f)
                arcTo(87.6f, 87.6f, 0.0f, false, true, 128.0f, 40.0f)
                close()
                moveTo(156.0f, 128.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, -28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 156.0f, 128.0f)
                close()
                moveTo(40.0f, 128.0f)
                arcTo(87.7f, 87.7f, 0.0f, false, true, 51.8f, 84.0f)
                lineToRelative(38.1f, 66.0f)
                lineToRelative(0.2f, 0.3f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 45.2f, 21.1f)
                lineToRelative(-24.8f, 42.9f)
                arcTo(88.3f, 88.3f, 0.0f, false, true, 40.0f, 128.0f)
                close()
                moveTo(128.0f, 216.0f)
                lineTo(166.1f, 150.0f)
                curveToRelative(0.1f, -0.1f, 0.1f, -0.3f, 0.2f, -0.4f)
                arcToRelative(43.8f, 43.8f, 0.0f, false, false, -4.4f, -49.6f)
                horizontalLineToRelative(49.5f)
                arcToRelative(86.5f, 86.5f, 0.0f, false, true, 4.6f, 28.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
            }
        }
        .build()
        return _googleChromeLogo!!
    }

private var _googleChromeLogo: ImageVector? = null
