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

public val MaterialDesignIcons.FormatTextRotationNone: ImageVector
    get() {
        if (_formatTextRotationNone != null) {
            return _formatTextRotationNone!!
        }
        _formatTextRotationNone = Builder(name = "FormatTextRotationNone", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 18.0f)
                lineTo(17.5f, 21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(15.0f)
                lineTo(20.5f, 18.0f)
                moveTo(10.13f, 10.0f)
                horizontalLineTo(13.88f)
                lineTo(12.0f, 4.97f)
                lineTo(10.13f, 10.0f)
                moveTo(12.75f, 3.0f)
                lineTo(17.5f, 14.0f)
                horizontalLineTo(15.42f)
                lineTo(14.5f, 11.81f)
                horizontalLineTo(9.5f)
                lineTo(8.58f, 14.0f)
                horizontalLineTo(6.5f)
                lineTo(11.25f, 3.0f)
                horizontalLineTo(12.75f)
                close()
            }
        }
        .build()
        return _formatTextRotationNone!!
    }

private var _formatTextRotationNone: ImageVector? = null
