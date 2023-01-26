package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.DonutSmall: ImageVector
    get() {
        if (_donutSmall != null) {
            return _donutSmall!!
        }
        _donutSmall = Builder(name = "DonutSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.82f, 11.0f)
                horizontalLineToRelative(7.13f)
                curveToRelative(-0.47f, -4.72f, -4.23f, -8.48f, -8.95f, -8.95f)
                verticalLineToRelative(7.13f)
                curveToRelative(0.85f, 0.31f, 1.51f, 0.97f, 1.82f, 1.82f)
                close()
                moveTo(15.0f, 4.58f)
                curveTo(17.0f, 5.4f, 18.6f, 7.0f, 19.42f, 9.0f)
                horizontalLineToRelative(-3.43f)
                curveToRelative(-0.28f, -0.37f, -0.62f, -0.71f, -0.99f, -0.99f)
                lineTo(15.0f, 4.58f)
                close()
                moveTo(2.0f, 12.0f)
                curveToRelative(0.0f, 5.19f, 3.95f, 9.45f, 9.0f, 9.95f)
                verticalLineToRelative(-7.13f)
                curveTo(9.84f, 14.4f, 9.0f, 13.3f, 9.0f, 12.0f)
                curveToRelative(0.0f, -1.3f, 0.84f, -2.4f, 2.0f, -2.82f)
                lineTo(11.0f, 2.05f)
                curveToRelative(-5.05f, 0.5f, -9.0f, 4.76f, -9.0f, 9.95f)
                close()
                moveTo(9.0f, 4.58f)
                verticalLineToRelative(3.44f)
                curveToRelative(-1.23f, 0.92f, -2.0f, 2.39f, -2.0f, 3.98f)
                curveToRelative(0.0f, 1.59f, 0.77f, 3.06f, 2.0f, 3.99f)
                verticalLineToRelative(3.44f)
                curveTo(6.04f, 18.24f, 4.0f, 15.35f, 4.0f, 12.0f)
                curveToRelative(0.0f, -3.35f, 2.04f, -6.24f, 5.0f, -7.42f)
                close()
                moveTo(13.0f, 14.82f)
                verticalLineToRelative(7.13f)
                curveToRelative(4.72f, -0.47f, 8.48f, -4.23f, 8.95f, -8.95f)
                horizontalLineToRelative(-7.13f)
                curveToRelative(-0.31f, 0.85f, -0.97f, 1.51f, -1.82f, 1.82f)
                close()
                moveTo(15.0f, 15.99f)
                curveToRelative(0.37f, -0.28f, 0.71f, -0.61f, 0.99f, -0.99f)
                horizontalLineToRelative(3.43f)
                curveTo(18.6f, 17.0f, 17.0f, 18.6f, 15.0f, 19.42f)
                verticalLineToRelative(-3.43f)
                close()
            }
        }
        .build()
        return _donutSmall!!
    }

private var _donutSmall: ImageVector? = null
