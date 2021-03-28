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

public val Octicons.Home16: ImageVector
    get() {
        if (_home16 != null) {
            return _home16!!
        }
        _home16 = Builder(name = "Home16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.156f, 1.835f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.312f, 0.0f)
                lineToRelative(-5.25f, 4.2f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.094f, 0.196f)
                verticalLineToRelative(7.019f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineTo(5.5f)
                verticalLineTo(8.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(5.25f)
                horizontalLineToRelative(2.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineTo(6.23f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.094f, -0.195f)
                lineToRelative(-5.25f, -4.2f)
                close()
                moveTo(6.906f, 0.664f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 2.187f, 0.0f)
                lineToRelative(5.25f, 4.2f)
                curveToRelative(0.415f, 0.332f, 0.657f, 0.835f, 0.657f, 1.367f)
                verticalLineToRelative(7.019f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 13.25f, 15.0f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(5.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-3.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 1.0f, 13.25f)
                verticalLineTo(6.23f)
                curveToRelative(0.0f, -0.531f, 0.242f, -1.034f, 0.657f, -1.366f)
                lineToRelative(5.25f, -4.2f)
                horizontalLineToRelative(-0.001f)
                close()
            }
        }
        .build()
        return _home16!!
    }

private var _home16: ImageVector? = null
