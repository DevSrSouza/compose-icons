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

public val Octicons.ArrowUpRight24: ImageVector
    get() {
        if (_arrowUpRight24 != null) {
            return _arrowUpRight24!!
        }
        _arrowUpRight24 = Builder(name = "ArrowUpRight24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.25f, 15.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.75f, -0.75f)
                verticalLineToRelative(-9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(7.19f)
                lineTo(6.22f, 16.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.06f, 1.06f)
                lineTo(17.5f, 7.56f)
                verticalLineToRelative(7.19f)
                curveToRelative(0.0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                close()
            }
        }
        .build()
        return _arrowUpRight24!!
    }

private var _arrowUpRight24: ImageVector? = null
