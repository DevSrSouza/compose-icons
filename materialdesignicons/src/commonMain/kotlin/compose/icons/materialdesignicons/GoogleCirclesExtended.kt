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

public val MaterialDesignIcons.GoogleCirclesExtended: ImageVector
    get() {
        if (_googleCirclesExtended != null) {
            return _googleCirclesExtended!!
        }
        _googleCirclesExtended = Builder(name = "GoogleCirclesExtended", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 19.0f)
                curveTo(16.89f, 19.0f, 16.0f, 18.1f, 16.0f, 17.0f)
                curveTo(16.0f, 15.89f, 16.89f, 15.0f, 18.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 19.0f)
                moveTo(18.0f, 13.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 14.0f, 17.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 18.0f, 21.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 22.0f, 17.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 18.0f, 13.0f)
                moveTo(12.0f, 11.1f)
                arcTo(1.9f, 1.9f, 0.0f, false, false, 10.1f, 13.0f)
                arcTo(1.9f, 1.9f, 0.0f, false, false, 12.0f, 14.9f)
                arcTo(1.9f, 1.9f, 0.0f, false, false, 13.9f, 13.0f)
                arcTo(1.9f, 1.9f, 0.0f, false, false, 12.0f, 11.1f)
                moveTo(6.0f, 19.0f)
                curveTo(4.89f, 19.0f, 4.0f, 18.1f, 4.0f, 17.0f)
                curveTo(4.0f, 15.89f, 4.89f, 15.0f, 6.0f, 15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 19.0f)
                moveTo(6.0f, 13.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 2.0f, 17.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 6.0f, 21.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 10.0f, 17.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 6.0f, 13.0f)
                moveTo(12.0f, 4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 8.0f)
                curveTo(10.89f, 8.0f, 10.0f, 7.1f, 10.0f, 6.0f)
                curveTo(10.0f, 4.89f, 10.89f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 10.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 2.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return _googleCirclesExtended!!
    }

private var _googleCirclesExtended: ImageVector? = null
