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

public val LineAwesomeIcons.AudioDescriptionSolid: ImageVector
    get() {
        if (_audioDescriptionSolid != null) {
            return _audioDescriptionSolid!!
        }
        _audioDescriptionSolid = Builder(name = "AudioDescriptionSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5938f, 7.0f)
                lineTo(5.2813f, 7.2813f)
                curveTo(5.2813f, 7.2813f, 2.0f, 10.6016f, 2.0f, 16.0f)
                curveTo(2.0f, 21.3984f, 5.2813f, 24.7188f, 5.2813f, 24.7188f)
                lineTo(5.5938f, 25.0f)
                lineTo(26.4063f, 25.0f)
                lineTo(26.7188f, 24.7188f)
                curveTo(26.7188f, 24.7188f, 30.0f, 21.3984f, 30.0f, 16.0f)
                curveTo(30.0f, 10.6016f, 26.7188f, 7.2813f, 26.7188f, 7.2813f)
                lineTo(26.4063f, 7.0f)
                close()
                moveTo(6.5313f, 9.0f)
                lineTo(25.4688f, 9.0f)
                curveTo(25.8047f, 9.3555f, 28.0f, 11.7305f, 28.0f, 16.0f)
                curveTo(28.0f, 20.2695f, 25.8047f, 22.6445f, 25.4688f, 23.0f)
                lineTo(6.5313f, 23.0f)
                curveTo(6.1953f, 22.6445f, 4.0f, 20.2695f, 4.0f, 16.0f)
                curveTo(4.0f, 11.7305f, 6.1953f, 9.3555f, 6.5313f, 9.0f)
                close()
                moveTo(10.375f, 12.0f)
                lineTo(6.375f, 20.0f)
                lineTo(8.625f, 20.0f)
                lineTo(9.125f, 19.0f)
                lineTo(11.0f, 19.0f)
                lineTo(11.0f, 20.0f)
                lineTo(13.0f, 20.0f)
                curveTo(15.1992f, 20.0f, 17.0f, 18.1992f, 17.0f, 16.0f)
                curveTo(17.0f, 13.8008f, 15.1992f, 12.0f, 13.0f, 12.0f)
                close()
                moveTo(15.9688f, 12.0f)
                curveTo(17.1953f, 12.9102f, 18.0f, 14.3594f, 18.0f, 16.0f)
                curveTo(18.0f, 17.6406f, 17.1953f, 19.0898f, 15.9688f, 20.0f)
                lineTo(18.75f, 20.0f)
                curveTo(19.543f, 18.8633f, 20.0f, 17.4883f, 20.0f, 16.0f)
                curveTo(20.0f, 14.5117f, 19.543f, 13.1367f, 18.75f, 12.0f)
                close()
                moveTo(19.9063f, 12.0f)
                curveTo(20.5898f, 13.1797f, 21.0f, 14.543f, 21.0f, 16.0f)
                curveTo(21.0f, 17.457f, 20.5898f, 18.8203f, 19.9063f, 20.0f)
                lineTo(22.1563f, 20.0f)
                curveTo(22.6914f, 18.7734f, 23.0f, 17.4219f, 23.0f, 16.0f)
                curveTo(23.0f, 14.5781f, 22.6953f, 13.2266f, 22.1563f, 12.0f)
                close()
                moveTo(23.25f, 12.0f)
                curveTo(23.7383f, 13.2422f, 24.0f, 14.5898f, 24.0f, 16.0f)
                curveTo(24.0f, 17.4102f, 23.7383f, 18.7578f, 23.25f, 20.0f)
                lineTo(25.375f, 20.0f)
                curveTo(25.7852f, 18.7383f, 26.0f, 17.3945f, 26.0f, 16.0f)
                curveTo(26.0f, 14.6055f, 25.7852f, 13.2617f, 25.375f, 12.0f)
                close()
                moveTo(13.0f, 14.0f)
                curveTo(14.1172f, 14.0f, 15.0f, 14.8828f, 15.0f, 16.0f)
                curveTo(15.0f, 17.1172f, 14.1172f, 18.0f, 13.0f, 18.0f)
                close()
                moveTo(11.0f, 15.25f)
                lineTo(11.0f, 17.0f)
                lineTo(10.125f, 17.0f)
                close()
            }
        }
        .build()
        return _audioDescriptionSolid!!
    }

private var _audioDescriptionSolid: ImageVector? = null
