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

public val LightGroup.Octagon: ImageVector
    get() {
        if (_octagon != null) {
            return _octagon!!
        }
        _octagon = Builder(name = "Octagon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.5f, 230.0f)
                horizontalLineToRelative(-73.0f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, true, -9.9f, -4.1f)
                lineTo(30.1f, 174.4f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, true, -4.1f, -9.9f)
                verticalLineToRelative(-73.0f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, true, 4.1f, -9.9f)
                lineTo(81.6f, 30.1f)
                arcTo(14.3f, 14.3f, 0.0f, false, true, 91.5f, 26.0f)
                horizontalLineToRelative(73.0f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, true, 9.9f, 4.1f)
                lineToRelative(51.5f, 51.5f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, true, 4.1f, 9.9f)
                verticalLineToRelative(73.0f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, true, -4.1f, 9.9f)
                lineToRelative(-51.5f, 51.5f)
                arcTo(14.3f, 14.3f, 0.0f, false, true, 164.5f, 230.0f)
                close()
                moveTo(91.5f, 38.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.4f, 0.6f)
                lineTo(38.6f, 90.1f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.6f, 1.4f)
                verticalLineToRelative(73.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.6f, 1.4f)
                lineToRelative(51.5f, 51.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.4f, 0.6f)
                horizontalLineToRelative(73.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.4f, -0.6f)
                lineToRelative(51.5f, -51.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.6f, -1.4f)
                verticalLineToRelative(-73.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.6f, -1.4f)
                lineTo(165.9f, 38.6f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.4f, -0.6f)
                close()
            }
        }
        .build()
        return _octagon!!
    }

private var _octagon: ImageVector? = null
