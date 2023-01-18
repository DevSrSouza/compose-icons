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

public val ThinGroup.LadderSimple: ImageVector
    get() {
        if (_ladderSimple != null) {
            return _ladderSimple!!
        }
        _ladderSimple = Builder(name = "LadderSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(188.0f, 68.0f)
                lineTo(68.0f, 68.0f)
                lineTo(68.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(60.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(68.0f, 188.0f)
                lineTo(188.0f, 188.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(196.0f, 32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 192.0f, 28.0f)
                close()
                moveTo(188.0f, 76.0f)
                verticalLineToRelative(48.0f)
                lineTo(68.0f, 124.0f)
                lineTo(68.0f, 76.0f)
                close()
                moveTo(68.0f, 180.0f)
                lineTo(68.0f, 132.0f)
                lineTo(188.0f, 132.0f)
                verticalLineToRelative(48.0f)
                close()
            }
        }
        .build()
        return _ladderSimple!!
    }

private var _ladderSimple: ImageVector? = null
