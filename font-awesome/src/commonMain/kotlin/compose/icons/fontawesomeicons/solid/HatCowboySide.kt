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
                moveTo(463.2f, 71.3f)
                curveToRelative(-2.4f, -12.8f, -9.8f, -24.1f, -20.7f, -31.3f)
                reflectiveCurveToRelative(-24.2f, -9.7f, -36.9f, -6.8f)
                lineToRelative(-216.0f, 48.0f)
                curveToRelative(-19.8f, 4.4f, -34.7f, 20.8f, -37.2f, 40.9f)
                lineToRelative(-8.8f, 70.6f)
                curveToRelative(5.3f, -0.4f, 10.8f, -0.7f, 16.5f, -0.7f)
                curveToRelative(82.9f, 0.0f, 141.9f, 55.3f, 197.5f, 107.5f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(3.1f, 3.0f, 6.3f, 5.9f, 9.4f, 8.8f)
                curveTo(427.1f, 364.5f, 486.9f, 416.0f, 576.0f, 416.0f)
                curveToRelative(0.0f, 0.0f, 64.0f, 0.0f, 64.0f, -48.0f)
                curveToRelative(0.0f, -96.0f, -112.0f, -128.0f, -144.0f, -128.0f)
                horizontalLineToRelative(-1.6f)
                lineTo(463.2f, 71.3f)
                close()
                moveTo(576.0f, 448.0f)
                curveToRelative(-102.9f, 0.0f, -171.1f, -60.5f, -230.9f, -116.3f)
                lineToRelative(-6.5f, -6.0f)
                curveTo(279.9f, 270.8f, 229.9f, 224.0f, 160.0f, 224.0f)
                curveToRelative(-57.8f, 0.0f, -97.4f, 28.6f, -123.1f, 63.5f)
                curveTo(10.7f, 323.0f, 0.0f, 363.8f, 0.0f, 384.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineTo(576.0f)
                close()
            }
        }
        .build()
        return _hatCowboySide!!
    }

private var _hatCowboySide: ImageVector? = null
