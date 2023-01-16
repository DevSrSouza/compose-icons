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

public val MaterialDesignIcons.Flare: ImageVector
    get() {
        if (_flare != null) {
            return _flare!!
        }
        _flare = Builder(name = "Flare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 11.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                moveTo(9.17f, 7.76f)
                lineTo(7.05f, 5.64f)
                lineTo(5.64f, 7.05f)
                lineTo(7.76f, 9.17f)
                lineTo(9.17f, 7.76f)
                moveTo(13.0f, 1.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(1.0f)
                moveTo(18.36f, 7.05f)
                lineTo(16.95f, 5.64f)
                lineTo(14.83f, 7.76f)
                lineTo(16.24f, 9.17f)
                lineTo(18.36f, 7.05f)
                moveTo(17.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                moveTo(12.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.0f, 12.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.0f, 9.0f)
                moveTo(14.83f, 16.24f)
                lineTo(16.95f, 18.36f)
                lineTo(18.36f, 16.95f)
                lineTo(16.24f, 14.83f)
                lineTo(14.83f, 16.24f)
                moveTo(5.64f, 16.95f)
                lineTo(7.05f, 18.36f)
                lineTo(9.17f, 16.24f)
                lineTo(7.76f, 14.83f)
                lineTo(5.64f, 16.95f)
                moveTo(11.0f, 23.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(23.0f)
                close()
            }
        }
        .build()
        return _flare!!
    }

private var _flare: ImageVector? = null
