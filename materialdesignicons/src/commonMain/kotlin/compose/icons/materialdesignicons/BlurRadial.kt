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

public val MaterialDesignIcons.BlurRadial: ImageVector
    get() {
        if (_blurRadial != null) {
            return _blurRadial!!
        }
        _blurRadial = Builder(name = "BlurRadial", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 13.0f)
                moveTo(14.0f, 16.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 13.5f, 17.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 14.0f, 17.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 14.5f, 17.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 14.0f, 16.5f)
                moveTo(12.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 20.0f)
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(17.0f, 9.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 16.5f, 10.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 17.0f, 10.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 17.5f, 10.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 17.0f, 9.5f)
                moveTo(17.0f, 13.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 16.5f, 14.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 17.0f, 14.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 17.5f, 14.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 17.0f, 13.5f)
                moveTo(14.0f, 7.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 14.5f, 7.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 14.0f, 6.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 13.5f, 7.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 14.0f, 7.5f)
                moveTo(14.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 9.0f)
                moveTo(10.0f, 7.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 10.5f, 7.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 10.0f, 6.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 9.5f, 7.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 10.0f, 7.5f)
                moveTo(7.0f, 13.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 6.5f, 14.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 7.0f, 14.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 7.5f, 14.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 7.0f, 13.5f)
                moveTo(10.0f, 16.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 9.5f, 17.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 10.0f, 17.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 10.5f, 17.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 10.0f, 16.5f)
                moveTo(7.0f, 9.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 6.5f, 10.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 7.0f, 10.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 7.5f, 10.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 7.0f, 9.5f)
                moveTo(10.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 13.0f)
                moveTo(10.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 9.0f)
                close()
            }
        }
        .build()
        return _blurRadial!!
    }

private var _blurRadial: ImageVector? = null
