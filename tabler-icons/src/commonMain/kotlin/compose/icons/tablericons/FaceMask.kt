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

public val TablerIcons.FaceMask: ImageVector
    get() {
        if (_faceMask != null) {
            return _faceMask!!
        }
        _faceMask = Builder(name = "FaceMask", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 14.5f)
                horizontalLineToRelative(-0.222f)
                curveToRelative(-1.535f, 0.0f, -2.778f, -1.12f, -2.778f, -2.5f)
                reflectiveCurveToRelative(1.243f, -2.5f, 2.778f, -2.5f)
                horizontalLineToRelative(0.222f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 14.5f)
                horizontalLineToRelative(0.222f)
                curveToRelative(1.534f, 0.0f, 2.778f, -1.12f, 2.778f, -2.5f)
                reflectiveCurveToRelative(-1.244f, -2.5f, -2.778f, -2.5f)
                horizontalLineToRelative(-0.222f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 10.0f)
                horizontalLineToRelative(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 14.0f)
                horizontalLineToRelative(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.55f, 18.843f)
                lineToRelative(5.0f, -1.429f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.45f, -1.923f)
                verticalLineToRelative(-6.981f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.45f, -1.923f)
                lineToRelative(-5.0f, -1.429f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.1f, 0.0f)
                lineToRelative(-5.0f, 1.429f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.45f, 1.922f)
                verticalLineToRelative(6.982f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.45f, 1.923f)
                lineToRelative(5.0f, 1.429f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.1f, 0.0f)
                close()
            }
        }
        .build()
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
