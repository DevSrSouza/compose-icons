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

public val MaterialDesignIcons.History: ImageVector
    get() {
        if (_history != null) {
            return _history!!
        }
        _history = Builder(name = "History", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 8.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.0f)
                lineTo(16.28f, 15.54f)
                lineTo(17.0f, 14.33f)
                lineTo(13.5f, 12.25f)
                verticalLineTo(8.0f)
                moveTo(13.0f, 3.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 4.0f, 12.0f)
                horizontalLineTo(1.0f)
                lineTo(4.96f, 16.03f)
                lineTo(9.0f, 12.0f)
                horizontalLineTo(6.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 13.0f, 5.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 20.0f, 12.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 13.0f, 19.0f)
                curveTo(11.07f, 19.0f, 9.32f, 18.21f, 8.06f, 16.94f)
                lineTo(6.64f, 18.36f)
                curveTo(8.27f, 20.0f, 10.5f, 21.0f, 13.0f, 21.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 13.0f, 3.0f)
            }
        }
        .build()
        return _history!!
    }

private var _history: ImageVector? = null
