package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(name = "Paperclip", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(43.246f, 466.142f)
                curveToRelative(-58.43f, -60.289f, -57.341f, -157.511f, 1.386f, -217.581f)
                lineTo(254.392f, 34.0f)
                curveToRelative(44.316f, -45.332f, 116.351f, -45.336f, 160.671f, 0.0f)
                curveToRelative(43.89f, 44.894f, 43.943f, 117.329f, 0.0f, 162.276f)
                lineTo(232.214f, 383.128f)
                curveToRelative(-29.855f, 30.537f, -78.633f, 30.111f, -107.982f, -0.998f)
                curveToRelative(-28.275f, -29.97f, -27.368f, -77.473f, 1.452f, -106.953f)
                lineToRelative(143.743f, -146.835f)
                curveToRelative(6.182f, -6.314f, 16.312f, -6.422f, 22.626f, -0.241f)
                lineToRelative(22.861f, 22.379f)
                curveToRelative(6.315f, 6.182f, 6.422f, 16.312f, 0.241f, 22.626f)
                lineTo(171.427f, 319.927f)
                curveToRelative(-4.932f, 5.045f, -5.236f, 13.428f, -0.648f, 18.292f)
                curveToRelative(4.372f, 4.634f, 11.245f, 4.711f, 15.688f, 0.165f)
                lineToRelative(182.849f, -186.851f)
                curveToRelative(19.613f, -20.062f, 19.613f, -52.725f, -0.011f, -72.798f)
                curveToRelative(-19.189f, -19.627f, -49.957f, -19.637f, -69.154f, 0.0f)
                lineTo(90.39f, 293.295f)
                curveToRelative(-34.763f, 35.56f, -35.299f, 93.12f, -1.191f, 128.313f)
                curveToRelative(34.01f, 35.093f, 88.985f, 35.137f, 123.058f, 0.286f)
                lineToRelative(172.06f, -175.999f)
                curveToRelative(6.177f, -6.319f, 16.307f, -6.433f, 22.626f, -0.256f)
                lineToRelative(22.877f, 22.364f)
                curveToRelative(6.319f, 6.177f, 6.434f, 16.307f, 0.256f, 22.626f)
                lineToRelative(-172.06f, 175.998f)
                curveToRelative(-59.576f, 60.938f, -155.943f, 60.216f, -214.77f, -0.485f)
                close()
            }
        }
        .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
