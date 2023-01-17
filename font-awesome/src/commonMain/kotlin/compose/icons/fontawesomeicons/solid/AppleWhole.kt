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

public val SolidGroup.AppleWhole: ImageVector
    get() {
        if (_appleWhole != null) {
            return _appleWhole!!
        }
        _appleWhole = Builder(name = "AppleWhole", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 112.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                verticalLineTo(80.0f)
                curveToRelative(0.0f, -44.2f, 35.8f, -80.0f, 80.0f, -80.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                verticalLineTo(32.0f)
                curveToRelative(0.0f, 44.2f, -35.8f, 80.0f, -80.0f, 80.0f)
                horizontalLineTo(224.0f)
                close()
                moveTo(0.0f, 288.0f)
                curveToRelative(0.0f, -76.3f, 35.7f, -160.0f, 112.0f, -160.0f)
                curveToRelative(27.3f, 0.0f, 59.7f, 10.3f, 82.7f, 19.3f)
                curveToRelative(18.8f, 7.3f, 39.9f, 7.3f, 58.7f, 0.0f)
                curveToRelative(22.9f, -8.9f, 55.4f, -19.3f, 82.7f, -19.3f)
                curveToRelative(76.3f, 0.0f, 112.0f, 83.7f, 112.0f, 160.0f)
                curveToRelative(0.0f, 128.0f, -80.0f, 224.0f, -160.0f, 224.0f)
                curveToRelative(-16.5f, 0.0f, -38.1f, -6.6f, -51.5f, -11.3f)
                curveToRelative(-8.1f, -2.8f, -16.9f, -2.8f, -25.0f, 0.0f)
                curveToRelative(-13.4f, 4.7f, -35.0f, 11.3f, -51.5f, 11.3f)
                curveTo(80.0f, 512.0f, 0.0f, 416.0f, 0.0f, 288.0f)
                close()
            }
        }
        .build()
        return _appleWhole!!
    }

private var _appleWhole: ImageVector? = null
