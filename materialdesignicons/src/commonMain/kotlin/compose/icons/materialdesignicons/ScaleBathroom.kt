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

public val MaterialDesignIcons.ScaleBathroom: ImageVector
    get() {
        if (_scaleBathroom != null) {
            return _scaleBathroom!!
        }
        _scaleBathroom = Builder(name = "ScaleBathroom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 2.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 4.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 22.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 2.0f)
                moveTo(12.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineTo(11.26f)
                lineTo(10.85f, 5.23f)
                lineTo(12.9f, 8.0f)
                horizontalLineTo(16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 4.0f)
                moveTo(5.0f, 10.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _scaleBathroom!!
    }

private var _scaleBathroom: ImageVector? = null
