package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.BreadSliceSolid: ImageVector
    get() {
        if (_breadSliceSolid != null) {
            return _breadSliceSolid!!
        }
        _breadSliceSolid = Builder(name = "BreadSliceSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(8.822f, 4.0f, 4.0f, 8.4304f, 4.0f, 12.5684f)
                curveTo(4.0f, 14.0144f, 4.775f, 15.1919f, 6.0f, 15.7129f)
                lineTo(6.0f, 24.0f)
                curveTo(6.0f, 26.206f, 7.794f, 28.0f, 10.0f, 28.0f)
                lineTo(22.0f, 28.0f)
                curveTo(24.206f, 28.0f, 26.0f, 26.206f, 26.0f, 24.0f)
                lineTo(26.0f, 15.7129f)
                curveTo(27.225f, 15.1919f, 28.0f, 14.0144f, 28.0f, 12.5684f)
                curveTo(28.0f, 8.4304f, 23.178f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(22.438f, 6.0f, 26.0f, 9.8834f, 26.0f, 12.5684f)
                curveTo(26.0f, 13.3364f, 25.5667f, 13.8626f, 24.8438f, 13.9766f)
                lineTo(24.0f, 14.1113f)
                lineTo(24.0f, 24.0f)
                curveTo(24.0f, 25.103f, 23.103f, 26.0f, 22.0f, 26.0f)
                lineTo(10.0f, 26.0f)
                curveTo(8.897f, 26.0f, 8.0f, 25.103f, 8.0f, 24.0f)
                lineTo(8.0f, 14.1113f)
                lineTo(7.1563f, 13.9785f)
                curveTo(6.4332f, 13.8635f, 6.0f, 13.3364f, 6.0f, 12.5684f)
                curveTo(6.0f, 9.8834f, 9.562f, 6.0f, 16.0f, 6.0f)
                close()
            }
        }
        .build()
        return _breadSliceSolid!!
    }

private var _breadSliceSolid: ImageVector? = null
