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

public val TablerIcons.CookieMan: ImageVector
    get() {
        if (_cookieMan != null) {
            return _cookieMan!!
        }
        _cookieMan = Builder(name = "CookieMan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 2.845f, 9.112f)
                lineToRelative(0.147f, 0.369f)
                lineToRelative(1.755f, -0.803f)
                curveToRelative(0.969f, -0.443f, 2.12f, -0.032f, 2.571f, 0.918f)
                arcToRelative(1.88f, 1.88f, 0.0f, false, true, -0.787f, 2.447f)
                lineToRelative(-0.148f, 0.076f)
                lineToRelative(-2.383f, 1.089f)
                verticalLineToRelative(2.02f)
                lineToRelative(1.426f, 1.425f)
                lineToRelative(0.114f, 0.125f)
                arcToRelative(1.96f, 1.96f, 0.0f, false, true, -2.762f, 2.762f)
                lineToRelative(-0.125f, -0.114f)
                lineToRelative(-2.079f, -2.08f)
                lineToRelative(-0.114f, -0.124f)
                arcToRelative(1.957f, 1.957f, 0.0f, false, true, -0.161f, -0.22f)
                horizontalLineToRelative(-0.599f)
                curveToRelative(-0.047f, 0.075f, -0.101f, 0.15f, -0.16f, 0.22f)
                lineToRelative(-0.115f, 0.125f)
                lineToRelative(-2.08f, 2.079f)
                arcToRelative(1.96f, 1.96f, 0.0f, false, true, -2.886f, -2.648f)
                lineToRelative(0.114f, -0.125f)
                lineToRelative(1.427f, -1.426f)
                verticalLineToRelative(-2.019f)
                lineToRelative(-2.383f, -1.09f)
                lineToRelative(-0.148f, -0.075f)
                arcToRelative(1.88f, 1.88f, 0.0f, false, true, -0.787f, -2.447f)
                curveToRelative(0.429f, -0.902f, 1.489f, -1.318f, 2.424f, -0.978f)
                lineToRelative(0.147f, 0.06f)
                lineToRelative(1.755f, 0.803f)
                lineToRelative(0.147f, -0.369f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -2.15f, -3.895f)
                lineToRelative(0.0f, -0.217f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, -5.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 7.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 7.0f)
                horizontalLineToRelative(0.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                horizontalLineToRelative(0.01f)
            }
        }
        .build()
        return _cookieMan!!
    }

private var _cookieMan: ImageVector? = null
