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

public val MaterialDesignIcons.Flashlight: ImageVector
    get() {
        if (_flashlight != null) {
            return _flashlight!!
        }
        _flashlight = Builder(name = "Flashlight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 10.0f)
                lineTo(6.0f, 5.0f)
                horizontalLineTo(18.0f)
                lineTo(15.0f, 10.0f)
                horizontalLineTo(9.0f)
                moveTo(18.0f, 4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(4.0f)
                moveTo(9.0f, 22.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                moveTo(12.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _flashlight!!
    }

private var _flashlight: ImageVector? = null
