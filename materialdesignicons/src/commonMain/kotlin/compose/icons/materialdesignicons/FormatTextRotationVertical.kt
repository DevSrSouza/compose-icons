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

public val MaterialDesignIcons.FormatTextRotationVertical: ImageVector
    get() {
        if (_formatTextRotationVertical != null) {
            return _formatTextRotationVertical!!
        }
        _formatTextRotationVertical = Builder(name = "FormatTextRotationVertical", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 5.0f)
                horizontalLineTo(14.25f)
                lineTo(9.5f, 16.0f)
                horizontalLineTo(11.6f)
                lineTo(12.5f, 13.8f)
                horizontalLineTo(17.5f)
                lineTo(18.4f, 16.0f)
                horizontalLineTo(20.5f)
                lineTo(15.75f, 5.0f)
                moveTo(13.13f, 12.0f)
                lineTo(15.0f, 7.0f)
                lineTo(16.87f, 12.0f)
                horizontalLineTo(13.13f)
                moveTo(6.0f, 19.75f)
                lineTo(9.0f, 16.75f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.25f)
                horizontalLineTo(5.0f)
                verticalLineTo(16.75f)
                horizontalLineTo(3.0f)
                lineTo(6.0f, 19.75f)
                close()
            }
        }
        .build()
        return _formatTextRotationVertical!!
    }

private var _formatTextRotationVertical: ImageVector? = null
