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

public val SimpleIcons.Byjus: ImageVector
    get() {
        if (_byjus != null) {
            return _byjus!!
        }
        _byjus = Builder(name = "Byjus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.327f, 0.016f)
                arcTo(2.325f, 2.325f, 0.0f, false, false, 0.0f, 2.34f)
                verticalLineToRelative(19.32f)
                arcToRelative(2.325f, 2.325f, 0.0f, false, false, 2.327f, 2.323f)
                horizontalLineToRelative(19.346f)
                arcTo(2.325f, 2.325f, 0.0f, false, false, 24.0f, 21.66f)
                lineTo(24.0f, 2.34f)
                arcTo(2.325f, 2.325f, 0.0f, false, false, 21.673f, 0.016f)
                close()
                moveTo(12.381f, 3.512f)
                arcToRelative(3.443f, 3.443f, 0.0f, false, true, 0.07f, 0.0f)
                arcToRelative(4.317f, 4.317f, 0.0f, false, true, 3.267f, 1.462f)
                arcToRelative(4.447f, 4.447f, 0.0f, false, true, 0.961f, 2.365f)
                arcToRelative(4.157f, 4.157f, 0.0f, false, true, -0.456f, 2.27f)
                arcToRelative(5.024f, 5.024f, 0.0f, false, true, 2.424f, 2.008f)
                arcToRelative(5.237f, 5.237f, 0.0f, false, true, 0.73f, 3.374f)
                arcToRelative(4.68f, 4.68f, 0.0f, false, true, -1.15f, 2.466f)
                arcToRelative(4.84f, 4.84f, 0.0f, false, true, -2.26f, 1.535f)
                lineToRelative(-4.987f, 1.439f)
                arcToRelative(1.494f, 1.494f, 0.0f, false, true, -0.41f, 0.058f)
                arcToRelative(1.497f, 1.497f, 0.0f, false, true, -1.432f, -1.075f)
                lineTo(5.524f, 6.909f)
                arcToRelative(1.487f, 1.487f, 0.0f, false, true, 1.018f, -1.841f)
                lineToRelative(4.956f, -1.429f)
                arcToRelative(3.443f, 3.443f, 0.0f, false, true, 0.883f, -0.127f)
                close()
                moveTo(12.629f, 4.373f)
                arcToRelative(3.091f, 3.091f, 0.0f, false, false, -0.855f, 0.122f)
                lineTo(6.94f, 5.888f)
                arcToRelative(0.744f, 0.744f, 0.0f, false, false, -0.51f, 0.922f)
                lineToRelative(3.53f, 12.206f)
                arcToRelative(0.745f, 0.745f, 0.0f, false, false, 0.921f, 0.509f)
                lineToRelative(4.664f, -1.345f)
                arcToRelative(4.085f, 4.085f, 0.0f, false, false, -0.896f, -8.003f)
                arcToRelative(3.297f, 3.297f, 0.0f, false, false, 1.138f, -2.272f)
                arcToRelative(3.479f, 3.479f, 0.0f, false, false, -0.928f, -2.549f)
                arcToRelative(2.989f, 2.989f, 0.0f, false, false, -2.23f, -0.983f)
                close()
            }
        }
        .build()
        return _byjus!!
    }

private var _byjus: ImageVector? = null
