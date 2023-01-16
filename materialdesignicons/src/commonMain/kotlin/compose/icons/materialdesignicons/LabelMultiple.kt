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

public val MaterialDesignIcons.LabelMultiple: ImageVector
    get() {
        if (_labelMultiple != null) {
            return _labelMultiple!!
        }
        _labelMultiple = Builder(name = "LabelMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 19.0f)
                horizontalLineTo(13.0f)
                lineTo(11.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.5f, 21.0f, 2.97f, 20.79f, 2.59f, 20.41f)
                curveTo(2.21f, 20.03f, 2.0f, 19.5f, 2.0f, 19.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                moveTo(17.63f, 5.84f)
                curveTo(17.27f, 5.33f, 16.67f, 5.0f, 16.0f, 5.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 5.0f, 6.0f, 5.9f, 6.0f, 7.0f)
                verticalLineTo(15.0f)
                curveTo(6.0f, 16.1f, 6.9f, 17.0f, 8.0f, 17.0f)
                horizontalLineTo(16.0f)
                curveTo(16.67f, 17.0f, 17.27f, 16.66f, 17.63f, 16.15f)
                lineTo(22.0f, 11.0f)
                lineTo(17.63f, 5.84f)
                close()
            }
        }
        .build()
        return _labelMultiple!!
    }

private var _labelMultiple: ImageVector? = null
