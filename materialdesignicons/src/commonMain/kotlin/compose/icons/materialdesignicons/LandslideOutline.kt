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

public val MaterialDesignIcons.LandslideOutline: ImageVector
    get() {
        if (_landslideOutline != null) {
            return _landslideOutline!!
        }
        _landslideOutline = Builder(name = "LandslideOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 12.0f)
                lineTo(8.0f, 8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                lineTo(16.0f, 14.0f)
                lineTo(11.0f, 12.0f)
                moveTo(12.53f, 14.77f)
                lineTo(6.0f, 16.95f)
                lineTo(4.0f, 16.28f)
                verticalLineTo(14.39f)
                lineTo(6.0f, 15.06f)
                lineTo(9.95f, 13.74f)
                lineTo(12.53f, 14.77f)
                moveTo(7.0f, 10.0f)
                lineTo(8.57f, 12.09f)
                lineTo(6.0f, 12.95f)
                lineTo(4.0f, 12.28f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.0f)
                moveTo(4.0f, 20.0f)
                verticalLineTo(18.39f)
                lineTo(6.0f, 19.06f)
                lineTo(15.03f, 16.05f)
                lineTo(18.0f, 20.0f)
                horizontalLineTo(4.0f)
                moveTo(17.0f, 6.0f)
                verticalLineTo(1.0f)
                lineTo(12.0f, 0.0f)
                lineTo(9.0f, 2.0f)
                verticalLineTo(6.0f)
                lineTo(12.0f, 8.0f)
                lineTo(17.0f, 6.0f)
                moveTo(11.0f, 3.07f)
                lineTo(12.42f, 2.12f)
                lineTo(15.0f, 2.64f)
                verticalLineTo(4.65f)
                lineTo(12.23f, 5.76f)
                lineTo(11.0f, 4.93f)
                verticalLineTo(3.07f)
                moveTo(18.5f, 7.0f)
                lineTo(16.0f, 9.0f)
                verticalLineTo(12.0f)
                lineTo(18.5f, 14.0f)
                lineTo(23.0f, 12.0f)
                verticalLineTo(8.0f)
                lineTo(18.5f, 7.0f)
                moveTo(21.0f, 10.7f)
                lineTo(18.8f, 11.68f)
                lineTo(18.0f, 11.04f)
                verticalLineTo(9.96f)
                lineTo(19.0f, 9.16f)
                lineTo(21.0f, 9.6f)
                verticalLineTo(10.7f)
                close()
            }
        }
        .build()
        return _landslideOutline!!
    }

private var _landslideOutline: ImageVector? = null
