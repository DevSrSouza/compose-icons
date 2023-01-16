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

public val MaterialDesignIcons.ArrowTopRightBottomLeftBold: ImageVector
    get() {
        if (_arrowTopRightBottomLeftBold != null) {
            return _arrowTopRightBottomLeftBold!!
        }
        _arrowTopRightBottomLeftBold = Builder(name = "ArrowTopRightBottomLeftBold", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.17f, 8.66f)
                lineTo(21.0f, 11.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(12.5f)
                lineTo(15.34f, 5.83f)
                lineTo(5.83f, 15.34f)
                lineTo(3.0f, 12.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.5f)
                lineTo(8.66f, 18.17f)
                lineTo(18.17f, 8.66f)
                close()
            }
        }
        .build()
        return _arrowTopRightBottomLeftBold!!
    }

private var _arrowTopRightBottomLeftBold: ImageVector? = null
