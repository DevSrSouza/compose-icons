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

public val SolidGroup.FilePen: ImageVector
    get() {
        if (_filePen != null) {
            return _filePen!!
        }
        _filePen = Builder(name = "FilePen", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 64.0f)
                curveTo(0.0f, 28.7f, 28.7f, 0.0f, 64.0f, 0.0f)
                lineTo(224.0f, 0.0f)
                lineTo(224.0f, 128.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(384.0f, 160.0f)
                lineTo(384.0f, 299.6f)
                lineToRelative(-94.7f, 94.7f)
                curveToRelative(-8.2f, 8.2f, -14.0f, 18.5f, -16.8f, 29.7f)
                lineToRelative(-15.0f, 60.1f)
                curveToRelative(-2.3f, 9.4f, -1.8f, 19.0f, 1.4f, 27.8f)
                lineTo(64.0f, 511.9f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 64.0f)
                close()
                moveTo(384.0f, 128.0f)
                lineTo(256.0f, 128.0f)
                lineTo(256.0f, 0.0f)
                lineTo(384.0f, 128.0f)
                close()
                moveTo(549.8f, 235.7f)
                lineToRelative(14.4f, 14.4f)
                curveToRelative(15.6f, 15.6f, 15.6f, 40.9f, 0.0f, 56.6f)
                lineToRelative(-29.4f, 29.4f)
                lineToRelative(-71.0f, -71.0f)
                lineToRelative(29.4f, -29.4f)
                curveToRelative(15.6f, -15.6f, 40.9f, -15.6f, 56.6f, 0.0f)
                close()
                moveTo(311.9f, 417.0f)
                lineTo(441.1f, 287.8f)
                lineToRelative(71.0f, 71.0f)
                lineTo(382.9f, 487.9f)
                curveToRelative(-4.1f, 4.1f, -9.2f, 7.0f, -14.9f, 8.4f)
                lineToRelative(-60.1f, 15.0f)
                curveToRelative(-5.5f, 1.4f, -11.2f, -0.2f, -15.2f, -4.2f)
                reflectiveCurveToRelative(-5.6f, -9.7f, -4.2f, -15.2f)
                lineToRelative(15.0f, -60.1f)
                curveToRelative(1.4f, -5.6f, 4.3f, -10.8f, 8.4f, -14.9f)
                close()
            }
        }
        .build()
        return _filePen!!
    }

private var _filePen: ImageVector? = null
