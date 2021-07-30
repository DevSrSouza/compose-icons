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

public val SimpleIcons.Klook: ImageVector
    get() {
        if (_klook != null) {
            return _klook!!
        }
        _klook = Builder(name = "Klook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.8f, 0.0f)
                arcTo(4.79f, 4.79f, 0.0f, false, false, 0.0f, 4.8f)
                verticalLineToRelative(14.4f)
                curveTo(0.0f, 21.86f, 2.14f, 24.0f, 4.8f, 24.0f)
                horizontalLineToRelative(14.4f)
                curveToRelative(2.66f, 0.0f, 4.8f, -2.14f, 4.8f, -4.8f)
                lineTo(24.0f, 4.8f)
                curveTo(24.0f, 2.14f, 21.86f, 0.0f, 19.2f, 0.0f)
                lineTo(4.8f, 0.0f)
                close()
                moveTo(12.0f, 3.449f)
                verticalLineToRelative(0.001f)
                curveToRelative(4.242f, 0.0f, 7.833f, 1.904f, 7.833f, 6.17f)
                curveToRelative(0.0f, 2.932f, -3.86f, 7.815f, -6.164f, 10.164f)
                curveToRelative(-0.99f, 1.008f, -2.32f, 1.036f, -3.338f, 0.0f)
                curveToRelative(-2.303f, -2.349f, -6.164f, -7.232f, -6.164f, -10.164f)
                curveToRelative(0.0f, -4.162f, 3.476f, -6.171f, 7.833f, -6.171f)
                close()
                moveTo(15.54f, 5.604f)
                lineToRelative(-5.05f, 4.96f)
                lineToRelative(5.05f, 4.956f)
                arcToRelative(1.84f, 1.84f, 0.0f, false, false, 0.0f, -2.634f)
                verticalLineToRelative(-0.001f)
                lineToRelative(-2.366f, -2.323f)
                lineToRelative(2.366f, -2.323f)
                arcToRelative(1.84f, 1.84f, 0.0f, false, false, 0.0f, -2.635f)
                close()
                moveTo(8.191f, 5.748f)
                verticalLineToRelative(9.772f)
                arcToRelative(1.86f, 1.86f, 0.0f, false, false, 1.868f, -1.852f)
                lineTo(10.059f, 7.602f)
                arcToRelative(1.86f, 1.86f, 0.0f, false, false, -1.866f, -1.854f)
                horizontalLineToRelative(-0.002f)
                close()
            }
        }
        .build()
        return _klook!!
    }

private var _klook: ImageVector? = null
