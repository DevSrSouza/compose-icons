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

public val MaterialDesignIcons.Altimeter: ImageVector
    get() {
        if (_altimeter != null) {
            return _altimeter!!
        }
        _altimeter = Builder(name = "Altimeter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(7.0f)
                moveTo(9.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.0f)
                moveTo(2.0f, 7.96f)
                verticalLineTo(16.04f)
                lineTo(6.03f, 12.0f)
                lineTo(2.0f, 7.96f)
                moveTo(22.03f, 7.96f)
                lineTo(18.0f, 12.0f)
                lineTo(22.03f, 16.04f)
                verticalLineTo(7.96f)
                moveTo(7.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                moveTo(9.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                moveTo(7.0f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _altimeter!!
    }

private var _altimeter: ImageVector? = null
