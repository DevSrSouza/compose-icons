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

public val ThinGroup.CodepenLogo: ImageVector
    get() {
        if (_codepenLogo != null) {
            return _codepenLogo!!
        }
        _codepenLogo = Builder(name = "CodepenLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.0f, 97.5f)
                lineTo(133.9f, 40.8f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -11.8f, 0.0f)
                lineTo(22.0f, 97.5f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -2.0f, 3.5f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 2.0f, 3.5f)
                lineToRelative(100.1f, 56.7f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 11.8f, 0.0f)
                lineTo(234.0f, 168.5f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 2.0f, -3.5f)
                lineTo(236.0f, 101.0f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 234.0f, 97.5f)
                close()
                moveTo(228.0f, 158.1f)
                lineTo(183.7f, 133.0f)
                lineTo(228.0f, 107.9f)
                close()
                moveTo(223.9f, 101.0f)
                lineToRelative(-48.3f, 27.4f)
                lineTo(132.0f, 103.7f)
                lineTo(132.0f, 48.9f)
                close()
                moveTo(128.0f, 155.4f)
                lineTo(88.5f, 133.0f)
                lineTo(128.0f, 110.6f)
                lineTo(167.5f, 133.0f)
                close()
                moveTo(124.0f, 48.9f)
                verticalLineToRelative(54.8f)
                lineTo(80.4f, 128.4f)
                lineTo(32.1f, 101.0f)
                close()
                moveTo(28.0f, 107.9f)
                lineTo(72.3f, 133.0f)
                lineTo(28.0f, 158.1f)
                close()
                moveTo(32.1f, 165.0f)
                lineToRelative(48.3f, -27.4f)
                lineTo(124.0f, 162.3f)
                verticalLineToRelative(54.8f)
                close()
                moveTo(132.0f, 217.1f)
                lineTo(132.0f, 162.3f)
                lineToRelative(43.6f, -24.7f)
                lineTo(223.9f, 165.0f)
                close()
            }
        }
        .build()
        return _codepenLogo!!
    }

private var _codepenLogo: ImageVector? = null
