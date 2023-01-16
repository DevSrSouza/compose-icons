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

public val MaterialDesignIcons.CellphoneWireless: ImageVector
    get() {
        if (_cellphoneWireless != null) {
            return _cellphoneWireless!!
        }
        _cellphoneWireless = Builder(name = "CellphoneWireless", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.07f, 4.93f)
                curveTo(21.88f, 6.74f, 23.0f, 9.24f, 23.0f, 12.0f)
                curveTo(23.0f, 14.76f, 21.88f, 17.26f, 20.07f, 19.07f)
                lineTo(18.66f, 17.66f)
                curveTo(20.11f, 16.22f, 21.0f, 14.22f, 21.0f, 12.0f)
                curveTo(21.0f, 9.79f, 20.11f, 7.78f, 18.66f, 6.34f)
                lineTo(20.07f, 4.93f)
                moveTo(17.24f, 7.76f)
                curveTo(18.33f, 8.85f, 19.0f, 10.35f, 19.0f, 12.0f)
                curveTo(19.0f, 13.65f, 18.33f, 15.15f, 17.24f, 16.24f)
                lineTo(15.83f, 14.83f)
                curveTo(16.55f, 14.11f, 17.0f, 13.11f, 17.0f, 12.0f)
                curveTo(17.0f, 10.89f, 16.55f, 9.89f, 15.83f, 9.17f)
                lineTo(17.24f, 7.76f)
                moveTo(13.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 15.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 10.0f)
                moveTo(11.5f, 1.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.0f, 3.5f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(20.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 11.5f, 23.0f)
                horizontalLineTo(3.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 1.0f, 20.5f)
                verticalLineTo(3.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 3.5f, 1.0f)
                horizontalLineTo(11.5f)
                close()
            }
        }
        .build()
        return _cellphoneWireless!!
    }

private var _cellphoneWireless: ImageVector? = null
