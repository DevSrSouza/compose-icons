package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Doctor: ImageVector
    get() {
        if (_doctor != null) {
            return _doctor!!
        }
        _doctor = Builder(name = "Doctor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 3.25f)
                curveTo(9.0335f, 3.25f, 8.25f, 4.0335f, 8.25f, 5.0f)
                verticalLineTo(8.25f)
                horizontalLineTo(5.0f)
                curveTo(4.0335f, 8.25f, 3.25f, 9.0335f, 3.25f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(3.25f, 14.9665f, 4.0335f, 15.75f, 5.0f, 15.75f)
                horizontalLineTo(8.25f)
                verticalLineTo(19.0f)
                curveTo(8.25f, 19.9665f, 9.0335f, 20.75f, 10.0f, 20.75f)
                horizontalLineTo(14.0f)
                curveTo(14.9665f, 20.75f, 15.75f, 19.9665f, 15.75f, 19.0f)
                verticalLineTo(15.75f)
                horizontalLineTo(19.0f)
                curveTo(19.9665f, 15.75f, 20.75f, 14.9665f, 20.75f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(20.75f, 9.0335f, 19.9665f, 8.25f, 19.0f, 8.25f)
                horizontalLineTo(15.75f)
                verticalLineTo(5.0f)
                curveTo(15.75f, 4.0335f, 14.9665f, 3.25f, 14.0f, 3.25f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _doctor!!
    }

private var _doctor: ImageVector? = null
