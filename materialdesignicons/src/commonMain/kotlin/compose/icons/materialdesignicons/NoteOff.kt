package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.NoteOff: ImageVector
    get() {
        if (_noteOff != null) {
            return _noteOff!!
        }
        _noteOff = Builder(name = "NoteOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(19.1f, 21.0f)
                curveTo(19.07f, 21.0f, 19.03f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 21.0f, 3.0f, 20.11f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 4.97f, 3.0f, 4.93f, 3.0f, 4.9f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(20.7f, 20.04f)
                lineTo(20.7f, 20.05f)
                lineTo(22.11f, 21.46f)
                moveTo(21.0f, 17.8f)
                lineTo(6.2f, 3.0f)
                horizontalLineTo(15.0f)
                lineTo(21.0f, 9.0f)
                verticalLineTo(17.8f)
                moveTo(19.5f, 10.0f)
                lineTo(14.0f, 4.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.5f)
                close()
            }
        }
        .build()
        return _noteOff!!
    }

private var _noteOff: ImageVector? = null
