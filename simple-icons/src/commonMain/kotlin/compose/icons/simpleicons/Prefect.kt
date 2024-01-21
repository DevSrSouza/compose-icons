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

public val SimpleIcons.Prefect: ImageVector
    get() {
        if (_prefect != null) {
            return _prefect!!
        }
        _prefect = Builder(name = "Prefect", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.003f)
                lineTo(4.288f, 4.002f)
                lineTo(12.0f, 0.0f)
                lineToRelative(7.713f, 4.0f)
                verticalLineToRelative(8.004f)
                lineTo(12.0f, 16.0f)
                verticalLineToRelative(8.0f)
                lineToRelative(-7.71f, -4.0f)
                verticalLineToRelative(-8.0f)
                lineTo(12.0f, 16.0f)
                verticalLineTo(8.003f)
                close()
            }
        }
        .build()
        return _prefect!!
    }

private var _prefect: ImageVector? = null
