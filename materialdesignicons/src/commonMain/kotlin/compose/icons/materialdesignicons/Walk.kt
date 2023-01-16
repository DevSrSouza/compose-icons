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

public val MaterialDesignIcons.Walk: ImageVector
    get() {
        if (_walk != null) {
            return _walk!!
        }
        _walk = Builder(name = "Walk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.12f, 10.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.2f)
                horizontalLineTo(15.38f)
                lineTo(13.38f, 4.87f)
                curveTo(13.08f, 4.37f, 12.54f, 4.03f, 11.92f, 4.03f)
                curveTo(11.74f, 4.03f, 11.58f, 4.06f, 11.42f, 4.11f)
                lineTo(6.0f, 5.8f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.8f)
                verticalLineTo(7.33f)
                lineTo(9.91f, 6.67f)
                lineTo(6.0f, 22.0f)
                horizontalLineTo(7.8f)
                lineTo(10.67f, 13.89f)
                lineTo(13.0f, 17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(14.8f)
                verticalLineTo(15.59f)
                lineTo(12.31f, 11.05f)
                lineTo(13.04f, 8.18f)
                moveTo(14.0f, 3.8f)
                curveTo(15.0f, 3.8f, 15.8f, 3.0f, 15.8f, 2.0f)
                curveTo(15.8f, 1.0f, 15.0f, 0.2f, 14.0f, 0.2f)
                curveTo(13.0f, 0.2f, 12.2f, 1.0f, 12.2f, 2.0f)
                curveTo(12.2f, 3.0f, 13.0f, 3.8f, 14.0f, 3.8f)
                close()
            }
        }
        .build()
        return _walk!!
    }

private var _walk: ImageVector? = null
