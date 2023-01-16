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

public val MaterialDesignIcons.Airplane: ImageVector
    get() {
        if (_airplane != null) {
            return _airplane!!
        }
        _airplane = Builder(name = "Airplane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.56f, 3.91f)
                curveTo(21.15f, 4.5f, 21.15f, 5.45f, 20.56f, 6.03f)
                lineTo(16.67f, 9.92f)
                lineTo(18.79f, 19.11f)
                lineTo(17.38f, 20.53f)
                lineTo(13.5f, 13.1f)
                lineTo(9.6f, 17.0f)
                lineTo(9.96f, 19.47f)
                lineTo(8.89f, 20.53f)
                lineTo(7.13f, 17.35f)
                lineTo(3.94f, 15.58f)
                lineTo(5.0f, 14.5f)
                lineTo(7.5f, 14.87f)
                lineTo(11.37f, 11.0f)
                lineTo(3.94f, 7.09f)
                lineTo(5.36f, 5.68f)
                lineTo(14.55f, 7.8f)
                lineTo(18.44f, 3.91f)
                curveTo(19.0f, 3.33f, 20.0f, 3.33f, 20.56f, 3.91f)
                close()
            }
        }
        .build()
        return _airplane!!
    }

private var _airplane: ImageVector? = null
