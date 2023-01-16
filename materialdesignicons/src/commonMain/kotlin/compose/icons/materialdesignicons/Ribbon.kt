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

public val MaterialDesignIcons.Ribbon: ImageVector
    get() {
        if (_ribbon != null) {
            return _ribbon!!
        }
        _ribbon = Builder(name = "Ribbon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.41f, 19.31f)
                lineTo(16.59f, 22.5f)
                lineTo(18.0f, 21.07f)
                lineTo(14.83f, 17.9f)
                moveTo(15.54f, 11.53f)
                horizontalLineTo(15.53f)
                lineTo(12.0f, 15.07f)
                lineTo(8.47f, 11.53f)
                horizontalLineTo(8.46f)
                verticalLineTo(11.53f)
                curveTo(7.56f, 10.63f, 7.0f, 9.38f, 7.0f, 8.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 12.0f, 3.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 17.0f, 8.0f)
                curveTo(17.0f, 9.38f, 16.44f, 10.63f, 15.54f, 11.53f)
                moveTo(16.9f, 13.0f)
                curveTo(18.2f, 11.73f, 19.0f, 9.96f, 19.0f, 8.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 12.0f, 1.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 5.0f, 8.0f)
                curveTo(5.0f, 9.96f, 5.81f, 11.73f, 7.1f, 13.0f)
                verticalLineTo(13.0f)
                lineTo(10.59f, 16.5f)
                lineTo(6.0f, 21.07f)
                lineTo(7.41f, 22.5f)
                lineTo(16.9f, 13.0f)
                close()
            }
        }
        .build()
        return _ribbon!!
    }

private var _ribbon: ImageVector? = null
