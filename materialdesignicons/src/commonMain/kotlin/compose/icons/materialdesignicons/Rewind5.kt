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

public val MaterialDesignIcons.Rewind5: ImageVector
    get() {
        if (_rewind5 != null) {
            return _rewind5!!
        }
        _rewind5 = Builder(name = "Rewind5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 3.0f)
                curveTo(17.15f, 3.0f, 21.08f, 6.03f, 22.47f, 10.22f)
                lineTo(20.1f, 11.0f)
                curveTo(19.05f, 7.81f, 16.04f, 5.5f, 12.5f, 5.5f)
                curveTo(10.54f, 5.5f, 8.77f, 6.22f, 7.38f, 7.38f)
                lineTo(10.0f, 10.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                lineTo(5.6f, 5.6f)
                curveTo(7.45f, 4.0f, 9.85f, 3.0f, 12.5f, 3.0f)
                moveTo(9.0f, 12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                curveTo(14.11f, 16.0f, 15.0f, 16.9f, 15.0f, 18.0f)
                verticalLineTo(20.0f)
                curveTo(15.0f, 21.11f, 14.11f, 22.0f, 13.0f, 22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _rewind5!!
    }

private var _rewind5: ImageVector? = null
