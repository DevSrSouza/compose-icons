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

public val FillGroup.Flask: ImageVector
    get() {
        if (_flask != null) {
            return _flask!!
        }
        _flask = Builder(name = "Flask", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.6f, 199.8f)
                lineTo(160.0f, 93.8f)
                lineTo(160.0f, 40.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(88.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                lineTo(96.0f, 93.8f)
                lineTo(55.8f, 160.7f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.2f, -0.1f, 0.3f)
                lineTo(32.4f, 199.8f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 46.1f, 224.0f)
                lineTo(209.9f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.7f, -24.2f)
                close()
                moveTo(131.6f, 160.8f)
                curveToRelative(-14.3f, -7.1f, -32.7f, -13.5f, -50.3f, -11.4f)
                lineTo(109.7f, 102.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 2.3f, -8.2f)
                lineTo(112.0f, 40.0f)
                horizontalLineToRelative(32.0f)
                lineTo(144.0f, 93.8f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 2.3f, 8.2f)
                lineToRelative(38.8f, 64.8f)
                curveTo(172.0f, 173.9f, 153.7f, 171.9f, 131.6f, 160.8f)
                close()
            }
        }
        .build()
        return _flask!!
    }

private var _flask: ImageVector? = null
