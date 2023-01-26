package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.LocalPolice: ImageVector
    get() {
        if (_localPolice != null) {
            return _localPolice!!
        }
        _localPolice = Builder(name = "LocalPolice", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 12.59f)
                lineToRelative(0.63f, 2.73f)
                curveToRelative(0.1f, 0.43f, -0.37f, 0.77f, -0.75f, 0.54f)
                lineTo(12.0f, 14.42f)
                lineToRelative(-2.39f, 1.44f)
                curveToRelative(-0.38f, 0.23f, -0.85f, -0.11f, -0.75f, -0.54f)
                lineTo(9.5f, 12.6f)
                lineToRelative(-2.1f, -1.81f)
                curveTo(7.06f, 10.5f, 7.24f, 9.95f, 7.68f, 9.91f)
                lineToRelative(2.78f, -0.24f)
                lineToRelative(1.08f, -2.56f)
                curveToRelative(0.17f, -0.41f, 0.75f, -0.41f, 0.92f, 0.0f)
                lineToRelative(1.08f, 2.55f)
                lineToRelative(2.78f, 0.24f)
                curveToRelative(0.44f, 0.04f, 0.62f, 0.59f, 0.28f, 0.88f)
                lineTo(14.5f, 12.59f)
                close()
                moveTo(4.19f, 4.47f)
                curveTo(3.47f, 4.79f, 3.0f, 5.51f, 3.0f, 6.3f)
                verticalLineTo(11.0f)
                curveToRelative(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f)
                curveToRelative(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f)
                verticalLineTo(6.3f)
                curveToRelative(0.0f, -0.79f, -0.47f, -1.51f, -1.19f, -1.83f)
                lineToRelative(-7.0f, -3.11f)
                curveToRelative(-0.52f, -0.23f, -1.11f, -0.23f, -1.62f, 0.0f)
                lineTo(4.19f, 4.47f)
                close()
            }
        }
        .build()
        return _localPolice!!
    }

private var _localPolice: ImageVector? = null
