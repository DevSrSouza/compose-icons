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

public val MaterialDesignIcons.FootPrint: ImageVector
    get() {
        if (_footPrint != null) {
            return _footPrint!!
        }
        _footPrint = Builder(name = "FootPrint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 14.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 2.0f)
                moveTo(12.04f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 10.54f, 4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.04f, 3.0f)
                moveTo(9.09f, 4.5f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 8.09f, 5.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.09f, 4.5f)
                moveTo(7.04f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 6.04f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.04f, 6.0f)
                moveTo(14.53f, 12.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 17.0f, 9.24f)
                arcTo(2.6f, 2.6f, 0.0f, false, false, 14.39f, 7.0f)
                horizontalLineTo(11.91f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 6.12f, 11.4f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.23f, 12.8f)
                arcTo(6.8f, 6.8f, 0.0f, false, true, 6.91f, 15.76f)
                arcTo(6.89f, 6.89f, 0.0f, false, true, 6.22f, 18.55f)
                arcTo(1.92f, 1.92f, 0.0f, false, false, 6.3f, 20.31f)
                arcTo(3.62f, 3.62f, 0.0f, false, false, 10.19f, 21.91f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.36f, 16.63f)
                arcTo(2.82f, 2.82f, 0.0f, false, true, 11.91f, 15.0f)
                reflectiveCurveTo(11.68f, 12.0f, 14.53f, 12.0f)
                close()
            }
        }
        .build()
        return _footPrint!!
    }

private var _footPrint: ImageVector? = null
