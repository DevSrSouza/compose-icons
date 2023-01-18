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

public val ThinGroup.PhosphorLogo: ImageVector
    get() {
        if (_phosphorLogo != null) {
            return _phosphorLogo!!
        }
        _phosphorLogo = Builder(name = "PhosphorLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(142.0f, 28.0f)
                lineTo(68.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(64.0f, 164.0f)
                arcToRelative(70.1f, 70.1f, 0.0f, false, false, 70.0f, 70.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(138.0f, 168.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(70.0f, 70.0f, 0.0f, false, false, 0.0f, -140.0f)
                close()
                moveTo(72.0f, 48.9f)
                lineTo(127.5f, 160.0f)
                lineTo(72.0f, 160.0f)
                close()
                moveTo(130.0f, 147.1f)
                lineTo(74.5f, 36.0f)
                lineTo(130.0f, 36.0f)
                close()
                moveTo(72.1f, 168.0f)
                lineTo(130.0f, 168.0f)
                verticalLineToRelative(57.9f)
                arcTo(62.2f, 62.2f, 0.0f, false, true, 72.1f, 168.0f)
                close()
                moveTo(142.0f, 160.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(138.0f, 36.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, true, 0.0f, 124.0f)
                close()
            }
        }
        .build()
        return _phosphorLogo!!
    }

private var _phosphorLogo: ImageVector? = null
