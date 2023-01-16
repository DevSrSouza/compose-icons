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

public val MaterialDesignIcons.FormatListNumberedRtl: ImageVector
    get() {
        if (_formatListNumberedRtl != null) {
            return _formatListNumberedRtl!!
        }
        _formatListNumberedRtl = Builder(name = "FormatListNumberedRtl", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                moveTo(3.0f, 19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.0f)
                moveTo(3.0f, 7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                moveTo(20.0f, 8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                moveTo(19.0f, 17.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.5f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.5f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                moveTo(21.25f, 10.0f)
                curveTo(21.67f, 10.0f, 22.0f, 10.34f, 22.0f, 10.75f)
                curveTo(22.0f, 10.95f, 21.92f, 11.14f, 21.79f, 11.27f)
                lineTo(20.12f, 13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.08f)
                lineTo(21.0f, 11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.25f)
                close()
            }
        }
        .build()
        return _formatListNumberedRtl!!
    }

private var _formatListNumberedRtl: ImageVector? = null
