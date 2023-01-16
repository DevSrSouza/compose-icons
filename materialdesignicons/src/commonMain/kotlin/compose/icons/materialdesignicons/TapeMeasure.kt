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

public val MaterialDesignIcons.TapeMeasure: ImageVector
    get() {
        if (_tapeMeasure != null) {
            return _tapeMeasure!!
        }
        _tapeMeasure = Builder(name = "TapeMeasure", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 16.0f, 12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 9.0f, 5.0f)
                moveTo(9.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 5.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 9.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 13.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 9.0f, 8.0f)
                moveTo(17.0f, 17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.0f)
                lineTo(22.0f, 21.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _tapeMeasure!!
    }

private var _tapeMeasure: ImageVector? = null
