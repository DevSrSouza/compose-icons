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

public val MaterialDesignIcons.Balloon: ImageVector
    get() {
        if (_balloon != null) {
            return _balloon!!
        }
        _balloon = Builder(name = "Balloon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.16f, 12.74f)
                lineTo(14.0f, 14.0f)
                horizontalLineTo(12.5f)
                curveTo(12.35f, 16.71f, 12.0f, 19.41f, 11.5f, 22.08f)
                lineTo(10.5f, 21.92f)
                curveTo(11.0f, 19.3f, 11.34f, 16.66f, 11.5f, 14.0f)
                horizontalLineTo(10.0f)
                lineTo(10.84f, 12.74f)
                curveTo(8.64f, 11.79f, 7.0f, 8.36f, 7.0f, 6.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 1.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 17.0f, 6.0f)
                curveTo(17.0f, 8.36f, 15.36f, 11.79f, 13.16f, 12.74f)
                close()
            }
        }
        .build()
        return _balloon!!
    }

private var _balloon: ImageVector? = null
