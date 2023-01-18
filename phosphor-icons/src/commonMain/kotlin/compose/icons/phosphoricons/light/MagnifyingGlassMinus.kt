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

public val LightGroup.MagnifyingGlassMinus: ImageVector
    get() {
        if (_magnifyingGlassMinus != null) {
            return _magnifyingGlassMinus!!
        }
        _magnifyingGlassMinus = Builder(name = "MagnifyingGlassMinus", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(154.0f, 116.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(84.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 154.0f, 116.0f)
                close()
                moveTo(228.2f, 228.2f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -8.4f, 0.0f)
                lineToRelative(-44.6f, -44.5f)
                arcToRelative(90.2f, 90.2f, 0.0f, true, true, 8.5f, -8.5f)
                lineToRelative(44.5f, 44.6f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 228.2f, 228.2f)
                close()
                moveTo(116.0f, 194.0f)
                arcToRelative(78.0f, 78.0f, 0.0f, true, false, -78.0f, -78.0f)
                arcTo(78.1f, 78.1f, 0.0f, false, false, 116.0f, 194.0f)
                close()
            }
        }
        .build()
        return _magnifyingGlassMinus!!
    }

private var _magnifyingGlassMinus: ImageVector? = null
