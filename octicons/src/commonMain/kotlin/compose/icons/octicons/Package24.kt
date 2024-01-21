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

public val Octicons.Package24: ImageVector
    get() {
        if (_package24 != null) {
            return _package24!!
        }
        _package24 = Builder(name = "Package24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.876f, 0.64f)
                lineTo(12.876f, 0.639f)
                lineToRelative(8.25f, 4.763f)
                curveToRelative(0.541f, 0.313f, 0.875f, 0.89f, 0.875f, 1.515f)
                verticalLineToRelative(9.525f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -0.875f, 1.516f)
                lineToRelative(-8.25f, 4.762f)
                arcToRelative(1.748f, 1.748f, 0.0f, false, true, -1.75f, 0.0f)
                lineToRelative(-8.25f, -4.763f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -0.875f, -1.515f)
                lineTo(2.001f, 6.917f)
                curveToRelative(0.0f, -0.625f, 0.334f, -1.202f, 0.875f, -1.515f)
                lineTo(11.126f, 0.64f)
                arcToRelative(1.748f, 1.748f, 0.0f, false, true, 1.75f, 0.0f)
                close()
                moveTo(11.876f, 1.938f)
                lineTo(4.251f, 6.34f)
                lineToRelative(7.75f, 4.474f)
                lineToRelative(7.75f, -4.474f)
                lineToRelative(-7.625f, -4.402f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, false, -0.25f, 0.0f)
                close()
                moveTo(12.751f, 21.061f)
                lineTo(20.376f, 16.659f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.125f, -0.216f)
                lineTo(20.501f, 7.639f)
                lineToRelative(-7.75f, 4.474f)
                close()
                moveTo(3.501f, 7.64f)
                verticalLineToRelative(8.803f)
                curveToRelative(0.0f, 0.09f, 0.048f, 0.172f, 0.125f, 0.216f)
                lineToRelative(7.625f, 4.402f)
                verticalLineToRelative(-8.947f)
                close()
            }
        }
        .build()
        return _package24!!
    }

private var _package24: ImageVector? = null
