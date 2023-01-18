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

public val FillGroup.Armchair: ImageVector
    get() {
        if (_armchair != null) {
            return _armchair!!
        }
        _armchair = Builder(name = "Armchair", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 159.0f)
                verticalLineToRelative(41.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(159.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 40.0f, -31.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(136.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 40.0f, 31.0f)
                close()
                moveTo(95.3f, 120.0f)
                horizontalLineToRelative(65.4f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 208.0f, 80.0f)
                horizontalLineToRelative(3.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 4.3f, -3.9f)
                verticalLineTo(72.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, -40.0f)
                horizontalLineTo(80.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 40.0f, 72.0f)
                verticalLineToRelative(4.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 4.3f, 3.9f)
                horizontalLineTo(48.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 95.3f, 120.0f)
                close()
            }
        }
        .build()
        return _armchair!!
    }

private var _armchair: ImageVector? = null
