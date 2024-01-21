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

public val SolidGroup.FaceGrinHearts: ImageVector
    get() {
        if (_faceGrinHearts != null) {
            return _faceGrinHearts!!
        }
        _faceGrinHearts = Builder(name = "FaceGrinHearts", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, false, 256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(388.1f, 312.8f)
                curveToRelative(12.3f, -3.8f, 24.3f, 6.9f, 19.3f, 18.7f)
                curveTo(382.4f, 390.6f, 324.2f, 432.0f, 256.3f, 432.0f)
                reflectiveCurveToRelative(-126.2f, -41.4f, -151.1f, -100.5f)
                curveToRelative(-5.0f, -11.8f, 7.0f, -22.5f, 19.3f, -18.7f)
                curveToRelative(39.7f, 12.2f, 84.5f, 19.0f, 131.8f, 19.0f)
                reflectiveCurveToRelative(92.1f, -6.8f, 131.8f, -19.0f)
                close()
                moveTo(199.3f, 129.1f)
                curveToRelative(17.8f, 4.8f, 28.4f, 23.1f, 23.6f, 40.8f)
                lineToRelative(-17.4f, 65.0f)
                curveToRelative(-2.3f, 8.5f, -11.1f, 13.6f, -19.6f, 11.3f)
                lineToRelative(-65.1f, -17.4f)
                curveToRelative(-17.8f, -4.8f, -28.4f, -23.1f, -23.6f, -40.8f)
                reflectiveCurveToRelative(23.1f, -28.4f, 40.8f, -23.6f)
                lineToRelative(16.1f, 4.3f)
                lineToRelative(4.3f, -16.1f)
                curveToRelative(4.8f, -17.8f, 23.1f, -28.4f, 40.8f, -23.6f)
                close()
                moveTo(353.6f, 152.7f)
                lineToRelative(4.3f, 16.1f)
                lineToRelative(16.1f, -4.3f)
                curveToRelative(17.8f, -4.8f, 36.1f, 5.8f, 40.8f, 23.6f)
                reflectiveCurveToRelative(-5.8f, 36.1f, -23.6f, 40.8f)
                lineToRelative(-65.1f, 17.4f)
                curveToRelative(-8.5f, 2.3f, -17.3f, -2.8f, -19.6f, -11.3f)
                lineToRelative(-17.4f, -65.0f)
                curveToRelative(-4.8f, -17.8f, 5.8f, -36.1f, 23.6f, -40.8f)
                reflectiveCurveToRelative(36.1f, 5.8f, 40.9f, 23.6f)
                close()
            }
        }
        .build()
        return _faceGrinHearts!!
    }

private var _faceGrinHearts: ImageVector? = null
