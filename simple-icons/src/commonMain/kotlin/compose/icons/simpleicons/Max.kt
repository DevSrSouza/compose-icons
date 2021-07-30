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

public val SimpleIcons.Max: ImageVector
    get() {
        if (_max != null) {
            return _max!!
        }
        _max = Builder(name = "Max", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.769f, 0.0f)
                arcTo(1.77f, 1.77f, 0.0f, false, false, 0.0f, 1.769f)
                lineTo(0.0f, 22.23f)
                arcTo(1.77f, 1.77f, 0.0f, false, false, 1.769f, 24.0f)
                lineTo(22.23f, 24.0f)
                arcTo(1.77f, 1.77f, 0.0f, false, false, 24.0f, 22.231f)
                lineTo(24.0f, 1.77f)
                arcTo(1.77f, 1.77f, 0.0f, false, false, 22.231f, 0.0f)
                close()
                moveTo(14.254f, 3.28f)
                arcToRelative(4.301f, 4.301f, 0.0f, false, true, 4.3f, 4.302f)
                arcToRelative(4.301f, 4.301f, 0.0f, false, true, -1.993f, 3.63f)
                arcToRelative(6.085f, 6.085f, 0.0f, false, true, 1.054f, 3.422f)
                arcToRelative(6.085f, 6.085f, 0.0f, false, true, -6.085f, 6.085f)
                arcToRelative(6.085f, 6.085f, 0.0f, false, true, -6.085f, -6.085f)
                arcToRelative(6.085f, 6.085f, 0.0f, false, true, 4.66f, -5.916f)
                arcToRelative(4.301f, 4.301f, 0.0f, false, true, -0.152f, -1.136f)
                arcToRelative(4.301f, 4.301f, 0.0f, false, true, 4.301f, -4.301f)
                close()
                moveTo(14.254f, 5.129f)
                arcToRelative(2.453f, 2.453f, 0.0f, false, false, -2.453f, 2.453f)
                arcToRelative(2.453f, 2.453f, 0.0f, false, false, 2.453f, 2.453f)
                arcToRelative(2.453f, 2.453f, 0.0f, false, false, 2.453f, -2.453f)
                arcToRelative(2.453f, 2.453f, 0.0f, false, false, -2.453f, -2.453f)
                close()
                moveTo(11.53f, 10.397f)
                arcToRelative(4.237f, 4.237f, 0.0f, false, false, -4.237f, 4.237f)
                arcToRelative(4.237f, 4.237f, 0.0f, false, false, 4.237f, 4.237f)
                arcToRelative(4.237f, 4.237f, 0.0f, false, false, 4.237f, -4.237f)
                arcToRelative(4.237f, 4.237f, 0.0f, false, false, -4.237f, -4.237f)
                close()
                moveTo(11.562f, 12.937f)
                arcToRelative(1.781f, 1.781f, 0.0f, true, true, 0.0f, 3.562f)
                arcToRelative(1.781f, 1.781f, 0.0f, false, true, 0.0f, -3.562f)
                close()
            }
        }
        .build()
        return _max!!
    }

private var _max: ImageVector? = null
