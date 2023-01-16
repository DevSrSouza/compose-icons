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

public val MaterialDesignIcons.LinkVariantRemove: ImageVector
    get() {
        if (_linkVariantRemove != null) {
            return _linkVariantRemove!!
        }
        _linkVariantRemove = Builder(name = "LinkVariantRemove", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.6f, 13.4f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.2f, 14.8f)
                arcTo(4.8f, 4.8f, 0.0f, false, true, 9.2f, 7.8f)
                lineTo(12.7f, 4.2f)
                arcTo(5.1f, 5.1f, 0.0f, false, true, 19.8f, 4.2f)
                arcTo(5.1f, 5.1f, 0.0f, false, true, 19.8f, 11.3f)
                lineTo(18.3f, 12.8f)
                arcTo(6.4f, 6.4f, 0.0f, false, false, 17.9f, 10.4f)
                lineTo(18.4f, 9.9f)
                arcTo(3.2f, 3.2f, 0.0f, false, false, 18.4f, 5.6f)
                arcTo(3.2f, 3.2f, 0.0f, false, false, 14.1f, 5.6f)
                lineTo(10.6f, 9.2f)
                arcTo(2.9f, 2.9f, 0.0f, false, false, 10.6f, 13.4f)
                moveTo(16.2f, 13.7f)
                arcTo(4.8f, 4.8f, 0.0f, false, false, 14.8f, 9.2f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.4f, 10.6f)
                arcTo(2.9f, 2.9f, 0.0f, false, true, 13.4f, 14.8f)
                lineTo(9.9f, 18.4f)
                arcTo(3.2f, 3.2f, 0.0f, false, true, 5.6f, 18.4f)
                arcTo(3.2f, 3.2f, 0.0f, false, true, 5.6f, 14.1f)
                lineTo(6.1f, 13.7f)
                arcTo(7.3f, 7.3f, 0.0f, false, true, 5.7f, 11.2f)
                lineTo(4.2f, 12.7f)
                arcTo(5.1f, 5.1f, 0.0f, false, false, 4.2f, 19.8f)
                arcTo(5.1f, 5.1f, 0.0f, false, false, 11.3f, 19.8f)
                lineTo(13.1f, 18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 16.2f, 13.7f)
                moveTo(21.1f, 15.5f)
                lineTo(19.0f, 17.6f)
                lineTo(16.9f, 15.5f)
                lineTo(15.5f, 16.9f)
                lineTo(17.6f, 19.0f)
                lineTo(15.5f, 21.1f)
                lineTo(16.9f, 22.5f)
                lineTo(19.0f, 20.4f)
                lineTo(21.1f, 22.5f)
                lineTo(22.5f, 21.1f)
                lineTo(20.4f, 19.0f)
                lineTo(22.5f, 16.9f)
                close()
            }
        }
        .build()
        return _linkVariantRemove!!
    }

private var _linkVariantRemove: ImageVector? = null
