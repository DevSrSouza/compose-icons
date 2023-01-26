package compose.icons.studioicons.baseline

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
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.MacroOff: ImageVector
    get() {
        if (_macroOff != null) {
            return _macroOff!!
        }
        _macroOff = Builder(name = "MacroOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.98f, 17.15f)
                curveTo(20.63f, 15.91f, 21.0f, 14.5f, 21.0f, 13.0f)
                curveToRelative(-1.5f, 0.0f, -2.91f, 0.37f, -4.15f, 1.02f)
                lineTo(19.98f, 17.15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 13.0f)
                curveToRelative(0.0f, 4.97f, 4.03f, 9.0f, 9.0f, 9.0f)
                curveTo(12.0f, 17.03f, 7.97f, 13.0f, 3.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.5f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0.0f, 0.99f, -0.58f, 1.84f, -1.42f, 2.25f)
                lineToRelative(2.48f, 2.48f)
                curveToRelative(0.11f, 0.02f, 0.23f, 0.03f, 0.35f, 0.03f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0.0f, -1.0f, -0.59f, -1.85f, -1.43f, -2.25f)
                curveToRelative(0.84f, -0.4f, 1.43f, -1.25f, 1.43f, -2.25f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.53f, 0.0f, -1.01f, 0.16f, -1.42f, 0.44f)
                lineTo(14.5f, 3.5f)
                curveTo(14.5f, 2.12f, 13.38f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveTo(9.5f, 2.12f, 9.5f, 3.5f)
                lineToRelative(0.02f, 0.19f)
                curveTo(9.12f, 3.41f, 8.63f, 3.25f, 8.1f, 3.25f)
                curveToRelative(-0.57f, 0.0f, -1.09f, 0.2f, -1.51f, 0.52f)
                lineToRelative(3.16f, 3.16f)
                curveTo(10.16f, 6.08f, 11.01f, 5.5f, 12.0f, 5.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineToRelative(4.64f, 4.64f)
                curveTo(5.76f, 9.26f, 5.6f, 9.73f, 5.6f, 10.25f)
                curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                curveToRelative(0.52f, 0.0f, 0.99f, -0.16f, 1.4f, -0.43f)
                lineToRelative(0.02f, 0.02f)
                lineTo(9.5f, 12.5f)
                curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                curveToRelative(0.05f, 0.0f, 0.1f, -0.01f, 0.16f, -0.02f)
                lineToRelative(1.64f, 1.64f)
                curveTo(12.67f, 18.12f, 12.0f, 19.98f, 12.0f, 22.0f)
                curveToRelative(2.02f, 0.0f, 3.88f, -0.67f, 5.38f, -1.8f)
                lineToRelative(2.4f, 2.4f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                close()
            }
        }
        .build()
        return _macroOff!!
    }

private var _macroOff: ImageVector? = null
