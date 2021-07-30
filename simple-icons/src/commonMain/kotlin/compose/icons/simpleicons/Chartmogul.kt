package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Chartmogul: ImageVector
    get() {
        if (_chartmogul != null) {
            return _chartmogul!!
        }
        _chartmogul = Builder(name = "Chartmogul", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.621f, 19.89f)
                verticalLineTo(8.75f)
                lineTo(2.867f, 19.89f)
                horizontalLineTo(0.0f)
                verticalLineTo(4.11f)
                horizontalLineToRelative(2.758f)
                verticalLineToRelative(11.112f)
                lineToRelative(7.754f, -11.113f)
                horizontalLineToRelative(2.867f)
                verticalLineToRelative(11.14f)
                lineTo(21.16f, 4.11f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(15.782f)
                horizontalLineToRelative(-2.73f)
                verticalLineTo(8.75f)
                lineToRelative(-7.755f, 11.14f)
                close()
            }
        }
        .build()
        return _chartmogul!!
    }

private var _chartmogul: ImageVector? = null
