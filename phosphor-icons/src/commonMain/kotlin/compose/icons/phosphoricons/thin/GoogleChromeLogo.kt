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

public val ThinGroup.GoogleChromeLogo: ImageVector
    get() {
        if (_googleChromeLogo != null) {
            return _googleChromeLogo!!
        }
        _googleChromeLogo = Builder(name = "GoogleChromeLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.2f, 100.2f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 36.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, true, 82.8f, 52.0f)
                lineTo(128.0f, 88.0f)
                arcToRelative(40.1f, 40.1f, 0.0f, false, false, -39.7f, 35.2f)
                lineTo(57.2f, 69.3f)
                arcTo(91.9f, 91.9f, 0.0f, false, true, 128.0f, 36.0f)
                close()
                moveTo(160.0f, 128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -32.0f, -32.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 160.0f, 128.0f)
                close()
                moveTo(36.0f, 128.0f)
                arcTo(91.0f, 91.0f, 0.0f, false, true, 52.0f, 76.3f)
                lineTo(93.4f, 148.0f)
                verticalLineToRelative(0.2f)
                arcTo(40.1f, 40.1f, 0.0f, false, false, 128.0f, 168.0f)
                arcToRelative(40.8f, 40.8f, 0.0f, false, false, 15.7f, -3.2f)
                lineToRelative(-31.1f, 53.9f)
                arcTo(92.2f, 92.2f, 0.0f, false, true, 36.0f, 128.0f)
                close()
                moveTo(128.0f, 220.0f)
                curveToRelative(-2.3f, 0.0f, -4.5f, -0.1f, -6.8f, -0.3f)
                lineTo(162.6f, 148.0f)
                verticalLineToRelative(-0.2f)
                arcTo(39.1f, 39.1f, 0.0f, false, false, 168.0f, 128.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -16.0f, -32.0f)
                horizontalLineToRelative(62.3f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return _googleChromeLogo!!
    }

private var _googleChromeLogo: ImageVector? = null
