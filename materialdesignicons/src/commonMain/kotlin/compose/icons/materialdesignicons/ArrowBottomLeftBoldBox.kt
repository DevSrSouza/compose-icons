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

public val MaterialDesignIcons.ArrowBottomLeftBoldBox: ImageVector
    get() {
        if (_arrowBottomLeftBoldBox != null) {
            return _arrowBottomLeftBoldBox!!
        }
        _arrowBottomLeftBoldBox = Builder(name = "ArrowBottomLeftBoldBox", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 21.0f)
                curveTo(3.9f, 21.0f, 3.0f, 20.1f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.9f, 3.9f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 3.0f, 21.0f, 3.9f, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 20.1f, 20.1f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                moveTo(15.3f, 16.0f)
                lineTo(13.2f, 13.9f)
                lineTo(17.0f, 10.0f)
                lineTo(14.2f, 7.2f)
                lineTo(10.4f, 11.1f)
                lineTo(8.2f, 8.9f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.3f)
                close()
            }
        }
        .build()
        return _arrowBottomLeftBoldBox!!
    }

private var _arrowBottomLeftBoldBox: ImageVector? = null
