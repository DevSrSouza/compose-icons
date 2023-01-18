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

public val ThinGroup.BracketsCurly: ImageVector
    get() {
        if (_bracketsCurly != null) {
            return _bracketsCurly!!
        }
        _bracketsCurly = Builder(name = "BracketsCurly", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(35.9f, 128.0f)
                curveTo(52.0f, 136.2f, 52.0f, 155.6f, 52.0f, 172.0f)
                curveToRelative(0.0f, 24.8f, 1.4f, 40.0f, 28.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                curveToRelative(-36.0f, 0.0f, -36.0f, -26.6f, -36.0f, -48.0f)
                curveToRelative(0.0f, -24.8f, -1.4f, -40.0f, -28.0f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                curveToRelative(26.6f, 0.0f, 28.0f, -15.2f, 28.0f, -40.0f)
                curveToRelative(0.0f, -21.4f, 0.0f, -48.0f, 36.0f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                curveTo(53.4f, 44.0f, 52.0f, 59.2f, 52.0f, 84.0f)
                curveTo(52.0f, 100.4f, 52.0f, 119.8f, 35.9f, 128.0f)
                close()
                moveTo(240.0f, 124.0f)
                curveToRelative(-26.6f, 0.0f, -28.0f, -15.2f, -28.0f, -40.0f)
                curveToRelative(0.0f, -21.4f, 0.0f, -48.0f, -36.0f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                curveToRelative(26.6f, 0.0f, 28.0f, 15.2f, 28.0f, 40.0f)
                curveToRelative(0.0f, 16.4f, 0.0f, 35.8f, 16.1f, 44.0f)
                curveTo(204.0f, 136.2f, 204.0f, 155.6f, 204.0f, 172.0f)
                curveToRelative(0.0f, 24.8f, -1.4f, 40.0f, -28.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                curveToRelative(36.0f, 0.0f, 36.0f, -26.6f, 36.0f, -48.0f)
                curveToRelative(0.0f, -24.8f, 1.4f, -40.0f, 28.0f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
            }
        }
        .build()
        return _bracketsCurly!!
    }

private var _bracketsCurly: ImageVector? = null
