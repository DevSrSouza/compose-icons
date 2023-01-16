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

public val MaterialDesignIcons.LabelMultipleOutline: ImageVector
    get() {
        if (_labelMultipleOutline != null) {
            return _labelMultipleOutline!!
        }
        _labelMultipleOutline = Builder(name = "LabelMultipleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 18.0f)
                horizontalLineTo(13.0f)
                lineTo(11.0f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(3.5f, 20.0f, 2.97f, 19.79f, 2.59f, 19.41f)
                curveTo(2.21f, 19.03f, 2.0f, 18.5f, 2.0f, 18.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                moveTo(17.63f, 4.84f)
                curveTo(17.27f, 4.33f, 16.67f, 4.0f, 16.0f, 4.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 4.0f, 6.0f, 4.9f, 6.0f, 6.0f)
                verticalLineTo(14.0f)
                curveTo(6.0f, 15.1f, 6.9f, 16.0f, 8.0f, 16.0f)
                horizontalLineTo(16.0f)
                curveTo(16.67f, 16.0f, 17.27f, 15.66f, 17.63f, 15.15f)
                lineTo(22.0f, 10.0f)
                lineTo(17.63f, 4.84f)
                moveTo(16.0f, 14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.0f)
                lineTo(19.55f, 10.0f)
                close()
            }
        }
        .build()
        return _labelMultipleOutline!!
    }

private var _labelMultipleOutline: ImageVector? = null
