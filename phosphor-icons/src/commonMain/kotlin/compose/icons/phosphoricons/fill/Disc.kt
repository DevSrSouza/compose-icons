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

public val FillGroup.Disc: ImageVector
    get() {
        if (_disc != null) {
            return _disc!!
        }
        _disc = Builder(name = "Disc", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.3f, 43.3f)
                lineToRelative(-0.6f, -0.5f)
                lineToRelative(-0.8f, -0.4f)
                arcTo(102.9f, 102.9f, 0.0f, false, false, 128.0f, 24.0f)
                arcToRelative(104.1f, 104.1f, 0.0f, true, false, 60.3f, 19.3f)
                close()
                moveTo(128.0f, 152.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 128.0f, 152.0f)
                close()
                moveTo(216.0f, 128.0f)
                curveToRelative(0.0f, 2.5f, -0.1f, 4.9f, -0.3f, 7.3f)
                lineTo(168.0f, 126.9f)
                arcToRelative(39.8f, 39.8f, 0.0f, false, false, -11.0f, -26.4f)
                lineToRelative(27.8f, -39.7f)
                arcTo(87.9f, 87.9f, 0.0f, false, true, 216.0f, 128.0f)
                close()
            }
        }
        .build()
        return _disc!!
    }

private var _disc: ImageVector? = null
