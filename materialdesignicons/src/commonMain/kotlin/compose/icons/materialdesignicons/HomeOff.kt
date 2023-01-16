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

public val MaterialDesignIcons.HomeOff: ImageVector
    get() {
        if (_homeOff != null) {
            return _homeOff!!
        }
        _homeOff = Builder(name = "HomeOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.84f, 22.73f)
                lineTo(18.11f, 20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.89f)
                lineTo(12.11f, 14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.0f)
                lineTo(6.27f, 8.16f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(19.0f, 12.0f)
                horizontalLineTo(22.0f)
                lineTo(12.0f, 3.0f)
                lineTo(8.95f, 5.75f)
                lineTo(19.0f, 15.8f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _homeOff!!
    }

private var _homeOff: ImageVector? = null
