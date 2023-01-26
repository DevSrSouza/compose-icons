package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.EditOff: ImageVector
    get() {
        if (_editOff != null) {
            return _editOff!!
        }
        _editOff = Builder(name = "EditOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.41f, 6.33f)
                lineToRelative(-3.75f, -3.75f)
                lineToRelative(-2.53f, 2.54f)
                lineToRelative(3.75f, 3.75f)
                lineTo(21.41f, 6.33f)
                close()
                moveTo(1.39f, 4.22f)
                lineToRelative(7.32f, 7.32f)
                lineTo(3.0f, 17.25f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(3.75f)
                lineToRelative(5.71f, -5.71f)
                lineToRelative(7.32f, 7.32f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                close()
                moveTo(17.81f, 9.94f)
                lineToRelative(-3.75f, -3.75f)
                lineToRelative(-2.52f, 2.52f)
                lineToRelative(3.75f, 3.75f)
                lineTo(17.81f, 9.94f)
                close()
            }
        }
        .build()
        return _editOff!!
    }

private var _editOff: ImageVector? = null
