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

public val MaterialDesignIcons.Rivet: ImageVector
    get() {
        if (_rivet != null) {
            return _rivet!!
        }
        _rivet = Builder(name = "Rivet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.43f, 2.0f)
                curveTo(10.61f, 2.0f, 9.94f, 2.65f, 9.94f, 3.5f)
                curveTo(9.94f, 4.64f, 9.94f, 5.8f, 9.94f, 6.96f)
                horizontalLineTo(7.95f)
                verticalLineTo(7.95f)
                horizontalLineTo(15.91f)
                verticalLineTo(6.96f)
                horizontalLineTo(13.92f)
                curveTo(13.92f, 5.8f, 13.92f, 4.64f, 13.92f, 3.5f)
                curveTo(13.92f, 2.65f, 13.25f, 2.0f, 12.43f, 2.0f)
                horizontalLineTo(11.43f)
                moveTo(10.94f, 8.95f)
                verticalLineTo(21.87f)
                lineTo(11.93f, 22.87f)
                lineTo(12.92f, 21.87f)
                verticalLineTo(8.95f)
                horizontalLineTo(10.94f)
                close()
            }
        }
        .build()
        return _rivet!!
    }

private var _rivet: ImageVector? = null
