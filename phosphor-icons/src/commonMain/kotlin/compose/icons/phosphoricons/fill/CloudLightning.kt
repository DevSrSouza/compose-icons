package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.CloudLightning: ImageVector
    get() {
        if (_cloudLightning != null) {
            return _cloudLightning!!
        }
        _cloudLightning = Builder(name = "CloudLightning", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.6f, 168.0f)
                lineToRelative(-15.8f, 24.0f)
                horizontalLineTo(154.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.2f, 2.7f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, 0.7f, 9.7f)
                lineToRelative(-26.2f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 248.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -5.0f, -1.8f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -1.6f, -10.8f)
                lineToRelative(18.0f, -27.4f)
                horizontalLineTo(104.2f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -6.2f, -2.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -0.7f, -9.7f)
                lineTo(115.4f, 168.0f)
                horizontalLineTo(76.8f)
                curveToRelative(-28.7f, 0.0f, -52.6f, -23.0f, -52.8f, -51.7f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 61.5f, 66.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.0f, 4.7f)
                arcToRelative(91.4f, 91.4f, 0.0f, false, false, -2.5f, 21.0f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 7.5f, 8.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 80.0f, 92.0f)
                arcToRelative(76.4f, 76.4f, 0.0f, false, true, 5.0f, -27.2f)
                horizontalLineToRelative(0.0f)
                arcTo(76.0f, 76.0f, 0.0f, true, true, 156.0f, 168.0f)
                close()
            }
        }
        .build()
        return _cloudLightning!!
    }

private var _cloudLightning: ImageVector? = null
