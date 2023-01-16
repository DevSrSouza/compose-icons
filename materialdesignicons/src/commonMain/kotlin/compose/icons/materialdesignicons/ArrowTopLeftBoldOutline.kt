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

public val MaterialDesignIcons.ArrowTopLeftBoldOutline: ImageVector
    get() {
        if (_arrowTopLeftBoldOutline != null) {
            return _arrowTopLeftBoldOutline!!
        }
        _arrowTopLeftBoldOutline = Builder(name = "ArrowTopLeftBoldOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.12f, 8.46f)
                lineTo(19.78f, 14.12f)
                lineTo(14.12f, 19.78f)
                lineTo(8.46f, 14.12f)
                lineTo(4.22f, 18.36f)
                verticalLineTo(4.22f)
                horizontalLineTo(18.36f)
                lineTo(14.12f, 8.46f)
                moveTo(6.34f, 13.41f)
                lineTo(8.46f, 11.29f)
                lineTo(14.12f, 16.95f)
                lineTo(16.95f, 14.12f)
                lineTo(11.29f, 8.47f)
                lineTo(13.41f, 6.34f)
                horizontalLineTo(6.34f)
                verticalLineTo(13.41f)
                close()
            }
        }
        .build()
        return _arrowTopLeftBoldOutline!!
    }

private var _arrowTopLeftBoldOutline: ImageVector? = null
