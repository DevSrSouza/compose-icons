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

public val RemixIcons.Rocket2Line: ImageVector
    get() {
        if (_rocket2Line != null) {
            return _rocket2Line!!
        }
        _rocket2Line = Builder(name = "Rocket2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.502f, 20.0f)
                arcTo(6.523f, 6.523f, 0.0f, false, true, 12.0f, 23.502f)
                arcTo(6.523f, 6.523f, 0.0f, false, true, 8.498f, 20.0f)
                horizontalLineToRelative(2.26f)
                curveToRelative(0.326f, 0.489f, 0.747f, 0.912f, 1.242f, 1.243f)
                curveToRelative(0.495f, -0.33f, 0.916f, -0.754f, 1.243f, -1.243f)
                horizontalLineToRelative(2.259f)
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
                moveTo(17.27f, 17.0f)
                lineTo(16.0f, 15.56f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, -2.318f, -1.57f, -4.43f, -4.0f, -5.42f)
                curveTo(9.57f, 4.57f, 8.0f, 6.681f, 8.0f, 9.0f)
                verticalLineToRelative(6.56f)
                lineTo(6.73f, 17.0f)
                horizontalLineToRelative(10.54f)
                close()
                moveTo(12.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _rocket2Line!!
    }

private var _rocket2Line: ImageVector? = null
