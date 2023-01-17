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

public val BrandsGroup.Linode: ImageVector
    get() {
        if (_linode != null) {
            return _linode!!
        }
        _linode = Builder(name = "Linode", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(366.036f, 186.867f)
                lineToRelative(-59.5f, 36.871f)
                lineToRelative(-0.838f, 36.871f)
                lineToRelative(-29.329f, -19.273f)
                lineToRelative(-39.384f, 24.3f)
                curveToRelative(2.238f, 55.211f, 2.483f, 59.271f, 2.51f, 59.5f)
                lineToRelative(-97.2f, 65.359f)
                lineTo(127.214f, 285.748f)
                lineToRelative(108.1f, -62.01f)
                lineTo(195.09f, 197.761f)
                lineToRelative(-75.417f, 38.547f)
                lineTo(98.723f, 93.015f)
                lineTo(227.771f, 43.574f)
                lineTo(136.432f, 0.0f)
                lineTo(10.737f, 39.385f)
                lineTo(38.39f, 174.3f)
                lineToRelative(41.9f, 32.681f)
                lineTo(48.445f, 222.062f)
                lineTo(69.394f, 323.457f)
                lineTo(98.723f, 351.11f)
                lineTo(77.774f, 363.679f)
                lineToRelative(16.76f, 78.769f)
                lineTo(160.733f, 512.0f)
                curveToRelative(-10.8f, -74.842f, -11.658f, -78.641f, -11.725f, -78.773f)
                lineToRelative(77.925f, -55.3f)
                curveToRelative(16.759f, -12.57f, 15.083f, -10.894f, 15.083f, -10.894f)
                lineToRelative(0.838f, 24.3f)
                lineToRelative(33.519f, 28.491f)
                lineToRelative(-0.838f, -77.093f)
                lineToRelative(46.927f, -33.519f)
                lineToRelative(26.815f, -18.435f)
                lineToRelative(-2.514f, 36.033f)
                lineToRelative(25.139f, 17.6f)
                lineToRelative(6.7f, -74.579f)
                lineToRelative(58.657f, -43.575f)
                close()
            }
        }
        .build()
        return _linode!!
    }

private var _linode: ImageVector? = null
