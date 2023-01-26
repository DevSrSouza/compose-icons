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

public val RoundGroup.Approval: ImageVector
    get() {
        if (_approval != null) {
            return _approval!!
        }
        _approval = Builder(name = "Approval", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 16.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 14.0f, 4.0f, 14.9f, 4.0f, 16.0f)
                close()
                moveTo(17.0f, 18.0f)
                horizontalLineTo(7.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveTo(18.0f, 17.55f, 17.55f, 18.0f, 17.0f, 18.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveTo(9.54f, 2.0f, 7.48f, 3.79f, 7.07f, 6.13f)
                curveTo(6.99f, 6.65f, 7.13f, 7.18f, 7.43f, 7.6f)
                lineToRelative(3.76f, 5.26f)
                curveToRelative(0.4f, 0.56f, 1.23f, 0.56f, 1.63f, 0.0f)
                lineToRelative(3.76f, -5.26f)
                curveToRelative(0.3f, -0.42f, 0.44f, -0.95f, 0.35f, -1.47f)
                curveTo(16.52f, 3.79f, 14.46f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _approval!!
    }

private var _approval: ImageVector? = null
