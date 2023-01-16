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

public val MaterialDesignIcons.ArrowAll: ImageVector
    get() {
        if (_arrowAll != null) {
            return _arrowAll!!
        }
        _arrowAll = Builder(name = "ArrowAll", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 11.0f)
                horizontalLineTo(18.0f)
                lineTo(16.5f, 9.5f)
                lineTo(17.92f, 8.08f)
                lineTo(21.84f, 12.0f)
                lineTo(17.92f, 15.92f)
                lineTo(16.5f, 14.5f)
                lineTo(18.0f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                lineTo(14.5f, 16.5f)
                lineTo(15.92f, 17.92f)
                lineTo(12.0f, 21.84f)
                lineTo(8.08f, 17.92f)
                lineTo(9.5f, 16.5f)
                lineTo(11.0f, 18.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                lineTo(7.5f, 14.5f)
                lineTo(6.08f, 15.92f)
                lineTo(2.16f, 12.0f)
                lineTo(6.08f, 8.08f)
                lineTo(7.5f, 9.5f)
                lineTo(6.0f, 11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.0f)
                lineTo(9.5f, 7.5f)
                lineTo(8.08f, 6.08f)
                lineTo(12.0f, 2.16f)
                lineTo(15.92f, 6.08f)
                lineTo(14.5f, 7.5f)
                lineTo(13.0f, 6.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _arrowAll!!
    }

private var _arrowAll: ImageVector? = null
