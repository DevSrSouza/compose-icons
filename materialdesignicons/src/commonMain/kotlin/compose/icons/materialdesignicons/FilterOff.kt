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

public val MaterialDesignIcons.FilterOff: ImageVector
    get() {
        if (_filterOff != null) {
            return _filterOff!!
        }
        _filterOff = Builder(name = "FilterOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(9.5f, 11.37f)
                lineTo(9.97f, 12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.87f)
                curveTo(9.96f, 18.16f, 10.06f, 18.47f, 10.29f, 18.7f)
                lineTo(12.3f, 20.71f)
                curveTo(12.69f, 21.1f, 13.32f, 21.1f, 13.71f, 20.71f)
                curveTo(13.94f, 20.5f, 14.04f, 20.18f, 14.0f, 19.88f)
                verticalLineTo(15.89f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(14.0f, 13.35f)
                lineTo(9.41f, 8.76f)
                lineTo(4.15f, 3.5f)
                lineTo(2.39f, 1.73f)
                moveTo(6.21f, 3.0f)
                lineTo(14.54f, 11.34f)
                lineTo(19.79f, 4.62f)
                curveTo(20.13f, 4.19f, 20.05f, 3.56f, 19.62f, 3.22f)
                curveTo(19.43f, 3.08f, 19.22f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(6.21f)
                close()
            }
        }
        .build()
        return _filterOff!!
    }

private var _filterOff: ImageVector? = null
