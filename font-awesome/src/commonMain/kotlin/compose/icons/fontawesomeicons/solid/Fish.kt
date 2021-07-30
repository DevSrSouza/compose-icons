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

public val SolidGroup.Fish: ImageVector
    get() {
        if (_fish != null) {
            return _fish!!
        }
        _fish = Builder(name = "Fish", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(327.1f, 96.0f)
                curveToRelative(-89.97f, 0.0f, -168.54f, 54.77f, -212.27f, 101.63f)
                lineTo(27.5f, 131.58f)
                curveToRelative(-12.13f, -9.18f, -30.24f, 0.6f, -27.14f, 14.66f)
                lineTo(24.54f, 256.0f)
                lineTo(0.35f, 365.77f)
                curveToRelative(-3.1f, 14.06f, 15.01f, 23.83f, 27.14f, 14.66f)
                lineToRelative(87.33f, -66.05f)
                curveTo(158.55f, 361.23f, 237.13f, 416.0f, 327.1f, 416.0f)
                curveTo(464.56f, 416.0f, 576.0f, 288.0f, 576.0f, 256.0f)
                reflectiveCurveTo(464.56f, 96.0f, 327.1f, 96.0f)
                close()
                moveTo(414.53f, 280.0f)
                curveToRelative(-13.25f, 0.0f, -24.0f, -10.75f, -24.0f, -24.0f)
                curveToRelative(0.0f, -13.26f, 10.75f, -24.0f, 24.0f, -24.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, 10.74f, 24.0f, 24.0f)
                curveToRelative(0.0f, 13.25f, -10.75f, 24.0f, -24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _fish!!
    }

private var _fish: ImageVector? = null
