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

public val LineAwesomeIcons.ApplePay: ImageVector
    get() {
        if (_applePay != null) {
            return _applePay!!
        }
        _applePay = Builder(name = "ApplePay", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.8281f, 9.0f)
                curveTo(8.2431f, 9.0f, 7.5647f, 9.3351f, 7.1367f, 9.8301f)
                curveTo(6.8007f, 10.2391f, 6.4393f, 10.8785f, 6.5703f, 11.5195f)
                curveTo(7.1733f, 11.5925f, 7.8262f, 11.2206f, 8.1992f, 10.7266f)
                curveTo(8.6282f, 10.2686f, 8.8651f, 9.641f, 8.8281f, 9.0f)
                close()
                moveTo(4.7988f, 11.6602f)
                curveTo(3.2138f, 11.6602f, 2.0f, 13.0373f, 2.0f, 15.0273f)
                curveTo(2.0f, 17.6273f, 3.8251f, 20.0f, 4.9531f, 20.0f)
                curveTo(5.6431f, 20.0f, 5.8988f, 19.5488f, 6.8008f, 19.5488f)
                curveTo(7.6398f, 19.5488f, 7.9019f, 20.0f, 8.6289f, 20.0f)
                curveTo(9.9799f, 20.0f, 11.0996f, 17.2453f, 11.1406f, 17.0723f)
                curveTo(10.9186f, 16.9743f, 9.6172f, 16.3493f, 9.6172f, 14.8633f)
                curveTo(9.6172f, 13.4293f, 10.8055f, 12.783f, 10.8555f, 12.752f)
                curveTo(10.2095f, 11.776f, 9.1644f, 11.6602f, 8.7734f, 11.6602f)
                curveTo(7.8664f, 11.6602f, 7.0638f, 12.1543f, 6.6348f, 12.1543f)
                curveTo(6.1868f, 12.1543f, 5.5328f, 11.6602f, 4.7988f, 11.6602f)
                close()
                moveTo(13.0f, 12.0f)
                lineTo(13.0f, 20.0f)
                lineTo(15.0f, 20.0f)
                lineTo(15.0f, 17.0f)
                lineTo(15.5f, 17.0f)
                curveTo(16.4809f, 17.0f, 17.174f, 16.3327f, 17.582f, 15.5f)
                lineTo(18.0f, 15.5f)
                lineTo(18.0f, 14.5f)
                curveTo(18.0f, 13.1309f, 16.8691f, 12.0f, 15.5f, 12.0f)
                lineTo(13.0f, 12.0f)
                close()
                moveTo(20.2227f, 12.0f)
                lineTo(18.0f, 18.8418f)
                lineTo(18.0f, 20.0f)
                lineTo(20.0f, 20.0f)
                lineTo(20.0f, 19.1582f)
                lineTo(20.0508f, 19.0f)
                lineTo(21.9492f, 19.0f)
                lineTo(22.0f, 19.1582f)
                lineTo(22.0f, 20.0f)
                lineTo(24.0f, 20.0f)
                lineTo(24.0f, 18.8418f)
                lineTo(21.7773f, 12.0f)
                lineTo(20.2227f, 12.0f)
                close()
                moveTo(24.0f, 12.0f)
                lineTo(24.0f, 13.2969f)
                lineTo(26.0f, 16.373f)
                lineTo(26.0f, 20.0f)
                lineTo(28.0f, 20.0f)
                lineTo(28.0f, 16.373f)
                lineTo(30.0f, 13.2969f)
                lineTo(30.0f, 12.0f)
                lineTo(28.0f, 12.0f)
                lineTo(28.0f, 12.7031f)
                lineTo(27.0f, 14.2422f)
                lineTo(26.0f, 12.7031f)
                lineTo(26.0f, 12.0f)
                lineTo(24.0f, 12.0f)
                close()
                moveTo(15.0f, 14.0f)
                lineTo(15.5f, 14.0f)
                curveTo(15.7869f, 14.0f, 16.0f, 14.2131f, 16.0f, 14.5f)
                curveTo(16.0f, 14.7869f, 15.7869f, 15.0f, 15.5f, 15.0f)
                lineTo(15.0f, 15.0f)
                lineTo(15.0f, 14.0f)
                close()
                moveTo(21.0f, 16.0801f)
                lineTo(21.2988f, 17.0f)
                lineTo(20.7012f, 17.0f)
                lineTo(21.0f, 16.0801f)
                close()
            }
        }
        .build()
        return _applePay!!
    }

private var _applePay: ImageVector? = null
