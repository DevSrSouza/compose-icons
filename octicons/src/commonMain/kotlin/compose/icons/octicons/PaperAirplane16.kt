package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.PaperAirplane16: ImageVector
    get() {
        if (_paperAirplane16 != null) {
            return _paperAirplane16!!
        }
        _paperAirplane16 = Builder(name = "PaperAirplane16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.989f, 8.0f)
                lineTo(0.064f, 2.68f)
                arcToRelative(1.342f, 1.342f, 0.0f, false, true, 1.85f, -1.462f)
                lineToRelative(13.402f, 5.744f)
                arcToRelative(1.13f, 1.13f, 0.0f, false, true, 0.0f, 2.076f)
                lineTo(1.913f, 14.782f)
                arcToRelative(1.343f, 1.343f, 0.0f, false, true, -1.85f, -1.463f)
                lineTo(0.99f, 8.0f)
                close()
                moveTo(1.592f, 2.712f)
                lineTo(2.38f, 7.25f)
                horizontalLineToRelative(4.87f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(2.38f, 8.75f)
                lineToRelative(-0.788f, 4.538f)
                lineTo(13.929f, 8.0f)
                close()
            }
        }
        .build()
        return _paperAirplane16!!
    }

private var _paperAirplane16: ImageVector? = null
