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

public val MaterialDesignIcons.GoogleCircles: ImageVector
    get() {
        if (_googleCircles != null) {
            return _googleCircles!!
        }
        _googleCircles = Builder(name = "GoogleCircles", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.66f, 15.0f)
                horizontalLineTo(17.0f)
                curveTo(18.0f, 15.0f, 19.0f, 14.8f, 19.87f, 14.46f)
                curveTo(19.17f, 18.73f, 15.47f, 22.0f, 11.0f, 22.0f)
                curveTo(6.0f, 22.0f, 2.0f, 17.97f, 2.0f, 13.0f)
                curveTo(2.0f, 8.53f, 5.27f, 4.83f, 9.54f, 4.13f)
                curveTo(9.2f, 5.0f, 9.0f, 6.0f, 9.0f, 7.0f)
                verticalLineTo(7.34f)
                curveTo(6.68f, 8.16f, 5.0f, 10.38f, 5.0f, 13.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 11.0f, 19.0f)
                curveTo(13.62f, 19.0f, 15.84f, 17.32f, 16.66f, 15.0f)
                moveTo(17.0f, 10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 20.0f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 17.0f, 4.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 14.0f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 17.0f, 10.0f)
                moveTo(17.0f, 1.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 23.0f, 7.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 17.0f, 13.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 11.0f, 7.0f)
                curveTo(11.0f, 3.68f, 13.69f, 1.0f, 17.0f, 1.0f)
                close()
            }
        }
        .build()
        return _googleCircles!!
    }

private var _googleCircles: ImageVector? = null
