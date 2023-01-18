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

public val RemixIcons.HazeFill: ImageVector
    get() {
        if (_hazeFill != null) {
            return _hazeFill!!
        }
        _hazeFill = Builder(name = "HazeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.083f, 13.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.834f, 0.0f)
                lineTo(6.083f, 13.0f)
                close()
                moveTo(2.0f, 15.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(14.0f, 15.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(16.0f, 19.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(4.0f, 19.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 1.0f)
                close()
                moveTo(3.515f, 4.929f)
                lineToRelative(1.414f, -1.414f)
                lineTo(7.05f, 5.636f)
                lineTo(5.636f, 7.05f)
                lineTo(3.515f, 4.93f)
                close()
                moveTo(19.07f, 3.515f)
                lineToRelative(1.414f, 1.414f)
                lineToRelative(-2.121f, 2.121f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(2.121f, -2.121f)
                close()
                moveTo(23.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(4.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _hazeFill!!
    }

private var _hazeFill: ImageVector? = null
