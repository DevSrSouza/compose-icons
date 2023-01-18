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

public val RemixIcons.DriveLine: ImageVector
    get() {
        if (_driveLine != null) {
            return _driveLine!!
        }
        _driveLine = Builder(name = "DriveLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.097f, 6.15f)
                lineTo(4.31f, 14.443f)
                lineToRelative(1.755f, 3.032f)
                lineToRelative(4.785f, -8.29f)
                lineTo(9.097f, 6.15f)
                close()
                moveTo(7.797f, 18.474f)
                horizontalLineToRelative(9.568f)
                lineToRelative(1.751f, -3.034f)
                lineTo(9.55f, 15.44f)
                lineToRelative(-1.752f, 3.034f)
                close()
                moveTo(19.111f, 13.44f)
                lineToRelative(-4.786f, -8.29f)
                lineTo(10.83f, 5.15f)
                lineToRelative(4.787f, 8.29f)
                horizontalLineToRelative(3.495f)
                close()
                moveTo(8.52f, 3.15f)
                horizontalLineToRelative(6.96f)
                lineTo(22.0f, 14.444f)
                lineToRelative(-3.48f, 6.03f)
                lineTo(5.49f, 20.474f)
                lineTo(2.0f, 14.444f)
                lineTo(8.52f, 3.15f)
                close()
                moveTo(12.005f, 11.186f)
                lineToRelative(-1.302f, 2.254f)
                horizontalLineToRelative(2.603f)
                lineToRelative(-1.301f, -2.254f)
                close()
            }
        }
        .build()
        return _driveLine!!
    }

private var _driveLine: ImageVector? = null
