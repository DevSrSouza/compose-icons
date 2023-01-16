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

public val MaterialDesignIcons.CarDoor: ImageVector
    get() {
        if (_carDoor != null) {
            return _carDoor!!
        }
        _carDoor = Builder(name = "CarDoor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                moveTo(22.0f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                lineTo(11.0f, 3.0f)
                horizontalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 22.0f, 4.0f)
                verticalLineTo(21.0f)
                moveTo(11.83f, 5.0f)
                lineTo(5.83f, 11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.83f)
                close()
            }
        }
        .build()
        return _carDoor!!
    }

private var _carDoor: ImageVector? = null
