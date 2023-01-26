package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.PartyMode: ImageVector
    get() {
        if (_partyMode != null) {
            return _partyMode!!
        }
        _partyMode = Builder(name = "PartyMode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 4.0f)
                horizontalLineToRelative(-5.17f)
                lineTo(15.0f, 2.0f)
                lineTo(9.0f, 2.0f)
                lineTo(7.17f, 4.0f)
                lineTo(2.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 4.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveToRelative(1.63f, 0.0f, 3.06f, 0.79f, 3.98f, 2.0f)
                lineTo(12.0f, 9.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f)
                curveToRelative(0.0f, 0.35f, 0.07f, 0.69f, 0.18f, 1.0f)
                lineTo(7.1f, 13.0f)
                curveToRelative(-0.06f, -0.32f, -0.1f, -0.66f, -0.1f, -1.0f)
                curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-1.63f, 0.0f, -3.06f, -0.79f, -3.98f, -2.0f)
                lineTo(12.0f, 15.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f)
                curveToRelative(0.0f, -0.35f, -0.07f, -0.69f, -0.18f, -1.0f)
                horizontalLineToRelative(2.08f)
                curveToRelative(0.07f, 0.32f, 0.1f, 0.66f, 0.1f, 1.0f)
                curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _partyMode!!
    }

private var _partyMode: ImageVector? = null
