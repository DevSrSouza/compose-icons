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

public val MaterialDesignIcons.StarBoxMultiple: ImageVector
    get() {
        if (_starBoxMultiple != null) {
            return _starBoxMultiple!!
        }
        _starBoxMultiple = Builder(name = "StarBoxMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4f, 22.0f, 2.0f, 21.6f, 2.0f, 21.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                moveTo(8.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 2.0f, 22.0f, 2.9f, 22.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(22.0f, 17.11f, 21.11f, 18.0f, 20.0f, 18.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 18.0f, 6.0f, 17.11f, 6.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(6.0f, 2.9f, 6.9f, 2.0f, 8.0f, 2.0f)
                moveTo(16.3f, 13.3f)
                lineTo(15.9f, 10.7f)
                lineTo(17.8f, 8.8f)
                lineTo(15.2f, 8.4f)
                lineTo(14.0f, 6.0f)
                lineTo(12.8f, 8.4f)
                lineTo(10.2f, 8.8f)
                lineTo(12.1f, 10.6f)
                lineTo(11.6f, 13.2f)
                lineTo(14.0f, 12.0f)
                lineTo(16.3f, 13.3f)
                close()
            }
        }
        .build()
        return _starBoxMultiple!!
    }

private var _starBoxMultiple: ImageVector? = null
