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

public val MaterialDesignIcons.ArrowBottomLeftBoldOutline: ImageVector
    get() {
        if (_arrowBottomLeftBoldOutline != null) {
            return _arrowBottomLeftBoldOutline!!
        }
        _arrowBottomLeftBoldOutline = Builder(name = "ArrowBottomLeftBoldOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.36f, 19.78f)
                horizontalLineTo(4.22f)
                verticalLineTo(5.64f)
                lineTo(8.47f, 9.88f)
                lineTo(14.12f, 4.22f)
                lineTo(19.78f, 9.88f)
                lineTo(14.12f, 15.54f)
                lineTo(18.36f, 19.78f)
                moveTo(6.34f, 17.66f)
                horizontalLineTo(13.41f)
                lineTo(11.29f, 15.54f)
                lineTo(16.95f, 9.88f)
                lineTo(14.12f, 7.05f)
                lineTo(8.46f, 12.71f)
                lineTo(6.34f, 10.59f)
                verticalLineTo(17.66f)
                close()
            }
        }
        .build()
        return _arrowBottomLeftBoldOutline!!
    }

private var _arrowBottomLeftBoldOutline: ImageVector? = null
