package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Perspective: ImageVector
    get() {
        if (_perspective != null) {
            return _perspective!!
        }
        _perspective = Builder(name = "Perspective", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.141f, 4.163f)
                lineToRelative(12.0f, 1.714f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.859f, 0.99f)
                verticalLineToRelative(10.266f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.859f, 0.99f)
                lineToRelative(-12.0f, 1.714f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.141f, -0.99f)
                verticalLineToRelative(-13.694f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.141f, -0.99f)
                close()
            }
        }
        .build()
        return _perspective!!
    }

private var _perspective: ImageVector? = null
