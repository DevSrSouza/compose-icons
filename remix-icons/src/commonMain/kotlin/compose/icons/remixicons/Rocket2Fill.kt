package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.Rocket2Fill: ImageVector
    get() {
        if (_rocket2Fill != null) {
            return _rocket2Fill!!
        }
        _rocket2Fill = Builder(name = "Rocket2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.498f, 20.0f)
                horizontalLineToRelative(7.004f)
                arcTo(6.523f, 6.523f, 0.0f, false, true, 12.0f, 23.502f)
                arcTo(6.523f, 6.523f, 0.0f, false, true, 8.498f, 20.0f)
                close()
                moveTo(18.0f, 14.805f)
                lineToRelative(2.0f, 2.268f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-1.927f)
                lineToRelative(2.0f, -2.268f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, -3.483f, 2.504f, -6.447f, 6.0f, -7.545f)
                curveTo(15.496f, 2.553f, 18.0f, 5.517f, 18.0f, 9.0f)
                verticalLineToRelative(5.805f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _rocket2Fill!!
    }

private var _rocket2Fill: ImageVector? = null
