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

public val MaterialDesignIcons.OilLamp: ImageVector
    get() {
        if (_oilLamp != null) {
            return _oilLamp!!
        }
        _oilLamp = Builder(name = "OilLamp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                moveTo(11.0f, 5.0f)
                horizontalLineTo(10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 7.0f)
                horizontalLineTo(13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 5.0f)
                moveTo(16.0f, 8.0f)
                horizontalLineTo(22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 10.0f)
                horizontalLineTo(19.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 15.0f, 14.0f)
                verticalLineTo(15.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 11.0f, 19.0f)
                horizontalLineTo(10.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 6.0f, 15.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 13.0f)
                verticalLineTo(10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 8.0f)
                moveTo(6.0f, 10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                moveTo(19.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 7.0f)
                horizontalLineTo(22.0f)
                arcTo(2.9f, 2.9f, 0.0f, false, false, 19.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.0f, 2.0f)
                horizontalLineTo(16.0f)
                arcTo(2.9f, 2.9f, 0.0f, false, false, 19.0f, 5.0f)
            }
        }
        .build()
        return _oilLamp!!
    }

private var _oilLamp: ImageVector? = null
