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

public val SolidGroup.Tags: ImageVector
    get() {
        if (_tags != null) {
            return _tags!!
        }
        _tags = Builder(name = "Tags", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(345.0f, 39.1f)
                lineTo(472.8f, 168.4f)
                curveToRelative(52.4f, 53.0f, 52.4f, 138.2f, 0.0f, 191.2f)
                lineTo(360.8f, 472.9f)
                curveToRelative(-9.3f, 9.4f, -24.5f, 9.5f, -33.9f, 0.2f)
                reflectiveCurveToRelative(-9.5f, -24.5f, -0.2f, -33.9f)
                lineTo(438.6f, 325.9f)
                curveToRelative(33.9f, -34.3f, 33.9f, -89.4f, 0.0f, -123.7f)
                lineTo(310.9f, 72.9f)
                curveToRelative(-9.3f, -9.4f, -9.2f, -24.6f, 0.2f, -33.9f)
                reflectiveCurveToRelative(24.6f, -9.2f, 33.9f, 0.2f)
                close()
                moveTo(0.0f, 229.5f)
                verticalLineTo(80.0f)
                curveTo(0.0f, 53.5f, 21.5f, 32.0f, 48.0f, 32.0f)
                horizontalLineTo(197.5f)
                curveToRelative(17.0f, 0.0f, 33.3f, 6.7f, 45.3f, 18.7f)
                lineToRelative(168.0f, 168.0f)
                curveToRelative(25.0f, 25.0f, 25.0f, 65.5f, 0.0f, 90.5f)
                lineTo(277.3f, 442.7f)
                curveToRelative(-25.0f, 25.0f, -65.5f, 25.0f, -90.5f, 0.0f)
                lineToRelative(-168.0f, -168.0f)
                curveTo(6.7f, 262.7f, 0.0f, 246.5f, 0.0f, 229.5f)
                close()
                moveTo(144.0f, 144.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _tags!!
    }

private var _tags: ImageVector? = null
