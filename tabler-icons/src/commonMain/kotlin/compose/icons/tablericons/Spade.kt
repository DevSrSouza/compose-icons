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

public val TablerIcons.Spade: ImageVector
    get() {
        if (_spade != null) {
            return _spade!!
        }
        _spade = Builder(name = "Spade", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                lineToRelative(4.919f, 4.5f)
                curveToRelative(0.61f, 0.587f, 1.177f, 1.177f, 1.703f, 1.771f)
                arcToRelative(5.527f, 5.527f, 0.0f, false, true, 0.264f, 6.979f)
                curveToRelative(-1.18f, 1.56f, -3.338f, 1.92f, -4.886f, 0.75f)
                verticalLineToRelative(1.0f)
                lineToRelative(1.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                lineToRelative(1.0f, -3.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-1.54f, 1.07f, -3.735f, 0.772f, -4.886f, -0.75f)
                arcToRelative(5.527f, 5.527f, 0.0f, false, true, 0.264f, -6.979f)
                arcToRelative(30.883f, 30.883f, 0.0f, false, true, 1.703f, -1.771f)
                arcToRelative(1541.72f, 1541.72f, 0.0f, false, true, 4.919f, -4.5f)
                close()
            }
        }
        .build()
        return _spade!!
    }

private var _spade: ImageVector? = null
