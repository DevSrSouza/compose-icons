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

public val MaterialDesignIcons.ArrowUpLeftBold: ImageVector
    get() {
        if (_arrowUpLeftBold != null) {
            return _arrowUpLeftBold!!
        }
        _arrowUpLeftBold = Builder(name = "ArrowUpLeftBold", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 21.0f)
                curveTo(9.36f, 21.0f, 6.0f, 17.64f, 6.0f, 13.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(2.0f)
                lineTo(8.0f, 4.0f)
                lineTo(14.0f, 11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.5f)
                curveTo(10.0f, 15.43f, 11.57f, 17.0f, 13.5f, 17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.5f)
                close()
            }
        }
        .build()
        return _arrowUpLeftBold!!
    }

private var _arrowUpLeftBold: ImageVector? = null
