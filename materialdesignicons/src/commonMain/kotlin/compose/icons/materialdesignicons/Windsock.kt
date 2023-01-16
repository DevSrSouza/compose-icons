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

public val MaterialDesignIcons.Windsock: ImageVector
    get() {
        if (_windsock != null) {
            return _windsock!!
        }
        _windsock = Builder(name = "Windsock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                verticalLineTo(13.0f)
                lineTo(22.0f, 11.0f)
                verticalLineTo(7.0f)
                lineTo(7.0f, 5.0f)
                moveTo(10.0f, 6.91f)
                lineTo(13.0f, 7.31f)
                verticalLineTo(10.69f)
                lineTo(10.0f, 11.09f)
                verticalLineTo(6.91f)
                moveTo(16.0f, 7.71f)
                lineTo(19.0f, 8.11f)
                verticalLineTo(9.89f)
                lineTo(16.0f, 10.29f)
                verticalLineTo(7.71f)
                moveTo(5.0f, 10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.45f, 3.45f, 3.0f, 4.0f, 3.0f)
                reflectiveCurveTo(5.0f, 3.45f, 5.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _windsock!!
    }

private var _windsock: ImageVector? = null
