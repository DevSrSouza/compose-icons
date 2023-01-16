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

public val MaterialDesignIcons.Finance: ImageVector
    get() {
        if (_finance != null) {
            return _finance!!
        }
        _finance = Builder(name = "Finance", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 16.5f)
                lineTo(3.0f, 19.44f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                moveTo(11.0f, 14.66f)
                lineTo(9.43f, 13.32f)
                lineTo(8.0f, 14.64f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                moveTo(16.0f, 13.0f)
                lineTo(13.0f, 16.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.0f)
                moveTo(18.81f, 12.81f)
                lineTo(17.0f, 11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(16.0f)
                lineTo(20.21f, 14.21f)
                lineTo(13.0f, 21.36f)
                lineTo(9.53f, 18.34f)
                lineTo(5.75f, 22.0f)
                horizontalLineTo(3.0f)
                lineTo(9.47f, 15.66f)
                lineTo(13.0f, 18.64f)
            }
        }
        .build()
        return _finance!!
    }

private var _finance: ImageVector? = null
