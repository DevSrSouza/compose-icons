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

public val LineAwesomeIcons.SpeakerDeck: ImageVector
    get() {
        if (_speakerDeck != null) {
            return _speakerDeck!!
        }
        _speakerDeck = Builder(name = "SpeakerDeck", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 8.0f)
                curveTo(5.243f, 8.0f, 3.0f, 10.243f, 3.0f, 13.0f)
                curveTo(3.0f, 15.757f, 5.243f, 18.0f, 8.0f, 18.0f)
                lineTo(14.0f, 18.0f)
                curveTo(14.551f, 18.0f, 15.0f, 18.448f, 15.0f, 19.0f)
                curveTo(15.0f, 19.552f, 14.551f, 20.0f, 14.0f, 20.0f)
                lineTo(5.0f, 20.0f)
                curveTo(3.896f, 20.0f, 3.0f, 20.896f, 3.0f, 22.0f)
                curveTo(3.0f, 23.104f, 3.896f, 24.0f, 5.0f, 24.0f)
                lineTo(14.0f, 24.0f)
                curveTo(16.757f, 24.0f, 19.0f, 21.757f, 19.0f, 19.0f)
                curveTo(19.0f, 16.243f, 16.757f, 14.0f, 14.0f, 14.0f)
                lineTo(8.0f, 14.0f)
                curveTo(7.449f, 14.0f, 7.0f, 13.552f, 7.0f, 13.0f)
                curveTo(7.0f, 12.448f, 7.449f, 12.0f, 8.0f, 12.0f)
                lineTo(15.0f, 12.0f)
                curveTo(16.104f, 12.0f, 17.0f, 11.104f, 17.0f, 10.0f)
                curveTo(17.0f, 8.896f, 16.104f, 8.0f, 15.0f, 8.0f)
                lineTo(8.0f, 8.0f)
                close()
                moveTo(18.4453f, 8.0f)
                curveTo(18.7893f, 8.59f, 19.0f, 9.268f, 19.0f, 10.0f)
                curveTo(19.0f, 10.734f, 18.7835f, 11.409f, 18.4395f, 12.0f)
                lineTo(24.0f, 12.0f)
                curveTo(24.552f, 12.0f, 25.0f, 12.448f, 25.0f, 13.0f)
                lineTo(25.0f, 19.0f)
                curveTo(25.0f, 19.552f, 24.552f, 20.0f, 24.0f, 20.0f)
                lineTo(20.9199f, 20.0f)
                curveTo(20.6959f, 21.556f, 19.9637f, 22.949f, 18.8887f, 24.0f)
                lineTo(25.0f, 24.0f)
                curveTo(27.209f, 24.0f, 29.0f, 22.209f, 29.0f, 20.0f)
                lineTo(29.0f, 12.0f)
                curveTo(29.0f, 9.791f, 27.209f, 8.0f, 25.0f, 8.0f)
                lineTo(18.4453f, 8.0f)
                close()
            }
        }
        .build()
        return _speakerDeck!!
    }

private var _speakerDeck: ImageVector? = null
