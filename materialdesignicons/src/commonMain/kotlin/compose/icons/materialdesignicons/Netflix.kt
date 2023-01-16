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

public val MaterialDesignIcons.Netflix: ImageVector
    get() {
        if (_netflix != null) {
            return _netflix!!
        }
        _netflix = Builder(name = "Netflix", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 2.0f)
                horizontalLineTo(10.5f)
                lineTo(13.44f, 10.83f)
                lineTo(13.5f, 2.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(22.0f)
                curveTo(16.25f, 21.78f, 14.87f, 21.64f, 13.41f, 21.58f)
                lineTo(10.5f, 13.0f)
                lineTo(10.43f, 21.59f)
                curveTo(9.03f, 21.65f, 7.7f, 21.79f, 6.5f, 22.0f)
                verticalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _netflix!!
    }

private var _netflix: ImageVector? = null
