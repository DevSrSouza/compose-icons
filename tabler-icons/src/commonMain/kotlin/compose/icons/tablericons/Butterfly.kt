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

public val TablerIcons.Butterfly: ImageVector
    get() {
        if (_butterfly != null) {
            return _butterfly!!
        }
        _butterfly = Builder(name = "Butterfly", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 18.176f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -4.953f, -2.449f)
                lineToRelative(-0.025f, 0.023f)
                arcToRelative(4.502f, 4.502f, 0.0f, false, true, 1.483f, -8.75f)
                curveToRelative(1.414f, 0.0f, 2.675f, 0.652f, 3.5f, 1.671f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 4.983f, 7.079f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -4.983f, 2.25f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                verticalLineToRelative(-10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 3.0f)
                lineToRelative(3.0f, 2.0f)
                lineToRelative(3.0f, -2.0f)
            }
        }
        .build()
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
