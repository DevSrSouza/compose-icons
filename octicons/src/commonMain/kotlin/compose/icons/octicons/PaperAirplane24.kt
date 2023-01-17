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

public val Octicons.PaperAirplane24: ImageVector
    get() {
        if (_paperAirplane24 != null) {
            return _paperAirplane24!!
        }
        _paperAirplane24 = Builder(name = "PaperAirplane24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.513f, 1.96f)
                arcToRelative(1.374f, 1.374f, 0.0f, false, true, 1.499f, -0.21f)
                lineToRelative(19.335f, 9.215f)
                arcToRelative(1.147f, 1.147f, 0.0f, false, true, 0.0f, 2.07f)
                lineTo(3.012f, 22.25f)
                arcToRelative(1.374f, 1.374f, 0.0f, false, true, -1.947f, -1.46f)
                lineTo(2.49f, 12.0f)
                lineTo(1.065f, 3.21f)
                arcToRelative(1.375f, 1.375f, 0.0f, false, true, 0.448f, -1.25f)
                close()
                moveTo(3.888f, 12.75f)
                lineTo(2.584f, 20.792f)
                lineTo(21.031f, 12.0f)
                lineTo(2.584f, 3.208f)
                lineToRelative(1.304f, 8.042f)
                horizontalLineToRelative(7.362f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                close()
            }
        }
        .build()
        return _paperAirplane24!!
    }

private var _paperAirplane24: ImageVector? = null
