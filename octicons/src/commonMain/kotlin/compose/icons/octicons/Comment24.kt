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

public val Octicons.Comment24: ImageVector
    get() {
        if (_comment24 != null) {
            return _comment24!!
        }
        _comment24 = Builder(name = "Comment24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.25f, 4.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(3.19f)
                lineToRelative(3.72f, -3.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.53f, -0.22f)
                horizontalLineToRelative(10.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(21.0f, 4.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                lineTo(3.25f, 4.0f)
                close()
                moveTo(1.5f, 4.25f)
                curveToRelative(0.0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(17.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(12.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.75f, 1.75f)
                horizontalLineToRelative(-9.69f)
                lineToRelative(-3.573f, 3.573f)
                arcTo(1.457f, 1.457f, 0.0f, false, true, 5.0f, 21.043f)
                lineTo(5.0f, 18.5f)
                lineTo(3.25f, 18.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.75f, -1.75f)
                lineTo(1.5f, 4.25f)
                close()
            }
        }
        .build()
        return _comment24!!
    }

private var _comment24: ImageVector? = null
