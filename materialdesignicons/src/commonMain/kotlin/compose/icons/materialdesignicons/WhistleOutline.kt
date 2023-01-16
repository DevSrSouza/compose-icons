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

public val MaterialDesignIcons.WhistleOutline: ImageVector
    get() {
        if (_whistleOutline != null) {
            return _whistleOutline!!
        }
        _whistleOutline = Builder(name = "WhistleOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.76f, 3.7f)
                lineTo(2.14f, 4.88f)
                lineTo(4.43f, 8.0f)
                arcTo(8.23f, 8.23f, 0.0f, false, true, 6.35f, 7.28f)
                moveTo(11.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.29f)
                lineTo(13.0f, 12.71f)
                verticalLineTo(15.5f)
                arcTo(4.5f, 4.5f, 0.0f, true, true, 8.5f, 11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.5f)
                arcTo(6.5f, 6.5f, 0.0f, true, false, 15.0f, 15.5f)
                verticalLineTo(13.91f)
                lineTo(22.0f, 12.0f)
                verticalLineTo(9.0f)
                moveTo(16.24f, 3.7f)
                lineTo(13.85f, 7.0f)
                horizontalLineTo(16.32f)
                lineTo(17.86f, 4.88f)
                moveTo(9.0f, 2.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _whistleOutline!!
    }

private var _whistleOutline: ImageVector? = null
