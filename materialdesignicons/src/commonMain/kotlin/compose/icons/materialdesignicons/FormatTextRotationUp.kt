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

public val MaterialDesignIcons.FormatTextRotationUp: ImageVector
    get() {
        if (_formatTextRotationUp != null) {
            return _formatTextRotationUp!!
        }
        _formatTextRotationUp = Builder(name = "FormatTextRotationUp", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                verticalLineTo(13.5f)
                lineTo(14.0f, 18.25f)
                verticalLineTo(16.15f)
                lineTo(11.8f, 15.25f)
                verticalLineTo(10.25f)
                lineTo(14.0f, 9.35f)
                verticalLineTo(7.25f)
                lineTo(3.0f, 12.0f)
                moveTo(10.0f, 14.62f)
                lineTo(5.0f, 12.75f)
                lineTo(10.0f, 10.88f)
                verticalLineTo(14.62f)
                moveTo(18.0f, 4.25f)
                lineTo(15.0f, 7.25f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.75f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.25f)
                horizontalLineTo(21.0f)
                lineTo(18.0f, 4.25f)
                close()
            }
        }
        .build()
        return _formatTextRotationUp!!
    }

private var _formatTextRotationUp: ImageVector? = null
