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

public val SolidGroup.WhiskeyGlass: ImageVector
    get() {
        if (_whiskeyGlass != null) {
            return _whiskeyGlass!!
        }
        _whiskeyGlass = Builder(name = "WhiskeyGlass", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 32.0f)
                curveToRelative(-9.3f, 0.0f, -18.1f, 4.0f, -24.2f, 11.1f)
                reflectiveCurveTo(-1.0f, 59.4f, 0.3f, 68.6f)
                lineToRelative(50.0f, 342.9f)
                curveToRelative(5.7f, 39.3f, 39.4f, 68.5f, 79.2f, 68.5f)
                horizontalLineToRelative(253.0f)
                curveToRelative(39.7f, 0.0f, 73.4f, -29.1f, 79.2f, -68.5f)
                lineToRelative(50.0f, -342.9f)
                curveToRelative(1.3f, -9.2f, -1.4f, -18.5f, -7.5f, -25.5f)
                reflectiveCurveTo(489.3f, 32.0f, 480.0f, 32.0f)
                horizontalLineTo(32.0f)
                close()
                moveTo(87.7f, 224.0f)
                lineTo(69.0f, 96.0f)
                horizontalLineTo(443.0f)
                lineTo(424.3f, 224.0f)
                horizontalLineTo(87.7f)
                close()
            }
        }
        .build()
        return _whiskeyGlass!!
    }

private var _whiskeyGlass: ImageVector? = null
