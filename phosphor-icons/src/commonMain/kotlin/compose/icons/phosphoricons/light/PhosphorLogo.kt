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

public val LightGroup.PhosphorLogo: ImageVector
    get() {
        if (_phosphorLogo != null) {
            return _phosphorLogo!!
        }
        _phosphorLogo = Builder(name = "PhosphorLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(142.0f, 26.0f)
                lineTo(68.0f, 26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(62.0f, 164.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, false, 72.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(140.0f, 170.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, 0.0f, -144.0f)
                close()
                moveTo(74.0f, 57.4f)
                lineTo(124.3f, 158.0f)
                lineTo(74.0f, 158.0f)
                close()
                moveTo(128.0f, 138.6f)
                lineTo(77.7f, 38.0f)
                lineTo(128.0f, 38.0f)
                close()
                moveTo(74.3f, 170.0f)
                lineTo(128.0f, 170.0f)
                verticalLineToRelative(53.7f)
                arcTo(60.1f, 60.1f, 0.0f, false, true, 74.3f, 170.0f)
                close()
                moveTo(142.0f, 158.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(140.0f, 38.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 0.0f, 120.0f)
                close()
            }
        }
        .build()
        return _phosphorLogo!!
    }

private var _phosphorLogo: ImageVector? = null
