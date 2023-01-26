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

public val BaselineGroup.RemoveDone: ImageVector
    get() {
        if (_removeDone != null) {
            return _removeDone!!
        }
        _removeDone = Builder(name = "RemoveDone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.79f, 12.0f)
                lineToRelative(5.58f, 5.59f)
                lineTo(5.96f, 19.0f)
                lineTo(0.37f, 13.41f)
                lineTo(1.79f, 12.0f)
                close()
                moveTo(2.24f, 4.22f)
                lineTo(12.9f, 14.89f)
                lineToRelative(-1.28f, 1.28f)
                lineTo(7.44f, 12.0f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(11.62f, 19.0f)
                lineToRelative(2.69f, -2.69f)
                lineToRelative(4.89f, 4.89f)
                lineToRelative(1.41f, -1.41f)
                lineTo(3.65f, 2.81f)
                lineTo(2.24f, 4.22f)
                close()
                moveTo(17.14f, 13.49f)
                lineTo(23.62f, 7.0f)
                lineTo(22.2f, 5.59f)
                lineToRelative(-6.48f, 6.48f)
                lineToRelative(1.42f, 1.42f)
                close()
                moveTo(17.96f, 7.0f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.65f, 3.66f)
                lineToRelative(1.41f, 1.41f)
                lineTo(17.96f, 7.0f)
                close()
            }
        }
        .build()
        return _removeDone!!
    }

private var _removeDone: ImageVector? = null
