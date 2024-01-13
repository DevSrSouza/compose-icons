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

public val SimpleIcons.Nextui: ImageVector
    get() {
        if (_nextui != null) {
            return _nextui!!
        }
        _nextui = Builder(name = "Nextui", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.353f, 0.0f)
                horizontalLineToRelative(11.294f)
                arcTo(6.353f, 6.353f, 0.0f, false, true, 24.0f, 6.353f)
                verticalLineToRelative(11.294f)
                arcTo(6.353f, 6.353f, 0.0f, false, true, 17.647f, 24.0f)
                lineTo(6.353f, 24.0f)
                arcTo(6.353f, 6.353f, 0.0f, false, true, 0.0f, 17.647f)
                lineTo(0.0f, 6.353f)
                arcTo(6.353f, 6.353f, 0.0f, false, true, 6.353f, 0.0f)
                close()
                moveTo(14.108f, 6.913f)
                horizontalLineToRelative(-0.933f)
                verticalLineToRelative(6.702f)
                arcToRelative(2.88f, 2.88f, 0.0f, false, true, -0.362f, 1.45f)
                curveToRelative(-0.24f, 0.424f, -0.596f, 0.77f, -1.025f, 1.0f)
                curveToRelative(-0.443f, 0.244f, -0.96f, 0.365f, -1.553f, 0.365f)
                curveToRelative(-0.592f, 0.0f, -1.108f, -0.121f, -1.55f, -0.364f)
                arcToRelative(2.603f, 2.603f, 0.0f, false, true, -1.024f, -1.0f)
                arcToRelative(2.865f, 2.865f, 0.0f, false, true, -0.365f, -1.45f)
                lineTo(7.296f, 6.912f)
                horizontalLineToRelative(-0.933f)
                verticalLineToRelative(6.767f)
                arcToRelative(3.558f, 3.558f, 0.0f, false, false, 0.489f, 1.862f)
                curveToRelative(0.327f, 0.547f, 0.798f, 0.994f, 1.362f, 1.292f)
                curveToRelative(0.582f, 0.316f, 1.256f, 0.474f, 2.021f, 0.474f)
                curveToRelative(0.769f, 0.0f, 1.444f, -0.157f, 2.024f, -0.471f)
                arcToRelative(3.473f, 3.473f, 0.0f, false, false, 1.36f, -1.293f)
                curveToRelative(0.33f, -0.565f, 0.5f, -1.21f, 0.49f, -1.864f)
                lineTo(14.109f, 6.913f)
                close()
                moveTo(17.756f, 17.133f)
                lineTo(17.756f, 6.914f)
                horizontalLineToRelative(-0.933f)
                verticalLineToRelative(10.22f)
                horizontalLineToRelative(0.933f)
                close()
            }
        }
        .build()
        return _nextui!!
    }

private var _nextui: ImageVector? = null
