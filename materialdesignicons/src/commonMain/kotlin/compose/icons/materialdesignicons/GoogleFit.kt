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

public val MaterialDesignIcons.GoogleFit: ImageVector
    get() {
        if (_googleFit != null) {
            return _googleFit!!
        }
        _googleFit = Builder(name = "GoogleFit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 22.0f, 9.0f)
                curveTo(22.0f, 10.38f, 21.44f, 11.63f, 20.54f, 12.54f)
                lineTo(12.0f, 21.07f)
                lineTo(3.46f, 12.54f)
                curveTo(2.56f, 11.63f, 2.0f, 10.38f, 2.0f, 9.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.0f, 4.0f)
                curveTo(8.38f, 4.0f, 9.63f, 4.56f, 10.54f, 5.46f)
                lineTo(12.0f, 6.93f)
                lineTo(13.46f, 5.46f)
                curveTo(14.37f, 4.56f, 15.62f, 4.0f, 17.0f, 4.0f)
                moveTo(15.59f, 7.59f)
                lineTo(9.17f, 14.0f)
                lineTo(12.0f, 16.83f)
                lineTo(18.41f, 10.41f)
                curveTo(18.78f, 10.05f, 19.0f, 9.55f, 19.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 7.0f)
                curveTo(16.45f, 7.0f, 15.95f, 7.22f, 15.59f, 7.59f)
                moveTo(8.41f, 7.59f)
                curveTo(8.05f, 7.22f, 7.55f, 7.0f, 7.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 9.0f)
                curveTo(5.0f, 9.55f, 5.22f, 10.05f, 5.59f, 10.41f)
                lineTo(7.05f, 11.88f)
                lineTo(9.88f, 9.05f)
                lineTo(8.41f, 7.59f)
                close()
            }
        }
        .build()
        return _googleFit!!
    }

private var _googleFit: ImageVector? = null
