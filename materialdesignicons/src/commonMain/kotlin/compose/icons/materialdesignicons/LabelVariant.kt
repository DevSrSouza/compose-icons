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

public val MaterialDesignIcons.LabelVariant: ImageVector
    get() {
        if (_labelVariant != null) {
            return _labelVariant!!
        }
        _labelVariant = Builder(name = "LabelVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 19.0f)
                lineTo(8.34f, 12.0f)
                lineTo(3.5f, 5.0f)
                horizontalLineTo(14.5f)
                curveTo(15.17f, 5.0f, 15.72f, 5.3f, 16.13f, 5.86f)
                lineTo(20.5f, 12.0f)
                lineTo(16.13f, 18.14f)
                curveTo(15.72f, 18.7f, 15.17f, 19.0f, 14.5f, 19.0f)
                horizontalLineTo(3.5f)
                close()
            }
        }
        .build()
        return _labelVariant!!
    }

private var _labelVariant: ImageVector? = null
