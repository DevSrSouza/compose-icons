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

public val BrandsGroup.Gitlab: ImageVector
    get() {
        if (_gitlab != null) {
            return _gitlab!!
        }
        _gitlab = Builder(name = "Gitlab", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(503.5f, 204.6f)
                lineTo(502.8f, 202.8f)
                lineTo(433.1f, 21.02f)
                curveTo(431.7f, 17.45f, 429.2f, 14.43f, 425.9f, 12.38f)
                curveTo(423.5f, 10.83f, 420.8f, 9.865f, 417.9f, 9.57f)
                curveTo(415.0f, 9.275f, 412.2f, 9.653f, 409.5f, 10.68f)
                curveTo(406.8f, 11.7f, 404.4f, 13.34f, 402.4f, 15.46f)
                curveTo(400.5f, 17.58f, 399.1f, 20.13f, 398.3f, 22.9f)
                lineTo(351.3f, 166.9f)
                horizontalLineTo(160.8f)
                lineTo(113.7f, 22.9f)
                curveTo(112.9f, 20.13f, 111.5f, 17.59f, 109.6f, 15.47f)
                curveTo(107.6f, 13.35f, 105.2f, 11.72f, 102.5f, 10.7f)
                curveTo(99.86f, 9.675f, 96.98f, 9.295f, 94.12f, 9.587f)
                curveTo(91.26f, 9.878f, 88.51f, 10.83f, 86.08f, 12.38f)
                curveTo(82.84f, 14.43f, 80.33f, 17.45f, 78.92f, 21.02f)
                lineTo(9.267f, 202.8f)
                lineTo(8.543f, 204.6f)
                curveTo(-1.484f, 230.8f, -2.72f, 259.6f, 5.023f, 286.6f)
                curveTo(12.77f, 313.5f, 29.07f, 337.3f, 51.47f, 354.2f)
                lineTo(51.74f, 354.4f)
                lineTo(52.33f, 354.8f)
                lineTo(158.3f, 434.3f)
                lineTo(210.9f, 474.0f)
                lineTo(242.9f, 498.2f)
                curveTo(246.6f, 500.1f, 251.2f, 502.5f, 255.9f, 502.5f)
                curveTo(260.6f, 502.5f, 265.2f, 500.1f, 268.9f, 498.2f)
                lineTo(300.9f, 474.0f)
                lineTo(353.5f, 434.3f)
                lineTo(460.2f, 354.4f)
                lineTo(460.5f, 354.1f)
                curveTo(482.9f, 337.2f, 499.2f, 313.5f, 506.1f, 286.6f)
                curveTo(514.7f, 259.6f, 513.5f, 230.8f, 503.5f, 204.6f)
                close()
            }
        }
        .build()
        return _gitlab!!
    }

private var _gitlab: ImageVector? = null
