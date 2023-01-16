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

public val MaterialDesignIcons.LabelVariantOutline: ImageVector
    get() {
        if (_labelVariantOutline != null) {
            return _labelVariantOutline!!
        }
        _labelVariantOutline = Builder(name = "LabelVariantOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 17.0f)
                horizontalLineTo(15.0f)
                lineTo(18.5f, 12.0f)
                lineTo(15.0f, 7.0f)
                horizontalLineTo(6.5f)
                lineTo(10.0f, 12.0f)
                lineTo(6.5f, 17.0f)
                moveTo(15.0f, 19.0f)
                horizontalLineTo(3.0f)
                lineTo(7.5f, 12.0f)
                lineTo(3.0f, 5.0f)
                horizontalLineTo(15.0f)
                curveTo(15.69f, 5.0f, 16.23f, 5.3f, 16.64f, 5.86f)
                lineTo(21.0f, 12.0f)
                lineTo(16.64f, 18.14f)
                curveTo(16.23f, 18.7f, 15.69f, 19.0f, 15.0f, 19.0f)
                close()
            }
        }
        .build()
        return _labelVariantOutline!!
    }

private var _labelVariantOutline: ImageVector? = null
