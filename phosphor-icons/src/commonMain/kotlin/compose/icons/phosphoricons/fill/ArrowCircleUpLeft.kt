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

public val FillGroup.ArrowCircleUpLeft: ImageVector
    get() {
        if (_arrowCircleUpLeft != null) {
            return _arrowCircleUpLeft!!
        }
        _arrowCircleUpLeft = Builder(name = "ArrowCircleUpLeft", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(161.7f, 161.7f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                lineTo(108.0f, 119.3f)
                lineTo(108.0f, 148.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(92.0f, 100.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 0.6f, -3.1f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 4.3f, -4.3f)
                arcTo(8.5f, 8.5f, 0.0f, false, true, 100.0f, 92.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(119.3f, 108.0f)
                lineToRelative(42.4f, 42.3f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 161.7f, 161.7f)
                close()
            }
        }
        .build()
        return _arrowCircleUpLeft!!
    }

private var _arrowCircleUpLeft: ImageVector? = null
