package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.VrCardboard: ImageVector
    get() {
        if (_vrCardboard != null) {
            return _vrCardboard!!
        }
        _vrCardboard = Builder(name = "VrCardboard", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(576.0f, 64.0f)
                lineTo(64.0f, 64.0f)
                curveTo(28.7f, 64.0f, 0.0f, 92.7f, 0.0f, 128.0f)
                lineTo(0.0f, 384.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(184.4f, 448.0f)
                curveToRelative(24.2f, 0.0f, 46.4f, -13.7f, 57.2f, -35.4f)
                lineToRelative(32.0f, -64.0f)
                curveToRelative(8.8f, -17.5f, 26.7f, -28.6f, 46.3f, -28.6f)
                reflectiveCurveToRelative(37.5f, 11.1f, 46.3f, 28.6f)
                lineToRelative(32.0f, 64.0f)
                curveToRelative(10.8f, 21.7f, 33.0f, 35.4f, 57.2f, 35.4f)
                lineTo(576.0f, 448.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(640.0f, 128.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                close()
                moveTo(96.0f, 240.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 128.0f, 0.0f)
                arcTo(64.0f, 64.0f, 0.0f, true, true, 96.0f, 240.0f)
                close()
                moveTo(480.0f, 176.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 0.0f, 128.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 0.0f, -128.0f)
                close()
            }
        }
        .build()
        return _vrCardboard!!
    }

private var _vrCardboard: ImageVector? = null
