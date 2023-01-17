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

public val TablerIcons.ConeOff: ImageVector
    get() {
        if (_coneOff != null) {
            return _coneOff!!
        }
        _coneOff = Builder(name = "ConeOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.305f, 18.305f)
                curveToRelative(-1.132f, 1.003f, -3.53f, 1.695f, -6.305f, 1.695f)
                curveToRelative(-3.866f, 0.0f, -7.0f, -1.343f, -7.0f, -3.0f)
                reflectiveCurveToRelative(3.134f, -3.0f, 7.0f, -3.0f)
                curveToRelative(0.747f, 0.0f, 1.467f, 0.05f, 2.142f, 0.143f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.07f, 13.054f)
                lineToRelative(-5.07f, -9.054f)
                lineToRelative(-1.432f, 2.558f)
                moveToRelative(-1.439f, 2.569f)
                lineToRelative(-4.129f, 7.373f)
                verticalLineToRelative(0.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _coneOff!!
    }

private var _coneOff: ImageVector? = null
