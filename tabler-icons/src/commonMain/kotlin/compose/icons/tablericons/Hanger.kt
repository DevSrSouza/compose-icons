package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Hanger: ImageVector
    get() {
        if (_hanger != null) {
            return _hanger!!
        }
        _hanger = Builder(name = "Hanger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -3.0f, 3.0f)
                verticalLineToRelative(2.0f)
                moveToRelative(0.0f, 0.0f)
                lineToRelative(-8.624f, 5.488f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, false, 0.44f, 1.512f)
                horizontalLineToRelative(16.368f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, false, 0.44f, -1.512f)
                lineToRelative(-8.624f, -5.488f)
                close()
            }
        }
        .build()
        return _hanger!!
    }

private var _hanger: ImageVector? = null
