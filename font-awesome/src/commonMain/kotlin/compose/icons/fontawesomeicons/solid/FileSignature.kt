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

public val SolidGroup.FileSignature: ImageVector
    get() {
        if (_fileSignature != null) {
            return _fileSignature!!
        }
        _fileSignature = Builder(name = "FileSignature", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 0.0f)
                curveTo(28.7f, 0.0f, 0.0f, 28.7f, 0.0f, 64.0f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineTo(320.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                verticalLineTo(428.7f)
                curveToRelative(-2.7f, 1.1f, -5.4f, 2.0f, -8.2f, 2.7f)
                lineToRelative(-60.1f, 15.0f)
                curveToRelative(-3.0f, 0.7f, -6.0f, 1.2f, -9.0f, 1.4f)
                curveToRelative(-0.9f, 0.1f, -1.8f, 0.2f, -2.7f, 0.2f)
                horizontalLineTo(240.0f)
                curveToRelative(-6.1f, 0.0f, -11.6f, -3.4f, -14.3f, -8.8f)
                lineToRelative(-8.8f, -17.7f)
                curveToRelative(-1.7f, -3.4f, -5.1f, -5.5f, -8.8f, -5.5f)
                reflectiveCurveToRelative(-7.2f, 2.1f, -8.8f, 5.5f)
                lineToRelative(-8.8f, 17.7f)
                curveToRelative(-2.9f, 5.9f, -9.2f, 9.4f, -15.7f, 8.8f)
                reflectiveCurveToRelative(-12.1f, -5.1f, -13.9f, -11.3f)
                lineTo(144.0f, 381.0f)
                lineToRelative(-9.8f, 32.8f)
                curveToRelative(-6.1f, 20.3f, -24.8f, 34.2f, -46.0f, 34.2f)
                horizontalLineTo(80.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(8.2f)
                curveToRelative(7.1f, 0.0f, 13.3f, -4.6f, 15.3f, -11.4f)
                lineToRelative(14.9f, -49.5f)
                curveToRelative(3.4f, -11.3f, 13.8f, -19.1f, 25.6f, -19.1f)
                reflectiveCurveToRelative(22.2f, 7.8f, 25.6f, 19.1f)
                lineToRelative(11.6f, 38.6f)
                curveToRelative(7.4f, -6.2f, 16.8f, -9.7f, 26.8f, -9.7f)
                curveToRelative(15.9f, 0.0f, 30.4f, 9.0f, 37.5f, 23.2f)
                lineToRelative(4.4f, 8.8f)
                horizontalLineToRelative(8.9f)
                curveToRelative(-3.1f, -8.8f, -3.7f, -18.4f, -1.4f, -27.8f)
                lineToRelative(15.0f, -60.1f)
                curveToRelative(2.8f, -11.3f, 8.6f, -21.5f, 16.8f, -29.7f)
                lineTo(384.0f, 203.6f)
                verticalLineTo(160.0f)
                horizontalLineTo(256.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(64.0f)
                close()
                moveTo(256.0f, 0.0f)
                verticalLineTo(128.0f)
                horizontalLineTo(384.0f)
                lineTo(256.0f, 0.0f)
                close()
                moveTo(549.8f, 139.7f)
                curveToRelative(-15.6f, -15.6f, -40.9f, -15.6f, -56.6f, 0.0f)
                lineToRelative(-29.4f, 29.4f)
                lineToRelative(71.0f, 71.0f)
                lineToRelative(29.4f, -29.4f)
                curveToRelative(15.6f, -15.6f, 15.6f, -40.9f, 0.0f, -56.6f)
                lineToRelative(-14.4f, -14.4f)
                close()
                moveTo(311.9f, 321.0f)
                curveToRelative(-4.1f, 4.1f, -7.0f, 9.2f, -8.4f, 14.9f)
                lineToRelative(-15.0f, 60.1f)
                curveToRelative(-1.4f, 5.5f, 0.2f, 11.2f, 4.2f, 15.2f)
                reflectiveCurveToRelative(9.7f, 5.6f, 15.2f, 4.2f)
                lineToRelative(60.1f, -15.0f)
                curveToRelative(5.6f, -1.4f, 10.8f, -4.3f, 14.9f, -8.4f)
                lineTo(512.1f, 262.7f)
                lineToRelative(-71.0f, -71.0f)
                lineTo(311.9f, 321.0f)
                close()
            }
        }
        .build()
        return _fileSignature!!
    }

private var _fileSignature: ImageVector? = null
