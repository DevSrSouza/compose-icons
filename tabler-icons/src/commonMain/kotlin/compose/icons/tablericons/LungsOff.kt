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

public val TablerIcons.LungsOff: ImageVector
    get() {
        if (_lungsOff != null) {
            return _lungsOff!!
        }
        _lungsOff = Builder(name = "LungsOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.583f, 6.608f)
                curveToRelative(-1.206f, 1.058f, -2.07f, 2.626f, -2.933f, 5.449f)
                curveToRelative(-0.42f, 1.37f, -0.636f, 2.962f, -0.648f, 4.775f)
                curveToRelative(-0.012f, 1.675f, 1.261f, 3.054f, 2.877f, 3.161f)
                lineToRelative(0.203f, 0.007f)
                curveToRelative(1.611f, 0.0f, 2.918f, -1.335f, 2.918f, -2.98f)
                verticalLineToRelative(-8.02f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 11.0f)
                verticalLineToRelative(-3.743f)
                curveToRelative(0.0f, -0.694f, 0.552f, -1.257f, 1.233f, -1.257f)
                curveToRelative(0.204f, 0.0f, 0.405f, 0.052f, 0.584f, 0.15f)
                lineToRelative(0.13f, 0.083f)
                curveToRelative(1.46f, 1.059f, 2.432f, 2.647f, 3.405f, 5.824f)
                curveToRelative(0.42f, 1.37f, 0.636f, 2.962f, 0.648f, 4.775f)
                curveToRelative(0.0f, 0.063f, 0.0f, 0.125f, 0.0f, 0.187f)
                moveToRelative(-1.455f, 2.51f)
                curveToRelative(-0.417f, 0.265f, -0.9f, 0.43f, -1.419f, 0.464f)
                lineToRelative(-0.202f, 0.007f)
                curveToRelative(-1.613f, 0.0f, -2.92f, -1.335f, -2.92f, -2.98f)
                verticalLineToRelative(-2.02f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 12.0f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, 2.132f, -0.89f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                verticalLineToRelative(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _lungsOff!!
    }

private var _lungsOff: ImageVector? = null
