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

public val SharpGroup.LabelOff: ImageVector
    get() {
        if (_labelOff != null) {
            return _labelOff!!
        }
        _labelOff = Builder(name = "LabelOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                lineToRelative(-4.97f, -7.0f)
                horizontalLineTo(8.66f)
                lineToRelative(10.7f, 10.73f)
                close()
                moveTo(2.0f, 4.0f)
                lineToRelative(1.0f, 1.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(14.0f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(1.41f, -1.41f)
                lineTo(3.44f, 2.62f)
                close()
            }
        }
        .build()
        return _labelOff!!
    }

private var _labelOff: ImageVector? = null
