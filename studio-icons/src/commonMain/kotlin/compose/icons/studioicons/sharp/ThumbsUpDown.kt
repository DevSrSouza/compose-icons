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

public val SharpGroup.ThumbsUpDown: ImageVector
    get() {
        if (_thumbsUpDown != null) {
            return _thumbsUpDown!!
        }
        _thumbsUpDown = Builder(name = "ThumbsUpDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                lineTo(5.82f, 5.0f)
                lineToRelative(0.78f, -3.78f)
                lineTo(5.38f, 0.0f)
                lineTo(0.0f, 5.38f)
                lineTo(0.0f, 14.0f)
                horizontalLineToRelative(9.24f)
                lineTo(12.0f, 7.54f)
                close()
                moveTo(14.76f, 10.0f)
                lineTo(12.0f, 16.46f)
                lineTo(12.0f, 19.0f)
                horizontalLineToRelative(6.18f)
                lineToRelative(-0.78f, 3.78f)
                lineTo(18.62f, 24.0f)
                lineTo(24.0f, 18.62f)
                lineTo(24.0f, 10.0f)
                close()
            }
        }
        .build()
        return _thumbsUpDown!!
    }

private var _thumbsUpDown: ImageVector? = null
