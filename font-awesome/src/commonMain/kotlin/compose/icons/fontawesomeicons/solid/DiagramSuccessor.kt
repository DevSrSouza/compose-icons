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

public val SolidGroup.DiagramSuccessor: ImageVector
    get() {
        if (_diagramSuccessor != null) {
            return _diagramSuccessor!!
        }
        _diagramSuccessor = Builder(name = "DiagramSuccessor", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 416.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 288.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(384.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                close()
                moveTo(64.0f, 160.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(144.0f, 0.0f)
                lineToRelative(16.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineTo(64.0f, 160.0f)
                close()
                moveTo(288.0f, 160.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(80.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                lineToRelative(0.0f, 16.0f)
                lineToRelative(-38.1f, 0.0f)
                curveToRelative(-21.4f, 0.0f, -32.1f, 25.9f, -17.0f, 41.0f)
                lineTo(399.0f, 239.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                lineTo(503.0f, 169.0f)
                curveToRelative(15.1f, -15.1f, 4.4f, -41.0f, -17.0f, -41.0f)
                lineTo(448.0f, 128.0f)
                lineToRelative(0.0f, -16.0f)
                curveToRelative(0.0f, -44.2f, -35.8f, -80.0f, -80.0f, -80.0f)
                lineTo(224.0f, 32.0f)
                lineToRelative(-16.0f, 0.0f)
                lineTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineToRelative(160.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                close()
            }
        }
        .build()
        return _diagramSuccessor!!
    }

private var _diagramSuccessor: ImageVector? = null
