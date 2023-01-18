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

public val FillGroup.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) {
            return _wheelchair!!
        }
        _wheelchair = Builder(name = "Wheelchair", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.5f, 195.6f)
                lineToRelative(-24.0f, 8.0f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, true, -2.5f, 0.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.2f, -4.4f)
                lineTo(179.1f, 140.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(106.3f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 71.9f, 57.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 1.0f)
                arcTo(72.0f, 72.0f, 0.0f, true, true, 88.0f, 89.8f)
                verticalLineTo(62.6f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 16.0f, 0.0f)
                verticalLineTo(88.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineTo(104.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 7.2f, 4.4f)
                lineToRelative(28.9f, 57.8f)
                lineToRelative(17.4f, -5.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.0f, 15.2f)
                close()
            }
        }
        .build()
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
