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

public val FillGroup.Cube: ImageVector
    get() {
        if (_cube != null) {
            return _cube!!
        }
        _cube = Builder(name = "Cube", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.9f, 70.8f)
                horizontalLineToRelative(0.0f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, -0.1f, -0.1f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, -6.0f, -5.9f)
                lineToRelative(-88.0f, -49.5f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.6f, 0.0f)
                lineToRelative(-88.0f, 49.5f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, -6.0f, 5.9f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, -0.1f, 0.1f)
                verticalLineToRelative(0.2f)
                arcTo(15.0f, 15.0f, 0.0f, false, false, 24.0f, 78.7f)
                verticalLineToRelative(98.6f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 8.2f, 14.0f)
                lineToRelative(88.0f, 49.5f)
                arcToRelative(16.5f, 16.5f, 0.0f, false, false, 7.2f, 2.0f)
                horizontalLineToRelative(1.4f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 7.0f, -2.0f)
                lineToRelative(88.0f, -49.5f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 8.2f, -14.0f)
                lineTo(232.0f, 78.7f)
                arcTo(15.6f, 15.6f, 0.0f, false, false, 229.9f, 70.8f)
                close()
                moveTo(128.9f, 118.8f)
                lineTo(48.4f, 74.0f)
                lineTo(128.0f, 29.2f)
                lineTo(207.7f, 74.0f)
                close()
                moveTo(216.0f, 177.3f)
                lineToRelative(-79.9f, 45.0f)
                lineToRelative(0.8f, -89.6f)
                lineToRelative(79.1f, -45.0f)
                close()
            }
        }
        .build()
        return _cube!!
    }

private var _cube: ImageVector? = null
