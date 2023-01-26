package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.DoneOutline: ImageVector
    get() {
        if (_doneOutline != null) {
            return _doneOutline!!
        }
        _doneOutline = Builder(name = "DoneOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.77f, 5.03f)
                lineToRelative(1.4f, 1.4f)
                lineTo(8.43f, 19.17f)
                lineToRelative(-5.6f, -5.6f)
                lineToRelative(1.4f, -1.4f)
                lineToRelative(4.2f, 4.2f)
                lineTo(19.77f, 5.03f)
                moveToRelative(0.0f, -2.83f)
                lineTo(8.43f, 13.54f)
                lineToRelative(-4.2f, -4.2f)
                lineTo(0.0f, 13.57f)
                lineTo(8.43f, 22.0f)
                lineTo(24.0f, 6.43f)
                lineTo(19.77f, 2.2f)
                close()
            }
        }
        .build()
        return _doneOutline!!
    }

private var _doneOutline: ImageVector? = null
