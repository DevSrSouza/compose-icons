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

public val SimpleIcons.Steamdeck: ImageVector
    get() {
        if (_steamdeck != null) {
            return _steamdeck!!
        }
        _steamdeck = Builder(name = "Steamdeck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.494f, 0.0f)
                verticalLineToRelative(4.309f)
                curveToRelative(4.242f, 0.0f, 7.694f, 3.45f, 7.694f, 7.691f)
                reflectiveCurveToRelative(-3.452f, 7.691f, -7.694f, 7.691f)
                lineTo(8.494f, 24.0f)
                curveToRelative(6.617f, 0.0f, 12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveToRelative(-5.383f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(19.313f, 3.62f)
                verticalLineToRelative(0.194f)
                horizontalLineToRelative(0.328f)
                verticalLineToRelative(0.893f)
                horizontalLineToRelative(0.228f)
                verticalLineToRelative(-0.893f)
                horizontalLineToRelative(0.33f)
                lineTo(20.199f, 3.62f)
                close()
                moveTo(20.35f, 3.62f)
                verticalLineToRelative(1.087f)
                horizontalLineToRelative(0.207f)
                verticalLineToRelative(-0.684f)
                lineToRelative(0.298f, 0.653f)
                horizontalLineToRelative(0.14f)
                lineToRelative(0.29f, -0.66f)
                verticalLineToRelative(0.691f)
                horizontalLineToRelative(0.219f)
                lineTo(21.504f, 3.619f)
                horizontalLineToRelative(-0.23f)
                lineToRelative(-0.338f, 0.772f)
                lineToRelative(-0.368f, -0.772f)
                close()
                moveTo(8.494f, 6.011f)
                arcToRelative(5.998f, 5.998f, 0.0f, false, false, -5.998f, 6.0f)
                arcToRelative(5.998f, 5.998f, 0.0f, true, false, 11.998f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _steamdeck!!
    }

private var _steamdeck: ImageVector? = null
