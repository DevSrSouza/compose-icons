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

public val MaterialDesignIcons.DecimalComma: ImageVector
    get() {
        if (_decimalComma != null) {
            return _decimalComma!!
        }
        _decimalComma = Builder(name = "DecimalComma", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 13.0f, 10.0f)
                verticalLineTo(13.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 13.0f)
                verticalLineTo(10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 10.0f, 7.0f)
                moveTo(10.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 10.0f)
                verticalLineTo(13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 13.0f)
                verticalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 9.0f)
                moveTo(17.0f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 20.0f, 10.0f)
                verticalLineTo(13.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 14.0f, 13.0f)
                verticalLineTo(10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 17.0f, 7.0f)
                moveTo(17.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 10.0f)
                verticalLineTo(13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 13.0f)
                verticalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 9.0f)
                moveTo(5.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 15.0f)
                lineTo(5.0f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 14.0f)
                close()
            }
        }
        .build()
        return _decimalComma!!
    }

private var _decimalComma: ImageVector? = null
