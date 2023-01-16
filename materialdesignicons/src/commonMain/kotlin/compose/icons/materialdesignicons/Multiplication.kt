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

public val MaterialDesignIcons.Multiplication: ImageVector
    get() {
        if (_multiplication != null) {
            return _multiplication!!
        }
        _multiplication = Builder(name = "Multiplication", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.27f)
                lineTo(19.29f, 6.64f)
                lineTo(20.29f, 8.37f)
                lineTo(14.0f, 12.0f)
                lineTo(20.3f, 15.64f)
                lineTo(19.3f, 17.37f)
                lineTo(13.0f, 13.72f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.73f)
                lineTo(4.69f, 17.36f)
                lineTo(3.69f, 15.63f)
                lineTo(10.0f, 12.0f)
                lineTo(3.72f, 8.36f)
                lineTo(4.72f, 6.63f)
                lineTo(11.0f, 10.26f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _multiplication!!
    }

private var _multiplication: ImageVector? = null
