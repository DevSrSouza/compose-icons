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

public val TablerIcons.Sailboat2: ImageVector
    get() {
        if (_sailboat2 != null) {
            return _sailboat2!!
        }
        _sailboat2 = Builder(name = "Sailboat2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 20.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, 1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, -1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 2.0f, -1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 2.0f, 1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, 1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, -1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 2.0f, -1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 2.0f, 1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, 1.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 2.0f, -1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 18.0f)
                lineToRelative(-1.0f, -3.0f)
                horizontalLineToRelative(18.0f)
                lineToRelative(-1.0f, 3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 11.0f)
                verticalLineToRelative(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 3.0f)
                curveToRelative(1.333f, 2.667f, 1.333f, 5.333f, 0.0f, 8.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.333f, -2.667f, 1.333f, -5.333f, 0.0f, -8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                horizontalLineToRelative(12.0f)
            }
        }
        .build()
        return _sailboat2!!
    }

private var _sailboat2: ImageVector? = null
