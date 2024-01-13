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

public val SolidGroup.FilePowerpoint: ImageVector
    get() {
        if (_filePowerpoint != null) {
            return _filePowerpoint!!
        }
        _filePowerpoint = Builder(name = "FilePowerpoint", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                curveTo(28.7f, 0.0f, 0.0f, 28.7f, 0.0f, 64.0f)
                lineTo(0.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(320.0f, 512.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(384.0f, 160.0f)
                lineTo(256.0f, 160.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(224.0f, 0.0f)
                lineTo(64.0f, 0.0f)
                close()
                moveTo(256.0f, 0.0f)
                lineTo(256.0f, 128.0f)
                lineTo(384.0f, 128.0f)
                lineTo(256.0f, 0.0f)
                close()
                moveTo(136.0f, 240.0f)
                horizontalLineToRelative(68.0f)
                curveToRelative(42.0f, 0.0f, 76.0f, 34.0f, 76.0f, 76.0f)
                reflectiveCurveToRelative(-34.0f, 76.0f, -76.0f, 76.0f)
                lineTo(160.0f, 392.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineTo(112.0f, 368.0f)
                lineTo(112.0f, 264.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                close()
                moveTo(204.0f, 344.0f)
                curveToRelative(15.5f, 0.0f, 28.0f, -12.5f, 28.0f, -28.0f)
                reflectiveCurveToRelative(-12.5f, -28.0f, -28.0f, -28.0f)
                lineTo(160.0f, 288.0f)
                verticalLineToRelative(56.0f)
                horizontalLineToRelative(44.0f)
                close()
            }
        }
        .build()
        return _filePowerpoint!!
    }

private var _filePowerpoint: ImageVector? = null
