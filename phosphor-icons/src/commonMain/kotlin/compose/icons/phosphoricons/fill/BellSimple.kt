package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.BellSimple: ImageVector
    get() {
        if (_bellSimple != null) {
            return _bellSimple!!
        }
        _bellSimple = Builder(name = "BellSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.1f, 192.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -13.9f, 8.0f)
                lineTo(48.8f, 200.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -13.9f, -8.0f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, true, 0.1f, -16.1f)
                curveToRelative(5.9f, -10.2f, 13.0f, -29.6f, 13.0f, -63.9f)
                verticalLineToRelative(-8.0f)
                arcToRelative(79.9f, 79.9f, 0.0f, false, true, 80.0f, -80.0f)
                horizontalLineToRelative(0.6f)
                curveToRelative(43.8f, 0.3f, 79.4f, 36.6f, 79.4f, 80.9f)
                lineTo(208.0f, 112.0f)
                curveToRelative(0.0f, 34.3f, 7.1f, 53.7f, 13.0f, 63.9f)
                arcTo(15.8f, 15.8f, 0.0f, false, true, 221.1f, 192.0f)
                close()
                moveTo(159.9f, 216.0f)
                horizontalLineToRelative(-64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _bellSimple!!
    }

private var _bellSimple: ImageVector? = null
