package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.CreativeCommons: ImageVector
    get() {
        if (_creativeCommons != null) {
            return _creativeCommons!!
        }
        _creativeCommons = Builder(name = "CreativeCommons", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.383f, 4.0f, 4.0f, 9.383f, 4.0f, 16.0f)
                curveTo(4.0f, 22.617f, 9.383f, 28.0f, 16.0f, 28.0f)
                curveTo(22.617f, 28.0f, 28.0f, 22.617f, 28.0f, 16.0f)
                curveTo(28.0f, 9.383f, 22.617f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(21.535f, 6.0f, 26.0f, 10.465f, 26.0f, 16.0f)
                curveTo(26.0f, 21.535f, 21.535f, 26.0f, 16.0f, 26.0f)
                curveTo(10.465f, 26.0f, 6.0f, 21.535f, 6.0f, 16.0f)
                curveTo(6.0f, 10.465f, 10.465f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(10.355f, 12.0f, 9.0f, 13.355f, 9.0f, 15.0f)
                lineTo(9.0f, 17.0f)
                curveTo(9.0f, 18.645f, 10.355f, 20.0f, 12.0f, 20.0f)
                curveTo(13.645f, 20.0f, 15.0f, 18.645f, 15.0f, 17.0f)
                lineTo(13.0f, 17.0f)
                curveTo(13.0f, 17.566f, 12.566f, 18.0f, 12.0f, 18.0f)
                curveTo(11.434f, 18.0f, 11.0f, 17.566f, 11.0f, 17.0f)
                lineTo(11.0f, 15.0f)
                curveTo(11.0f, 14.434f, 11.434f, 14.0f, 12.0f, 14.0f)
                curveTo(12.566f, 14.0f, 13.0f, 14.434f, 13.0f, 15.0f)
                lineTo(15.0f, 15.0f)
                curveTo(15.0f, 13.355f, 13.645f, 12.0f, 12.0f, 12.0f)
                close()
                moveTo(20.0f, 12.0f)
                curveTo(18.355f, 12.0f, 17.0f, 13.355f, 17.0f, 15.0f)
                lineTo(17.0f, 17.0f)
                curveTo(17.0f, 18.645f, 18.355f, 20.0f, 20.0f, 20.0f)
                curveTo(21.645f, 20.0f, 23.0f, 18.645f, 23.0f, 17.0f)
                lineTo(21.0f, 17.0f)
                curveTo(21.0f, 17.566f, 20.566f, 18.0f, 20.0f, 18.0f)
                curveTo(19.434f, 18.0f, 19.0f, 17.566f, 19.0f, 17.0f)
                lineTo(19.0f, 15.0f)
                curveTo(19.0f, 14.434f, 19.434f, 14.0f, 20.0f, 14.0f)
                curveTo(20.566f, 14.0f, 21.0f, 14.434f, 21.0f, 15.0f)
                lineTo(23.0f, 15.0f)
                curveTo(23.0f, 13.355f, 21.645f, 12.0f, 20.0f, 12.0f)
                close()
            }
        }
        .build()
        return _creativeCommons!!
    }

private var _creativeCommons: ImageVector? = null
