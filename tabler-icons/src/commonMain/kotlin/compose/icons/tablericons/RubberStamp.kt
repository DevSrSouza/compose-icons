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

public val TablerIcons.RubberStamp: ImageVector
    get() {
        if (_rubberStamp != null) {
            return _rubberStamp!!
        }
        _rubberStamp = Builder(name = "RubberStamp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 17.85f)
                horizontalLineToRelative(-18.0f)
                curveToRelative(0.0f, -4.05f, 1.421f, -4.05f, 3.79f, -4.05f)
                curveToRelative(5.21f, 0.0f, 1.21f, -4.59f, 1.21f, -6.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                curveToRelative(0.0f, 2.21f, -4.0f, 6.8f, 1.21f, 6.8f)
                curveToRelative(2.369f, 0.0f, 3.79f, 0.0f, 3.79f, 4.05f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 21.0f)
                horizontalLineToRelative(14.0f)
            }
        }
        .build()
        return _rubberStamp!!
    }

private var _rubberStamp: ImageVector? = null
