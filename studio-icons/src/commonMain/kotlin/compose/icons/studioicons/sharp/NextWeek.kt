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

public val SharpGroup.NextWeek: ImageVector
    get() {
        if (_nextWeek != null) {
            return _nextWeek!!
        }
        _nextWeek = Builder(name = "NextWeek", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(16.0f, 5.0f)
                curveToRelative(0.0f, -0.55f, -0.22f, -1.05f, -0.59f, -1.41f)
                curveTo(15.05f, 3.22f, 14.55f, 3.0f, 14.0f, 3.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 7.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 7.0f)
                close()
                moveTo(10.0f, 5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.0f, 5.0f)
                close()
                moveTo(11.0f, 18.5f)
                lineToRelative(-1.0f, -1.0f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(-3.0f, -3.0f)
                lineToRelative(1.0f, -1.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(-4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _nextWeek!!
    }

private var _nextWeek: ImageVector? = null
