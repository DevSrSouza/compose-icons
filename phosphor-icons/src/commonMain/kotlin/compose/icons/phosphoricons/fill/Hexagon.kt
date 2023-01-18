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

public val FillGroup.Hexagon: ImageVector
    get() {
        if (_hexagon != null) {
            return _hexagon!!
        }
        _hexagon = Builder(name = "Hexagon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 80.7f)
                verticalLineToRelative(94.6f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, -8.1f, 14.0f)
                lineToRelative(-84.0f, 47.4f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -15.8f, 0.0f)
                lineToRelative(-84.0f, -47.4f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, -8.1f, -14.0f)
                verticalLineTo(80.7f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, 8.1f, -14.0f)
                lineToRelative(84.0f, -47.4f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 15.8f, 0.0f)
                lineToRelative(84.0f, 47.4f)
                arcTo(16.2f, 16.2f, 0.0f, false, true, 228.0f, 80.7f)
                close()
            }
        }
        .build()
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
