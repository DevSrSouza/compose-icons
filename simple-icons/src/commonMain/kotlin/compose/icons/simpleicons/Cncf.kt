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

public val SimpleIcons.Cncf: ImageVector
    get() {
        if (_cncf != null) {
            return _cncf!!
        }
        _cncf = Builder(name = "Cncf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                lineTo(8.004f, 0.0f)
                close()
                moveTo(3.431f, 3.431f)
                horizontalLineToRelative(4.544f)
                lineToRelative(0.029f, 0.023f)
                lineToRelative(4.544f, 4.544f)
                horizontalLineToRelative(3.03f)
                lineToRelative(-4.572f, -4.567f)
                horizontalLineToRelative(9.569f)
                verticalLineToRelative(9.563f)
                lineToRelative(-0.789f, -0.782f)
                lineToRelative(-3.784f, -3.79f)
                verticalLineToRelative(3.03f)
                lineToRelative(2.271f, 2.272f)
                lineToRelative(2.272f, 2.272f)
                lineToRelative(0.029f, 0.03f)
                verticalLineToRelative(4.543f)
                horizontalLineToRelative(-4.55f)
                lineToRelative(-0.023f, -0.023f)
                lineToRelative(-2.272f, -2.278f)
                lineToRelative(-2.272f, -2.272f)
                lineTo(8.427f, 15.996f)
                lineToRelative(3.785f, 3.79f)
                lineToRelative(0.782f, 0.783f)
                lineTo(3.43f, 20.569f)
                verticalLineToRelative(-9.563f)
                lineToRelative(4.573f, 4.567f)
                verticalLineToRelative(-3.031f)
                lineToRelative(-4.55f, -4.544f)
                lineToRelative(-0.023f, -0.023f)
                close()
            }
        }
        .build()
        return _cncf!!
    }

private var _cncf: ImageVector? = null
