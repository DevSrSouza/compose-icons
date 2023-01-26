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

public val SharpGroup.Badge: ImageVector
    get() {
        if (_badge != null) {
            return _badge!!
        }
        _badge = Builder(name = "Badge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(9.0f, 12.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                curveTo(7.5f, 12.67f, 8.17f, 12.0f, 9.0f, 12.0f)
                close()
                moveTo(12.0f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-0.43f)
                curveToRelative(0.0f, -0.6f, 0.36f, -1.15f, 0.92f, -1.39f)
                curveTo(7.56f, 15.9f, 8.26f, 15.75f, 9.0f, 15.75f)
                reflectiveCurveToRelative(1.44f, 0.15f, 2.08f, 0.43f)
                curveToRelative(0.55f, 0.24f, 0.92f, 0.78f, 0.92f, 1.39f)
                verticalLineTo(18.0f)
                close()
                moveTo(13.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(18.0f, 16.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(16.5f)
                close()
                moveTo(18.0f, 13.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineTo(12.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(13.5f)
                close()
            }
        }
        .build()
        return _badge!!
    }

private var _badge: ImageVector? = null
