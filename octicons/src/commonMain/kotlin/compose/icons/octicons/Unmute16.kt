package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Unmute16: ImageVector
    get() {
        if (_unmute16 != null) {
            return _unmute16!!
        }
        _unmute16 = Builder(name = "Unmute16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.563f, 2.069f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 8.0f, 2.75f)
                verticalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.238f, 0.57f)
                lineTo(3.472f, 11.0f)
                lineTo(1.75f, 11.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 9.25f)
                verticalLineToRelative(-2.5f)
                curveTo(0.0f, 5.784f, 0.784f, 5.0f, 1.75f, 5.0f)
                horizontalLineToRelative(1.723f)
                lineToRelative(3.289f, -2.82f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.801f, -0.111f)
                close()
                moveTo(6.5f, 4.38f)
                lineTo(4.238f, 6.319f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.488f, 0.181f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.488f, 0.18f)
                lineTo(6.5f, 11.62f)
                lineTo(6.5f, 4.38f)
                close()
                moveTo(12.596f, 2.342f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.314f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, -1.06f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 0.0f, -9.193f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                verticalLineToRelative(-0.001f)
                close()
                moveTo(11.536f, 4.463f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.061f, 1.061f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, 4.95f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.0f, -7.07f)
                lineToRelative(0.001f, -0.001f)
                close()
            }
        }
        .build()
        return _unmute16!!
    }

private var _unmute16: ImageVector? = null
