package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.BellFill24: ImageVector
    get() {
        if (_bellFill24 != null) {
            return _bellFill24!!
        }
        _bellFill24 = Builder(name = "BellFill24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 12.0f, 0.0f)
                verticalLineToRelative(2.917f)
                curveToRelative(0.0f, 0.703f, 0.228f, 1.387f, 0.65f, 1.95f)
                lineTo(20.7f, 15.6f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.2f, 2.4f)
                horizontalLineToRelative(-15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.2f, -2.4f)
                lineToRelative(2.05f, -2.733f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 0.65f, -1.95f)
                close()
                moveTo(12.0f, 21.5f)
                arcTo(3.502f, 3.502f, 0.0f, false, true, 8.645f, 19.0f)
                horizontalLineToRelative(6.71f)
                arcTo(3.502f, 3.502f, 0.0f, false, true, 12.0f, 21.5f)
                close()
            }
        }
        .build()
        return _bellFill24!!
    }

private var _bellFill24: ImageVector? = null
