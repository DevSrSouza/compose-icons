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

public val MaterialDesignIcons.FormatHeader1: ImageVector
    get() {
        if (_formatHeader1 != null) {
            return _formatHeader1!!
        }
        _formatHeader1 = Builder(name = "FormatHeader1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                moveTo(14.0f, 18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.31f)
                lineTo(13.5f, 7.75f)
                verticalLineTo(5.44f)
                lineTo(16.0f, 4.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _formatHeader1!!
    }

private var _formatHeader1: ImageVector? = null
