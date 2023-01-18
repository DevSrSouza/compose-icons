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

public val IonIcons.LockClosedSharp: ImageVector
    get() {
        if (_lockClosedSharp != null) {
            return _lockClosedSharp!!
        }
        _lockClosedSharp = Builder(name = "LockClosedSharp", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(420.0f, 192.0f)
                lineTo(352.0f, 192.0f)
                lineTo(352.0f, 112.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, -192.0f, 0.0f)
                verticalLineToRelative(80.0f)
                lineTo(92.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                lineTo(80.0f, 484.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(420.0f, 496.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(432.0f, 204.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 420.0f, 192.0f)
                close()
                moveTo(314.0f, 192.0f)
                lineTo(198.0f, 192.0f)
                lineTo(198.0f, 111.25f)
                arcToRelative(58.0f, 58.0f, 0.0f, true, true, 116.0f, 0.0f)
                close()
            }
        }
        .build()
        return _lockClosedSharp!!
    }

private var _lockClosedSharp: ImageVector? = null
