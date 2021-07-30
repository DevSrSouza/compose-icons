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

public val SolidGroup.GlassCheers: ImageVector
    get() {
        if (_glassCheers != null) {
            return _glassCheers!!
        }
        _glassCheers = Builder(name = "GlassCheers", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(639.4f, 433.6f)
                curveToRelative(-8.4f, -20.4f, -31.8f, -30.1f, -52.2f, -21.6f)
                lineToRelative(-22.1f, 9.2f)
                lineToRelative(-38.7f, -101.9f)
                curveToRelative(47.9f, -35.0f, 64.8f, -100.3f, 34.5f, -152.8f)
                lineTo(474.3f, 16.0f)
                curveToRelative(-8.0f, -13.9f, -25.1f, -19.7f, -40.0f, -13.6f)
                lineTo(320.0f, 49.8f)
                lineTo(205.7f, 2.4f)
                curveToRelative(-14.9f, -6.2f, -32.0f, -0.3f, -40.0f, 13.6f)
                lineTo(79.1f, 166.5f)
                curveTo(48.9f, 219.0f, 65.7f, 284.3f, 113.6f, 319.2f)
                lineTo(74.9f, 421.1f)
                lineToRelative(-22.1f, -9.2f)
                curveToRelative(-20.4f, -8.5f, -43.7f, 1.2f, -52.2f, 21.6f)
                curveToRelative(-1.7f, 4.1f, 0.2f, 8.8f, 4.3f, 10.5f)
                lineToRelative(162.3f, 67.4f)
                curveToRelative(4.1f, 1.7f, 8.7f, -0.2f, 10.4f, -4.3f)
                curveToRelative(8.4f, -20.4f, -1.2f, -43.8f, -21.6f, -52.3f)
                lineToRelative(-22.1f, -9.2f)
                lineTo(173.3f, 342.0f)
                curveToRelative(4.4f, 0.5f, 8.8f, 1.3f, 13.1f, 1.3f)
                curveToRelative(51.7f, 0.0f, 99.4f, -33.1f, 113.4f, -85.3f)
                lineToRelative(20.2f, -75.4f)
                lineToRelative(20.2f, 75.4f)
                curveToRelative(14.0f, 52.2f, 61.7f, 85.3f, 113.4f, 85.3f)
                curveToRelative(4.3f, 0.0f, 8.7f, -0.8f, 13.1f, -1.3f)
                lineTo(506.0f, 445.6f)
                lineToRelative(-22.1f, 9.2f)
                curveToRelative(-20.4f, 8.5f, -30.1f, 31.9f, -21.6f, 52.3f)
                curveToRelative(1.7f, 4.1f, 6.4f, 6.0f, 10.4f, 4.3f)
                lineTo(635.1f, 444.0f)
                curveToRelative(4.0f, -1.7f, 6.0f, -6.3f, 4.3f, -10.4f)
                close()
                moveTo(275.9f, 162.1f)
                lineToRelative(-112.1f, -46.5f)
                lineToRelative(36.5f, -63.4f)
                lineToRelative(94.5f, 39.2f)
                lineToRelative(-18.9f, 70.7f)
                close()
                moveTo(364.1f, 162.1f)
                lineToRelative(-18.9f, -70.7f)
                lineToRelative(94.5f, -39.2f)
                lineToRelative(36.5f, 63.4f)
                lineToRelative(-112.1f, 46.5f)
                close()
            }
        }
        .build()
        return _glassCheers!!
    }

private var _glassCheers: ImageVector? = null
