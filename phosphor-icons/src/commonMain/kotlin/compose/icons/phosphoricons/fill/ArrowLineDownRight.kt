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

public val FillGroup.ArrowLineDownRight: ImageVector
    get() {
        if (_arrowLineDownRight != null) {
            return _arrowLineDownRight!!
        }
        _arrowLineDownRight = Builder(name = "ArrowLineDownRight", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 100.0f)
                lineTo(200.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(92.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.4f, -4.9f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, 1.7f, -8.8f)
                lineTo(130.7f, 150.0f)
                lineTo(74.3f, 93.7f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 85.7f, 82.3f)
                lineTo(142.0f, 138.7f)
                lineToRelative(44.3f, -44.4f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, true, 8.8f, -1.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 100.0f)
                close()
                moveTo(216.0f, 32.0f)
                lineTo(40.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(216.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _arrowLineDownRight!!
    }

private var _arrowLineDownRight: ImageVector? = null
