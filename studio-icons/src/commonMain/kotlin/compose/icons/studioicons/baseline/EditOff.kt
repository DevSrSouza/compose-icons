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

public val BaselineGroup.EditOff: ImageVector
    get() {
        if (_editOff != null) {
            return _editOff!!
        }
        _editOff = Builder(name = "EditOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.126f, 8.125f)
                lineToRelative(1.937f, -1.937f)
                lineToRelative(3.747f, 3.747f)
                lineToRelative(-1.937f, 1.938f)
                close()
                moveTo(20.71f, 5.63f)
                lineToRelative(-2.34f, -2.34f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.41f, 0.0f)
                lineToRelative(-1.83f, 1.83f)
                lineToRelative(3.75f, 3.75f)
                lineTo(20.71f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.37f)
                close()
                moveTo(2.0f, 5.0f)
                lineToRelative(6.63f, 6.63f)
                lineTo(3.0f, 17.25f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(3.75f)
                lineToRelative(5.63f, -5.62f)
                lineTo(18.0f, 21.0f)
                lineToRelative(2.0f, -2.0f)
                lineTo(4.0f, 3.0f)
                lineTo(2.0f, 5.0f)
                close()
            }
        }
        .build()
        return _editOff!!
    }

private var _editOff: ImageVector? = null
