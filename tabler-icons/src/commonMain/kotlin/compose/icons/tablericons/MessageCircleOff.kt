package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.MessageCircleOff: ImageVector
    get() {
        if (_messageCircleOff != null) {
            return _messageCircleOff!!
        }
        _messageCircleOff = Builder(name = "MessageCircleOff", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.595f, 4.577f)
                curveToRelative(3.223f, -1.176f, 7.025f, -0.61f, 9.65f, 1.63f)
                curveToRelative(2.982f, 2.543f, 3.601f, 6.523f, 1.636f, 9.66f)
                moveToRelative(-1.908f, 2.109f)
                curveToRelative(-2.787f, 2.19f, -6.89f, 2.666f, -10.273f, 1.024f)
                lineToRelative(-4.7f, 1.0f)
                lineToRelative(1.3f, -3.9f)
                curveToRelative(-2.229f, -3.296f, -1.494f, -7.511f, 1.68f, -10.057f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _messageCircleOff!!
    }

private var _messageCircleOff: ImageVector? = null
