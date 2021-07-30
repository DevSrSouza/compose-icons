package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.FacebookMessenger: ImageVector
    get() {
        if (_facebookMessenger != null) {
            return _facebookMessenger!!
        }
        _facebookMessenger = Builder(name = "FacebookMessenger", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.55f, 8.0f)
                curveTo(116.52f, 8.0f, 8.0f, 110.34f, 8.0f, 248.57f)
                curveToRelative(0.0f, 72.3f, 29.71f, 134.78f, 78.07f, 177.94f)
                curveToRelative(8.35f, 7.51f, 6.63f, 11.86f, 8.05f, 58.23f)
                arcTo(19.92f, 19.92f, 0.0f, false, false, 122.0f, 502.31f)
                curveToRelative(52.91f, -23.3f, 53.59f, -25.14f, 62.56f, -22.7f)
                curveTo(337.85f, 521.8f, 504.0f, 423.7f, 504.0f, 248.57f)
                curveTo(504.0f, 110.34f, 396.59f, 8.0f, 256.55f, 8.0f)
                close()
                moveTo(405.79f, 193.13f)
                lineToRelative(-73.0f, 115.57f)
                arcToRelative(37.37f, 37.37f, 0.0f, false, true, -53.91f, 9.93f)
                lineToRelative(-58.08f, -43.47f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, false, -18.0f, 0.0f)
                lineToRelative(-78.37f, 59.44f)
                curveToRelative(-10.46f, 7.93f, -24.16f, -4.6f, -17.11f, -15.67f)
                lineToRelative(73.0f, -115.57f)
                arcToRelative(37.36f, 37.36f, 0.0f, false, true, 53.91f, -9.93f)
                lineToRelative(58.06f, 43.46f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, false, 18.0f, 0.0f)
                lineToRelative(78.41f, -59.38f)
                curveToRelative(10.44f, -7.98f, 24.14f, 4.54f, 17.09f, 15.62f)
                close()
            }
        }
        .build()
        return _facebookMessenger!!
    }

private var _facebookMessenger: ImageVector? = null
