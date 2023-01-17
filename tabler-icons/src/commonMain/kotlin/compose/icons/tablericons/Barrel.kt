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

public val TablerIcons.Barrel: ImageVector
    get() {
        if (_barrel != null) {
            return _barrel!!
        }
        _barrel = Builder(name = "Barrel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.278f, 4.0f)
                horizontalLineToRelative(9.444f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.841f, 1.22f)
                curveToRelative(0.958f, 2.26f, 1.437f, 4.52f, 1.437f, 6.78f)
                curveToRelative(0.0f, 2.26f, -0.479f, 4.52f, -1.437f, 6.78f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.841f, 1.22f)
                horizontalLineToRelative(-9.444f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.841f, -1.22f)
                curveToRelative(-0.958f, -2.26f, -1.437f, -4.52f, -1.437f, -6.78f)
                curveToRelative(0.0f, -2.26f, 0.479f, -4.52f, 1.437f, -6.78f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.841f, -1.22f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 4.0f)
                curveToRelative(0.667f, 2.667f, 1.0f, 5.333f, 1.0f, 8.0f)
                reflectiveCurveToRelative(-0.333f, 5.333f, -1.0f, 8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 4.0f)
                curveToRelative(-0.667f, 2.667f, -1.0f, 5.333f, -1.0f, 8.0f)
                reflectiveCurveToRelative(0.333f, 5.333f, 1.0f, 8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 16.0f)
                horizontalLineToRelative(15.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5f, 8.0f)
                horizontalLineToRelative(-15.0f)
            }
        }
        .build()
        return _barrel!!
    }

private var _barrel: ImageVector? = null
