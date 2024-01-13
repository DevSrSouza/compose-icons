package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Task: ImageVector
    get() {
        if (_task != null) {
            return _task!!
        }
        _task = Builder(name = "Task", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.857f, 18.013f)
                lineTo(11.736f, 24.0f)
                lineTo(11.736f, 12.456f)
                lineTo(1.857f, 6.468f)
                close()
                moveTo(22.143f, 18.013f)
                lineTo(22.143f, 6.468f)
                lineToRelative(-9.879f, 5.988f)
                lineTo(12.264f, 24.0f)
                close()
                moveTo(21.897f, 5.999f)
                lineTo(12.0f, 0.0f)
                lineTo(2.103f, 5.999f)
                lineTo(12.0f, 11.998f)
                close()
            }
        }
        .build()
        return _task!!
    }

private var _task: ImageVector? = null
