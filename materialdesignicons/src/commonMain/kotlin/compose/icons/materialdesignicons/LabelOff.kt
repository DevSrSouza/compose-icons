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

public val MaterialDesignIcons.LabelOff: ImageVector
    get() {
        if (_labelOff != null) {
            return _labelOff!!
        }
        _labelOff = Builder(name = "LabelOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.27f)
                lineTo(3.28f, 3.0f)
                lineTo(20.0f, 19.72f)
                lineTo(18.73f, 21.0f)
                lineTo(16.63f, 18.9f)
                curveTo(16.43f, 18.96f, 16.22f, 19.0f, 16.0f, 19.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(3.0f, 6.5f, 3.17f, 6.07f, 3.46f, 5.73f)
                lineTo(2.0f, 4.27f)
                moveTo(17.63f, 5.84f)
                lineTo(22.0f, 12.0f)
                lineTo(19.0f, 16.2f)
                lineTo(7.83f, 5.0f)
                horizontalLineTo(16.0f)
                curveTo(16.67f, 5.0f, 17.27f, 5.33f, 17.63f, 5.84f)
                close()
            }
        }
        .build()
        return _labelOff!!
    }

private var _labelOff: ImageVector? = null
