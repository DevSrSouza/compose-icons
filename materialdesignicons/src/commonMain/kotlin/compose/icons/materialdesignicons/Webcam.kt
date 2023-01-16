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

public val MaterialDesignIcons.Webcam: ImageVector
    get() {
        if (_webcam != null) {
            return _webcam!!
        }
        _webcam = Builder(name = "Webcam", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 19.0f, 9.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 16.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 5.0f, 9.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(12.0f, 4.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 7.0f, 9.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 14.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 17.0f, 9.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 4.0f)
                moveTo(12.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 6.0f)
                moveTo(6.0f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 20.0f)
                curveTo(4.0f, 19.62f, 4.1f, 19.27f, 4.29f, 18.97f)
                lineTo(6.11f, 15.81f)
                curveTo(7.69f, 17.17f, 9.75f, 18.0f, 12.0f, 18.0f)
                curveTo(14.25f, 18.0f, 16.31f, 17.17f, 17.89f, 15.81f)
                lineTo(19.71f, 18.97f)
                curveTo(19.9f, 19.27f, 20.0f, 19.62f, 20.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _webcam!!
    }

private var _webcam: ImageVector? = null
