package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.BehanceLogo: ImageVector
    get() {
        if (_behanceLogo != null) {
            return _behanceLogo!!
        }
        _behanceLogo = Builder(name = "BehanceLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(168.0f, 84.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 80.0f)
                close()
                moveTo(244.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(164.2f, 156.0f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, false, 61.3f, 21.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, 5.6f)
                arcTo(44.0f, 44.0f, 0.0f, true, true, 244.0f, 152.0f)
                close()
                moveTo(235.8f, 148.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -71.6f, 0.0f)
                close()
                moveTo(136.0f, 158.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, -38.0f, 38.0f)
                lineTo(32.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(28.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(86.0f, 60.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 20.7f, 61.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 136.0f, 158.0f)
                close()
                moveTo(36.0f, 120.0f)
                lineTo(86.0f, 120.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 0.0f, -52.0f)
                lineTo(36.0f, 68.0f)
                close()
                moveTo(128.0f, 158.0f)
                arcToRelative(30.1f, 30.1f, 0.0f, false, false, -30.0f, -30.0f)
                lineTo(36.0f, 128.0f)
                verticalLineToRelative(60.0f)
                lineTo(98.0f, 188.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, false, 128.0f, 158.0f)
                close()
            }
        }
        .build()
        return _behanceLogo!!
    }

private var _behanceLogo: ImageVector? = null
