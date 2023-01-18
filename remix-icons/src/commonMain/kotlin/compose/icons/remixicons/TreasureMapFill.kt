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

public val RemixIcons.TreasureMapFill: ImageVector
    get() {
        if (_treasureMapFill != null) {
            return _treasureMapFill!!
        }
        _treasureMapFill = Builder(name = "TreasureMapFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.0f)
                lineToRelative(7.0f, -3.0f)
                lineToRelative(6.0f, 3.0f)
                lineToRelative(6.303f, -2.701f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.697f, 0.46f)
                lineTo(22.0f, 19.0f)
                lineToRelative(-7.0f, 3.0f)
                lineToRelative(-6.0f, -3.0f)
                lineToRelative(-6.303f, 2.701f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.697f, -0.46f)
                lineTo(2.0f, 5.0f)
                close()
                moveTo(6.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                lineTo(6.0f, 11.0f)
                close()
                moveTo(10.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(16.0f, 10.94f)
                lineToRelative(-1.237f, -1.238f)
                lineToRelative(-1.061f, 1.06f)
                lineTo(14.939f, 12.0f)
                lineToRelative(-1.237f, 1.237f)
                lineToRelative(1.06f, 1.061f)
                lineTo(16.0f, 13.061f)
                lineToRelative(1.237f, 1.237f)
                lineToRelative(1.061f, -1.06f)
                lineTo(17.061f, 12.0f)
                lineToRelative(1.237f, -1.237f)
                lineToRelative(-1.06f, -1.061f)
                lineTo(16.0f, 10.939f)
                close()
            }
        }
        .build()
        return _treasureMapFill!!
    }

private var _treasureMapFill: ImageVector? = null
