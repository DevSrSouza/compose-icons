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

public val SolidGroup.FileShield: ImageVector
    get() {
        if (_fileShield != null) {
            return _fileShield!!
        }
        _fileShield = Builder(name = "FileShield", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 64.0f)
                curveTo(0.0f, 28.7f, 28.7f, 0.0f, 64.0f, 0.0f)
                lineTo(224.0f, 0.0f)
                lineTo(224.0f, 128.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(384.0f, 160.0f)
                verticalLineToRelative(47.0f)
                lineToRelative(-92.8f, 37.1f)
                curveToRelative(-21.3f, 8.5f, -35.2f, 29.1f, -35.2f, 52.0f)
                curveToRelative(0.0f, 56.6f, 18.9f, 148.0f, 94.2f, 208.3f)
                curveToRelative(-9.0f, 4.8f, -19.3f, 7.6f, -30.2f, 7.6f)
                lineTo(64.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 64.0f)
                close()
                moveTo(384.0f, 128.0f)
                lineTo(256.0f, 128.0f)
                lineTo(256.0f, 0.0f)
                lineTo(384.0f, 128.0f)
                close()
                moveTo(423.1f, 225.7f)
                curveToRelative(5.7f, -2.3f, 12.1f, -2.3f, 17.8f, 0.0f)
                lineToRelative(120.0f, 48.0f)
                curveTo(570.0f, 277.4f, 576.0f, 286.2f, 576.0f, 296.0f)
                curveToRelative(0.0f, 63.3f, -25.9f, 168.8f, -134.8f, 214.2f)
                curveToRelative(-5.9f, 2.5f, -12.6f, 2.5f, -18.5f, 0.0f)
                curveTo(313.9f, 464.8f, 288.0f, 359.3f, 288.0f, 296.0f)
                curveToRelative(0.0f, -9.8f, 6.0f, -18.6f, 15.1f, -22.3f)
                lineToRelative(120.0f, -48.0f)
                close()
                moveTo(527.4f, 312.0f)
                lineTo(432.0f, 273.8f)
                lineTo(432.0f, 461.7f)
                curveToRelative(68.2f, -33.0f, 91.5f, -99.0f, 95.4f, -149.7f)
                close()
            }
        }
        .build()
        return _fileShield!!
    }

private var _fileShield: ImageVector? = null
