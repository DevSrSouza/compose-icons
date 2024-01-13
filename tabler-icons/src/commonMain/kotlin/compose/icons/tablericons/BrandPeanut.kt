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

public val TablerIcons.BrandPeanut: ImageVector
    get() {
        if (_brandPeanut != null) {
            return _brandPeanut!!
        }
        _brandPeanut = Builder(name = "BrandPeanut", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 16.25f)
                lineToRelative(-0.816f, -0.36f)
                lineToRelative(-0.462f, -0.196f)
                curveToRelative(-1.444f, -0.592f, -2.0f, -0.593f, -3.447f, 0.0f)
                lineToRelative(-0.462f, 0.195f)
                lineToRelative(-0.817f, 0.359f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 0.0f, -8.49f)
                verticalLineToRelative(0.0f)
                lineToRelative(1.054f, 0.462f)
                lineToRelative(0.434f, 0.178f)
                curveToRelative(1.292f, 0.507f, 1.863f, 0.48f, 3.237f, -0.082f)
                lineToRelative(0.462f, -0.195f)
                lineToRelative(0.817f, -0.359f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 0.0f, 8.49f)
            }
        }
        .build()
        return _brandPeanut!!
    }

private var _brandPeanut: ImageVector? = null
