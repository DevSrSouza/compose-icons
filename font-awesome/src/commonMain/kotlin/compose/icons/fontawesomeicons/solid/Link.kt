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

public val SolidGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(579.8f, 267.7f)
                curveToRelative(56.5f, -56.5f, 56.5f, -148.0f, 0.0f, -204.5f)
                curveToRelative(-50.0f, -50.0f, -128.8f, -56.5f, -186.3f, -15.4f)
                lineToRelative(-1.6f, 1.1f)
                curveToRelative(-14.4f, 10.3f, -17.7f, 30.3f, -7.4f, 44.6f)
                reflectiveCurveToRelative(30.3f, 17.7f, 44.6f, 7.4f)
                lineToRelative(1.6f, -1.1f)
                curveToRelative(32.1f, -22.9f, 76.0f, -19.3f, 103.8f, 8.6f)
                curveToRelative(31.5f, 31.5f, 31.5f, 82.5f, 0.0f, 114.0f)
                lineTo(422.3f, 334.8f)
                curveToRelative(-31.5f, 31.5f, -82.5f, 31.5f, -114.0f, 0.0f)
                curveToRelative(-27.9f, -27.9f, -31.5f, -71.8f, -8.6f, -103.8f)
                lineToRelative(1.1f, -1.6f)
                curveToRelative(10.3f, -14.4f, 6.9f, -34.4f, -7.4f, -44.6f)
                reflectiveCurveToRelative(-34.4f, -6.9f, -44.6f, 7.4f)
                lineToRelative(-1.1f, 1.6f)
                curveTo(206.5f, 251.2f, 213.0f, 330.0f, 263.0f, 380.0f)
                curveToRelative(56.5f, 56.5f, 148.0f, 56.5f, 204.5f, 0.0f)
                lineTo(579.8f, 267.7f)
                close()
                moveTo(60.2f, 244.3f)
                curveToRelative(-56.5f, 56.5f, -56.5f, 148.0f, 0.0f, 204.5f)
                curveToRelative(50.0f, 50.0f, 128.8f, 56.5f, 186.3f, 15.4f)
                lineToRelative(1.6f, -1.1f)
                curveToRelative(14.4f, -10.3f, 17.7f, -30.3f, 7.4f, -44.6f)
                reflectiveCurveToRelative(-30.3f, -17.7f, -44.6f, -7.4f)
                lineToRelative(-1.6f, 1.1f)
                curveToRelative(-32.1f, 22.9f, -76.0f, 19.3f, -103.8f, -8.6f)
                curveTo(74.0f, 372.0f, 74.0f, 321.0f, 105.5f, 289.5f)
                lineTo(217.7f, 177.2f)
                curveToRelative(31.5f, -31.5f, 82.5f, -31.5f, 114.0f, 0.0f)
                curveToRelative(27.9f, 27.9f, 31.5f, 71.8f, 8.6f, 103.9f)
                lineToRelative(-1.1f, 1.6f)
                curveToRelative(-10.3f, 14.4f, -6.9f, 34.4f, 7.4f, 44.6f)
                reflectiveCurveToRelative(34.4f, 6.9f, 44.6f, -7.4f)
                lineToRelative(1.1f, -1.6f)
                curveTo(433.5f, 260.8f, 427.0f, 182.0f, 377.0f, 132.0f)
                curveToRelative(-56.5f, -56.5f, -148.0f, -56.5f, -204.5f, 0.0f)
                lineTo(60.2f, 244.3f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
