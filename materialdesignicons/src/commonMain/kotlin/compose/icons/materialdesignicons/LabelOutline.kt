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

public val MaterialDesignIcons.LabelOutline: ImageVector
    get() {
        if (_labelOutline != null) {
            return _labelOutline!!
        }
        _labelOutline = Builder(name = "LabelOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                lineTo(19.55f, 12.0f)
                moveTo(17.63f, 5.84f)
                curveTo(17.27f, 5.33f, 16.67f, 5.0f, 16.0f, 5.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 7.0f)
                verticalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 19.0f)
                horizontalLineTo(16.0f)
                curveTo(16.67f, 19.0f, 17.27f, 18.66f, 17.63f, 18.15f)
                lineTo(22.0f, 12.0f)
                lineTo(17.63f, 5.84f)
                close()
            }
        }
        .build()
        return _labelOutline!!
    }

private var _labelOutline: ImageVector? = null
