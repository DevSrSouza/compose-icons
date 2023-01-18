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

public val FillGroup.CaretCircleDoubleUp: ImageVector
    get() {
        if (_caretCircleDoubleUp != null) {
            return _caretCircleDoubleUp!!
        }
        _caretCircleDoubleUp = Builder(name = "CaretCircleDoubleUp", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.5f, 201.5f)
                arcToRelative(104.0f, 104.0f, 0.0f, true, false, -147.0f, 0.0f)
                arcTo(103.9f, 103.9f, 0.0f, false, false, 201.5f, 201.5f)
                close()
                moveTo(101.7f, 117.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -11.4f, 0.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 0.0f, -11.4f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 0.0f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -11.4f, 11.4f)
                lineTo(128.0f, 91.3f)
                close()
                moveTo(101.7f, 173.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -11.4f, 0.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 0.0f, -11.4f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 0.0f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -11.4f, 11.4f)
                lineTo(128.0f, 147.3f)
                close()
            }
        }
        .build()
        return _caretCircleDoubleUp!!
    }

private var _caretCircleDoubleUp: ImageVector? = null
