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

public val SimpleIcons.Wprocket: ImageVector
    get() {
        if (_wprocket != null) {
            return _wprocket!!
        }
        _wprocket = Builder(name = "Wprocket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.723f, 0.666f)
                curveToRelative(-0.08f, -0.276f, 0.08f, -0.47f, 0.356f, -0.47f)
                horizontalLineToRelative(2.283f)
                curveToRelative(0.16f, 0.0f, 0.31f, 0.137f, 0.356f, 0.274f)
                lineTo(8.393f, 7.07f)
                horizontalLineToRelative(0.08f)
                lineTo(11.491f, 0.218f)
                arcTo(0.374f, 0.374f, 0.0f, false, true, 11.824f, 0.0f)
                horizontalLineToRelative(0.356f)
                curveToRelative(0.172f, 0.0f, 0.287f, 0.092f, 0.333f, 0.218f)
                lineToRelative(3.018f, 6.85f)
                horizontalLineToRelative(0.08f)
                lineTo(17.286f, 0.47f)
                arcToRelative(0.397f, 0.397f, 0.0f, false, true, 0.356f, -0.275f)
                horizontalLineToRelative(2.284f)
                curveToRelative(0.275f, 0.0f, 0.424f, 0.195f, 0.355f, 0.47f)
                lineToRelative(-3.683f, 13.082f)
                arcToRelative(0.369f, 0.369f, 0.0f, false, true, -0.356f, 0.275f)
                horizontalLineToRelative(-0.31f)
                arcToRelative(0.38f, 0.38f, 0.0f, false, true, -0.333f, -0.218f)
                lineToRelative(-3.568f, -7.963f)
                horizontalLineToRelative(-0.058f)
                lineToRelative(-3.545f, 7.963f)
                arcToRelative(0.403f, 0.403f, 0.0f, false, true, -0.333f, 0.218f)
                horizontalLineToRelative(-0.31f)
                arcToRelative(0.379f, 0.379f, 0.0f, false, true, -0.356f, -0.275f)
                lineTo(3.723f, 0.666f)
                moveToRelative(8.308f, 7.917f)
                lineToRelative(-2.594f, 5.818f)
                arcToRelative(1.663f, 1.663f, 0.0f, false, true, -0.344f, 0.448f)
                verticalLineToRelative(0.004f)
                arcToRelative(1.466f, 1.466f, 0.0f, false, true, -0.688f, 0.34f)
                lineToRelative(1.4f, 8.687f)
                curveToRelative(0.091f, 0.16f, 0.263f, 0.16f, 0.367f, 0.0f)
                lineToRelative(1.79f, -2.72f)
                lineToRelative(1.64f, 2.708f)
                curveToRelative(0.104f, 0.16f, 0.265f, 0.16f, 0.368f, 0.0f)
                lineToRelative(1.584f, -8.698f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.832f, -0.618f)
                lineToRelative(-0.02f, -0.03f)
                arcToRelative(1.405f, 1.405f, 0.0f, false, true, -0.066f, -0.12f)
                lineToRelative(-0.609f, -1.366f)
                horizontalLineToRelative(-0.003f)
                close()
            }
        }
        .build()
        return _wprocket!!
    }

private var _wprocket: ImageVector? = null
