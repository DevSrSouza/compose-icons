package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Octagon: ImageVector
    get() {
        if (_octagon != null) {
            return _octagon!!
        }
        _octagon = Builder(name = "Octagon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 91.5f)
                verticalLineToRelative(73.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, -4.7f, 11.3f)
                lineToRelative(-51.5f, 51.5f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, -11.3f, 4.7f)
                horizontalLineToRelative(-73.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, -11.3f, -4.7f)
                lineTo(28.7f, 175.8f)
                arcTo(16.1f, 16.1f, 0.0f, false, true, 24.0f, 164.5f)
                verticalLineToRelative(-73.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 4.7f, -11.3f)
                lineTo(80.2f, 28.7f)
                arcTo(16.1f, 16.1f, 0.0f, false, true, 91.5f, 24.0f)
                horizontalLineToRelative(73.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 11.3f, 4.7f)
                lineToRelative(51.5f, 51.5f)
                arcTo(16.1f, 16.1f, 0.0f, false, true, 232.0f, 91.5f)
                close()
            }
        }
        .build()
        return _octagon!!
    }

private var _octagon: ImageVector? = null
