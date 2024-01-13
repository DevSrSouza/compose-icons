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

public val SolidGroup.SquareEnvelope: ImageVector
    get() {
        if (_squareEnvelope != null) {
            return _squareEnvelope!!
        }
        _squareEnvelope = Builder(name = "SquareEnvelope", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(384.0f, 480.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(448.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(218.0f, 271.7f)
                lineTo(64.2f, 172.4f)
                curveTo(66.0f, 156.4f, 79.5f, 144.0f, 96.0f, 144.0f)
                lineTo(352.0f, 144.0f)
                curveToRelative(16.5f, 0.0f, 30.0f, 12.4f, 31.8f, 28.4f)
                lineTo(230.0f, 271.7f)
                curveToRelative(-1.8f, 1.2f, -3.9f, 1.8f, -6.0f, 1.8f)
                reflectiveCurveToRelative(-4.2f, -0.6f, -6.0f, -1.8f)
                close()
                moveTo(247.4f, 298.6f)
                lineTo(384.0f, 210.4f)
                lineTo(384.0f, 336.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(96.0f, 368.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(64.0f, 210.4f)
                lineToRelative(136.6f, 88.2f)
                curveToRelative(7.0f, 4.5f, 15.1f, 6.9f, 23.4f, 6.9f)
                reflectiveCurveToRelative(16.4f, -2.4f, 23.4f, -6.9f)
                close()
            }
        }
        .build()
        return _squareEnvelope!!
    }

private var _squareEnvelope: ImageVector? = null
