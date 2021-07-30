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

public val SolidGroup.Magnet: ImageVector
    get() {
        if (_magnet != null) {
            return _magnet!!
        }
        _magnet = Builder(name = "Magnet", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.07f, 148.1f)
                lineTo(12.0f, 148.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineToRelative(-80.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, -36.0f)
                horizontalLineToRelative(104.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, 36.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(11.89f, 11.89f, 0.0f, false, true, -11.93f, 12.0f)
                close()
                moveTo(512.0f, 136.1f)
                lineTo(512.0f, 56.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, -36.0f)
                lineTo(372.0f, 20.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, 36.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(152.0f)
                arcToRelative(11.89f, 11.89f, 0.0f, false, false, 12.0f, -11.9f)
                close()
                moveTo(348.0f, 180.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(52.0f)
                curveToRelative(0.0f, 128.1f, -160.0f, 127.9f, -160.0f, 0.0f)
                verticalLineToRelative(-52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(12.1f, 180.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.1f)
                curveToRelative(0.1f, 21.4f, 0.6f, 40.3f, 0.0f, 53.3f)
                curveToRelative(0.0f, 150.6f, 136.17f, 246.6f, 256.75f, 246.6f)
                reflectiveCurveToRelative(255.0f, -96.0f, 255.0f, -246.7f)
                curveToRelative(-0.6f, -12.8f, -0.2f, -33.0f, 0.0f, -53.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.1f)
                close()
            }
        }
        .build()
        return _magnet!!
    }

private var _magnet: ImageVector? = null
