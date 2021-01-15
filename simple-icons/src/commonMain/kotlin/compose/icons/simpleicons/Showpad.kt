package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Showpad: ImageVector
    get() {
        if (_showpad != null) {
            return _showpad!!
        }
        _showpad = Builder(name = "Showpad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                verticalLineTo(11.66f)
                lineToRelative(-0.03f, -0.24f)
                arcToRelative(5.48f, 5.48f, 0.0f, false, false, -4.88f, -4.89f)
                lineToRelative(-0.24f, -0.01f)
                horizontalLineToRelative(-0.05f)
                lineToRelative(-0.27f, -0.01f)
                arcToRelative(5.45f, 5.45f, 0.0f, false, false, -3.88f, 1.6f)
                lineTo(12.8f, 9.97f)
                lineToRelative(1.35f, 1.36f)
                lineToRelative(1.35f, -1.35f)
                horizontalLineToRelative(-0.01f)
                lineToRelative(0.5f, -0.51f)
                arcToRelative(3.55f, 3.55f, 0.0f, false, true, 2.53f, -1.05f)
                horizontalLineToRelative(0.2f)
                lineToRelative(0.16f, 0.01f)
                arcToRelative(3.58f, 3.58f, 0.0f, false, true, 3.2f, 3.19f)
                verticalLineTo(12.35f)
                arcToRelative(3.58f, 3.58f, 0.0f, false, true, -2.0f, 2.84f)
                lineToRelative(-0.03f, 0.02f)
                lineToRelative(-0.1f, 0.04f)
                lineToRelative(-0.07f, 0.03f)
                lineToRelative(-0.06f, 0.03f)
                lineToRelative(-0.11f, 0.04f)
                horizontalLineToRelative(-0.03f)
                arcToRelative(3.58f, 3.58f, 0.0f, false, true, -3.69f, -0.84f)
                lineToRelative(-0.5f, -0.5f)
                lineToRelative(-3.37f, -3.36f)
                lineToRelative(-5.38f, -5.39f)
                lineToRelative(-1.35f, 1.35f)
                lineTo(0.0f, 12.0f)
                lineToRelative(1.35f, 1.35f)
                lineToRelative(5.39f, 5.39f)
                lineToRelative(1.34f, -1.35f)
                lineToRelative(3.37f, -3.37f)
                lineToRelative(-1.34f, -1.35f)
                lineToRelative(-3.37f, 3.37f)
                lineTo(2.7f, 12.0f)
                lineToRelative(4.04f, -4.04f)
                lineToRelative(2.02f, 2.02f)
                lineToRelative(5.39f, 5.39f)
                lineToRelative(0.5f, 0.5f)
                arcToRelative(5.46f, 5.46f, 0.0f, false, false, 5.65f, 1.3f)
                lineToRelative(0.05f, -0.01f)
                lineToRelative(0.16f, -0.07f)
                lineToRelative(0.1f, -0.04f)
                lineToRelative(0.11f, -0.04f)
                lineToRelative(0.16f, -0.07f)
                lineToRelative(0.05f, -0.03f)
                arcToRelative(5.47f, 5.47f, 0.0f, false, false, 3.04f, -4.35f)
                verticalLineToRelative(-0.01f)
                lineToRelative(0.02f, -0.24f)
                verticalLineToRelative(-0.04f)
                verticalLineTo(12.0f)
                horizontalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _showpad!!
    }

private var _showpad: ImageVector? = null
