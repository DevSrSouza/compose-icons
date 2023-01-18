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

public val FillGroup.Rewind: ImageVector
    get() {
        if (_rewind != null) {
            return _rewind!!
        }
        _rewind = Builder(name = "Rewind", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 70.7f)
                verticalLineTo(185.3f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, -8.3f, 14.1f)
                arcToRelative(16.5f, 16.5f, 0.0f, false, true, -16.4f, -0.6f)
                lineTo(124.0f, 142.7f)
                verticalLineToRelative(42.6f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, -8.3f, 14.1f)
                arcToRelative(16.5f, 16.5f, 0.0f, false, true, -16.4f, -0.6f)
                lineTo(10.1f, 141.5f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 0.0f, -27.0f)
                lineTo(99.3f, 57.2f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 124.0f, 70.7f)
                verticalLineToRelative(42.6f)
                lineToRelative(87.3f, -56.1f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 236.0f, 70.7f)
                close()
            }
        }
        .build()
        return _rewind!!
    }

private var _rewind: ImageVector? = null
