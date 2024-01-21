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

public val SolidGroup.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(73.0f, 39.0f)
                curveToRelative(-14.8f, -9.1f, -33.4f, -9.4f, -48.5f, -0.9f)
                reflectiveCurveTo(0.0f, 62.6f, 0.0f, 80.0f)
                verticalLineTo(432.0f)
                curveToRelative(0.0f, 17.4f, 9.4f, 33.4f, 24.5f, 41.9f)
                reflectiveCurveToRelative(33.7f, 8.1f, 48.5f, -0.9f)
                lineTo(361.0f, 297.0f)
                curveToRelative(14.3f, -8.7f, 23.0f, -24.2f, 23.0f, -41.0f)
                reflectiveCurveToRelative(-8.7f, -32.2f, -23.0f, -41.0f)
                lineTo(73.0f, 39.0f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
