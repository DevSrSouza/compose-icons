package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Circleci: ImageVector
    get() {
        if (_circleci != null) {
            return _circleci!!
        }
        _circleci = Builder(name = "Circleci", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 0.0f)
                curveTo(5.3726f, 0.0f, 0.0f, 5.3726f, 0.0f, 12.0f)
                curveTo(0.0f, 18.6274f, 5.3726f, 24.0f, 12.0f, 24.0f)
                curveTo(18.6274f, 24.0f, 24.0f, 18.6274f, 24.0f, 12.0f)
                curveTo(24.0f, 5.3726f, 18.6274f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(4.1435f, 13.5165f)
                curveTo(4.8522f, 17.2096f, 8.1002f, 20.0f, 12.0f, 20.0f)
                curveTo(16.4183f, 20.0f, 20.0f, 16.4183f, 20.0f, 12.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                curveTo(8.0886f, 4.0f, 4.8328f, 6.807f, 4.1373f, 10.5165f)
                lineTo(6.7282f, 10.5071f)
                curveTo(7.3782f, 8.2074f, 9.4924f, 6.5222f, 12.0001f, 6.5222f)
                curveTo(15.0254f, 6.5222f, 17.4779f, 8.9747f, 17.4779f, 12.0f)
                curveTo(17.4779f, 15.0253f, 15.0254f, 17.4778f, 12.0001f, 17.4778f)
                curveTo(9.4975f, 17.4778f, 7.3869f, 15.7995f, 6.7323f, 13.5071f)
                lineTo(4.1435f, 13.5165f)
                close()
                moveTo(9.5223f, 12.0f)
                curveTo(9.5223f, 13.3684f, 10.6317f, 14.4778f, 12.0001f, 14.4778f)
                curveTo(13.3685f, 14.4778f, 14.4779f, 13.3684f, 14.4779f, 12.0f)
                curveTo(14.4779f, 10.6316f, 13.3685f, 9.5222f, 12.0001f, 9.5222f)
                curveTo(10.6317f, 9.5222f, 9.5223f, 10.6316f, 9.5223f, 12.0f)
                close()
            }
        }
        .build()
        return _circleci!!
    }

private var _circleci: ImageVector? = null
