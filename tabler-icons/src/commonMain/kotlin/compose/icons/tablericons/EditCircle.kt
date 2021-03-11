package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.EditCircle: ImageVector
    get() {
        if (_editCircle != null) {
            return _editCircle!!
        }
        _editCircle = Builder(name = "EditCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                lineToRelative(8.385f, -8.415f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -2.97f, -2.97f)
                lineToRelative(-8.415f, 8.385f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                lineToRelative(3.0f, 3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 7.07f)
                arcToRelative(7.002f, 7.002f, 0.0f, false, false, 1.0f, 13.93f)
                arcToRelative(7.002f, 7.002f, 0.0f, false, false, 6.929f, -5.999f)
            }
        }
        .build()
        return _editCircle!!
    }

private var _editCircle: ImageVector? = null
