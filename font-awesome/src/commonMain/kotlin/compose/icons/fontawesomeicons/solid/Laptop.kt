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

public val SolidGroup.Laptop: ImageVector
    get() {
        if (_laptop != null) {
            return _laptop!!
        }
        _laptop = Builder(name = "Laptop", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(624.0f, 416.0f)
                lineTo(381.54f, 416.0f)
                curveToRelative(-0.74f, 19.81f, -14.71f, 32.0f, -32.74f, 32.0f)
                lineTo(288.0f, 448.0f)
                curveToRelative(-18.69f, 0.0f, -33.02f, -17.47f, -32.77f, -32.0f)
                lineTo(16.0f, 416.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 35.2f, 28.8f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(512.0f)
                curveToRelative(35.2f, 0.0f, 64.0f, -28.8f, 64.0f, -64.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(576.0f, 48.0f)
                curveToRelative(0.0f, -26.4f, -21.6f, -48.0f, -48.0f, -48.0f)
                lineTo(112.0f, 0.0f)
                curveTo(85.6f, 0.0f, 64.0f, 21.6f, 64.0f, 48.0f)
                verticalLineToRelative(336.0f)
                horizontalLineToRelative(512.0f)
                lineTo(576.0f, 48.0f)
                close()
                moveTo(512.0f, 320.0f)
                lineTo(128.0f, 320.0f)
                lineTo(128.0f, 64.0f)
                horizontalLineToRelative(384.0f)
                verticalLineToRelative(256.0f)
                close()
            }
        }
        .build()
        return _laptop!!
    }

private var _laptop: ImageVector? = null
