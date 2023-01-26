package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.DesignServices: ImageVector
    get() {
        if (_designServices != null) {
            return _designServices!!
        }
        _designServices = Builder(name = "DesignServices", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.24f, 11.51f)
                lineToRelative(1.57f, -1.57f)
                lineToRelative(-3.75f, -3.75f)
                lineToRelative(-1.57f, 1.57f)
                lineTo(8.35f, 3.63f)
                curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f)
                lineToRelative(-1.9f, 1.9f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f)
                lineToRelative(4.13f, 4.13f)
                lineTo(3.15f, 17.1f)
                curveTo(3.05f, 17.2f, 3.0f, 17.32f, 3.0f, 17.46f)
                verticalLineToRelative(3.04f)
                curveTo(3.0f, 20.78f, 3.22f, 21.0f, 3.5f, 21.0f)
                horizontalLineToRelative(3.04f)
                curveToRelative(0.13f, 0.0f, 0.26f, -0.05f, 0.35f, -0.15f)
                lineToRelative(4.62f, -4.62f)
                lineToRelative(4.13f, 4.13f)
                curveToRelative(1.32f, 1.32f, 2.76f, 0.07f, 2.83f, 0.0f)
                lineToRelative(1.9f, -1.9f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0.0f, -2.83f)
                lineTo(16.24f, 11.51f)
                close()
                moveTo(9.18f, 11.07f)
                lineTo(5.04f, 6.94f)
                lineToRelative(1.89f, -1.9f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                lineToRelative(1.27f, 1.27f)
                lineTo(7.73f, 6.8f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(0.48f, -0.48f)
                lineToRelative(1.45f, 1.45f)
                lineTo(9.18f, 11.07f)
                close()
                moveTo(17.06f, 18.96f)
                lineToRelative(-4.13f, -4.13f)
                lineToRelative(1.9f, -1.9f)
                lineToRelative(1.45f, 1.45f)
                lineToRelative(-0.48f, 0.48f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(0.48f, -0.48f)
                lineToRelative(1.27f, 1.27f)
                lineTo(17.06f, 18.96f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.71f, 7.04f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(-2.34f, -2.34f)
                curveToRelative(-0.47f, -0.47f, -1.12f, -0.29f, -1.41f, 0.0f)
                lineToRelative(-1.83f, 1.83f)
                lineToRelative(3.75f, 3.75f)
                lineTo(20.71f, 7.04f)
                close()
            }
        }
        .build()
        return _designServices!!
    }

private var _designServices: ImageVector? = null
