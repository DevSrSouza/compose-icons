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

public val MaterialDesignIcons.Responsive: ImageVector
    get() {
        if (_responsive != null) {
            return _responsive!!
        }
        _responsive = Builder(name = "Responsive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 10.0f)
                horizontalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 12.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                moveTo(0.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 16.0f)
                verticalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 4.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 6.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 18.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                curveTo(18.0f, 21.11f, 17.1f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 20.0f)
                horizontalLineTo(9.0f)
                lineTo(0.0f, 20.0f)
                moveTo(11.5f, 20.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 11.0f, 20.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 11.5f, 21.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 12.0f, 20.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 11.5f, 20.0f)
                moveTo(15.5f, 20.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 15.0f, 20.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 15.5f, 21.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 16.0f, 20.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 15.5f, 20.0f)
                moveTo(13.0f, 20.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                moveTo(11.0f, 12.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _responsive!!
    }

private var _responsive: ImageVector? = null
