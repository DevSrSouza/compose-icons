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

public val MaterialDesignIcons.MicrosoftBing: ImageVector
    get() {
        if (_microsoftBing != null) {
            return _microsoftBing!!
        }
        _microsoftBing = Builder(name = "MicrosoftBing", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                verticalLineTo(19.0f)
                lineTo(8.72f, 21.0f)
                lineTo(18.0f, 15.82f)
                verticalLineTo(11.73f)
                horizontalLineTo(18.0f)
                lineTo(9.77f, 8.95f)
                lineTo(11.38f, 12.84f)
                lineTo(13.94f, 14.0f)
                lineTo(8.7f, 16.92f)
                verticalLineTo(4.27f)
                lineTo(5.0f, 3.0f)
            }
        }
        .build()
        return _microsoftBing!!
    }

private var _microsoftBing: ImageVector? = null
