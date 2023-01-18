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

public val RemixIcons.BehanceLine: ImageVector
    get() {
        if (_behanceLine != null) {
            return _behanceLine!!
        }
        _behanceLine = Builder(name = "BehanceLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                lineTo(3.0f, 7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(8.5f, 13.0f)
                lineTo(3.0f, 13.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                close()
                moveTo(10.563f, 11.572f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.5f, 19.0f)
                lineTo(1.0f, 19.0f)
                lineTo(1.0f, 5.0f)
                horizontalLineToRelative(6.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.063f, 6.572f)
                close()
                moveTo(15.5f, 6.0f)
                lineTo(21.0f, 6.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-5.5f)
                lineTo(15.5f, 6.0f)
                close()
                moveTo(23.0f, 14.5f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(0.25f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 20.7f, 16.0f)
                horizontalLineToRelative(2.134f)
                arcToRelative(4.752f, 4.752f, 0.0f, false, true, -9.334f, -1.25f)
                verticalLineToRelative(-1.5f)
                arcToRelative(4.75f, 4.75f, 0.0f, true, true, 9.5f, 0.0f)
                verticalLineToRelative(1.25f)
                close()
                moveTo(20.896f, 12.5f)
                arcToRelative(2.751f, 2.751f, 0.0f, false, false, -5.292f, 0.0f)
                horizontalLineToRelative(5.292f)
                close()
            }
        }
        .build()
        return _behanceLine!!
    }

private var _behanceLine: ImageVector? = null
