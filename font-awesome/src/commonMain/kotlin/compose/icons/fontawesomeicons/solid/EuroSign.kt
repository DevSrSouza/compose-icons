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

public val SolidGroup.EuroSign: ImageVector
    get() {
        if (_euroSign != null) {
            return _euroSign!!
        }
        _euroSign = Builder(name = "EuroSign", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(310.706f, 413.765f)
                curveToRelative(-1.314f, -6.63f, -7.835f, -10.872f, -14.424f, -9.369f)
                curveToRelative(-10.692f, 2.439f, -27.422f, 5.413f, -45.426f, 5.413f)
                curveToRelative(-56.763f, 0.0f, -101.929f, -34.79f, -121.461f, -85.449f)
                horizontalLineToRelative(113.689f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.708f, -9.369f)
                lineToRelative(6.373f, -28.36f)
                curveToRelative(1.686f, -7.502f, -4.019f, -14.631f, -11.708f, -14.631f)
                horizontalLineTo(115.22f)
                curveToRelative(-1.21f, -14.328f, -1.414f, -28.287f, 0.137f, -42.245f)
                horizontalLineTo(261.95f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.723f, -9.434f)
                lineToRelative(6.512f, -29.755f)
                curveToRelative(1.638f, -7.484f, -4.061f, -14.566f, -11.723f, -14.566f)
                horizontalLineTo(130.184f)
                curveToRelative(20.633f, -44.991f, 62.69f, -75.03f, 117.619f, -75.03f)
                curveToRelative(14.486f, 0.0f, 28.564f, 2.25f, 37.851f, 4.145f)
                curveToRelative(6.216f, 1.268f, 12.347f, -2.498f, 14.002f, -8.623f)
                lineToRelative(11.991f, -44.368f)
                curveToRelative(1.822f, -6.741f, -2.465f, -13.616f, -9.326f, -14.917f)
                curveTo(290.217f, 34.912f, 270.71f, 32.0f, 249.635f, 32.0f)
                curveTo(152.451f, 32.0f, 74.03f, 92.252f, 45.075f, 176.0f)
                horizontalLineTo(12.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
                verticalLineToRelative(29.755f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(21.569f)
                curveToRelative(-1.009f, 13.607f, -1.181f, 29.287f, -0.181f, 42.245f)
                horizontalLineTo(12.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
                verticalLineToRelative(28.36f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(30.114f)
                curveTo(67.139f, 414.692f, 145.264f, 480.0f, 249.635f, 480.0f)
                curveToRelative(26.301f, 0.0f, 48.562f, -4.544f, 61.101f, -7.788f)
                curveToRelative(6.167f, -1.595f, 10.027f, -7.708f, 8.788f, -13.957f)
                lineToRelative(-8.818f, -44.49f)
                close()
            }
        }
        .build()
        return _euroSign!!
    }

private var _euroSign: ImageVector? = null
