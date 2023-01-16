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

public val MaterialDesignIcons.FormatHeader2: ImageVector
    get() {
        if (_formatHeader2 != null) {
            return _formatHeader2!!
        }
        _formatHeader2 = Builder(name = "FormatHeader2", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(21.0f, 18.0f)
                horizontalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 16.0f)
                curveTo(13.0f, 15.47f, 13.2f, 15.0f, 13.54f, 14.64f)
                lineTo(18.41f, 9.41f)
                curveTo(18.78f, 9.05f, 19.0f, 8.55f, 19.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 8.0f)
                horizontalLineTo(13.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 17.0f, 4.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 21.0f, 8.0f)
                curveTo(21.0f, 9.1f, 20.55f, 10.1f, 19.83f, 10.83f)
                lineTo(15.0f, 16.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _formatHeader2!!
    }

private var _formatHeader2: ImageVector? = null
