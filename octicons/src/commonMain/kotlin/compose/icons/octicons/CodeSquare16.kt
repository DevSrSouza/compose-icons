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

public val Octicons.CodeSquare16: ImageVector
    get() {
        if (_codeSquare16 != null) {
            return _codeSquare16!!
        }
        _codeSquare16 = Builder(name = "CodeSquare16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.75f, 1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(12.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(14.5f, 1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                lineTo(1.75f, 1.5f)
                close()
                moveTo(0.0f, 1.75f)
                curveTo(0.0f, 0.784f, 0.784f, 0.0f, 1.75f, 0.0f)
                horizontalLineToRelative(12.5f)
                curveTo(15.216f, 0.0f, 16.0f, 0.784f, 16.0f, 1.75f)
                verticalLineToRelative(12.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.25f, 16.0f)
                lineTo(1.75f, 16.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 14.25f)
                lineTo(0.0f, 1.75f)
                close()
                moveTo(9.22f, 5.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.06f)
                lineTo(10.69f, 8.0f)
                lineTo(9.22f, 9.47f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineToRelative(2.0f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.06f)
                lineToRelative(-2.0f, -2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 0.0f)
                close()
                moveTo(6.78f, 6.53f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineToRelative(-2.0f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.06f)
                lineToRelative(2.0f, 2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, -1.06f)
                lineTo(5.31f, 8.0f)
                lineToRelative(1.47f, -1.47f)
                close()
            }
        }
        .build()
        return _codeSquare16!!
    }

private var _codeSquare16: ImageVector? = null
