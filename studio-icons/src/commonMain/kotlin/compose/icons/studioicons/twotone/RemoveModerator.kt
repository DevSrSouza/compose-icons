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

public val TwotoneGroup.RemoveModerator: ImageVector
    get() {
        if (_removeModerator != null) {
            return _removeModerator!!
        }
        _removeModerator = Builder(name = "RemoveModerator", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 11.09f)
                curveToRelative(0.0f, 4.0f, 2.55f, 7.7f, 6.0f, 8.83f)
                curveToRelative(1.17f, -0.38f, 2.24f, -1.07f, 3.14f, -1.95f)
                lineTo(6.0f, 8.83f)
                verticalLineTo(11.09f)
                close()
                moveTo(12.0f, 4.14f)
                lineTo(8.34f, 5.51f)
                lineToRelative(9.02f, 9.02f)
                curveToRelative(0.41f, -1.08f, 0.64f, -2.25f, 0.64f, -3.44f)
                verticalLineToRelative(-4.7f)
                lineTo(12.0f, 4.14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.14f)
                lineToRelative(6.0f, 2.25f)
                verticalLineToRelative(4.7f)
                curveToRelative(0.0f, 1.19f, -0.23f, 2.36f, -0.64f, 3.44f)
                lineToRelative(1.51f, 1.51f)
                curveToRelative(0.72f, -1.53f, 1.13f, -3.22f, 1.13f, -4.95f)
                verticalLineTo(5.0f)
                lineToRelative(-8.0f, -3.0f)
                lineTo(6.78f, 3.96f)
                lineToRelative(1.55f, 1.55f)
                lineTo(12.0f, 4.14f)
                close()
                moveTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineTo(4.0f, 6.83f)
                verticalLineToRelative(4.26f)
                curveToRelative(0.0f, 5.05f, 3.41f, 9.76f, 8.0f, 10.91f)
                curveToRelative(1.72f, -0.43f, 3.28f, -1.36f, 4.55f, -2.62f)
                lineToRelative(3.23f, 3.23f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                close()
                moveTo(12.0f, 19.92f)
                curveToRelative(-3.45f, -1.13f, -6.0f, -4.82f, -6.0f, -8.83f)
                verticalLineTo(8.83f)
                lineToRelative(9.14f, 9.14f)
                curveTo(14.24f, 18.85f, 13.17f, 19.54f, 12.0f, 19.92f)
                close()
            }
        }
        .build()
        return _removeModerator!!
    }

private var _removeModerator: ImageVector? = null
