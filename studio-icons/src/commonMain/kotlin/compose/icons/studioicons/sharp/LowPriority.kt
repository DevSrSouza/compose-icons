package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.LowPriority: ImageVector
    get() {
        if (_lowPriority != null) {
            return _lowPriority!!
        }
        _lowPriority = Builder(name = "LowPriority", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(14.0f, 5.0f)
                close()
                moveTo(14.0f, 10.5f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(14.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(2.0f, 11.5f)
                curveTo(2.0f, 15.08f, 4.92f, 18.0f, 8.5f, 18.0f)
                lineTo(9.0f, 18.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(-3.0f, -3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-0.5f)
                curveTo(6.02f, 16.0f, 4.0f, 13.98f, 4.0f, 11.5f)
                reflectiveCurveTo(6.02f, 7.0f, 8.5f, 7.0f)
                lineTo(12.0f, 7.0f)
                lineTo(12.0f, 5.0f)
                lineTo(8.5f, 5.0f)
                curveTo(4.92f, 5.0f, 2.0f, 7.92f, 2.0f, 11.5f)
                close()
            }
        }
        .build()
        return _lowPriority!!
    }

private var _lowPriority: ImageVector? = null
