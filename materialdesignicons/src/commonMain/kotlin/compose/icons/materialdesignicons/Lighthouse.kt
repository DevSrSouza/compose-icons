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

public val MaterialDesignIcons.Lighthouse: ImageVector
    get() {
        if (_lighthouse != null) {
            return _lighthouse!!
        }
        _lighthouse = Builder(name = "Lighthouse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 10.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                lineTo(12.0f, 1.0f)
                lineTo(16.0f, 3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.74f)
                lineTo(8.44f, 13.64f)
                lineTo(9.0f, 10.0f)
                horizontalLineTo(8.0f)
                moveTo(13.0f, 8.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                moveTo(7.0f, 23.0f)
                lineTo(7.04f, 22.76f)
                lineTo(16.15f, 17.5f)
                lineTo(16.67f, 20.88f)
                lineTo(13.0f, 23.0f)
                horizontalLineTo(7.0f)
                moveTo(8.05f, 16.17f)
                lineTo(15.31f, 12.0f)
                lineTo(15.83f, 15.37f)
                lineTo(7.43f, 20.22f)
                lineTo(8.05f, 16.17f)
                close()
            }
        }
        .build()
        return _lighthouse!!
    }

private var _lighthouse: ImageVector? = null
