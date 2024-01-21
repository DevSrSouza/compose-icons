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

public val SimpleIcons.Checkmk: ImageVector
    get() {
        if (_checkmk != null) {
            return _checkmk!!
        }
        _checkmk = Builder(name = "Checkmk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.187f, 8.738f)
                verticalLineToRelative(3.985f)
                lineToRelative(4.883f, -3.157f)
                verticalLineToRelative(8.217f)
                lineToRelative(1.925f, 1.111f)
                lineToRelative(1.926f, -1.111f)
                verticalLineTo(9.57f)
                lineToRelative(4.882f, 3.158f)
                verticalLineTo(8.742f)
                lineToRelative(-6.808f, -4.269f)
                lineToRelative(-6.808f, 4.265f)
                close()
                moveTo(12.0f, 0.0f)
                lineToRelative(10.375f, 5.999f)
                verticalLineTo(18.0f)
                lineTo(12.0f, 24.0f)
                lineTo(1.625f, 18.006f)
                verticalLineTo(6.003f)
                lineTo(12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _checkmk!!
    }

private var _checkmk: ImageVector? = null
