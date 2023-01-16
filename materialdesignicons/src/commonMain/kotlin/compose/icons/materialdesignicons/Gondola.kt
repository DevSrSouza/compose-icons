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

public val MaterialDesignIcons.Gondola: ImageVector
    get() {
        if (_gondola != null) {
            return _gondola!!
        }
        _gondola = Builder(name = "Gondola", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.59f)
                lineTo(22.12f, 6.07f)
                lineTo(21.88f, 4.59f)
                lineTo(16.41f, 5.5f)
                curveTo(16.46f, 5.35f, 16.5f, 5.18f, 16.5f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.0f, 3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 5.0f)
                curveTo(13.5f, 5.35f, 13.63f, 5.68f, 13.84f, 5.93f)
                lineTo(13.0f, 6.07f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.41f)
                lineTo(10.41f, 6.5f)
                curveTo(10.46f, 6.35f, 10.5f, 6.18f, 10.5f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.0f, 4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 6.0f)
                curveTo(7.5f, 6.36f, 7.63f, 6.68f, 7.83f, 6.93f)
                lineTo(1.88f, 7.93f)
                lineTo(2.12f, 9.41f)
                lineTo(11.0f, 7.93f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 10.0f, 4.0f, 10.9f, 4.0f, 12.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 20.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 18.0f)
                verticalLineTo(12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 10.0f)
                moveTo(6.0f, 12.0f)
                horizontalLineTo(8.25f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                moveTo(9.75f, 16.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.25f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.75f)
                moveTo(18.0f, 16.0f)
                horizontalLineTo(15.75f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _gondola!!
    }

private var _gondola: ImageVector? = null
