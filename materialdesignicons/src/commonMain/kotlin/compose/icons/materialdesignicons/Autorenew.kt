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

public val MaterialDesignIcons.Autorenew: ImageVector
    get() {
        if (_autorenew != null) {
            return _autorenew!!
        }
        _autorenew = Builder(name = "Autorenew", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                verticalLineTo(9.0f)
                lineTo(16.0f, 5.0f)
                lineTo(12.0f, 1.0f)
                verticalLineTo(4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 4.0f, 12.0f)
                curveTo(4.0f, 13.57f, 4.46f, 15.03f, 5.24f, 16.26f)
                lineTo(6.7f, 14.8f)
                curveTo(6.25f, 13.97f, 6.0f, 13.0f, 6.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.0f, 6.0f)
                moveTo(18.76f, 7.74f)
                lineTo(17.3f, 9.2f)
                curveTo(17.74f, 10.04f, 18.0f, 11.0f, 18.0f, 12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.0f, 18.0f)
                verticalLineTo(15.0f)
                lineTo(8.0f, 19.0f)
                lineTo(12.0f, 23.0f)
                verticalLineTo(20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 20.0f, 12.0f)
                curveTo(20.0f, 10.43f, 19.54f, 8.97f, 18.76f, 7.74f)
                close()
            }
        }
        .build()
        return _autorenew!!
    }

private var _autorenew: ImageVector? = null
