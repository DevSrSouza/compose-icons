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

public val MaterialDesignIcons.GuitarAcoustic: ImageVector
    get() {
        if (_guitarAcoustic != null) {
            return _guitarAcoustic!!
        }
        _guitarAcoustic = Builder(name = "GuitarAcoustic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.59f, 3.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(20.41f)
                lineTo(16.17f, 9.24f)
                curveTo(15.8f, 8.68f, 15.32f, 8.2f, 14.76f, 7.83f)
                lineTo(19.59f, 3.0f)
                moveTo(12.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 12.0f)
                curveTo(16.0f, 13.82f, 14.77f, 15.42f, 13.0f, 15.87f)
                verticalLineTo(16.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 8.0f, 21.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 3.0f, 16.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 8.0f, 11.0f)
                horizontalLineTo(8.13f)
                curveTo(8.58f, 9.24f, 10.17f, 8.0f, 12.0f, 8.0f)
                moveTo(12.0f, 10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 10.5f)
                moveTo(6.94f, 14.24f)
                lineTo(6.23f, 14.94f)
                lineTo(9.06f, 17.77f)
                lineTo(9.77f, 17.06f)
                lineTo(6.94f, 14.24f)
                close()
            }
        }
        .build()
        return _guitarAcoustic!!
    }

private var _guitarAcoustic: ImageVector? = null
