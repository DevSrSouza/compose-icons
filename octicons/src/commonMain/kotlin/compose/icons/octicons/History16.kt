package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.History16: ImageVector
    get() {
        if (_history16 != null) {
            return _history16!!
        }
        _history16 = Builder(name = "History16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.643f, 3.143f)
                lineTo(0.427f, 1.927f)
                arcTo(0.25f, 0.25f, 0.0f, false, false, 0.0f, 2.104f)
                verticalLineTo(5.75f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(3.646f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.177f, -0.427f)
                lineTo(2.715f, 4.215f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, -1.18f, 4.458f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.493f, 0.154f)
                arcToRelative(8.001f, 8.001f, 0.0f, true, false, 1.6f, -5.684f)
                close()
                moveTo(7.75f, 4.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(2.992f)
                lineToRelative(2.028f, 0.812f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.557f, 1.392f)
                lineToRelative(-2.5f, -1.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 7.0f, 8.25f)
                verticalLineToRelative(-3.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 7.75f, 4.0f)
                close()
            }
        }
        .build()
        return _history16!!
    }

private var _history16: ImageVector? = null
