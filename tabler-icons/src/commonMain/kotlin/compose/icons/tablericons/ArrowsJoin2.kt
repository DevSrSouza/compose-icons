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

public val TablerIcons.ArrowsJoin2: ImageVector
    get() {
        if (_arrowsJoin2 != null) {
            return _arrowsJoin2!!
        }
        _arrowsJoin2 = Builder(name = "ArrowsJoin2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 7.0f)
                horizontalLineToRelative(1.948f)
                curveToRelative(1.913f, 0.0f, 3.705f, 0.933f, 4.802f, 2.5f)
                arcToRelative(5.861f, 5.861f, 0.0f, false, false, 4.802f, 2.5f)
                horizontalLineToRelative(6.448f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 17.0f)
                horizontalLineToRelative(1.95f)
                arcToRelative(5.854f, 5.854f, 0.0f, false, false, 4.798f, -2.5f)
                arcToRelative(5.854f, 5.854f, 0.0f, false, true, 4.798f, -2.5f)
                horizontalLineToRelative(5.454f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 15.0f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(-3.0f, -3.0f)
            }
        }
        .build()
        return _arrowsJoin2!!
    }

private var _arrowsJoin2: ImageVector? = null
