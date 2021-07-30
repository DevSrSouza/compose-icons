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

public val BrandsGroup.SpeakerDeck: ImageVector
    get() {
        if (_speakerDeck != null) {
            return _speakerDeck!!
        }
        _speakerDeck = Builder(name = "SpeakerDeck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.86f, 296.0f)
                horizontalLineTo(100.0f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, true, 0.0f, -200.0f)
                horizontalLineToRelative(132.84f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, 80.0f)
                horizontalLineTo(98.0f)
                curveToRelative(-26.47f, 0.0f, -26.45f, 40.0f, 0.0f, 40.0f)
                horizontalLineToRelative(113.82f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, true, 0.0f, 200.0f)
                horizontalLineTo(40.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, -80.0f)
                horizontalLineToRelative(173.86f)
                curveToRelative(26.48f, 0.0f, 26.46f, -40.0f, 0.0f, -40.0f)
                close()
                moveTo(298.0f, 416.0f)
                arcToRelative(120.21f, 120.21f, 0.0f, false, false, 51.11f, -80.0f)
                horizontalLineToRelative(64.55f)
                arcToRelative(19.83f, 19.83f, 0.0f, false, false, 19.66f, -20.0f)
                verticalLineTo(196.0f)
                arcToRelative(19.83f, 19.83f, 0.0f, false, false, -19.66f, -20.0f)
                horizontalLineTo(296.42f)
                arcToRelative(60.77f, 60.77f, 0.0f, false, false, 0.0f, -80.0f)
                horizontalLineToRelative(136.93f)
                curveToRelative(43.44f, 0.0f, 78.65f, 35.82f, 78.65f, 80.0f)
                verticalLineToRelative(160.0f)
                curveToRelative(0.0f, 44.18f, -35.21f, 80.0f, -78.65f, 80.0f)
                close()
            }
        }
        .build()
        return _speakerDeck!!
    }

private var _speakerDeck: ImageVector? = null
