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

public val MaterialDesignIcons.Trademark: ImageVector
    get() {
        if (_trademark != null) {
            return _trademark!!
        }
        _trademark = Builder(name = "Trademark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.8f, 8.44f)
                horizontalLineTo(6.87f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.89f)
                verticalLineTo(8.44f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(9.8f)
                verticalLineTo(8.44f)
                moveTo(13.5f, 7.0f)
                lineTo(15.96f, 13.5f)
                lineTo(18.41f, 7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.5f)
                lineTo(19.22f, 9.24f)
                lineTo(16.63f, 16.0f)
                horizontalLineTo(15.28f)
                lineTo(12.7f, 9.25f)
                lineTo(12.9f, 13.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.93f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.5f)
                close()
            }
        }
        .build()
        return _trademark!!
    }

private var _trademark: ImageVector? = null
