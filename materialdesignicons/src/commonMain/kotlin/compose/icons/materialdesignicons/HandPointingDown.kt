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

public val MaterialDesignIcons.HandPointingDown: ImageVector
    get() {
        if (_handPointingDown != null) {
            return _handPointingDown!!
        }
        _handPointingDown = Builder(name = "HandPointingDown", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.9f, 21.0f)
                verticalLineTo(11.0f)
                lineTo(6.7f, 12.69f)
                lineTo(6.5f, 12.72f)
                curveTo(6.19f, 12.72f, 5.93f, 12.6f, 5.74f, 12.4f)
                lineTo(5.0f, 11.63f)
                lineTo(9.9f, 7.43f)
                curveTo(10.16f, 7.16f, 10.5f, 7.0f, 10.9f, 7.0f)
                horizontalLineTo(17.4f)
                curveTo(18.17f, 7.0f, 18.9f, 7.7f, 18.9f, 8.5f)
                verticalLineTo(12.86f)
                curveTo(18.9f, 13.47f, 18.55f, 14.0f, 18.05f, 14.2f)
                lineTo(13.11f, 16.4f)
                lineTo(11.9f, 16.53f)
                verticalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.9f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.9f, 21.0f)
                moveTo(18.9f, 5.0f)
                horizontalLineTo(10.9f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.9f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _handPointingDown!!
    }

private var _handPointingDown: ImageVector? = null
