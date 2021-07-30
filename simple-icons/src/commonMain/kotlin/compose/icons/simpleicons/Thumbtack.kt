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

public val SimpleIcons.Thumbtack: ImageVector
    get() {
        if (_thumbtack != null) {
            return _thumbtack!!
        }
        _thumbtack = Builder(name = "Thumbtack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.18f, 6.38f)
                horizontalLineToRelative(11.69f)
                verticalLineToRelative(2.68f)
                lineTo(6.17f, 9.06f)
                close()
                moveTo(13.45f, 10.18f)
                verticalLineToRelative(3.14f)
                curveToRelative(0.0f, 3.23f, -0.02f, 3.74f, -0.14f, 4.36f)
                arcToRelative(7.95f, 7.95f, 0.0f, false, true, -1.3f, 2.87f)
                curveToRelative(-0.03f, 0.0f, -0.78f, -1.35f, -0.9f, -1.62f)
                curveToRelative(-0.17f, -0.4f, -0.3f, -0.8f, -0.4f, -1.25f)
                lineToRelative(-0.09f, -0.41f)
                lineToRelative(-0.02f, -5.78f)
                lineToRelative(0.16f, -0.2f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, true, 2.44f, -1.1f)
                close()
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _thumbtack!!
    }

private var _thumbtack: ImageVector? = null
