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

public val LightGroup.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = Builder(name = "Cursor", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(146.9f, 138.4f)
                lineTo(205.7f, 117.0f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, 9.2f, -13.0f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, -9.1f, -13.2f)
                lineTo(50.6f, 32.6f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -18.0f, 18.0f)
                horizontalLineToRelative(0.0f)
                lineTo(90.8f, 205.8f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 13.1f, 9.1f)
                horizontalLineToRelative(0.1f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, 13.0f, -9.2f)
                lineToRelative(21.4f, -58.8f)
                lineToRelative(65.4f, 65.3f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 8.4f, -8.4f)
                close()
                moveTo(105.8f, 201.6f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.9f, 1.3f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -1.9f, -1.3f)
                lineTo(43.8f, 46.4f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, 0.5f, -2.1f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, 1.3f, -0.6f)
                horizontalLineToRelative(0.8f)
                lineTo(201.6f, 102.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 3.8f)
                lineToRelative(-64.1f, 23.3f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -8.4f, 8.4f)
                close()
            }
        }
        .build()
        return _cursor!!
    }

private var _cursor: ImageVector? = null
