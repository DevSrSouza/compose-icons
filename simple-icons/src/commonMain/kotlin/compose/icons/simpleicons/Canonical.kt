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

public val SimpleIcons.Canonical: ImageVector
    get() {
        if (_canonical != null) {
            return _canonical!!
        }
        _canonical = Builder(name = "Canonical", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.427f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(15.146f)
                lineTo(19.573f, 0.0f)
                close()
                moveTo(14.421f, 10.25f)
                arcToRelative(1.568f, 1.568f, 0.0f, false, true, 1.567f, 1.568f)
                arcToRelative(1.568f, 1.568f, 0.0f, false, true, -1.567f, 1.568f)
                arcToRelative(1.568f, 1.568f, 0.0f, false, true, -1.568f, -1.568f)
                arcToRelative(1.568f, 1.568f, 0.0f, false, true, 1.568f, -1.568f)
                close()
                moveTo(12.264f, 10.41f)
                curveToRelative(0.122f, 0.0f, 0.245f, 0.005f, 0.369f, 0.015f)
                arcToRelative(2.268f, 2.268f, 0.0f, false, false, -0.476f, 1.271f)
                arcToRelative(3.825f, 3.825f, 0.0f, false, false, -3.08f, 1.647f)
                arcToRelative(2.243f, 2.243f, 0.0f, false, false, -1.308f, -0.335f)
                arcToRelative(5.159f, 5.159f, 0.0f, false, true, 4.495f, -2.599f)
                close()
                moveTo(16.506f, 12.706f)
                arcToRelative(5.14f, 5.14f, 0.0f, false, true, 0.74f, 3.905f)
                arcToRelative(5.139f, 5.139f, 0.0f, false, true, -0.997f, 2.113f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -0.75f, -1.167f)
                arcToRelative(3.837f, 3.837f, 0.0f, false, false, 0.125f, -3.818f)
                arcToRelative(2.26f, 2.26f, 0.0f, false, false, 0.882f, -1.033f)
                close()
                moveTo(7.89f, 13.688f)
                arcToRelative(1.568f, 1.568f, 0.0f, false, true, 1.568f, 1.568f)
                arcToRelative(1.568f, 1.568f, 0.0f, false, true, -1.568f, 1.568f)
                arcToRelative(1.568f, 1.568f, 0.0f, false, true, -1.567f, -1.568f)
                arcToRelative(1.568f, 1.568f, 0.0f, false, true, 1.567f, -1.568f)
                close()
                moveTo(8.823f, 17.306f)
                arcToRelative(3.818f, 3.818f, 0.0f, false, false, 2.604f, 1.986f)
                curveToRelative(0.127f, 0.027f, 0.256f, 0.048f, 0.385f, 0.063f)
                curveToRelative(0.01f, 0.476f, 0.17f, 0.932f, 0.459f, 1.31f)
                arcToRelative(5.161f, 5.161f, 0.0f, false, true, -1.114f, -0.114f)
                arcToRelative(5.105f, 5.105f, 0.0f, false, true, -3.675f, -3.08f)
                arcToRelative(2.26f, 2.26f, 0.0f, false, false, 1.34f, -0.165f)
                close()
                moveTo(14.067f, 17.733f)
                arcToRelative(1.568f, 1.568f, 0.0f, false, true, 1.568f, 1.568f)
                arcToRelative(1.568f, 1.568f, 0.0f, false, true, -1.568f, 1.568f)
                arcTo(1.568f, 1.568f, 0.0f, false, true, 12.5f, 19.3f)
                arcToRelative(1.568f, 1.568f, 0.0f, false, true, 1.568f, -1.568f)
                close()
            }
        }
        .build()
        return _canonical!!
    }

private var _canonical: ImageVector? = null
