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

public val SimpleIcons.Lapce: ImageVector
    get() {
        if (_lapce != null) {
            return _lapce!!
        }
        _lapce = Builder(name = "Lapce", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.802f, 1.267f)
                lineTo(1.608f, 0.0f)
                verticalLineToRelative(24.0f)
                lineTo(8.0f, 20.31f)
                verticalLineToRelative(-2.535f)
                lineTo(3.802f, 20.2f)
                close()
                moveTo(8.01f, 15.167f)
                lineTo(8.01f, 6.231f)
                lineTo(18.003f, 12.0f)
                lineToRelative(-7.798f, 4.503f)
                verticalLineToRelative(2.533f)
                lineTo(22.392f, 12.0f)
                lineTo(5.806f, 2.424f)
                lineTo(5.806f, 16.44f)
                close()
                moveTo(13.608f, 11.936f)
                lineTo(10.205f, 9.97f)
                verticalLineToRelative(3.93f)
                close()
            }
        }
        .build()
        return _lapce!!
    }

private var _lapce: ImageVector? = null
