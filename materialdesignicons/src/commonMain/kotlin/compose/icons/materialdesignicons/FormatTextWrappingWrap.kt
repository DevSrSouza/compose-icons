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

public val MaterialDesignIcons.FormatTextWrappingWrap: ImageVector
    get() {
        if (_formatTextWrappingWrap != null) {
            return _formatTextWrappingWrap!!
        }
        _formatTextWrappingWrap = Builder(name = "FormatTextWrappingWrap", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 21.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(21.0f)
                moveTo(19.0f, 3.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(3.0f)
                moveTo(13.0f, 8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(12.97f)
                curveTo(13.14f, 10.0f, 14.0f, 10.16f, 14.0f, 12.0f)
                curveTo(14.0f, 13.84f, 13.14f, 14.0f, 13.0f, 14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                lineTo(8.0f, 15.0f)
                lineTo(11.0f, 18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                curveTo(14.04f, 16.0f, 16.0f, 15.16f, 16.0f, 12.0f)
                curveTo(16.0f, 8.84f, 14.04f, 8.0f, 13.0f, 8.0f)
                close()
            }
        }
        .build()
        return _formatTextWrappingWrap!!
    }

private var _formatTextWrappingWrap: ImageVector? = null
