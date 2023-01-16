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

public val MaterialDesignIcons.Ticket: ImageVector
    get() {
        if (_ticket != null) {
            return _ticket!!
        }
        _ticket = Builder(name = "Ticket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.58f, 16.8f)
                lineTo(12.0f, 14.5f)
                lineTo(8.42f, 16.8f)
                lineTo(9.5f, 12.68f)
                lineTo(6.21f, 10.0f)
                lineTo(10.46f, 9.74f)
                lineTo(12.0f, 5.8f)
                lineTo(13.54f, 9.74f)
                lineTo(17.79f, 10.0f)
                lineTo(14.5f, 12.68f)
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 10.89f, 20.9f, 10.0f, 22.0f, 10.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.89f, 21.1f, 4.0f, 20.0f, 4.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 6.0f)
                verticalLineTo(10.0f)
                curveTo(3.11f, 10.0f, 4.0f, 10.9f, 4.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 14.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 20.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 18.0f)
                verticalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 12.0f)
                close()
            }
        }
        .build()
        return _ticket!!
    }

private var _ticket: ImageVector? = null
