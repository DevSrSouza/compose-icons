package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.NestCamWiredStand: ImageVector
    get() {
        if (_nestCamWiredStand != null) {
            return _nestCamWiredStand!!
        }
        _nestCamWiredStand = Builder(name = "NestCamWiredStand", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 0.85f)
                lineTo(11.98f, 1.4f)
                curveTo(8.95f, 1.7f, 6.37f, 4.0f, 6.04f, 7.03f)
                curveToRelative(-0.39f, 3.57f, 2.2f, 6.69f, 5.68f, 7.04f)
                lineToRelative(1.9f, 0.19f)
                lineToRelative(-0.56f, 0.85f)
                curveToRelative(-0.88f, -0.19f, -1.83f, -0.18f, -2.85f, 0.25f)
                curveTo(8.21f, 16.21f, 7.0f, 18.25f, 7.0f, 20.41f)
                lineTo(7.0f, 23.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -1.67f, -0.83f, -3.15f, -2.09f, -4.06f)
                lineToRelative(0.97f, -1.45f)
                lineTo(18.0f, 14.72f)
                verticalLineTo(0.85f)
                close()
            }
        }
        .build()
        return _nestCamWiredStand!!
    }

private var _nestCamWiredStand: ImageVector? = null
