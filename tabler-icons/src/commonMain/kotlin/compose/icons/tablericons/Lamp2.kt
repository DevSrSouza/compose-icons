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

public val TablerIcons.Lamp2: ImageVector
    get() {
        if (_lamp2 != null) {
            return _lamp2!!
        }
        _lamp2 = Builder(name = "Lamp2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 21.0f)
                horizontalLineToRelative(9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 21.0f)
                lineToRelative(-7.0f, -8.0f)
                lineToRelative(8.5f, -5.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 14.0f)
                curveToRelative(-2.148f, -2.148f, -2.148f, -5.852f, 0.0f, -8.0f)
                curveToRelative(2.088f, -2.088f, 5.842f, -1.972f, 8.0f, 0.0f)
                lineToRelative(-8.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.742f, 7.574f)
                lineToRelative(-1.156f, -1.156f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.828f, -2.829f)
                lineToRelative(1.144f, 1.144f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 12.0f)
                lineToRelative(0.208f, 0.274f)
                arcToRelative(2.527f, 2.527f, 0.0f, false, false, 3.556f, 0.0f)
                curveToRelative(0.939f, -0.933f, 0.98f, -2.42f, 0.122f, -3.4f)
                lineToRelative(-0.366f, -0.369f)
            }
        }
        .build()
        return _lamp2!!
    }

private var _lamp2: ImageVector? = null
