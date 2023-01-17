package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.DogBowl: ImageVector
    get() {
        if (_dogBowl != null) {
            return _dogBowl!!
        }
        _dogBowl = Builder(name = "DogBowl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 15.0f)
                lineToRelative(5.586f, -5.585f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 3.414f, -1.415f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -1.413f, 3.414f)
                lineToRelative(-3.587f, 3.586f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                lineToRelative(-3.586f, -3.585f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -3.414f, -1.415f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 1.413f, 3.414f)
                lineToRelative(3.587f, 3.586f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 20.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(-0.175f, -1.671f, -0.046f, -3.345f, -2.0f, -5.0f)
                horizontalLineToRelative(-14.0f)
                curveToRelative(-1.333f, 1.0f, -2.0f, 2.667f, -2.0f, 5.0f)
                close()
            }
        }
        .build()
        return _dogBowl!!
    }

private var _dogBowl: ImageVector? = null
