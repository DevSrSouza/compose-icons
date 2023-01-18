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

public val FillGroup.DropHalf: ImageVector
    get() {
        if (_dropHalf != null) {
            return _dropHalf!!
        }
        _dropHalf = Builder(name = "DropHalf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 47.8f)
                arcTo(259.4f, 259.4f, 0.0f, false, false, 132.6f, 9.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -9.2f, 0.0f)
                arcTo(259.4f, 259.4f, 0.0f, false, false, 82.0f, 47.8f)
                curveTo(54.5f, 79.3f, 40.0f, 112.6f, 40.0f, 144.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                curveTo(216.0f, 112.6f, 201.5f, 79.3f, 174.0f, 47.8f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, true, -72.0f, -72.0f)
                curveToRelative(0.0f, -57.2f, 55.5f, -105.0f, 72.0f, -118.0f)
                close()
            }
        }
        .build()
        return _dropHalf!!
    }

private var _dropHalf: ImageVector? = null