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

public val MaterialDesignIcons.FormatTextRotationDownVertical: ImageVector
    get() {
        if (_formatTextRotationDownVertical != null) {
            return _formatTextRotationDownVertical!!
        }
        _formatTextRotationDownVertical = Builder(name = "FormatTextRotationDownVertical",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.25f, 4.0f)
                horizontalLineTo(13.75f)
                lineTo(9.0f, 15.0f)
                horizontalLineTo(11.1f)
                lineTo(12.0f, 12.8f)
                horizontalLineTo(17.0f)
                lineTo(17.9f, 15.0f)
                horizontalLineTo(20.0f)
                lineTo(15.25f, 4.0f)
                moveTo(12.63f, 11.0f)
                lineTo(14.5f, 6.0f)
                lineTo(16.37f, 11.0f)
                horizontalLineTo(12.63f)
                moveTo(5.0f, 17.5f)
                lineTo(8.0f, 14.5f)
                horizontalLineTo(6.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.5f)
                horizontalLineTo(2.0f)
                lineTo(5.0f, 17.5f)
                moveTo(22.0f, 20.0f)
                lineTo(19.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(23.0f)
                lineTo(22.0f, 20.0f)
                close()
            }
        }
        .build()
        return _formatTextRotationDownVertical!!
    }

private var _formatTextRotationDownVertical: ImageVector? = null
