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

public val Octicons.Clippy16: ImageVector
    get() {
        if (_clippy16 != null) {
            return _clippy16!!
        }
        _clippy16 = Builder(name = "Clippy16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.75f, 1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.75f, -0.75f)
                verticalLineToRelative(-3.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(6.5f, 4.0f)
                lineTo(6.5f, 2.5f)
                horizontalLineToRelative(3.0f)
                lineTo(9.5f, 4.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(3.626f, 3.533f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.752f, -1.298f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 2.0f, 3.75f)
                verticalLineToRelative(9.5f)
                curveToRelative(0.0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(8.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 14.0f, 13.25f)
                verticalLineToRelative(-9.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -0.874f, -1.515f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -0.752f, 1.298f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.126f, 0.217f)
                verticalLineToRelative(9.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-8.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-9.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.126f, -0.217f)
                close()
            }
        }
        .build()
        return _clippy16!!
    }

private var _clippy16: ImageVector? = null
