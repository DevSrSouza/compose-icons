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

public val SimpleIcons.Retroarch: ImageVector
    get() {
        if (_retroarch != null) {
            return _retroarch!!
        }
        _retroarch = Builder(name = "Retroarch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.84f, 5.76f)
                lineTo(8.4f, 7.68f)
                lineTo(5.28f, 7.68f)
                lineToRelative(-0.72f, 2.88f)
                lineTo(2.64f, 10.56f)
                lineToRelative(0.72f, -2.88f)
                lineTo(1.44f, 7.68f)
                lineTo(0.0f, 13.44f)
                horizontalLineToRelative(3.84f)
                lineToRelative(-0.48f, 1.92f)
                horizontalLineToRelative(3.36f)
                lineTo(4.2f, 18.24f)
                horizontalLineToRelative(2.82f)
                lineToRelative(2.34f, -2.88f)
                horizontalLineToRelative(5.28f)
                lineToRelative(2.34f, 2.88f)
                horizontalLineToRelative(2.82f)
                lineToRelative(-2.52f, -2.88f)
                horizontalLineToRelative(3.36f)
                lineToRelative(-0.48f, -1.92f)
                lineTo(24.0f, 13.44f)
                lineToRelative(-1.44f, -5.76f)
                horizontalLineToRelative(-1.92f)
                lineToRelative(0.72f, 2.88f)
                horizontalLineToRelative(-1.92f)
                lineToRelative(-0.72f, -2.88f)
                lineTo(15.6f, 7.68f)
                lineToRelative(1.56f, -1.92f)
                horizontalLineToRelative(-2.04f)
                lineToRelative(-1.68f, 1.92f)
                horizontalLineToRelative(-2.88f)
                lineTo(8.88f, 5.76f)
                close()
                moveTo(7.08f, 9.6f)
                lineTo(9.0f, 9.6f)
                verticalLineToRelative(1.92f)
                lineTo(7.08f, 11.52f)
                close()
                moveTo(15.005f, 9.6f)
                horizontalLineToRelative(1.92f)
                verticalLineToRelative(1.92f)
                horizontalLineToRelative(-1.92f)
                close()
            }
        }
        .build()
        return _retroarch!!
    }

private var _retroarch: ImageVector? = null
