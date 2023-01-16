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

public val MaterialDesignIcons.Violin: ImageVector
    get() {
        if (_violin != null) {
            return _violin!!
        }
        _violin = Builder(name = "Violin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 3.0f)
                verticalLineTo(5.0f)
                lineTo(10.0f, 9.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 10.5f, 9.5f)
                horizontalLineTo(12.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 12.5f, 10.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 12.0f, 10.5f)
                horizontalLineTo(10.5f)
                curveTo(9.73f, 10.5f, 9.0f, 9.77f, 9.0f, 9.0f)
                verticalLineTo(5.16f)
                curveTo(7.27f, 5.6f, 6.0f, 7.13f, 6.0f, 9.0f)
                verticalLineTo(10.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 8.5f, 13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 6.0f, 15.5f)
                verticalLineTo(17.0f)
                curveTo(6.0f, 19.77f, 8.23f, 22.0f, 11.0f, 22.0f)
                horizontalLineTo(13.0f)
                curveTo(15.77f, 22.0f, 18.0f, 19.77f, 18.0f, 17.0f)
                verticalLineTo(15.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 15.5f, 13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.0f, 10.5f)
                verticalLineTo(9.0f)
                curveTo(18.0f, 6.78f, 16.22f, 5.0f, 14.0f, 5.0f)
                verticalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 2.0f)
                horizontalLineTo(11.0f)
                moveTo(10.75f, 16.5f)
                horizontalLineTo(13.25f)
                lineTo(12.75f, 20.0f)
                horizontalLineTo(11.25f)
                lineTo(10.75f, 16.5f)
                close()
            }
        }
        .build()
        return _violin!!
    }

private var _violin: ImageVector? = null
