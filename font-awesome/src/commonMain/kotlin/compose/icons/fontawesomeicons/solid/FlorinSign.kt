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

public val SolidGroup.FlorinSign: ImageVector
    get() {
        if (_florinSign != null) {
            return _florinSign!!
        }
        _florinSign = Builder(name = "FlorinSign", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(314.7f, 32.0f)
                curveToRelative(-38.8f, 0.0f, -73.7f, 23.3f, -88.6f, 59.1f)
                lineTo(170.7f, 224.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(80.0f)
                lineTo(98.9f, 396.3f)
                curveToRelative(-5.0f, 11.9f, -16.6f, 19.7f, -29.5f, 19.7f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(69.3f)
                curveToRelative(38.8f, 0.0f, 73.7f, -23.3f, 88.6f, -59.1f)
                lineTo(213.3f, 288.0f)
                horizontalLineTo(320.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(240.0f)
                lineToRelative(45.1f, -108.3f)
                curveToRelative(5.0f, -11.9f, 16.6f, -19.7f, 29.5f, -19.7f)
                horizontalLineTo(352.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(314.7f)
                close()
            }
        }
        .build()
        return _florinSign!!
    }

private var _florinSign: ImageVector? = null
