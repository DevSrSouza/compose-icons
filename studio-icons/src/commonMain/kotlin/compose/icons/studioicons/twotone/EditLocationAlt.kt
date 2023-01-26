package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.EditLocationAlt: ImageVector
    get() {
        if (_editLocationAlt != null) {
            return _editLocationAlt!!
        }
        _editLocationAlt = Builder(name = "EditLocationAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.9f, 9.05f)
                curveTo(17.96f, 9.41f, 18.0f, 9.79f, 18.0f, 10.2f)
                curveToRelative(0.0f, 1.71f, -1.08f, 4.64f, -6.0f, 9.14f)
                curveToRelative(-4.92f, -4.49f, -6.0f, -7.43f, -6.0f, -9.14f)
                curveTo(6.0f, 6.17f, 9.09f, 4.0f, 12.0f, 4.0f)
                curveToRelative(0.32f, 0.0f, 0.65f, 0.03f, 0.97f, 0.08f)
                lineToRelative(1.65f, -1.65f)
                curveTo(13.78f, 2.16f, 12.9f, 2.0f, 12.0f, 2.0f)
                curveToRelative(-4.2f, 0.0f, -8.0f, 3.22f, -8.0f, 8.2f)
                curveToRelative(0.0f, 3.32f, 2.67f, 7.25f, 8.0f, 11.8f)
                curveToRelative(5.33f, -4.55f, 8.0f, -8.48f, 8.0f, -11.8f)
                curveToRelative(0.0f, -1.01f, -0.16f, -1.94f, -0.45f, -2.8f)
                lineTo(17.9f, 9.05f)
                close()
                moveTo(20.71f, 2.0f)
                lineTo(20.0f, 1.29f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(-0.72f, 0.72f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(0.72f, -0.72f)
                curveTo(21.1f, 3.02f, 21.1f, 2.39f, 20.71f, 2.0f)
                close()
                moveTo(11.0f, 11.0f)
                horizontalLineToRelative(2.12f)
                lineToRelative(6.16f, -6.16f)
                lineToRelative(-2.12f, -2.12f)
                lineTo(11.0f, 8.88f)
                verticalLineTo(11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.95f, 13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.05f)
                lineToRelative(3.97f, -3.97f)
                curveTo(12.65f, 4.03f, 12.32f, 4.0f, 12.0f, 4.0f)
                curveToRelative(-2.91f, 0.0f, -6.0f, 2.17f, -6.0f, 6.2f)
                curveToRelative(0.0f, 1.71f, 1.08f, 4.64f, 6.0f, 9.14f)
                curveToRelative(4.92f, -4.49f, 6.0f, -7.43f, 6.0f, -9.14f)
                curveToRelative(0.0f, -0.4f, -0.04f, -0.78f, -0.1f, -1.15f)
                lineTo(13.95f, 13.0f)
                close()
            }
        }
        .build()
        return _editLocationAlt!!
    }

private var _editLocationAlt: ImageVector? = null
