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

public val SimpleIcons.Kasasmart: ImageVector
    get() {
        if (_kasasmart != null) {
            return _kasasmart!!
        }
        _kasasmart = Builder(name = "Kasasmart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(-0.5f, 0.0f, -1.0f, 0.25f, -1.5f, 0.75f)
                lineTo(7.97f, 3.28f)
                lineToRelative(8.83f, 8.83f)
                curveToRelative(1.0f, 1.0f, 1.5f, 2.0f, 1.5f, 3.0f)
                lineTo(18.3f, 24.0f)
                horizontalLineToRelative(3.3f)
                curveToRelative(1.6f, 0.0f, 2.4f, -0.8f, 2.4f, -2.4f)
                verticalLineToRelative(-8.85f)
                curveToRelative(0.0f, -1.0f, -0.5f, -2.0f, -1.5f, -3.0f)
                lineToRelative(-9.0f, -9.0f)
                curveTo(13.0f, 0.25f, 12.5f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(6.9f, 4.34f)
                lineTo(2.89f, 8.37f)
                lineTo(9.6f, 15.1f)
                curveToRelative(1.0f, 1.0f, 1.5f, 2.0f, 1.5f, 3.0f)
                lineTo(11.1f, 24.0f)
                horizontalLineToRelative(5.7f)
                verticalLineToRelative(-8.89f)
                curveToRelative(-0.03f, -0.83f, -0.6f, -1.46f, -1.06f, -1.94f)
                lineTo(6.91f, 4.34f)
                close()
                moveTo(1.82f, 9.44f)
                lineToRelative(-0.32f, 0.31f)
                curveToRelative(-1.0f, 1.0f, -1.5f, 2.0f, -1.5f, 3.0f)
                verticalLineToRelative(8.85f)
                curveTo(0.0f, 23.2f, 0.8f, 24.0f, 2.4f, 24.0f)
                horizontalLineToRelative(7.2f)
                verticalLineToRelative(-5.9f)
                curveToRelative(-0.03f, -0.8f, -0.56f, -1.42f, -1.06f, -1.95f)
                close()
            }
        }
        .build()
        return _kasasmart!!
    }

private var _kasasmart: ImageVector? = null
