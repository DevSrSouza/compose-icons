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

public val SimpleIcons.Bitwarden: ImageVector
    get() {
        if (_bitwarden != null) {
            return _bitwarden!!
        }
        _bitwarden = Builder(name = "Bitwarden", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 0.0f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 0.0f, 3.75f)
                verticalLineToRelative(16.5f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 3.75f, 24.0f)
                horizontalLineToRelative(16.5f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 24.0f, 20.25f)
                lineTo(24.0f, 3.75f)
                arcTo(3.75f, 3.75f, 0.0f, false, false, 20.25f, 0.0f)
                close()
                moveTo(5.11f, 2.92f)
                horizontalLineToRelative(13.8f)
                curveToRelative(0.208f, 0.0f, 0.388f, 0.076f, 0.54f, 0.228f)
                arcToRelative(0.737f, 0.737f, 0.0f, false, true, 0.227f, 0.539f)
                verticalLineToRelative(9.2f)
                curveToRelative(0.0f, 0.687f, -0.134f, 1.367f, -0.401f, 2.042f)
                arcToRelative(7.618f, 7.618f, 0.0f, false, true, -0.995f, 1.797f)
                arcToRelative(11.097f, 11.097f, 0.0f, false, true, -1.413f, 1.528f)
                curveToRelative(-0.547f, 0.495f, -1.052f, 0.906f, -1.515f, 1.234f)
                curveToRelative(-0.464f, 0.327f, -0.947f, 0.636f, -1.45f, 0.928f)
                curveToRelative(-0.503f, 0.291f, -0.86f, 0.489f, -1.072f, 0.593f)
                curveToRelative(-0.212f, 0.104f, -0.381f, 0.184f, -0.51f, 0.24f)
                arcToRelative(0.687f, 0.687f, 0.0f, false, true, -0.31f, 0.071f)
                arcToRelative(0.688f, 0.688f, 0.0f, false, true, -0.312f, -0.072f)
                arcToRelative(13.784f, 13.784f, 0.0f, false, true, -0.51f, -0.24f)
                arcToRelative(20.61f, 20.61f, 0.0f, false, true, -1.071f, -0.592f)
                arcToRelative(19.133f, 19.133f, 0.0f, false, true, -1.45f, -0.928f)
                arcToRelative(16.457f, 16.457f, 0.0f, false, true, -1.515f, -1.234f)
                arcToRelative(11.11f, 11.11f, 0.0f, false, true, -1.414f, -1.528f)
                arcToRelative(7.617f, 7.617f, 0.0f, false, true, -0.994f, -1.797f)
                arcToRelative(5.502f, 5.502f, 0.0f, false, true, -0.401f, -2.042f)
                verticalLineToRelative(-9.2f)
                curveToRelative(0.0f, -0.208f, 0.076f, -0.387f, 0.227f, -0.54f)
                arcToRelative(0.737f, 0.737f, 0.0f, false, true, 0.54f, -0.227f)
                close()
                moveTo(12.01f, 5.22f)
                verticalLineToRelative(13.62f)
                curveToRelative(0.95f, -0.502f, 1.801f, -1.05f, 2.552f, -1.64f)
                curveToRelative(1.877f, -1.47f, 2.815f, -2.907f, 2.815f, -4.313f)
                lineTo(17.377f, 5.22f)
                close()
            }
        }
        .build()
        return _bitwarden!!
    }

private var _bitwarden: ImageVector? = null
