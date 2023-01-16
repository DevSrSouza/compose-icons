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

public val MaterialDesignIcons.RefreshCircle: ImageVector
    get() {
        if (_refreshCircle != null) {
            return _refreshCircle!!
        }
        _refreshCircle = Builder(name = "RefreshCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(18.0f, 11.0f)
                horizontalLineTo(13.0f)
                lineTo(14.81f, 9.19f)
                arcTo(3.94f, 3.94f, 0.0f, false, false, 12.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 15.86f, 13.0f)
                horizontalLineTo(17.91f)
                arcTo(6.0f, 6.0f, 0.0f, true, true, 12.0f, 6.0f)
                arcTo(5.91f, 5.91f, 0.0f, false, true, 16.22f, 7.78f)
                lineTo(18.0f, 6.0f)
                close()
            }
        }
        .build()
        return _refreshCircle!!
    }

private var _refreshCircle: ImageVector? = null
