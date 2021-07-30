package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.HatCowboySide: ImageVector
    get() {
        if (_hatCowboySide != null) {
            return _hatCowboySide!!
        }
        _hatCowboySide = Builder(name = "HatCowboySide", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(260.8f, 291.06f)
                curveToRelative(-28.63f, -22.94f, -62.0f, -35.06f, -96.4f, -35.06f)
                curveTo(87.0f, 256.0f, 21.47f, 318.72f, 1.43f, 412.06f)
                curveToRelative(-3.55f, 16.6f, -0.43f, 33.83f, 8.57f, 47.3f)
                curveTo(18.75f, 472.47f, 31.83f, 480.0f, 45.88f, 480.0f)
                lineTo(592.0f, 480.0f)
                curveToRelative(-103.21f, 0.0f, -155.0f, -37.07f, -233.19f, -104.46f)
                close()
                moveTo(495.45f, 272.77f)
                lineTo(468.4f, 116.2f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 392.0f, 64.41f)
                lineTo(200.85f, 105.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -50.35f, 55.79f)
                lineTo(143.61f, 226.0f)
                curveToRelative(6.9f, -0.83f, 13.7f, -2.0f, 20.79f, -2.0f)
                curveToRelative(41.79f, 0.0f, 82.0f, 14.55f, 117.29f, 42.82f)
                lineToRelative(98.0f, 84.48f)
                curveTo(450.76f, 412.54f, 494.9f, 448.0f, 592.0f, 448.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.0f, -48.0f)
                curveToRelative(0.0f, -25.39f, -29.6f, -119.33f, -144.55f, -127.23f)
                close()
            }
        }
        .build()
        return _hatCowboySide!!
    }

private var _hatCowboySide: ImageVector? = null
