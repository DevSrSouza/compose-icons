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

public val SharpGroup.FindReplace: ImageVector
    get() {
        if (_findReplace != null) {
            return _findReplace!!
        }
        _findReplace = Builder(name = "FindReplace", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.0f)
                curveToRelative(1.38f, 0.0f, 2.63f, 0.56f, 3.54f, 1.46f)
                lineTo(12.0f, 10.0f)
                horizontalLineToRelative(6.0f)
                lineTo(18.0f, 4.0f)
                lineToRelative(-2.05f, 2.05f)
                curveTo(14.68f, 4.78f, 12.93f, 4.0f, 11.0f, 4.0f)
                curveToRelative(-3.53f, 0.0f, -6.43f, 2.61f, -6.92f, 6.0f)
                lineTo(6.1f, 10.0f)
                curveToRelative(0.46f, -2.28f, 2.48f, -4.0f, 4.9f, -4.0f)
                close()
                moveTo(16.64f, 15.14f)
                curveToRelative(0.66f, -0.9f, 1.12f, -1.97f, 1.28f, -3.14f)
                lineTo(15.9f, 12.0f)
                curveToRelative(-0.46f, 2.28f, -2.48f, 4.0f, -4.9f, 4.0f)
                curveToRelative(-1.38f, 0.0f, -2.63f, -0.56f, -3.54f, -1.46f)
                lineTo(10.0f, 12.0f)
                lineTo(4.0f, 12.0f)
                verticalLineToRelative(6.0f)
                lineToRelative(2.05f, -2.05f)
                curveTo(7.32f, 17.22f, 9.07f, 18.0f, 11.0f, 18.0f)
                curveToRelative(1.55f, 0.0f, 2.98f, -0.51f, 4.14f, -1.36f)
                lineTo(20.0f, 21.49f)
                lineTo(21.49f, 20.0f)
                lineToRelative(-4.85f, -4.86f)
                close()
            }
        }
        .build()
        return _findReplace!!
    }

private var _findReplace: ImageVector? = null
