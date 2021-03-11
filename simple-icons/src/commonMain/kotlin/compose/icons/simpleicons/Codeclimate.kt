package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Codeclimate: ImageVector
    get() {
        if (_codeclimate != null) {
            return _codeclimate!!
        }
        _codeclimate = Builder(name = "Codeclimate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.047f, 5.32f)
                lineTo(24.0f, 13.273f)
                lineToRelative(-2.707f, 2.711f)
                lineToRelative(-5.246f, -5.246f)
                lineToRelative(-1.844f, 1.852f)
                lineToRelative(-2.715f, -2.711f)
                close()
                moveTo(10.652f, 10.719f)
                lineToRelative(2.707f, 2.715f)
                lineToRelative(2.547f, 2.539f)
                lineToRelative(-2.715f, 2.707f)
                lineToRelative(-5.238f, -5.239f)
                lineToRelative(-4.176f, 4.176f)
                lineToRelative(-1.07f, 1.063f)
                lineTo(0.0f, 15.973f)
                lineTo(7.953f, 8.02f)
                close()
                moveTo(10.652f, 10.719f)
            }
        }
        .build()
        return _codeclimate!!
    }

private var _codeclimate: ImageVector? = null
