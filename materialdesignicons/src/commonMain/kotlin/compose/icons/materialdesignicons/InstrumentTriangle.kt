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

public val MaterialDesignIcons.InstrumentTriangle: ImageVector
    get() {
        if (_instrumentTriangle != null) {
            return _instrumentTriangle!!
        }
        _instrumentTriangle = Builder(name = "InstrumentTriangle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 2.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(6.2f)
                curveTo(10.4f, 6.3f, 10.3f, 6.3f, 10.2f, 6.5f)
                lineTo(2.1f, 20.7f)
                curveTo(1.8f, 21.3f, 2.2f, 22.0f, 2.9f, 22.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.8f)
                lineTo(11.0f, 9.2f)
                lineTo(16.7f, 19.2f)
                lineTo(18.4f, 18.2f)
                lineTo(11.8f, 6.4f)
                lineTo(11.5f, 6.1f)
                verticalLineTo(2.0f)
                moveTo(21.0f, 6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                lineTo(19.5f, 22.0f)
                horizontalLineTo(21.5f)
                lineTo(21.0f, 18.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _instrumentTriangle!!
    }

private var _instrumentTriangle: ImageVector? = null
