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

public val RoundGroup.Deck: ImageVector
    get() {
        if (_deck != null) {
            return _deck!!
        }
        _deck = Builder(name = "Deck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.41f, 9.0f)
                curveToRelative(0.49f, 0.0f, 0.69f, -0.63f, 0.29f, -0.91f)
                lineTo(13.15f, 2.8f)
                curveToRelative(-0.69f, -0.48f, -1.61f, -0.48f, -2.29f, 0.0f)
                lineTo(3.3f, 8.09f)
                curveTo(2.9f, 8.37f, 3.1f, 9.0f, 3.59f, 9.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.41f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                horizontalLineTo(4.9f)
                lineToRelative(-0.57f, -3.02f)
                curveToRelative(-0.1f, -0.54f, -0.62f, -0.9f, -1.17f, -0.8f)
                curveToRelative(-0.54f, 0.1f, -0.9f, 0.62f, -0.8f, 1.17f)
                lineTo(3.0f, 16.74f)
                verticalLineTo(21.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.44f, 1.0f, -0.99f)
                lineTo(5.02f, 18.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                curveTo(9.0f, 16.45f, 8.55f, 16.0f, 8.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.84f, 12.18f)
                curveToRelative(-0.54f, -0.1f, -1.06f, 0.26f, -1.17f, 0.8f)
                lineTo(19.1f, 16.0f)
                horizontalLineTo(16.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.98f)
                lineToRelative(0.02f, 3.01f)
                curveToRelative(0.0f, 0.55f, 0.45f, 0.99f, 1.0f, 0.99f)
                horizontalLineTo(20.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-4.26f)
                lineToRelative(0.64f, -3.39f)
                curveTo(21.74f, 12.81f, 21.38f, 12.28f, 20.84f, 12.18f)
                close()
            }
        }
        .build()
        return _deck!!
    }

private var _deck: ImageVector? = null
