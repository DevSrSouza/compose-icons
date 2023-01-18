package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Hexagon: ImageVector
    get() {
        if (_hexagon != null) {
            return _hexagon!!
        }
        _hexagon = Builder(name = "Hexagon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 242.8f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -9.8f, -2.6f)
                lineToRelative(-84.0f, -47.5f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 24.0f, 175.3f)
                verticalLineTo(80.7f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 34.2f, 63.3f)
                lineToRelative(84.0f, -47.5f)
                arcToRelative(19.6f, 19.6f, 0.0f, false, true, 19.6f, 0.0f)
                lineToRelative(84.0f, 47.5f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 232.0f, 80.7f)
                verticalLineToRelative(94.6f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -10.2f, 17.4f)
                lineToRelative(-84.0f, 47.5f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 242.8f)
                close()
                moveTo(48.0f, 173.0f)
                lineToRelative(80.0f, 45.2f)
                lineTo(208.0f, 173.0f)
                verticalLineTo(83.0f)
                lineTo(128.0f, 37.8f)
                lineTo(48.0f, 83.0f)
                close()
            }
        }
        .build()
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null
