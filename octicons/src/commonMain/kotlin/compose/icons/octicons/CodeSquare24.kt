package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.CodeSquare24: ImageVector
    get() {
        if (_codeSquare24 != null) {
            return _codeSquare24!!
        }
        _codeSquare24 = Builder(name = "CodeSquare24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.3f, 8.24f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.04f, 1.06f)
                lineTo(7.352f, 12.0f)
                lineToRelative(2.908f, 2.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.02f, 1.1f)
                lineToRelative(-3.5f, -3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.1f)
                lineToRelative(3.5f, -3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.04f)
                close()
                moveTo(13.74f, 9.3f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.02f, -1.1f)
                lineToRelative(3.5f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.1f)
                lineToRelative(-3.5f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.02f, -1.1f)
                lineToRelative(2.908f, -2.7f)
                lineToRelative(-2.908f, -2.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.75f)
                curveTo(2.0f, 2.784f, 2.784f, 2.0f, 3.75f, 2.0f)
                horizontalLineToRelative(16.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(16.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 20.25f, 22.0f)
                lineTo(3.75f, 22.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 2.0f, 20.25f)
                close()
                moveTo(3.75f, 3.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(16.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(20.5f, 3.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
            }
        }
        .build()
        return _codeSquare24!!
    }

private var _codeSquare24: ImageVector? = null
