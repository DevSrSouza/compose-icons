package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BeerFilled: ImageVector
    get() {
        if (_beerFilled != null) {
            return _beerFilled!!
        }
        _beerFilled = Builder(name = "BeerFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.995f, 1.85f)
                lineToRelative(0.005f, 0.15f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.335f, -0.229f, 2.386f, -0.774f, 3.692f)
                lineToRelative(-0.157f, 0.363f)
                lineToRelative(-0.31f, 0.701f)
                arcToRelative(8.902f, 8.902f, 0.0f, false, false, -0.751f, 3.242f)
                lineToRelative(-0.008f, 0.377f)
                verticalLineToRelative(3.625f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.85f, 1.995f)
                lineToRelative(-0.15f, 0.005f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.995f, -1.85f)
                lineToRelative(-0.005f, -0.15f)
                verticalLineToRelative(-3.625f)
                curveToRelative(0.0f, -1.132f, -0.21f, -2.25f, -0.617f, -3.28f)
                lineToRelative(-0.142f, -0.34f)
                lineToRelative(-0.31f, -0.699f)
                curveToRelative(-0.604f, -1.358f, -0.883f, -2.41f, -0.925f, -3.698f)
                lineToRelative(-0.006f, -0.358f)
                verticalLineToRelative(-4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.85f, -1.995f)
                lineToRelative(0.15f, -0.005f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(17.0f, 4.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _beerFilled!!
    }

private var _beerFilled: ImageVector? = null
