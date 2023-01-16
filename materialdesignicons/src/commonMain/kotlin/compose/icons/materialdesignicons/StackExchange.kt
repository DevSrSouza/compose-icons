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

public val MaterialDesignIcons.StackExchange: ImageVector
    get() {
        if (_stackExchange != null) {
            return _stackExchange!!
        }
        _stackExchange = Builder(name = "StackExchange", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.9f, 10.72f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.03f)
                horizontalLineTo(3.9f)
                verticalLineTo(10.72f)
                moveTo(3.9f, 6.44f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.75f)
                horizontalLineTo(3.9f)
                verticalLineTo(6.44f)
                moveTo(17.5f, 2.0f)
                horizontalLineTo(6.5f)
                curveTo(5.06f, 2.0f, 3.9f, 3.18f, 3.9f, 4.65f)
                verticalLineTo(5.5f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.65f)
                curveTo(20.0f, 3.18f, 18.88f, 2.0f, 17.5f, 2.0f)
                moveTo(3.9f, 15.0f)
                verticalLineTo(15.84f)
                curveTo(3.9f, 17.31f, 5.06f, 18.5f, 6.5f, 18.5f)
                horizontalLineTo(13.37f)
                verticalLineTo(22.0f)
                lineTo(16.77f, 18.5f)
                horizontalLineTo(17.5f)
                curveTo(18.94f, 18.5f, 20.11f, 17.31f, 20.11f, 15.84f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.9f)
                close()
            }
        }
        .build()
        return _stackExchange!!
    }

private var _stackExchange: ImageVector? = null
