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
                moveTo(20.396f, 16.384f)
                lineToRelative(-7.526f, -13.877f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.74f, 0.0f)
                lineToRelative(-1.626f, 2.998f)
                moveToRelative(-1.407f, 2.594f)
                lineToRelative(-5.097f, 9.398f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.66f, 4.03f, 3.003f, 9.0f, 3.003f)
                curveToRelative(3.202f, 0.0f, 6.014f, -0.558f, 7.609f, -1.398f)
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
