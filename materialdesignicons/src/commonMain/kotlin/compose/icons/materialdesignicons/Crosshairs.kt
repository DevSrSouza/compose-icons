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

public val MaterialDesignIcons.Crosshairs: ImageVector
    get() {
        if (_crosshairs != null) {
            return _crosshairs!!
        }
        _crosshairs = Builder(name = "Crosshairs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.05f, 13.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.05f)
                curveTo(3.5f, 6.83f, 6.83f, 3.5f, 11.0f, 3.05f)
                verticalLineTo(1.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.05f)
                curveTo(17.17f, 3.5f, 20.5f, 6.83f, 20.95f, 11.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.95f)
                curveTo(20.5f, 17.17f, 17.17f, 20.5f, 13.0f, 20.95f)
                verticalLineTo(23.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.95f)
                curveTo(6.83f, 20.5f, 3.5f, 17.17f, 3.05f, 13.0f)
                moveTo(12.0f, 5.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 5.0f, 12.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 12.0f, 19.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 19.0f, 12.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 12.0f, 5.0f)
                close()
            }
        }
        .build()
        return _crosshairs!!
    }

private var _crosshairs: ImageVector? = null
