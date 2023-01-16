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

public val MaterialDesignIcons.CellphoneNfcOff: ImageVector
    get() {
        if (_cellphoneNfcOff != null) {
            return _cellphoneNfcOff!!
        }
        _cellphoneNfcOff = Builder(name = "CellphoneNfcOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.84f, 22.73f)
                lineTo(18.85f, 20.74f)
                curveTo(18.56f, 21.5f, 17.84f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(14.92f)
                curveTo(14.81f, 20.59f, 14.5f, 19.25f, 13.97f, 18.0f)
                horizontalLineTo(16.11f)
                lineTo(7.0f, 8.89f)
                verticalLineTo(11.0f)
                curveTo(6.36f, 10.74f, 5.69f, 10.53f, 5.0f, 10.37f)
                verticalLineTo(6.89f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(17.0f, 5.0f)
                verticalLineTo(13.8f)
                lineTo(19.0f, 15.8f)
                verticalLineTo(3.0f)
                curveTo(19.0f, 1.9f, 18.11f, 1.0f, 17.0f, 1.0f)
                horizontalLineTo(7.0f)
                curveTo(6.24f, 1.0f, 5.59f, 1.43f, 5.25f, 2.05f)
                lineTo(8.2f, 5.0f)
                horizontalLineTo(17.0f)
                moveTo(2.0f, 20.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(5.0f)
                curveTo(5.0f, 21.34f, 3.66f, 20.0f, 2.0f, 20.0f)
                moveTo(2.0f, 16.0f)
                verticalLineTo(18.0f)
                curveTo(4.76f, 18.0f, 7.0f, 20.24f, 7.0f, 23.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 19.13f, 5.87f, 16.0f, 2.0f, 16.0f)
                moveTo(2.0f, 12.0f)
                verticalLineTo(14.0f)
                curveTo(6.97f, 14.0f, 11.0f, 18.03f, 11.0f, 23.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 16.92f, 8.08f, 12.0f, 2.0f, 12.0f)
                close()
            }
        }
        .build()
        return _cellphoneNfcOff!!
    }

private var _cellphoneNfcOff: ImageVector? = null
