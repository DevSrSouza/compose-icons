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

public val FillGroup.House: ImageVector
    get() {
        if (_house != null) {
            return _house!!
        }
        _house = Builder(name = "House", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 115.5f)
                verticalLineTo(208.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, -8.4f, 14.1f)
                arcTo(15.3f, 15.3f, 0.0f, false, true, 208.0f, 224.0f)
                horizontalLineTo(160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineTo(112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(48.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -12.0f, -5.4f)
                arcToRelative(16.9f, 16.9f, 0.0f, false, true, -4.0f, -11.0f)
                verticalLineTo(115.5f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 5.2f, -11.8f)
                lineToRelative(80.0f, -72.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 21.6f, 0.0f)
                lineToRelative(80.0f, 72.7f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 115.5f)
                close()
            }
        }
        .build()
        return _house!!
    }

private var _house: ImageVector? = null
