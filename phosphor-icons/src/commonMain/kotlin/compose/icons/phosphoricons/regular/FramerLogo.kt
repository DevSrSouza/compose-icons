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

public val RegularGroup.FramerLogo: ImageVector
    get() {
        if (_framerLogo != null) {
            return _framerLogo!!
        }
        _framerLogo = Builder(name = "FramerLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 100.0f)
                lineTo(208.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(56.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.5f, 13.8f)
                lineTo(107.9f, 92.0f)
                lineTo(56.0f, 92.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 2.5f, 5.8f)
                lineToRelative(72.0f, 68.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 128.0f, 244.0f)
                arcToRelative(7.4f, 7.4f, 0.0f, false, false, 3.2f, -0.7f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 136.0f, 236.0f)
                lineTo(136.0f, 176.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.5f, -13.8f)
                lineTo(148.1f, 108.0f)
                lineTo(200.0f, 108.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 100.0f)
                close()
                moveTo(179.9f, 160.0f)
                lineTo(128.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(49.4f)
                lineTo(64.0f, 164.6f)
                lineTo(64.0f, 108.0f)
                horizontalLineToRelative(60.8f)
                close()
                moveTo(192.0f, 92.0f)
                lineTo(131.2f, 92.0f)
                lineTo(76.1f, 40.0f)
                lineTo(192.0f, 40.0f)
                close()
            }
        }
        .build()
        return _framerLogo!!
    }

private var _framerLogo: ImageVector? = null
