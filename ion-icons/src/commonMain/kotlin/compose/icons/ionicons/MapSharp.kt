package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.MapSharp: ImageVector
    get() {
        if (_mapSharp != null) {
            return _mapSharp!!
        }
        _mapSharp = Builder(name = "MapSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(327.71f, 130.93f)
                lineTo(184.0f, 39.0f)
                lineTo(32.0f, 144.0f)
                verticalLineTo(480.0f)
                lineToRelative(152.29f, -98.93f)
                lineTo(328.0f, 473.0f)
                lineTo(480.0f, 368.0f)
                verticalLineTo(32.0f)
                close()
                moveTo(312.0f, 421.0f)
                lineTo(200.0f, 349.0f)
                verticalLineTo(91.0f)
                lineToRelative(112.0f, 72.0f)
                close()
            }
        }
        .build()
        return _mapSharp!!
    }

private var _mapSharp: ImageVector? = null
