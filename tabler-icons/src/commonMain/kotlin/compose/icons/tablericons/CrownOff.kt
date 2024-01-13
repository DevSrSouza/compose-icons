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

public val TablerIcons.CrownOff: ImageVector
    get() {
        if (_crownOff != null) {
            return _crownOff!!
        }
        _crownOff = Builder(name = "CrownOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 18.0f)
                horizontalLineToRelative(-13.0f)
                lineToRelative(-1.865f, -9.327f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.4f, -0.244f)
                lineToRelative(4.465f, 3.571f)
                lineToRelative(1.6f, -2.4f)
                moveToRelative(1.596f, -2.394f)
                lineToRelative(0.804f, -1.206f)
                lineToRelative(4.0f, 6.0f)
                lineToRelative(4.464f, -3.571f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.401f, 0.244f)
                lineToRelative(-1.363f, 6.818f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _crownOff!!
    }

private var _crownOff: ImageVector? = null
