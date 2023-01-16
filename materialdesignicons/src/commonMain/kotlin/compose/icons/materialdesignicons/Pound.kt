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

public val MaterialDesignIcons.Pound: ImageVector
    get() {
        if (_pound != null) {
            return _pound!!
        }
        _pound = Builder(name = "Pound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.41f, 21.0f)
                lineTo(6.12f, 17.0f)
                horizontalLineTo(2.12f)
                lineTo(2.47f, 15.0f)
                horizontalLineTo(6.47f)
                lineTo(7.53f, 9.0f)
                horizontalLineTo(3.53f)
                lineTo(3.88f, 7.0f)
                horizontalLineTo(7.88f)
                lineTo(8.59f, 3.0f)
                horizontalLineTo(10.59f)
                lineTo(9.88f, 7.0f)
                horizontalLineTo(15.88f)
                lineTo(16.59f, 3.0f)
                horizontalLineTo(18.59f)
                lineTo(17.88f, 7.0f)
                horizontalLineTo(21.88f)
                lineTo(21.53f, 9.0f)
                horizontalLineTo(17.53f)
                lineTo(16.47f, 15.0f)
                horizontalLineTo(20.47f)
                lineTo(20.12f, 17.0f)
                horizontalLineTo(16.12f)
                lineTo(15.41f, 21.0f)
                horizontalLineTo(13.41f)
                lineTo(14.12f, 17.0f)
                horizontalLineTo(8.12f)
                lineTo(7.41f, 21.0f)
                horizontalLineTo(5.41f)
                moveTo(9.53f, 9.0f)
                lineTo(8.47f, 15.0f)
                horizontalLineTo(14.47f)
                lineTo(15.53f, 9.0f)
                horizontalLineTo(9.53f)
                close()
            }
        }
        .build()
        return _pound!!
    }

private var _pound: ImageVector? = null
