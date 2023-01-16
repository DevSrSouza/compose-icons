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

public val MaterialDesignIcons.FormatOverline: ImageVector
    get() {
        if (_formatOverline != null) {
            return _formatOverline!!
        }
        _formatOverline = Builder(name = "FormatOverline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                moveTo(9.62f, 16.0f)
                lineTo(12.0f, 9.67f)
                lineTo(14.37f, 16.0f)
                moveTo(11.0f, 7.0f)
                lineTo(5.5f, 21.0f)
                horizontalLineTo(7.75f)
                lineTo(8.87f, 18.0f)
                horizontalLineTo(15.12f)
                lineTo(16.25f, 21.0f)
                horizontalLineTo(18.5f)
                lineTo(13.0f, 7.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _formatOverline!!
    }

private var _formatOverline: ImageVector? = null
